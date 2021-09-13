package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final LinkedNode<DeserializationProblemHandler> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._nodeFactory = JsonNodeFactory.instance;
        this._problemHandlers = null;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    private DeserializationConfig _withJsonReadFeatures(FormatFeature... formatFeatureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = this._formatReadFeaturesToChange;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        for (JsonReadFeature jsonReadFeature : formatFeatureArr) {
            int mask = jsonReadFeature.getMask();
            i7 |= mask;
            i8 |= mask;
            if (jsonReadFeature instanceof JsonReadFeature) {
                Feature mappedFeature = jsonReadFeature.mappedFeature();
                if (mappedFeature != null) {
                    int mask2 = mappedFeature.getMask();
                    i6 = mask2 | i6;
                    i5 |= mask2;
                }
            }
        }
        if (this._formatReadFeatures == i7 && this._formatReadFeaturesToChange == i8 && this._parserFeatures == i5 && this._parserFeaturesToChange == i6) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i5, i6, i7, i8);
        return deserializationConfig;
    }

    private DeserializationConfig _withoutJsonReadFeatures(FormatFeature... formatFeatureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = this._formatReadFeaturesToChange;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        for (JsonReadFeature jsonReadFeature : formatFeatureArr) {
            int mask = jsonReadFeature.getMask();
            i7 &= mask ^ -1;
            i8 |= mask;
            if (jsonReadFeature instanceof JsonReadFeature) {
                Feature mappedFeature = jsonReadFeature.mappedFeature();
                if (mappedFeature != null) {
                    int mask2 = mappedFeature.getMask();
                    i6 = mask2 | i6;
                    i5 = (mask2 ^ -1) & i5;
                }
            }
        }
        if (this._formatReadFeatures == i7 && this._formatReadFeaturesToChange == i8 && this._parserFeatures == i5 && this._parserFeaturesToChange == i6) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i5, i6, i7, i8);
        return deserializationConfig;
    }

    public TypeDeserializer findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        AnnotatedClass classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        Collection collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collection = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return findTypeResolver.buildTypeDeserializer(this, javaType, collection);
    }

    /* access modifiers changed from: protected */
    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode<DeserializationProblemHandler> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i) {
        return (this._deserFeatures & i) == i;
    }

    public final boolean hasSomeOfFeatures(int i) {
        return (i & this._deserFeatures) != 0;
    }

    public void initialize(JsonParser jsonParser) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i2);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForBuilder(JavaType javaType) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public <T extends BeanDescription> T introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return !propertyName.isEmpty();
        }
        return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i |= mask.getMask();
        }
        if (i == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        if (LinkedNode.contains(this._problemHandlers, deserializationProblemHandler)) {
            return this;
        }
        return new DeserializationConfig(this, new LinkedNode<>(deserializationProblemHandler, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        if (this._problemHandlers == null) {
            return this;
        }
        return new DeserializationConfig(this, null);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures & (deserializationFeature.getMask() ^ -1);
        if (mask == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        if (i == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    /* access modifiers changed from: protected */
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    /* access modifiers changed from: protected */
    public final DeserializationConfig _withMapperFeatures(int i) {
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, i, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public final boolean isEnabled(Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) == 0) {
            return jsonFactory.isEnabled(feature);
        }
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public DeserializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new DeserializationConfig(this, propertyName);
    }

    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    public DeserializationConfig with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new DeserializationConfig(this, subtypeResolver);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = (deserializationFeature.getMask() ^ -1) & this._deserFeatures;
        for (DeserializationFeature mask2 : deserializationFeatureArr) {
            mask &= mask2.getMask() ^ -1;
        }
        if (mask == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        if (mask == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig withFeatures(Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig withoutFeatures(Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 &= mask2 ^ -1;
            i4 |= mask2;
        }
        if (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature mask2 : deserializationFeatureArr) {
            mask |= mask2.getMask();
        }
        if (mask == this._deserFeatures) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig without(Feature feature) {
        int mask = this._parserFeatures & (feature.getMask() ^ -1);
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        if (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    protected DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        DeserializationConfig deserializationConfig;
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withJsonReadFeatures(formatFeatureArr);
        }
        int i = this._formatReadFeatures;
        int i2 = this._formatReadFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) {
            deserializationConfig = this;
        } else {
            deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
        }
        return deserializationConfig;
    }

    public DeserializationConfig without(FormatFeature formatFeature) {
        DeserializationConfig deserializationConfig;
        if (formatFeature instanceof JsonReadFeature) {
            return _withoutJsonReadFeatures(formatFeature);
        }
        int mask = this._formatReadFeatures & (formatFeature.getMask() ^ -1);
        int mask2 = this._formatReadFeaturesToChange | formatFeature.getMask();
        if (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) {
            deserializationConfig = this;
        } else {
            deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
        }
        return deserializationConfig;
    }

    public DeserializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        DeserializationConfig deserializationConfig;
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonReadFeature)) {
            return _withoutJsonReadFeatures(formatFeatureArr);
        }
        int i = this._formatReadFeatures;
        int i2 = this._formatReadFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i3 &= mask2 ^ -1;
            i4 |= mask2;
        }
        if (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) {
            deserializationConfig = this;
        } else {
            deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
        }
        return deserializationConfig;
    }

    public DeserializationConfig with(Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        if (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) {
            return this;
        }
        DeserializationConfig deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
        return deserializationConfig;
    }

    public DeserializationConfig with(FormatFeature formatFeature) {
        DeserializationConfig deserializationConfig;
        if (formatFeature instanceof JsonReadFeature) {
            return _withJsonReadFeatures(formatFeature);
        }
        int mask = this._formatReadFeatures | formatFeature.getMask();
        int mask2 = this._formatReadFeaturesToChange | formatFeature.getMask();
        if (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) {
            deserializationConfig = this;
        } else {
            deserializationConfig = new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
        }
        return deserializationConfig;
    }

    @Deprecated
    protected DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(deserializationConfig, deserializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, i);
        this._deserFeatures = i2;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = i3;
        this._parserFeaturesToChange = i4;
        this._formatReadFeatures = i5;
        this._formatReadFeaturesToChange = i6;
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        if (this._nodeFactory == jsonNodeFactory) {
            return this;
        }
        return new DeserializationConfig(this, jsonNodeFactory);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, subtypeResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, LinkedNode<DeserializationProblemHandler> linkedNode) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = linkedNode;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    protected DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    protected DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super((MapperConfigBase<CFG, T>) deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
