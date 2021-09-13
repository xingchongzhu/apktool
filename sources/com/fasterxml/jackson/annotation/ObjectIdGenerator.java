package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator<T> implements Serializable {

    public static final class IdKey implements Serializable {
        private static final long serialVersionUID = 1;
        private final int hashCode;
        public final Object key;
        public final Class<?> scope;
        public final Class<?> type;

        public IdKey(Class<?> cls, Class<?> cls2, Object obj) {
            if (obj != null) {
                this.type = cls;
                this.scope = cls2;
                this.key = obj;
                int hashCode2 = obj.hashCode() + cls.getName().hashCode();
                if (cls2 != null) {
                    hashCode2 ^= cls2.getName().hashCode();
                }
                this.hashCode = hashCode2;
                return;
            }
            throw new IllegalArgumentException("Can not construct IdKey for null key");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != IdKey.class) {
                return false;
            }
            IdKey idKey = (IdKey) obj;
            if (!(idKey.key.equals(this.key) && idKey.type == this.type && idKey.scope == this.scope)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.hashCode;
        }

        public String toString() {
            String str;
            Object[] objArr = new Object[3];
            objArr[0] = this.key;
            Class<?> cls = this.type;
            String str2 = "NONE";
            if (cls == null) {
                str = str2;
            } else {
                str = cls.getName();
            }
            objArr[1] = str;
            Class<?> cls2 = this.scope;
            if (cls2 != null) {
                str2 = cls2.getName();
            }
            objArr[2] = str2;
            return String.format("[ObjectId: key=%s, type=%s, scope=%s]", objArr);
        }
    }

    public abstract boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator);

    public abstract ObjectIdGenerator<T> forScope(Class<?> cls);

    public abstract T generateId(Object obj);

    public abstract Class<?> getScope();

    public boolean isValidReferencePropertyName(String str, Object obj) {
        return false;
    }

    public abstract IdKey key(Object obj);

    public boolean maySerializeAsObject() {
        return false;
    }

    public abstract ObjectIdGenerator<T> newForSerialization(Object obj);
}
