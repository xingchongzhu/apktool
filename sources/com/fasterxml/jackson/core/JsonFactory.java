package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.p194io.CharacterEscapes;
import com.fasterxml.jackson.core.p194io.IOContext;
import com.fasterxml.jackson.core.p194io.InputDecorator;
import com.fasterxml.jackson.core.p194io.OutputDecorator;
import com.fasterxml.jackson.core.p194io.SerializedString;
import com.fasterxml.jackson.core.p194io.UTF8Writer;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

public class JsonFactory extends TokenStreamFactory implements Versioned, Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = com.fasterxml.jackson.core.JsonParser.Feature.collectDefaults();
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected int _maximumNonEscapedChar;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values;
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((ObjectCodec) null);
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, new Object[]{getFormatName()}));
        }
    }

    public static TSFBuilder<?, ?> builder() {
        return new JsonFactoryBuilder();
    }

    /* access modifiers changed from: protected */
    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() != cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed copy(): ");
            sb.append(getClass().getName());
            sb.append(" (version: ");
            sb.append(version());
            sb.append(") does not override copy(); it has to");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), obj, z);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            writerBasedJsonGenerator.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    /* access modifiers changed from: protected */
    public IOContext _createNonBlockingContext(Object obj) {
        return new IOContext(_getBufferRecycler(), obj, false);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            uTF8JsonGenerator.setHighestNonEscapedChar(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    /* access modifiers changed from: protected */
    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new UTF8Writer(iOContext, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    /* access modifiers changed from: protected */
    public final InputStream _decorate(InputStream inputStream, IOContext iOContext) throws IOException {
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(iOContext, inputStream);
            if (decorate != null) {
                return decorate;
            }
        }
        return inputStream;
    }

    public BufferRecycler _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return BufferRecyclers.getBufferRecycler();
        }
        return new BufferRecycler();
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        boolean z = false;
        if (formatSchema == null) {
            return false;
        }
        String formatName = getFormatName();
        if (formatName != null && formatName.equals(formatSchema.getSchemaType())) {
            z = true;
        }
        return z;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (ObjectCodec) null);
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext _createContext = _createContext(outputStream, false);
        _createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException, JsonParseException {
        return createParser(file);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures));
    }

    public JsonParser createParser(File file) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(file, true);
        return _createParser(_decorate((InputStream) new FileInputStream(file), _createContext), _createContext);
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (feature.getMask() ^ -1) & this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public int getFormatGeneratorFeatures() {
        return 0;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public int getFormatParserFeatures() {
        return 0;
    }

    public Class<? extends FormatFeature> getFormatReadFeatureType() {
        return null;
    }

    public Class<? extends FormatFeature> getFormatWriteFeatureType() {
        return null;
    }

    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public String getRootValueSeparator() {
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString == null) {
            return null;
        }
        return serializableString.getValue();
    }

    public MatchStrength hasFormat(InputAccessor inputAccessor) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(inputAccessor);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        return ByteSourceJsonBootstrapper.hasJSONFormat(inputAccessor);
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public TSFBuilder<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new JsonFactoryBuilder(this);
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(Reader reader, IOContext iOContext) throws IOException {
        ReaderBasedJsonParser readerBasedJsonParser = new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
        return readerBasedJsonParser;
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException, JsonParseException {
        return createParser(url);
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = (feature.getMask() ^ -1) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public final Reader _decorate(Reader reader, IOContext iOContext) throws IOException {
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            Reader decorate = inputDecorator.decorate(iOContext, reader);
            if (decorate != null) {
                return decorate;
            }
        }
        return reader;
    }

    public final JsonFactory configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException, JsonParseException {
        return createParser(inputStream);
    }

    public JsonFactory disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonFactory enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.mappedFeature().getMask() & this._parserFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(char[] cArr, int i, int i2, IOContext iOContext, boolean z) throws IOException {
        ReaderBasedJsonParser readerBasedJsonParser = new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), cArr, i, i + i2, z);
        return readerBasedJsonParser;
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException, JsonParseException {
        return createParser(reader);
    }

    public JsonParser createParser(URL url) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(url, true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), _createContext), _createContext);
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public final DataInput _decorate(DataInput dataInput, IOContext iOContext) throws IOException {
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            DataInput decorate = inputDecorator.decorate(iOContext, dataInput);
            if (decorate != null) {
                return decorate;
            }
        }
        return dataInput;
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException, JsonParseException {
        return createParser(bArr);
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.mappedFeature().getMask() & this._generatorFeatures) != 0;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        return createParser(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(DataInput dataInput, IOContext iOContext) throws IOException {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int skipUTF8BOM = ByteSourceJsonBootstrapper.skipUTF8BOM(dataInput);
        IOContext iOContext2 = iOContext;
        DataInput dataInput2 = dataInput;
        UTF8DataInputJsonParser uTF8DataInputJsonParser = new UTF8DataInputJsonParser(iOContext2, this._parserFeatures, dataInput2, this._objectCodec, this._byteSymbolCanonicalizer.makeChild(this._factoryFeatures), skipUTF8BOM);
        return uTF8DataInputJsonParser;
    }

    /* access modifiers changed from: protected */
    public final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) throws IOException {
        OutputDecorator outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            OutputStream decorate = outputDecorator.decorate(iOContext, outputStream);
            if (decorate != null) {
                return decorate;
            }
        }
        return outputStream;
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException, JsonParseException {
        return createParser(str);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(inputStream, false);
        return _createParser(_decorate(inputStream, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        IOContext _createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, _createContext), _createContext);
    }

    /* access modifiers changed from: protected */
    public final Writer _decorate(Writer writer, IOContext iOContext) throws IOException {
        OutputDecorator outputDecorator = this._outputDecorator;
        if (outputDecorator != null) {
            Writer decorate = outputDecorator.decorate(iOContext, writer);
            if (decorate != null) {
                return decorate;
            }
        }
        return writer;
    }

    public JsonParser createParser(Reader reader) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, _createContext), _createContext);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOContext _createContext = _createContext(fileOutputStream, true);
        _createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate((OutputStream) fileOutputStream, _createContext), _createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, _createContext), _createContext), _createContext);
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    public JsonParser createParser(byte[] bArr) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(_createContext, bArr, 0, bArr.length);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, 0, bArr.length, _createContext);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        IOContext _createContext = _createContext(bArr, true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null) {
            InputStream decorate = inputDecorator.decorate(_createContext, bArr, i, i2);
            if (decorate != null) {
                return _createParser(decorate, _createContext);
            }
        }
        return _createParser(bArr, i, i2, _createContext);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    public JsonParser createParser(String str) throws IOException, JsonParseException {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser((Reader) new StringReader(str));
        }
        IOContext _createContext = _createContext(str, true);
        char[] allocTokenBuffer = _createContext.allocTokenBuffer(length);
        str.getChars(0, length, allocTokenBuffer, 0);
        return _createParser(allocTokenBuffer, 0, length, _createContext, true);
    }

    public JsonFactory(JsonFactoryBuilder jsonFactoryBuilder) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactoryBuilder._factoryFeatures;
        this._parserFeatures = jsonFactoryBuilder._streamReadFeatures;
        this._generatorFeatures = jsonFactoryBuilder._streamWriteFeatures;
        this._inputDecorator = jsonFactoryBuilder._inputDecorator;
        this._outputDecorator = jsonFactoryBuilder._outputDecorator;
        this._characterEscapes = jsonFactoryBuilder._characterEscapes;
        this._rootValueSeparator = jsonFactoryBuilder._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactoryBuilder._maximumNonEscapedChar;
        this._quoteChar = jsonFactoryBuilder._quoteChar;
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        if (this._inputDecorator != null) {
            return createParser((Reader) new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(cArr, true), false);
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        IOContext _createContext = _createContext(dataInput, false);
        return _createParser(_decorate(dataInput, _createContext), _createContext);
    }

    protected JsonFactory(TSFBuilder<?, ?> tSFBuilder, boolean z) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = tSFBuilder._factoryFeatures;
        this._parserFeatures = tSFBuilder._streamReadFeatures;
        this._generatorFeatures = tSFBuilder._streamWriteFeatures;
        this._inputDecorator = tSFBuilder._inputDecorator;
        this._outputDecorator = tSFBuilder._outputDecorator;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = DEFAULT_QUOTE_CHAR;
    }
}
