package android.support.p004v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p004v4.media.session.MediaSessionCompat;
import p000a.p001a.p002a.p003a.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6l(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m37b(bundle);
        }
        if (i == 0 && bundle != null) {
            String str = "media_item";
            if (bundle.containsKey(str)) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
                    MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
                    throw null;
                }
                throw null;
            }
        }
        throw null;
    }
}
