package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.source.hls.h */
final class FullSegmentEncryptionKeyCache {

    /* renamed from: a */
    private final LinkedHashMap<Uri, byte[]> f11573a;

    /* renamed from: com.google.android.exoplayer2.source.hls.h$a */
    /* compiled from: FullSegmentEncryptionKeyCache */
    class C1823a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: a */
        final /* synthetic */ int f11574a;

        C1823a(int i, float f, boolean z, int i2) {
            this.f11574a = i2;
            super(i, f, z);
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Entry<Uri, byte[]> entry) {
            return size() > this.f11574a;
        }
    }

    public FullSegmentEncryptionKeyCache(int i) {
        C1823a aVar = new C1823a(i + 1, 1.0f, false, i);
        this.f11573a = aVar;
    }

    /* renamed from: a */
    public byte[] mo14575a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f11573a.get(uri);
    }

    /* renamed from: b */
    public byte[] mo14576b(Uri uri, byte[] bArr) {
        return (byte[]) this.f11573a.put((Uri) Assertions.m10153e(uri), (byte[]) Assertions.m10153e(bArr));
    }

    /* renamed from: c */
    public byte[] mo14577c(Uri uri) {
        return (byte[]) this.f11573a.remove(Assertions.m10153e(uri));
    }
}
