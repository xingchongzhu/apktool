package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.load.p158p.p159d.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.f */
public final class ImageHeaderParserUtils {

    /* renamed from: com.bumptech.glide.load.f$a */
    /* compiled from: ImageHeaderParserUtils */
    class C1431a implements C1437g {

        /* renamed from: a */
        final /* synthetic */ InputStream f10335a;

        C1431a(InputStream inputStream) {
            this.f10335a = inputStream;
        }

        /* renamed from: a */
        public ImageType mo8824a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo8770c(this.f10335a);
            } finally {
                this.f10335a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$b */
    /* compiled from: ImageHeaderParserUtils */
    class C1432b implements C1437g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f10336a;

        C1432b(ByteBuffer byteBuffer) {
            this.f10336a = byteBuffer;
        }

        /* renamed from: a */
        public ImageType mo8824a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo8768a(this.f10336a);
        }
    }

    /* renamed from: com.bumptech.glide.load.f$c */
    /* compiled from: ImageHeaderParserUtils */
    class C1433c implements C1437g {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f10337a;

        /* renamed from: b */
        final /* synthetic */ ArrayPool f10338b;

        C1433c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool bVar) {
            this.f10337a = parcelFileDescriptorRewinder;
            this.f10338b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo8824a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.p.d.x r1 = new com.bumptech.glide.load.p.d.x     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f10337a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo8773a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.n.a0.b r3 = r4.f10338b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo8770c(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10337a
                r0.mo8773a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10337a
                r0.mo8773a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.ImageHeaderParserUtils.C1433c.mo8824a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$d */
    /* compiled from: ImageHeaderParserUtils */
    class C1434d implements C1436f {

        /* renamed from: a */
        final /* synthetic */ InputStream f10339a;

        /* renamed from: b */
        final /* synthetic */ ArrayPool f10340b;

        C1434d(InputStream inputStream, ArrayPool bVar) {
            this.f10339a = inputStream;
            this.f10340b = bVar;
        }

        /* renamed from: a */
        public int mo8825a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo8769b(this.f10339a, this.f10340b);
            } finally {
                this.f10339a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.f$e */
    /* compiled from: ImageHeaderParserUtils */
    class C1435e implements C1436f {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptorRewinder f10341a;

        /* renamed from: b */
        final /* synthetic */ ArrayPool f10342b;

        C1435e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool bVar) {
            this.f10341a = parcelFileDescriptorRewinder;
            this.f10342b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo8825a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.p.d.x r1 = new com.bumptech.glide.load.p.d.x     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f10341a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo8773a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.a0.b r3 = r4.f10342b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.n.a0.b r0 = r4.f10342b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo8769b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10341a
                r0.mo8773a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10341a
                r0.mo8773a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.ImageHeaderParserUtils.C1435e.mo8825a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.f$f */
    /* compiled from: ImageHeaderParserUtils */
    private interface C1436f {
        /* renamed from: a */
        int mo8825a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.f$g */
    /* compiled from: ImageHeaderParserUtils */
    private interface C1437g {
        /* renamed from: a */
        ImageType mo8824a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    public static int m12588a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool bVar) throws IOException {
        return m12590c(list, new C1435e(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: b */
    public static int m12589b(List<ImageHeaderParser> list, InputStream inputStream, ArrayPool bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m12590c(list, new C1434d(inputStream, bVar));
    }

    /* renamed from: c */
    private static int m12590c(List<ImageHeaderParser> list, C1436f fVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = fVar.mo8825a((ImageHeaderParser) list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageType m12591d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, ArrayPool bVar) throws IOException {
        return m12594g(list, new C1433c(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: e */
    public static ImageType m12592e(List<ImageHeaderParser> list, InputStream inputStream, ArrayPool bVar) throws IOException {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m12594g(list, new C1431a(inputStream));
    }

    /* renamed from: f */
    public static ImageType m12593f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageType.UNKNOWN;
        }
        return m12594g(list, new C1432b(byteBuffer));
    }

    /* renamed from: g */
    private static ImageType m12594g(List<ImageHeaderParser> list, C1437g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageType a = gVar.mo8824a((ImageHeaderParser) list.get(i));
            if (a != ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageType.UNKNOWN;
    }
}
