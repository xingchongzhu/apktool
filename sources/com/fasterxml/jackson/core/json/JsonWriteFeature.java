package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonGenerator.Feature;

public enum JsonWriteFeature implements FormatFeature {
    QUOTE_FIELD_NAMES(true, Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, Feature.ESCAPE_NON_ASCII);
    
    private final boolean _defaultState;
    private final Feature _mappedFeature;
    private final int _mask;

    private JsonWriteFeature(boolean z, Feature feature) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
        this._mappedFeature = feature;
    }

    public static int collectDefaults() {
        JsonWriteFeature[] values;
        int i = 0;
        for (JsonWriteFeature jsonWriteFeature : values()) {
            if (jsonWriteFeature.enabledByDefault()) {
                i |= jsonWriteFeature.getMask();
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
