package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator.Feature;

public enum StreamWriteFeature {
    AUTO_CLOSE_TARGET(Feature.AUTO_CLOSE_TARGET),
    AUTO_CLOSE_CONTENT(Feature.AUTO_CLOSE_JSON_CONTENT),
    FLUSH_PASSED_TO_STREAM(Feature.FLUSH_PASSED_TO_STREAM),
    WRITE_BIGDECIMAL_AS_PLAIN(Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    STRICT_DUPLICATE_DETECTION(Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNKNOWN(Feature.IGNORE_UNKNOWN);
    
    private final boolean _defaultState;
    private final Feature _mappedFeature;
    private final int _mask;

    private StreamWriteFeature(Feature feature) {
        this._mappedFeature = feature;
        this._mask = feature.getMask();
        this._defaultState = feature.enabledByDefault();
    }

    public static int collectDefaults() {
        StreamWriteFeature[] values;
        int i = 0;
        for (StreamWriteFeature streamWriteFeature : values()) {
            if (streamWriteFeature.enabledByDefault()) {
                i |= streamWriteFeature.getMask();
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
