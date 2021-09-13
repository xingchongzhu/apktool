package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;

public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final int SER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final FilterProvider _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = SER_FEATURE_DEFAULTS;
        this._filterProvider = null;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    private SerializationConfig _withJsonWriteFeatures(FormatFeature... formatFeatureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = this._formatWriteFeaturesToChange;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        for (JsonWriteFeature jsonWriteFeature : formatFeatureArr) {
            int mask = jsonWriteFeature.getMask();
            i7 |= mask;
            i8 |= mask;
            if (jsonWriteFeature instanceof JsonWriteFeature) {
                Feature mappedFeature = jsonWriteFeature.mappedFeature();
                if (mappedFeature != null) {
                    int mask2 = mappedFeature.getMask();
                    i6 = mask2 | i6;
                    i5 |= mask2;
                }
            }
        }
        if (this._formatWriteFeatures == i7 && this._formatWriteFeaturesToChange == i8 && this._generatorFeatures == i5 && this._generatorFeaturesToChange == i6) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i5, i6, i7, i8);
        return serializationConfig;
    }

    private SerializationConfig _withoutJsonWriteFeatures(FormatFeature... formatFeatureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = this._formatWriteFeaturesToChange;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        for (JsonWriteFeature jsonWriteFeature : formatFeatureArr) {
            int mask = jsonWriteFeature.getMask();
            i7 &= mask ^ -1;
            i8 |= mask;
            if (jsonWriteFeature instanceof JsonWriteFeature) {
                Feature mappedFeature = jsonWriteFeature.mappedFeature();
                if (mappedFeature != null) {
                    int mask2 = mappedFeature.getMask();
                    i6 = mask2 | i6;
                    i5 = (mask2 ^ -1) & i5;
                }
            }
        }
        if (this._formatWriteFeatures == i7 && this._formatWriteFeaturesToChange == i8 && this._generatorFeatures == i5 && this._generatorFeaturesToChange == i6) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i5, i6, i7, i8);
        return serializationConfig;
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    public PrettyPrinter getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public FilterProvider getFilterProvider() {
        return this._filterProvider;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    @Deprecated
    public Include getSerializationInclusion() {
        Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        return valueInclusion == Include.USE_DEFAULTS ? Include.ALWAYS : valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i) {
        return (this._serFeatures & i) == i;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null) {
            PrettyPrinter constructDefaultPrettyPrinter = constructDefaultPrettyPrinter();
            if (constructDefaultPrettyPrinter != null) {
                jsonGenerator.setPrettyPrinter(constructDefaultPrettyPrinter);
            }
        }
        boolean enabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i = this._generatorFeaturesToChange;
        if (i != 0 || enabledIn) {
            int i2 = this._generatorFeatures;
            if (enabledIn) {
                int mask = Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i2 |= mask;
                i |= mask;
            }
            jsonGenerator.overrideStdFeatures(i2, i);
        }
        int i3 = this._formatWriteFeaturesToChange;
        if (i3 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i3);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return !propertyName.isEmpty();
        }
        return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        return this._defaultPrettyPrinter == prettyPrinter ? this : new SerializationConfig(this, prettyPrinter);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature mask : serializationFeatureArr) {
            i |= mask.getMask();
        }
        if (i == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig withFilters(FilterProvider filterProvider) {
        return filterProvider == this._filterProvider ? this : new SerializationConfig(this, filterProvider);
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int mask = this._serFeatures & (serializationFeature.getMask() ^ -1);
        if (mask == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        for (SerializationFeature mask : serializationFeatureArr) {
            i &= mask.getMask() ^ -1;
        }
        if (i == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    /* access modifiers changed from: protected */
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    /* access modifiers changed from: protected */
    public final SerializationConfig _withMapperFeatures(int i) {
        SerializationConfig serializationConfig = new SerializationConfig(this, i, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public final boolean isEnabled(Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) == 0) {
            return jsonFactory.isEnabled(feature);
        }
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public SerializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new SerializationConfig(this, propertyName);
    }

    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = (serializationFeature.getMask() ^ -1) & this._serFeatures;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            mask &= mask2.getMask() ^ -1;
        }
        if (mask == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new SerializationConfig(this, subtypeResolver);
    }

    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    public SerializationConfig withFeatures(Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._generatorFeatures == i3 && this._generatorFeaturesToChange == i4) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i3, i4, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig withoutFeatures(Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 &= mask2 ^ -1;
            i4 |= mask2;
        }
        if (this._generatorFeatures == i3 && this._generatorFeaturesToChange == i4) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i3, i4, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(Feature feature) {
        int mask = this._generatorFeatures & (feature.getMask() ^ -1);
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super((MapperConfigBase<CFG, T>) serializationConfig, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        if (mask == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig withFeatures(FormatFeature... formatFeatureArr) {
        SerializationConfig serializationConfig;
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonWriteFeature)) {
            return _withJsonWriteFeatures(formatFeatureArr);
        }
        int i = this._formatWriteFeatures;
        int i2 = this._formatWriteFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._formatWriteFeatures == i3 && this._formatWriteFeaturesToChange == i4) {
            serializationConfig = this;
        } else {
            serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i3, i4);
        }
        return serializationConfig;
    }

    public SerializationConfig without(FormatFeature formatFeature) {
        SerializationConfig serializationConfig;
        if (formatFeature instanceof JsonWriteFeature) {
            return _withoutJsonWriteFeatures(formatFeature);
        }
        int mask = this._formatWriteFeatures & (formatFeature.getMask() ^ -1);
        int mask2 = this._formatWriteFeaturesToChange | formatFeature.getMask();
        if (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) {
            serializationConfig = this;
        } else {
            serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
        }
        return serializationConfig;
    }

    public SerializationConfig withoutFeatures(FormatFeature... formatFeatureArr) {
        SerializationConfig serializationConfig;
        if (formatFeatureArr.length > 0 && (formatFeatureArr[0] instanceof JsonWriteFeature)) {
            return _withoutJsonWriteFeatures(formatFeatureArr);
        }
        int i = this._formatWriteFeatures;
        int i2 = this._formatWriteFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (FormatFeature mask : formatFeatureArr) {
            int mask2 = mask.getMask();
            i3 &= mask2 ^ -1;
            i4 |= mask2;
        }
        if (this._formatWriteFeatures == i3 && this._formatWriteFeaturesToChange == i4) {
            serializationConfig = this;
        } else {
            serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i3, i4);
        }
        return serializationConfig;
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            mask |= mask2.getMask();
        }
        if (mask == this._serFeatures) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    public SerializationConfig with(Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) {
            return this;
        }
        SerializationConfig serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
        return serializationConfig;
    }

    @Deprecated
    protected SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(serializationConfig, serializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
    }

    private SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver) {
        super((MapperConfigBase<CFG, T>) serializationConfig, subtypeResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(FormatFeature formatFeature) {
        SerializationConfig serializationConfig;
        if (formatFeature instanceof JsonWriteFeature) {
            return _withJsonWriteFeatures(formatFeature);
        }
        int mask = this._formatWriteFeatures | formatFeature.getMask();
        int mask2 = this._formatWriteFeaturesToChange | formatFeature.getMask();
        if (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) {
            serializationConfig = this;
        } else {
            serializationConfig = new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
        }
        return serializationConfig;
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        super((MapperConfigBase<CFG, T>) serializationConfig, i);
        this._serFeatures = i2;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i3;
        this._generatorFeaturesToChange = i4;
        this._formatWriteFeatures = i5;
        this._formatWriteFeaturesToChange = i6;
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super((MapperConfigBase<CFG, T>) serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, FilterProvider filterProvider) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super((MapperConfigBase<CFG, T>) serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super((MapperConfigBase<CFG, T>) serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super((MapperConfigBase<CFG, T>) serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super((MapperConfigBase<CFG, T>) serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    protected SerializationConfig(SerializationConfig serializationConfig, PrettyPrinter prettyPrinter) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._filterProvider = serializationConfig._filterProvider;
        this._defaultPrettyPrinter = prettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
