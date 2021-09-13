package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.ValueInstantiator.Base;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JDKValueInstantiators {

    private static class ArrayListInstantiator extends Base implements Serializable {
        public static final ArrayListInstantiator INSTANCE = new ArrayListInstantiator();
        private static final long serialVersionUID = 2;

        public ArrayListInstantiator() {
            super(ArrayList.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ArrayList();
        }
    }

    private static class ConstantValueInstantiator extends Base implements Serializable {
        private static final long serialVersionUID = 2;
        protected final Object _value;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this._value = obj;
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return this._value;
        }
    }

    private static class HashMapInstantiator extends Base implements Serializable {
        public static final HashMapInstantiator INSTANCE = new HashMapInstantiator();
        private static final long serialVersionUID = 2;

        public HashMapInstantiator() {
            super(HashMap.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashMap();
        }
    }

    private static class LinkedHashMapInstantiator extends Base implements Serializable {
        public static final LinkedHashMapInstantiator INSTANCE = new LinkedHashMapInstantiator();
        private static final long serialVersionUID = 2;

        public LinkedHashMapInstantiator() {
            super(LinkedHashMap.class);
        }

        public boolean canCreateUsingDefault() {
            return true;
        }

        public boolean canInstantiate() {
            return true;
        }

        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedHashMap();
        }
    }

    public static ValueInstantiator findStdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.INSTANCE;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new ConstantValueInstantiator(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new ConstantValueInstantiator(list);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls == LinkedHashMap.class) {
                return LinkedHashMapInstantiator.INSTANCE;
            }
            if (cls == HashMap.class) {
                return HashMapInstantiator.INSTANCE;
            }
            if (Collections.EMPTY_MAP.getClass() == cls) {
                return new ConstantValueInstantiator(Collections.EMPTY_MAP);
            }
        }
        return null;
    }
}
