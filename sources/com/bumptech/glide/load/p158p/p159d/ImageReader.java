package com.bumptech.glide.load.p158p.p159d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p152n.p153a0.ArrayPool;
import com.bumptech.glide.p174t.C1638j;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.d.t */
interface ImageReader {

    /* renamed from: com.bumptech.glide.load.p.d.t$a */
    /* compiled from: ImageReader */
    public static final class C1595a implements ImageReader {

        /* renamed from: a */
        private final InputStreamRewinder f10896a;

        /* renamed from: b */
        private final ArrayPool f10897b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f10898c;

        C1595a(InputStream inputStream, List<ImageHeaderParser> list, ArrayPool bVar) {
            this.f10897b = (ArrayPool) C1638j.m14081d(bVar);
            this.f10898c = (List) C1638j.m14081d(list);
            this.f10896a = new InputStreamRewinder(inputStream, bVar);
        }

        /* renamed from: a */
        public Bitmap mo9234a(Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f10896a.mo8773a(), null, options);
        }

        /* renamed from: b */
        public void mo9235b() {
            this.f10896a.mo8811c();
        }

        /* renamed from: c */
        public int mo9236c() throws IOException {
            return ImageHeaderParserUtils.m12589b(this.f10898c, this.f10896a.mo8773a(), this.f10897b);
        }

        /* renamed from: d */
        public ImageType mo9237d() throws IOException {
            return ImageHeaderParserUtils.m12592e(this.f10898c, this.f10896a.mo8773a(), this.f10897b);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.t$b */
    /* compiled from: ImageReader */
    public static final class C1596b implements ImageReader {

        /* renamed from: a */
        private final ArrayPool f10899a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f10900b;

        /* renamed from: c */
        private final ParcelFileDescriptorRewinder f10901c;

        C1596b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ArrayPool bVar) {
            this.f10899a = (ArrayPool) C1638j.m14081d(bVar);
            this.f10900b = (List) C1638j.m14081d(list);
            this.f10901c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public Bitmap mo9234a(Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f10901c.mo8773a().getFileDescriptor(), null, options);
        }

        /* renamed from: b */
        public void mo9235b() {
        }

        /* renamed from: c */
        public int mo9236c() throws IOException {
            return ImageHeaderParserUtils.m12588a(this.f10900b, this.f10901c, this.f10899a);
        }

        /* renamed from: d */
        public ImageType mo9237d() throws IOException {
            return ImageHeaderParserUtils.m12591d(this.f10900b, this.f10901c, this.f10899a);
        }
    }

    /* renamed from: a */
    Bitmap mo9234a(Options options) throws IOException;

    /* renamed from: b */
    void mo9235b();

    /* renamed from: c */
    int mo9236c() throws IOException;

    /* renamed from: d */
    ImageType mo9237d() throws IOException;
}
