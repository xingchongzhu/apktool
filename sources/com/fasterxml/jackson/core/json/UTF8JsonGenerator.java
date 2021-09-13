package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.p194io.CharTypes;
import com.fasterxml.jackson.core.p194io.CharacterEscapes;
import com.fasterxml.jackson.core.p194io.IOContext;
import com.fasterxml.jackson.core.p194io.NumberOutput;
import com.umeng.analytics.pro.TType;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte BYTE_0 = 48;
    private static final byte BYTE_BACKSLASH = 92;
    private static final byte BYTE_COLON = 58;
    private static final byte BYTE_COMMA = 44;
    private static final byte BYTE_LBRACKET = 91;
    private static final byte BYTE_LCURLY = 123;
    private static final byte BYTE_RBRACKET = 93;
    private static final byte BYTE_RCURLY = 125;
    private static final byte BYTE_u = 117;
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final int MAX_BYTES_TO_BUFFER = 512;
    private static final byte[] NULL_BYTES = {110, BYTE_u, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, BYTE_u, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _entityBuffer;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;

    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream, char c) {
        super(iOContext, i, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c;
        if (c != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c);
        }
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, JsonGenerationException {
        int length = bArr2.length;
        if (i + length > i2) {
            this._outputTail = i;
            _flushBuffer();
            i = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        this._outputTail = i4;
        _flushBuffer();
        return this._outputTail;
    }

    private final int _outputMultiByteChar(int i, int i2) throws IOException {
        byte[] bArr = this._outputBuffer;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = BYTE_BACKSLASH;
        int i7 = i6 + 1;
        bArr[i6] = BYTE_u;
        int i8 = i7 + 1;
        byte[] bArr2 = HEX_CHARS;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    private final int _outputRawMultiByteChar(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this._outputBuffer;
            int i4 = this._outputTail;
            int i5 = i4 + 1;
            this._outputTail = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            this._outputTail = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this._outputTail = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3 || cArr == null) {
            _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i)}));
        }
        _outputSurrogates(i, cArr[i2]);
        return i2 + 1;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr[i4] = bArr[i];
            i4 = i5;
            i = i6;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i7 = min - i4;
            if (i7 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i7);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private final void _writeBytes(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > MAX_BYTES_TO_BUFFER) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i, SerializableString serializableString, int i2) throws IOException, JsonGenerationException {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i, this._outputEnd, asUnquotedUTF8, i2);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c);
                        if (escapeSequence == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(c));
                            sb.append(", although was supposed to have one");
                            _reportError(sb.toString());
                        }
                        i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = _writeGenericEscape(c, i3);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c);
                if (escapeSequence2 != null) {
                    i3 = _writeCustomEscape(bArr, i3, escapeSequence2, i2 - i5);
                } else if (c <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((c & '?') | 128);
                } else {
                    i3 = _outputMultiByteChar(c, i3);
                }
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private int _writeGenericEscape(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this._outputBuffer;
        int i4 = i2 + 1;
        bArr[i2] = BYTE_BACKSLASH;
        int i5 = i4 + 1;
        bArr[i4] = BYTE_u;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = BYTE_0;
            i3 = i8 + 1;
            bArr[i8] = BYTE_0;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i, bArr, i3);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        bArr[i] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j, bArr, i2);
        this._outputTail = outputLong;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        bArr2[outputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        bArr[i] = this._quoteChar;
        int outputInt = NumberOutput.outputInt((int) s, bArr, i2);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r7 >= 2048) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5._outputTail = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r7 = _outputRawMultiByteChar(r7, r6, r0, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeRawSegment(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
        L_0x0000:
            if (r7 >= r8) goto L_0x0040
        L_0x0002:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0031
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x002c
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5._outputTail = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            r7 = r0
            goto L_0x0000
        L_0x002c:
            int r7 = r5._outputRawMultiByteChar(r7, r6, r0, r8)
            goto L_0x0000
        L_0x0031:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0002
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeRawSegment(char[], int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r9 = _outputRawMultiByteChar(r9, r8, r2, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r7._outputTail + 3) < r7._outputEnd) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        _flushBuffer();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r9 + 1;
        r9 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9 >= 2048) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r7._outputTail;
        r5 = r4 + 1;
        r7._outputTail = r5;
        r1[r4] = (byte) ((r9 >> 6) | 192);
        r7._outputTail = r5 + 1;
        r1[r5] = (byte) ((r9 & '?') | 128);
        r9 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void _writeSegmentedRaw(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7._outputEnd
            byte[] r1 = r7._outputBuffer
            int r10 = r10 + r9
        L_0x0005:
            if (r9 >= r10) goto L_0x0052
        L_0x0007:
            char r2 = r8[r9]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x003e
            int r2 = r7._outputTail
            int r2 = r2 + 3
            int r4 = r7._outputEnd
            if (r2 < r4) goto L_0x0018
            r7._flushBuffer()
        L_0x0018:
            int r2 = r9 + 1
            char r9 = r8[r9]
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 >= r4) goto L_0x0039
            int r4 = r7._outputTail
            int r5 = r4 + 1
            r7._outputTail = r5
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r4] = r6
            int r4 = r5 + 1
            r7._outputTail = r4
            r9 = r9 & 63
            r9 = r9 | r3
            byte r9 = (byte) r9
            r1[r5] = r9
            r9 = r2
            goto L_0x0005
        L_0x0039:
            int r9 = r7._outputRawMultiByteChar(r9, r8, r2, r10)
            goto L_0x0005
        L_0x003e:
            int r3 = r7._outputTail
            if (r3 < r0) goto L_0x0045
            r7._flushBuffer()
        L_0x0045:
            int r3 = r7._outputTail
            int r4 = r3 + 1
            r7._outputTail = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r9 = r9 + 1
            if (r9 < r10) goto L_0x0007
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(char[], int, int):void");
    }

    private final void _writeStringSegment(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) c;
            i++;
            i4 = i5;
        }
        this._outputTail = i4;
        if (i >= i3) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(cArr, i, i3);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(cArr, i, i3);
        } else {
            _writeStringSegmentASCII2(cArr, i, i3);
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(c, i3);
            }
            i = i4;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = _writeGenericEscape(c, i3);
            } else if (c <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((c & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(c, i3);
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegments(String str, boolean z) throws IOException {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr2[i3] = this._quoteChar;
        }
    }

    private final void _writeUTF8Segment(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int[] iArr = this._outputEscapes;
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < 0 || iArr[b] == 0) {
                i4 = i5;
            } else {
                _writeUTF8Segment2(bArr, i, i2);
                return;
            }
        }
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    private final void _writeUTF8Segment2(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3;
        int i4 = this._outputTail;
        if ((i2 * 6) + i4 > this._outputEnd) {
            _flushBuffer();
            i4 = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = i2 + i;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            if (b < 0 || iArr[b] == 0) {
                int i7 = i3 + 1;
                bArr2[i3] = b;
                i = i6;
                i3 = i7;
            } else {
                int i8 = iArr[b];
                if (i8 > 0) {
                    int i9 = i3 + 1;
                    bArr2[i3] = BYTE_BACKSLASH;
                    i3 = i9 + 1;
                    bArr2[i9] = (byte) i8;
                } else {
                    i3 = _writeGenericEscape(b, i3);
                }
                i = i6;
            }
        }
        this._outputTail = i3;
    }

    private final void _writeUTF8Segments(byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            _writeUTF8Segment(bArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void _writeUnq(SerializableString serializableString) throws IOException {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    /* access modifiers changed from: protected */
    public final void _flushBuffer() throws IOException {
        int i = this._outputTail;
        if (i > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void _outputSurrogates(int i, int i2) throws IOException {
        int _decodeSurrogate = _decodeSurrogate(i, i2);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i6 = i5 + 1;
        this._outputTail = i6;
        bArr[i5] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i6 + 1;
        bArr[i6] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public final void _verifyValueWrite(String str) throws IOException {
        byte b;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b = BYTE_COMMA;
        } else if (writeValue == 2) {
            b = BYTE_COLON;
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    _writeBytes(asUnquotedUTF8);
                }
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            return;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = b;
    }

    /* access modifiers changed from: protected */
    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i8 = encodeBase64Chunk + 1;
                this._outputTail = i8;
                bArr2[encodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = i8 + 1;
                bArr2[i8] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i7;
        }
        int i9 = i2 - i;
        if (i9 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i10 = i + 1;
            int i11 = bArr[i] << TType.f16865n;
            if (i9 == 2) {
                i11 |= (bArr[i10] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i11, i9, this._outputBuffer, this._outputTail);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        _releaseBuffers();
    }

    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public int getOutputBuffered() {
        return this._outputTail;
    }

    public Object getOutputTarget() {
        return this._outputStream;
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    public void writeBoolean(boolean z) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current context not Array but ");
            sb.append(this._writeContext.typeDesc());
            _reportError(sb.toString());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = BYTE_RBRACKET;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current context not Object but ");
            sb.append(this._writeContext.typeDesc());
            _reportError(sb.toString());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = BYTE_RCURLY;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr2[i2] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i3 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        writeRaw(str, 0, length);
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        _writeBytes(bArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        int appendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (appendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += appendUnquotedUTF8;
        }
    }

    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_LBRACKET;
    }

    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_LCURLY;
    }

    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        if (i2 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i, i2);
        } else {
            _writeUTF8Segments(bArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    private final void _writeBytes(byte[] bArr, int i, int i2) throws IOException {
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
            if (i2 > MAX_BYTES_TO_BUFFER) {
                this._outputStream.write(bArr, i, i2);
                return;
            }
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    public void writeNumber(int i) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
        } else {
            this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str, int i, int i2) throws IOException {
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            writeRaw(cArr, 0, i2);
            return;
        }
        int i3 = this._outputEnd;
        int min = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = min * 3;
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this._outputTail + i4 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1) {
                char c = cArr[min2 - 1];
                if (c >= 55296 && c <= 56319) {
                    min2--;
                }
            }
            _writeRawSegment(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }

    private void _writeQuotedRaw(char[] cArr, int i, int i2) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        writeRaw(cArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }

    public void writeStartArray(int i) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = BYTE_LBRACKET;
    }

    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = BYTE_LCURLY;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i < 0) {
            try {
                i = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i);
            if (_writeBinary > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Too few bytes available: missing ");
                sb.append(_writeBinary);
                sb.append(" bytes (out of ");
                sb.append(i);
                sb.append(")");
                _reportError(sb.toString());
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        return i;
    }

    private final void _writeStringSegments(char[] cArr, int i, int i2) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream, char c, byte[] bArr, int i2, boolean z) {
        super(iOContext, i, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c;
        if (c != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c);
        }
        this._bufferRecyclable = z;
        this._outputTail = i2;
        this._outputBuffer = bArr;
        int length = bArr.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
    }

    private final void _writeStringSegment(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) charAt;
            i++;
            i4 = i5;
        }
        this._outputTail = i4;
        if (i >= i3) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(str, i, i3);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(str, i, i3);
        } else {
            _writeStringSegmentASCII2(str, i, i3);
        }
    }

    public void writeNumber(long j) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    public void writeString(Reader reader, int i) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
        }
        int i2 = i >= 0 ? i : Integer.MAX_VALUE;
        char[] cArr = this._charBuffer;
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        while (i2 > 0) {
            int read = reader.read(cArr, 0, Math.min(i2, cArr.length));
            if (read <= 0) {
                break;
            }
            if (this._outputTail + i >= this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegments(cArr, 0, read);
            i2 -= read;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        if (i2 > 0 && i >= 0) {
            _reportError("Didn't read enough from reader");
        }
    }

    private final void _writeStringSegments(String str, int i, int i2) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private final void _writeStringSegment2(String str, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[charAt];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(charAt, i3);
            }
            i = i4;
        }
        this._outputTail = i3;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) throws IOException, JsonGenerationException {
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i5 > i4) {
                i6 = _readMore(inputStream, bArr, i5, i6, i);
                if (i6 < 3) {
                    i5 = 0;
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i7 = i5 + 1;
            int i8 = bArr[i5] << 8;
            int i9 = i7 + 1;
            i5 = i9 + 1;
            i -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | i8) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr2[encodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        int _readMore = _readMore(inputStream, bArr, i5, i6, i);
        if (_readMore <= 0) {
            return i;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i11 = bArr[0] << TType.f16865n;
        if (1 < _readMore) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i11, i3, this._outputBuffer, this._outputTail);
        return i - i3;
    }

    public void writeRaw(SerializableString serializableString) throws IOException {
        int appendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (appendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += appendUnquotedUTF8;
        }
    }

    private final void _writeStringSegmentASCII2(String str, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = _writeGenericEscape(charAt, i3);
            } else if (charAt <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = _outputMultiByteChar(charAt, i3);
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r7 + 1;
        r7 = r6[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r7 >= 2048) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r5._outputBuffer;
        r2 = r5._outputTail;
        r3 = r2 + 1;
        r5._outputTail = r3;
        r1[r2] = (byte) ((r7 >> 6) | 192);
        r5._outputTail = r3 + 1;
        r1[r3] = (byte) ((r7 & '?') | 128);
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r7 = _outputRawMultiByteChar(r7, r6, r0, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRaw(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r8 + r8
            int r0 = r0 + r8
            int r1 = r5._outputTail
            int r1 = r1 + r0
            int r2 = r5._outputEnd
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r5._writeSegmentedRaw(r6, r7, r8)
            return
        L_0x0010:
            r5._flushBuffer()
        L_0x0013:
            int r8 = r8 + r7
        L_0x0014:
            if (r7 >= r8) goto L_0x0054
        L_0x0016:
            char r0 = r6[r7]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0045
            int r0 = r7 + 1
            char r7 = r6[r7]
            r1 = 2048(0x800, float:2.87E-42)
            if (r7 >= r1) goto L_0x0040
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            int r4 = r7 >> 6
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r1[r2] = r4
            int r2 = r3 + 1
            r5._outputTail = r2
            r7 = r7 & 63
            r7 = r7 | 128(0x80, float:1.794E-43)
            byte r7 = (byte) r7
            r1[r3] = r7
            r7 = r0
            goto L_0x0014
        L_0x0040:
            int r7 = r5._outputRawMultiByteChar(r7, r6, r0, r8)
            goto L_0x0014
        L_0x0045:
            byte[] r1 = r5._outputBuffer
            int r2 = r5._outputTail
            int r3 = r2 + 1
            r5._outputTail = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x0016
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(char[], int, int):void");
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z = !this._cfgUnqNames;
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
        }
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr2[i2] = this._quoteChar;
        }
    }

    @Deprecated
    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream) {
        this(iOContext, i, objectCodec, outputStream, JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = BYTE_COMMA;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr2[i2] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i3);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr3[i4] = this._quoteChar;
    }

    public void writeNumber(double d) throws IOException {
        if (this._cfgNumbersAsStrings || (NumberOutput.notFinite(d) && Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d));
    }

    @Deprecated
    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream, byte[] bArr, int i2, boolean z) {
        this(iOContext, i, objectCodec, outputStream, JsonFactory.DEFAULT_QUOTE_CHAR, bArr, i2, z);
    }

    private final void _writeCustomStringSegment2(String str, int i, int i2) throws IOException {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = BYTE_BACKSLASH;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(charAt);
                        if (escapeSequence == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(charAt));
                            sb.append(", although was supposed to have one");
                            _reportError(sb.toString());
                        }
                        i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        i3 = _writeGenericEscape(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = _writeGenericEscape(charAt, i3);
            } else {
                SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(charAt);
                if (escapeSequence2 != null) {
                    i3 = _writeCustomEscape(bArr, i3, escapeSequence2, i2 - i5);
                } else if (charAt <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((charAt & '?') | 128);
                } else {
                    i3 = _outputMultiByteChar(charAt, i3);
                }
            }
            i = i5;
        }
        this._outputTail = i3;
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = this._quoteChar;
        if (i2 <= this._outputMaxContiguous) {
            if (i4 + i2 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, i2);
        } else {
            _writeStringSegments(cArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr2[i5] = this._quoteChar;
    }

    public void writeNumber(float f) throws IOException {
        if (this._cfgNumbersAsStrings || (NumberOutput.notFinite(f) && Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(f));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f));
    }

    public void writeRaw(char c) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c <= 127) {
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this._outputTail;
            int i3 = i2 + 1;
            this._outputTail = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this._outputTail = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            _outputRawMultiByteChar(c, null, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i = this._outputEnd - 6;
        int i2 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 > i3) {
                i5 = _readMore(inputStream, bArr, i4, i5, bArr.length);
                if (i5 < 3) {
                    break;
                }
                i3 = i5 - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i7 = i4 + 1;
            int i8 = bArr[i4] << 8;
            int i9 = i7 + 1;
            i4 = i9 + 1;
            i6 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((int) (((bArr[i7] & 255) | i8) << 8) | (bArr[i9] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr2[encodeBase64Chunk] = BYTE_BACKSLASH;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0) {
            return i6;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        int i11 = bArr[0] << TType.f16865n;
        if (1 < i5) {
            i11 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i12 = i6 + i2;
        this._outputTail = base64Variant.encodeBase64Partial(i11, i2, this._outputBuffer, this._outputTail);
        return i12;
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        bArr[i] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i2);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    public void writeNumber(char[] cArr, int i, int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(cArr, i, i2);
        } else {
            writeRaw(cArr, i, i2);
        }
    }
}
