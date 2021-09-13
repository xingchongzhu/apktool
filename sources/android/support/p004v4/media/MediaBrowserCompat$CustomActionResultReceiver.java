package android.support.p004v4.media;

import android.os.Bundle;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import p000a.p001a.p002a.p003a.ResultReceiver;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {

    /* renamed from: d */
    private final Bundle f8d;

    /* renamed from: e */
    private final MediaBrowserCompat f9e;

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6l(int i, Bundle bundle) {
        if (this.f9e != null) {
            MediaSessionCompat.m36a(bundle);
            if (i == -1) {
                throw null;
            } else if (i == 0) {
                throw null;
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown result code: ");
                sb.append(i);
                sb.append(" (extras=");
                sb.append(this.f8d);
                sb.append(", resultData=");
                sb.append(bundle);
                sb.append(")");
                Log.w("MediaBrowserCompat", sb.toString());
            } else {
                throw null;
            }
        }
    }
}
