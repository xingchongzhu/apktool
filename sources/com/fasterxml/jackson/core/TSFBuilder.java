package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactory.Feature;
import com.fasterxml.jackson.core.TSFBuilder;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.p194io.InputDecorator;
import com.fasterxml.jackson.core.p194io.OutputDecorator;

public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected int _factoryFeatures;
    protected InputDecorator _inputDecorator;
    protected OutputDecorator _outputDecorator;
    protected int _streamReadFeatures;
    protected int _streamWriteFeatures;

    protected TSFBuilder() {
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._streamReadFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._streamWriteFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._inputDecorator = null;
        this._outputDecorator = null;
    }

    private B _failNonJSON(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Feature ");
        sb.append(obj.getClass().getName());
        sb.append("#");
        sb.append(obj.toString());
        sb.append(" not supported for non-JSON backend");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void _legacyDisable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures = (feature.getMask() ^ -1) & this._streamReadFeatures;
        }
    }

    /* access modifiers changed from: protected */
    public void _legacyEnable(JsonParser.Feature feature) {
        if (feature != null) {
            this._streamReadFeatures = feature.getMask() | this._streamReadFeatures;
        }
    }

    /* access modifiers changed from: protected */
    public final B _this() {
        return this;
    }

    public abstract F build();

    public B configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public B disable(Feature feature) {
        this._factoryFeatures = (feature.getMask() ^ -1) & this._factoryFeatures;
        return _this();
    }

    public B enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return _this();
    }

    public int factoryFeaturesMask() {
        return this._factoryFeatures;
    }

    public InputDecorator inputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator outputDecorator() {
        return this._outputDecorator;
    }

    public int streamReadFeatures() {
        return this._streamReadFeatures;
    }

    public int streamWriteFeatures() {
        return this._streamWriteFeatures;
    }

    /* access modifiers changed from: protected */
    public void _legacyDisable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures = (feature.getMask() ^ -1) & this._streamWriteFeatures;
        }
    }

    /* access modifiers changed from: protected */
    public void _legacyEnable(JsonGenerator.Feature feature) {
        if (feature != null) {
            this._streamWriteFeatures = feature.getMask() | this._streamWriteFeatures;
        }
    }

    public B configure(StreamReadFeature streamReadFeature, boolean z) {
        return z ? enable(streamReadFeature) : disable(streamReadFeature);
    }

    public B inputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return _this();
    }

    public B outputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return _this();
    }

    public B configure(StreamWriteFeature streamWriteFeature, boolean z) {
        return z ? enable(streamWriteFeature) : disable(streamWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = (streamReadFeature.mappedFeature().getMask() ^ -1) & this._streamReadFeatures;
        return _this();
    }

    public B enable(StreamReadFeature streamReadFeature) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        return _this();
    }

    public B configure(JsonReadFeature jsonReadFeature, boolean z) {
        return _failNonJSON(jsonReadFeature);
    }

    public B configure(JsonWriteFeature jsonWriteFeature, boolean z) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = (streamReadFeature.mappedFeature().getMask() ^ -1) & this._streamReadFeatures;
        for (StreamReadFeature mappedFeature : streamReadFeatureArr) {
            this._streamReadFeatures = (mappedFeature.mappedFeature().getMask() ^ -1) & this._streamReadFeatures;
        }
        return _this();
    }

    public B enable(StreamReadFeature streamReadFeature, StreamReadFeature... streamReadFeatureArr) {
        this._streamReadFeatures = streamReadFeature.mappedFeature().getMask() | this._streamReadFeatures;
        for (StreamReadFeature mappedFeature : streamReadFeatureArr) {
            this._streamReadFeatures = mappedFeature.mappedFeature().getMask() | this._streamReadFeatures;
        }
        return _this();
    }

    protected TSFBuilder(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
    }

    protected TSFBuilder(int i, int i2, int i3) {
        this._factoryFeatures = i;
        this._streamReadFeatures = i2;
        this._streamWriteFeatures = i3;
    }

    public B disable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = (streamWriteFeature.mappedFeature().getMask() ^ -1) & this._streamWriteFeatures;
        return _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        return _this();
    }

    public B disable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = (streamWriteFeature.mappedFeature().getMask() ^ -1) & this._streamWriteFeatures;
        for (StreamWriteFeature mappedFeature : streamWriteFeatureArr) {
            this._streamWriteFeatures = (mappedFeature.mappedFeature().getMask() ^ -1) & this._streamWriteFeatures;
        }
        return _this();
    }

    public B enable(StreamWriteFeature streamWriteFeature, StreamWriteFeature... streamWriteFeatureArr) {
        this._streamWriteFeatures = streamWriteFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        for (StreamWriteFeature mappedFeature : streamWriteFeatureArr) {
            this._streamWriteFeatures = mappedFeature.mappedFeature().getMask() | this._streamWriteFeatures;
        }
        return _this();
    }

    public B disable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B enable(JsonReadFeature jsonReadFeature, JsonReadFeature... jsonReadFeatureArr) {
        return _failNonJSON(jsonReadFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B disable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }

    public B enable(JsonWriteFeature jsonWriteFeature, JsonWriteFeature... jsonWriteFeatureArr) {
        return _failNonJSON(jsonWriteFeature);
    }
}
