package com.hesmantech.ewmxmltool.utils;

import java.lang.reflect.Constructor;

public class ReflectionHelper {
    private ReflectionHelper() {
        throw new UnsupportedOperationException("This class is not instantiable");
    }

    @SuppressWarnings("unchecked")
    public static <T> Constructor<T> getPrivateUtilsConstructorNoParams(Class<T> clazz) {
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == 0) {
                constructor.setAccessible(true);
                return (Constructor<T>) constructor;
            }
        }

        return null;
    }
}
