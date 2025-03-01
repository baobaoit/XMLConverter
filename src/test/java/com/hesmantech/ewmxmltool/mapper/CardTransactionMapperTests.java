package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardTransactionItem;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CardTransactionMapperTests {
    CardTransactionMapper cardTransactionMapper;

    @BeforeEach
    void init() {
        cardTransactionMapper = CardTransactionMapper.INSTANCE;
    }

    @Test
    void initOk() {
        Assertions.assertNotNull(cardTransactionMapper);
    }

    @Test
    void toCardTransactionItemOk() {
        CardTransaction cardTransaction = new CardTransaction();
        cardTransaction.setTransactionType("TEST");

        CardTransactionItem item = cardTransactionMapper.toCardTransactionItem(cardTransaction);
        Assertions.assertEquals(cardTransaction.getTransactionType(), item.getTransactionType());
    }
}
