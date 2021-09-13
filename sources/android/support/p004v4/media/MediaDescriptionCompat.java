package android.support.p004v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C0006a();

    /* renamed from: a */
    private final String f12a;

    /* renamed from: b */
    private final CharSequence f13b;

    /* renamed from: c */
    private final CharSequence f14c;

    /* renamed from: d */
    private final CharSequence f15d;

    /* renamed from: e */
    private final Bitmap f16e;

    /* renamed from: f */
    private final Uri f17f;

    /* renamed from: g */
    private final Bundle f18g;

    /* renamed from: h */
    private final Uri f19h;

    /* renamed from: i */
    private MediaDescription f20i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0006a implements Creator<MediaDescriptionCompat> {
        C0006a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m11l(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0007b {

        /* renamed from: a */
        private String f21a;

        /* renamed from: b */
        private CharSequence f22b;

        /* renamed from: c */
        private CharSequence f23c;

        /* renamed from: d */
        private CharSequence f24d;

        /* renamed from: e */
        private Bitmap f25e;

        /* renamed from: f */
        private Uri f26f;

        /* renamed from: g */
        private Bundle f27g;

        /* renamed from: h */
        private Uri f28h;

        /* renamed from: a */
        public MediaDescriptionCompat mo28a() {
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(this.f21a, this.f22b, this.f23c, this.f24d, this.f25e, this.f26f, this.f27g, this.f28h);
            return mediaDescriptionCompat;
        }

        /* renamed from: b */
        public C0007b mo29b(CharSequence charSequence) {
            this.f24d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0007b mo30c(Bundle bundle) {
            this.f27g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0007b mo31d(Bitmap bitmap) {
            this.f25e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0007b mo32e(Uri uri) {
            this.f26f = uri;
            return this;
        }

        /* renamed from: f */
        public C0007b mo33f(String str) {
            this.f21a = str;
            return this;
        }

        /* renamed from: g */
        public C0007b mo34g(Uri uri) {
            this.f28h = uri;
            return this;
        }

        /* renamed from: h */
        public C0007b mo35h(CharSequence charSequence) {
            this.f23c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0007b mo36i(CharSequence charSequence) {
            this.f22b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f12a = str;
        this.f13b = charSequence;
        this.f14c = charSequence2;
        this.f15d = charSequence3;
        this.f16e = bitmap;
        this.f17f = uri;
        this.f18g = bundle;
        this.f19h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p004v4.media.MediaDescriptionCompat m11l(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.mo33f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.mo36i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.mo35h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.mo29b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.mo31d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.mo32e(r3)
            android.os.Bundle r3 = r9.getExtras()
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.p004v4.media.session.MediaSessionCompat.m37b(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.mo30c(r0)
            if (r5 == 0) goto L_0x0072
            r2.mo34g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = r9.getMediaUri()
            r2.mo34g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo28a()
            r0.f20i = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p004v4.media.MediaDescriptionCompat.m11l(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: m */
    public Object mo21m() {
        MediaDescription mediaDescription = this.f20i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        int i = VERSION.SDK_INT;
        if (i < 21) {
            return mediaDescription;
        }
        Builder builder = new Builder();
        builder.setMediaId(this.f12a);
        builder.setTitle(this.f13b);
        builder.setSubtitle(this.f14c);
        builder.setDescription(this.f15d);
        builder.setIconBitmap(this.f16e);
        builder.setIconUri(this.f17f);
        Bundle bundle = this.f18g;
        if (i < 23 && this.f19h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f19h);
        }
        builder.setExtras(bundle);
        if (i >= 23) {
            builder.setMediaUri(this.f19h);
        }
        MediaDescription build = builder.build();
        this.f20i = build;
        return build;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13b);
        String str = ", ";
        sb.append(str);
        sb.append(this.f14c);
        sb.append(str);
        sb.append(this.f15d);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f12a);
            TextUtils.writeToParcel(this.f13b, parcel, i);
            TextUtils.writeToParcel(this.f14c, parcel, i);
            TextUtils.writeToParcel(this.f15d, parcel, i);
            parcel.writeParcelable(this.f16e, i);
            parcel.writeParcelable(this.f17f, i);
            parcel.writeBundle(this.f18g);
            parcel.writeParcelable(this.f19h, i);
            return;
        }
        ((MediaDescription) mo21m()).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f12a = parcel.readString();
        this.f13b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f15d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f16e = (Bitmap) parcel.readParcelable(classLoader);
        this.f17f = (Uri) parcel.readParcelable(classLoader);
        this.f18g = parcel.readBundle(classLoader);
        this.f19h = (Uri) parcel.readParcelable(classLoader);
    }
}
