package com.bumptech.glide.load.p158p.p159d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Option.C1439b;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.p152n.Resource;
import com.bumptech.glide.load.p152n.p153a0.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.p.d.d0 */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {

    /* renamed from: a */
    public static final Option<Long> f10833a = Option.m12603a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C1571a());

    /* renamed from: b */
    public static final Option<Integer> f10834b = Option.m12603a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C1572b());

    /* renamed from: c */
    private static final C1576e f10835c = new C1576e();

    /* renamed from: d */
    private final C1577f<T> f10836d;

    /* renamed from: e */
    private final BitmapPool f10837e;

    /* renamed from: f */
    private final C1576e f10838f;

    /* renamed from: com.bumptech.glide.load.p.d.d0$a */
    /* compiled from: VideoDecoder */
    class C1571a implements C1439b<Long> {

        /* renamed from: a */
        private final ByteBuffer f10839a = ByteBuffer.allocate(8);

        C1571a() {
        }

        /* renamed from: b */
        public void mo8834a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f10839a) {
                this.f10839a.position(0);
                messageDigest.update(this.f10839a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$b */
    /* compiled from: VideoDecoder */
    class C1572b implements C1439b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f10840a = ByteBuffer.allocate(4);

        C1572b() {
        }

        /* renamed from: b */
        public void mo8834a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f10840a) {
                    this.f10840a.position(0);
                    messageDigest.update(this.f10840a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$c */
    /* compiled from: VideoDecoder */
    private static final class C1573c implements C1577f<AssetFileDescriptor> {
        private C1573c() {
        }

        /* renamed from: b */
        public void mo9201a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ C1573c(C1571a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$d */
    /* compiled from: VideoDecoder */
    static final class C1574d implements C1577f<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.p.d.d0$d$a */
        /* compiled from: VideoDecoder */
        class C1575a extends MediaDataSource {

            /* renamed from: a */
            final /* synthetic */ ByteBuffer f10841a;

            C1575a(ByteBuffer byteBuffer) {
                this.f10841a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f10841a.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f10841a.limit())) {
                    return -1;
                }
                this.f10841a.position((int) j);
                int min = Math.min(i2, this.f10841a.remaining());
                this.f10841a.get(bArr, i, min);
                return min;
            }
        }

        C1574d() {
        }

        /* renamed from: b */
        public void mo9201a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C1575a(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$e */
    /* compiled from: VideoDecoder */
    static class C1576e {
        C1576e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo9207a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$f */
    /* compiled from: VideoDecoder */
    interface C1577f<T> {
        /* renamed from: a */
        void mo9201a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$g */
    /* compiled from: VideoDecoder */
    static final class C1578g implements C1577f<ParcelFileDescriptor> {
        C1578g() {
        }

        /* renamed from: b */
        public void mo9201a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.d0$h */
    /* compiled from: VideoDecoder */
    private static final class C1579h extends RuntimeException {
        C1579h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    VideoDecoder(BitmapPool eVar, C1577f<T> fVar) {
        this(eVar, fVar, f10835c);
    }

    /* renamed from: c */
    public static ResourceDecoder<AssetFileDescriptor, Bitmap> m13303c(BitmapPool eVar) {
        return new VideoDecoder(eVar, new C1573c(null));
    }

    /* renamed from: d */
    public static ResourceDecoder<ByteBuffer, Bitmap> m13304d(BitmapPool eVar) {
        return new VideoDecoder(eVar, new C1574d());
    }

    /* renamed from: e */
    private static Bitmap m13305e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy mVar) {
        Bitmap g = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || mVar == DownsampleStrategy.f10860f) ? null : m13307g(mediaMetadataRetriever, j, i, i2, i3, mVar);
        if (g == null) {
            g = m13306f(mediaMetadataRetriever, j, i);
        }
        if (g != null) {
            return g;
        }
        throw new C1579h();
    }

    /* renamed from: f */
    private static Bitmap m13306f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: g */
    private static Bitmap m13307g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy mVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = mVar.mo9224b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            String str = "VideoDecoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            }
            return null;
        }
    }

    /* renamed from: h */
    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> m13308h(BitmapPool eVar) {
        return new VideoDecoder(eVar, new C1578g());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public Resource<Bitmap> mo8839a(T t, int i, int i2, Options iVar) throws IOException {
        long longValue = ((Long) iVar.mo8835c(f10833a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo8835c(f10834b);
            if (num == null) {
                num = Integer.valueOf(2);
            }
            DownsampleStrategy mVar = (DownsampleStrategy) iVar.mo8835c(DownsampleStrategy.f10862h);
            if (mVar == null) {
                mVar = DownsampleStrategy.f10861g;
            }
            DownsampleStrategy mVar2 = mVar;
            MediaMetadataRetriever a = this.f10838f.mo9207a();
            try {
                this.f10836d.mo9201a(a, t);
                Bitmap e = m13305e(a, longValue, num.intValue(), i, i2, mVar2);
                a.release();
                return BitmapResource.m13323g(e, this.f10837e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public boolean mo8840b(T t, Options iVar) {
        return true;
    }

    VideoDecoder(BitmapPool eVar, C1577f<T> fVar, C1576e eVar2) {
        this.f10837e = eVar;
        this.f10836d = fVar;
        this.f10838f = eVar2;
    }
}
