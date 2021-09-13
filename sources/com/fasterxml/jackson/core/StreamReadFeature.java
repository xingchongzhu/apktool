package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser.Feature;

public enum StreamReadFeature {
    AUTO_CLOSE_SOURCE(Feature.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(Feature.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(Feature.INCLUDE_SOURCE_IN_LOCATION);
    
    private final boolean _defaultState;
    private final Feature _mappedFeature;
    private final int _mask;

    private StreamReadFeature(Feature feature) {
        this._mappedFeature = feature;
        this._mask = feature.getMask();
        this._defaultState = feature.enabledByDefault();
    }

    public static int collectDefaults() {
        StreamReadFeature[] values;
        int i = 0;
        for (StreamReadFeature streamReadFeature : values()) {
            if (streamReadFeature.enabledByDefault()) {
                i |= streamReadFeature.getMask();
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
