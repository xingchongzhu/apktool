package com.tv91.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.tv91.model.Paging;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public final class Jsons {

    /* renamed from: a */
    private static final ObjectMapper f16070a;

    private static class DateDeserializer extends StdDeserializer<Date> {
        private DateDeserializer() {
            super(Date.class);
        }

        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String valueAsString = jsonParser.getValueAsString();
            Date c = Dates.m20558c(valueAsString);
            return c == null ? Dates.m20559d(valueAsString, "yyyy/MM/dd") : c;
        }
    }

    private static class DateSerializer extends StdSerializer<Date> {
        private DateSerializer() {
            super(Date.class);
        }

        public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(Dates.m20556a(date));
        }
    }

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        f16070a = objectMapper;
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Date.class, new DateSerializer());
        simpleModule.addDeserializer(Date.class, new DateDeserializer());
        objectMapper.registerModule(simpleModule);
    }

    /* renamed from: a */
    public static <T> T m20550a(String str, JavaType javaType) throws IOException {
        if (C3052g.m20586g(str)) {
            return null;
        }
        return f16070a.readValue(str, javaType);
    }

    /* renamed from: b */
    public static <T> T m20551b(String str, Class<T> cls) throws IOException {
        return m20550a(str, m20555f(cls));
    }

    /* renamed from: c */
    public static JavaType m20552c(Class<?> cls) {
        return f16070a.getTypeFactory().constructParametricType(List.class, (Class<?>[]) new Class[]{cls});
    }

    /* renamed from: d */
    public static JavaType m20553d(Class<?> cls) {
        return f16070a.getTypeFactory().constructParametricType(Paging.class, (Class<?>[]) new Class[]{cls});
    }

    /* renamed from: e */
    public static <T> String m20554e(T t) throws JsonProcessingException {
        return t == null ? "" : f16070a.writeValueAsString(t);
    }

    /* renamed from: f */
    public static JavaType m20555f(Class<?> cls) {
        return f16070a.getTypeFactory().constructType((Type) cls);
    }
}
