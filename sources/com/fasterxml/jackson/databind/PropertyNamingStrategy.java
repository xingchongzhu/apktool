package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

public class PropertyNamingStrategy implements Serializable {
    @Deprecated
    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES;
    public static final PropertyNamingStrategy KEBAB_CASE = new KebabCaseStrategy();
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new PropertyNamingStrategy();
    public static final PropertyNamingStrategy LOWER_CASE = new LowerCaseStrategy();
    public static final PropertyNamingStrategy LOWER_DOT_CASE = new LowerDotCaseStrategy();
    @Deprecated
    public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE;
    public static final PropertyNamingStrategy SNAKE_CASE;
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE;

    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, '-');
        }
    }

    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class LowerCaseWithUnderscoresStrategy extends SnakeCaseStrategy {
    }

    public static class LowerDotCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, '.');
        }
    }

    @Deprecated
    public static class PascalCaseStrategy extends UpperCamelCaseStrategy {
    }

    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        protected static String translateLowerCaseWithSeparator(String str, char c) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            if (length == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(charAt);
                if (lowerCase == charAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }

        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        public abstract String translate(String str);
    }

    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (i2 > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(charAt);
                    i++;
                }
            }
            if (i > 0) {
                str = sb.toString();
            }
            return str;
        }
    }

    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        public String translate(String str) {
            if (!(str == null || str.length() == 0)) {
                char charAt = str.charAt(0);
                char upperCase = Character.toUpperCase(charAt);
                if (charAt == upperCase) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(0, upperCase);
                str = sb.toString();
            }
            return str;
        }
    }

    static {
        SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();
        SNAKE_CASE = snakeCaseStrategy;
        UpperCamelCaseStrategy upperCamelCaseStrategy = new UpperCamelCaseStrategy();
        UPPER_CAMEL_CASE = upperCamelCaseStrategy;
        CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = snakeCaseStrategy;
        PASCAL_CASE_TO_CAMEL_CASE = upperCamelCaseStrategy;
    }

    public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}
