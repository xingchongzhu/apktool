package android.support.p004v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p004v4.media.session.MediaSessionCompat;
import p010b.p025d.ArrayMap;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C0008a();

    /* renamed from: a */
    static final ArrayMap<String, Integer> f29a;

    /* renamed from: b */
    private static final String[] f30b = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: c */
    private static final String[] f31c;

    /* renamed from: d */
    private static final String[] f32d;

    /* renamed from: e */
    final Bundle f33e;

    /* renamed from: f */
    private MediaMetadata f34f;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    class C0008a implements Creator<MediaMetadataCompat> {
        C0008a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        ArrayMap<String, Integer> aVar = new ArrayMap<>();
        f29a = aVar;
        Integer valueOf = Integer.valueOf(1);
        aVar.put("android.media.metadata.TITLE", valueOf);
        aVar.put("android.media.metadata.ARTIST", valueOf);
        Integer valueOf2 = Integer.valueOf(0);
        aVar.put("android.media.metadata.DURATION", valueOf2);
        aVar.put("android.media.metadata.ALBUM", valueOf);
        aVar.put("android.media.metadata.AUTHOR", valueOf);
        aVar.put("android.media.metadata.WRITER", valueOf);
        aVar.put("android.media.metadata.COMPOSER", valueOf);
        aVar.put("android.media.metadata.COMPILATION", valueOf);
        aVar.put("android.media.metadata.DATE", valueOf);
        aVar.put("android.media.metadata.YEAR", valueOf2);
        aVar.put("android.media.metadata.GENRE", valueOf);
        aVar.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        aVar.put("android.media.metadata.NUM_TRACKS", valueOf2);
        aVar.put("android.media.metadata.DISC_NUMBER", valueOf2);
        aVar.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        Integer valueOf3 = Integer.valueOf(2);
        String str = "android.media.metadata.ART";
        aVar.put(str, valueOf3);
        String str2 = "android.media.metadata.ART_URI";
        aVar.put(str2, valueOf);
        String str3 = "android.media.metadata.ALBUM_ART";
        aVar.put(str3, valueOf3);
        String str4 = "android.media.metadata.ALBUM_ART_URI";
        aVar.put(str4, valueOf);
        Integer valueOf4 = Integer.valueOf(3);
        aVar.put("android.media.metadata.USER_RATING", valueOf4);
        aVar.put("android.media.metadata.RATING", valueOf4);
        aVar.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        String str5 = "android.media.metadata.DISPLAY_ICON";
        aVar.put(str5, valueOf3);
        String str6 = "android.media.metadata.DISPLAY_ICON_URI";
        aVar.put(str6, valueOf);
        aVar.put("android.media.metadata.MEDIA_ID", valueOf);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        aVar.put("android.media.metadata.MEDIA_URI", valueOf);
        aVar.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        f31c = new String[]{str5, str, str3};
        f32d = new String[]{str6, str2, str4};
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f33e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: l */
    public static MediaMetadataCompat m24l(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f34f = mediaMetadata;
        return mediaMetadataCompat;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f33e);
    }
}
