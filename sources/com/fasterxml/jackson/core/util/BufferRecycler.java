package com.fasterxml.jackson.core.util;

import com.p259uc.crashsdk.export.CrashStatKey;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, CrashStatKey.LOG_LEGACY_TMP_FILE, CrashStatKey.LOG_LEGACY_TMP_FILE};
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i) {
        return allocByteBuffer(i, 0);
    }

    public final char[] allocCharBuffer(int i) {
        return allocCharBuffer(i, 0);
    }

    /* access modifiers changed from: protected */
    public byte[] balloc(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    public int byteBufferLength(int i) {
        return BYTE_BUFFER_LENGTHS[i];
    }

    /* access modifiers changed from: protected */
    public char[] calloc(int i) {
        return new char[i];
    }

    /* access modifiers changed from: protected */
    public int charBufferLength(int i) {
        return CHAR_BUFFER_LENGTHS[i];
    }

    public void releaseByteBuffer(int i, byte[] bArr) {
        this._byteBuffers.set(i, bArr);
    }

    public void releaseCharBuffer(int i, char[] cArr) {
        this._charBuffers.set(i, cArr);
    }

    protected BufferRecycler(int i, int i2) {
        this._byteBuffers = new AtomicReferenceArray<>(i);
        this._charBuffers = new AtomicReferenceArray<>(i2);
    }

    public byte[] allocByteBuffer(int i, int i2) {
        int byteBufferLength = byteBufferLength(i);
        if (i2 < byteBufferLength) {
            i2 = byteBufferLength;
        }
        byte[] bArr = (byte[]) this._byteBuffers.getAndSet(i, null);
        return (bArr == null || bArr.length < i2) ? balloc(i2) : bArr;
    }

    public char[] allocCharBuffer(int i, int i2) {
        int charBufferLength = charBufferLength(i);
        if (i2 < charBufferLength) {
            i2 = charBufferLength;
        }
        char[] cArr = (char[]) this._charBuffers.getAndSet(i, null);
        return (cArr == null || cArr.length < i2) ? calloc(i2) : cArr;
    }
}
