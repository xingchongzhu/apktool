package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSetter {

    public static class Value implements JacksonAnnotationValue<JsonSetter>, Serializable {
        protected static final Value EMPTY;
        private static final long serialVersionUID = 1;
        private final Nulls _contentNulls;
        private final Nulls _nulls;

        static {
            Nulls nulls = Nulls.DEFAULT;
            EMPTY = new Value(nulls, nulls);
        }

        protected Value(Nulls nulls, Nulls nulls2) {
            this._nulls = nulls;
            this._contentNulls = nulls2;
        }

        private static boolean _empty(Nulls nulls, Nulls nulls2) {
            Nulls nulls3 = Nulls.DEFAULT;
            return nulls == nulls3 && nulls2 == nulls3;
        }

        public static Value construct(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            if (_empty(nulls, nulls2)) {
                return EMPTY;
            }
            return new Value(nulls, nulls2);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value forContentNulls(Nulls nulls) {
            return construct(Nulls.DEFAULT, nulls);
        }

        public static Value forValueNulls(Nulls nulls) {
            return construct(nulls, Nulls.DEFAULT);
        }

        public static Value from(JsonSetter jsonSetter) {
            if (jsonSetter == null) {
                return EMPTY;
            }
            return construct(jsonSetter.nulls(), jsonSetter.contentNulls());
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            if (!(value._nulls == this._nulls && value._contentNulls == this._contentNulls)) {
                z = false;
            }
            return z;
        }

        public Nulls getContentNulls() {
            return this._contentNulls;
        }

        public Nulls getValueNulls() {
            return this._nulls;
        }

        public int hashCode() {
            return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
        }

        public Nulls nonDefaultContentNulls() {
            Nulls nulls = this._contentNulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        public Nulls nonDefaultValueNulls() {
            Nulls nulls = this._nulls;
            if (nulls == Nulls.DEFAULT) {
                return null;
            }
            return nulls;
        }

        /* access modifiers changed from: protected */
        public Object readResolve() {
            return _empty(this._nulls, this._contentNulls) ? EMPTY : this;
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", new Object[]{this._nulls, this._contentNulls});
        }

        public Class<JsonSetter> valueFor() {
            return JsonSetter.class;
        }

        public Value withContentNulls(Nulls nulls) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls == this._contentNulls) {
                return this;
            }
            return construct(this._nulls, nulls);
        }

        public Value withOverrides(Value value) {
            if (value == null || value == EMPTY) {
                return this;
            }
            Nulls nulls = value._nulls;
            Nulls nulls2 = value._contentNulls;
            Nulls nulls3 = Nulls.DEFAULT;
            if (nulls == nulls3) {
                nulls = this._nulls;
            }
            if (nulls2 == nulls3) {
                nulls2 = this._contentNulls;
            }
            if (nulls == this._nulls && nulls2 == this._contentNulls) {
                return this;
            }
            return construct(nulls, nulls2);
        }

        public Value withValueNulls(Nulls nulls) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls == this._nulls) {
                return this;
            }
            return construct(nulls, this._contentNulls);
        }

        public static Value forValueNulls(Nulls nulls, Nulls nulls2) {
            return construct(nulls, nulls2);
        }

        public Value withValueNulls(Nulls nulls, Nulls nulls2) {
            if (nulls == null) {
                nulls = Nulls.DEFAULT;
            }
            if (nulls2 == null) {
                nulls2 = Nulls.DEFAULT;
            }
            if (nulls == this._nulls && nulls2 == this._contentNulls) {
                return this;
            }
            return construct(nulls, nulls2);
        }
    }

    Nulls contentNulls() default Nulls.DEFAULT;

    Nulls nulls() default Nulls.DEFAULT;

    String value() default "";
}
