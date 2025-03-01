package com.hesmantech.ewmxmltool.utils;

import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardTransaction;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardsTransactions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

class XmlUtilsTests {
    final Logger logger = Logger.getLogger(getClass().getName());

    @Test
    void unmarshallerSuccess() {
        CardsTransactions cardsTransactions = new CardsTransactions();
        CardTransaction cardTransaction = new CardTransaction();
        cardTransaction.setTransactionType("TEST");
        cardsTransactions.setCardTransactions(Collections.singletonList(cardTransaction));

        try {
            File xmlFile = File.createTempFile("tmp-" + UUID.randomUUID(), ".xml");
            JAXBContext context = JAXBContext.newInstance(CardsTransactions.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(cardsTransactions, xmlFile);

            CardsTransactions actualCardsTransactions = XmlUtils.unmarshaller(xmlFile, CardsTransactions.class);
            CardTransaction actual = actualCardsTransactions.getCardTransactions().get(0);

            Assertions.assertEquals(cardTransaction.getTransactionType(), actual.getTransactionType(),
                    "Transaction type must be 'TEST'");

            xmlFile.deleteOnExit();
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "An error occurred during processing file", ex);
        } catch (JAXBException ex) {
            logger.log(Level.SEVERE, "An error occurred during processing JAXB", ex);
        }
    }

    @Test
    void shouldThrowsUnsupportedOperationException() {
        Constructor<XmlUtils> xmlUtilsConstructor = ReflectionHelper
                .getPrivateUtilsConstructorNoParams(XmlUtils.class);

        if (xmlUtilsConstructor != null) {
            try {
                xmlUtilsConstructor.newInstance();
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                Assertions.assertInstanceOf(UnsupportedOperationException.class, cause,
                        "Cause must from UnsupportedOperationException");
            }
        }
    }
}
