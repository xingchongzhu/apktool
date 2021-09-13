package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonParser.Feature;

public enum JsonReadFeature implements FormatFeature {
    ALLOW_JAVA_COMMENTS(false, Feature.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, Feature.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, Feature.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, Feature.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, Feature.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, Feature.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, Feature.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, Feature.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, Feature.ALLOW_TRAILING_COMMA);
    
    private final boolean _defaultState;
    private final Feature _mappedFeature;
    private final int _mask;

    private JsonReadFeature(boolean z, Feature feature) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
        this._mappedFeature = feature;
    }

    public static int collectDefaults() {
        JsonReadFeature[] values;
        int i = 0;
        for (JsonReadFeature jsonReadFeature : values()) {
            if (jsonReadFeature.enabledByDefault()) {
                i |= jsonReadFeature.getMask();
            }
        }
        return i;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    public int getMask() {
        return this._mask;
    }

    public Feature mappedFeature() {
        return this._mappedFeature;
    }
}
