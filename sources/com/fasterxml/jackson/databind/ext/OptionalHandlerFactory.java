package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory implements Serializable {
    private static final Class<?> CLASS_DOM_DOCUMENT;
    private static final Class<?> CLASS_DOM_NODE = Node.class;
    private static final String DESERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLDeserializers";
    private static final String DESERIALIZER_FOR_DOM_DOCUMENT = "com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer";
    private static final String DESERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer";
    private static final String PACKAGE_PREFIX_JAVAX_XML = "javax.xml.";
    private static final String SERIALIZERS_FOR_JAVAX_XML = "com.fasterxml.jackson.databind.ext.CoreXMLSerializers";
    private static final String SERIALIZER_FOR_DOM_NODE = "com.fasterxml.jackson.databind.ext.DOMSerializer";
    private static final Java7Handlers _jdk7Helper;
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
    private static final long serialVersionUID = 1;

    static {
        Java7Handlers java7Handlers = null;
        Class<Document> cls = Document.class;
        CLASS_DOM_DOCUMENT = cls;
        try {
            java7Handlers = Java7Handlers.instance();
        } catch (Throwable unused) {
        }
        _jdk7Helper = java7Handlers;
    }

    protected OptionalHandlerFactory() {
    }

    private boolean hasSuperClassStartingWith(Class<?> cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    private Object instantiate(String str) {
        try {
            return ClassUtil.createInstance(Class.forName(str), false);
        } catch (Exception | LinkageError unused) {
            return null;
        }
    }

    public JsonDeserializer<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Class rawClass = javaType.getRawClass();
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null) {
            JsonDeserializer<?> deserializerForJavaNioFilePath = java7Handlers.getDeserializerForJavaNioFilePath(rawClass);
            if (deserializerForJavaNioFilePath != null) {
                return deserializerForJavaNioFilePath;
            }
        }
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_NODE);
        }
        Class<?> cls2 = CLASS_DOM_DOCUMENT;
        if (cls2 != null && cls2.isAssignableFrom(rawClass)) {
            return (JsonDeserializer) instantiate(DESERIALIZER_FOR_DOM_DOCUMENT);
        }
        String name = rawClass.getName();
        String str = PACKAGE_PREFIX_JAVAX_XML;
        if (!name.startsWith(str) && !hasSuperClassStartingWith(rawClass, str)) {
            return null;
        }
        Object instantiate = instantiate(DESERIALIZERS_FOR_JAVAX_XML);
        if (instantiate == null) {
            return null;
        }
        return ((Deserializers) instantiate).findBeanDeserializer(javaType, deserializationConfig, beanDescription);
    }

    public JsonSerializer<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class rawClass = javaType.getRawClass();
        Class<?> cls = CLASS_DOM_NODE;
        if (cls != null && cls.isAssignableFrom(rawClass)) {
            return (JsonSerializer) instantiate(SERIALIZER_FOR_DOM_NODE);
        }
        Java7Handlers java7Handlers = _jdk7Helper;
        if (java7Handlers != null) {
            JsonSerializer<?> serializerForJavaNioFilePath = java7Handlers.getSerializerForJavaNioFilePath(rawClass);
            if (serializerForJavaNioFilePath != null) {
                return serializerForJavaNioFilePath;
            }
        }
        String name = rawClass.getName();
        String str = PACKAGE_PREFIX_JAVAX_XML;
        if (!name.startsWith(str) && !hasSuperClassStartingWith(rawClass, str)) {
            return null;
        }
        Object instantiate = instantiate(SERIALIZERS_FOR_JAVAX_XML);
        if (instantiate == null) {
            return null;
        }
        return ((Serializers) instantiate).findSerializer(serializationConfig, javaType, beanDescription);
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        Class<?> cls2 = CLASS_DOM_NODE;
        if (cls2 != null && cls2.isAssignableFrom(cls)) {
            return true;
        }
        Class<?> cls3 = CLASS_DOM_DOCUMENT;
        if (cls3 != null && cls3.isAssignableFrom(cls)) {
            return true;
        }
        String name = cls.getName();
        String str = PACKAGE_PREFIX_JAVAX_XML;
        if (name.startsWith(str) || hasSuperClassStartingWith(cls, str)) {
            return true;
        }
        return false;
    }
}
