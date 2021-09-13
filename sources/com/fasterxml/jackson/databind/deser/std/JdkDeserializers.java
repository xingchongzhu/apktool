package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer.Std;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class JdkDeserializers {
    private static final HashSet<String> _classNames = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 5; i++) {
            _classNames.add(clsArr[i].getName());
        }
        for (Class name : FromStringDeserializer.types()) {
            _classNames.add(name.getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (_classNames.contains(str)) {
            Std findDeserializer = FromStringDeserializer.findDeserializer(cls);
            if (findDeserializer != null) {
                return findDeserializer;
            }
            if (cls == UUID.class) {
                return new UUIDDeserializer();
            }
            if (cls == StackTraceElement.class) {
                return new StackTraceElementDeserializer();
            }
            if (cls == AtomicBoolean.class) {
                return new AtomicBooleanDeserializer();
            }
            if (cls == ByteBuffer.class) {
                return new ByteBufferDeserializer();
            }
            if (cls == Void.class) {
                return NullifyingDeserializer.instance;
            }
        }
        return null;
    }

    public static boolean hasDeserializerFor(Class<?> cls) {
        return _classNames.contains(cls.getName());
    }
}