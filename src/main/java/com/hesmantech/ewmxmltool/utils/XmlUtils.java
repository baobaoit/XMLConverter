package com.hesmantech.ewmxmltool.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public final class XmlUtils {
    private XmlUtils() {
        throw new UnsupportedOperationException("This class is not instantiable");
    }

    public static <T> T unmarshaller(File xmlFile, Class<T> classesToBeBound) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(classesToBeBound);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        return classesToBeBound.cast(unmarshaller.unmarshal(xmlFile));
    }
}
