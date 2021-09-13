package android.support.p004v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.IMediaSession.C0018a;
import android.support.p004v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p004v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f37a;

    /* renamed from: b */
    private final List<MediaControllerCompat> f38b;

    /* renamed from: c */
    private HashMap<MediaControllerCompat, C0010a> f39c;

    /* renamed from: d */
    final Token f40d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f41a;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f41a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f37a) {
                    mediaControllerCompat$MediaControllerImplApi21.f40d.mo75m(C0018a.m71p(BundleCompat.m1727a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f40d.mo76n(ParcelUtils.m4006b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.mo50a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0010a extends C0022c {
        C0010a(MediaControllerCompat cVar) {
            super(cVar);
        }

        /* renamed from: e */
        public void mo52e(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: f */
        public void mo53f() throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: g */
        public void mo54g(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: j */
        public void mo55j(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: k */
        public void mo56k(List<QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        /* renamed from: o */
        public void mo57o(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo50a() {
        if (this.f40d.mo74l() != null) {
            for (MediaControllerCompat cVar : this.f38b) {
                C0010a aVar = new C0010a(cVar);
                this.f39c.put(cVar, aVar);
                cVar.f76c = aVar;
                try {
                    this.f40d.mo74l().mo111a(aVar);
                    cVar.mo122i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f38b.clear();
        }
    }
}
