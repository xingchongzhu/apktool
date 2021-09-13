package android.support.p004v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p004v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Objects;
import p000a.p001a.p002a.p003a.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6l(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.m37b(bundle);
        }
        if (i == 0 && bundle != null) {
            String str = "search_results";
            if (bundle.containsKey(str)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                Objects.requireNonNull(parcelableArray);
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                }
                throw null;
            }
        }
        throw null;
    }
}
