package android.support.p004v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.IMediaControllerCallback.C0017a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class MediaControllerCompat implements DeathRecipient {

    /* renamed from: a */
    final Callback f74a;

    /* renamed from: b */
    C0021b f75b;

    /* renamed from: c */
    IMediaControllerCallback f76c;

    /* renamed from: android.support.v4.media.session.c$a */
    /* compiled from: MediaControllerCompat */
    private static class C0020a extends Callback {

        /* renamed from: a */
        private final WeakReference<MediaControllerCompat> f77a;

        C0020a(MediaControllerCompat cVar) {
            this.f77a = new WeakReference<>(cVar);
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                C0023d dVar = new C0023d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m2812c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
                cVar.mo113a(dVar);
            }
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m36a(bundle);
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                cVar.mo114b(bundle);
            }
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                cVar.mo116c(MediaMetadataCompat.m24l(mediaMetadata));
            }
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null && cVar.f76c == null) {
                cVar.mo117d(PlaybackStateCompat.m51l(playbackState));
            }
        }

        public void onQueueChanged(List<QueueItem> list) {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                cVar.mo118e(MediaSessionCompat.QueueItem.m39m(list));
            }
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                cVar.mo119f(charSequence);
            }
        }

        public void onSessionDestroyed() {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar != null) {
                cVar.mo120g();
            }
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m36a(bundle);
            MediaControllerCompat cVar = (MediaControllerCompat) this.f77a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f76c == null || VERSION.SDK_INT >= 23) {
                cVar.mo121h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* compiled from: MediaControllerCompat */
    private class C0021b extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$c */
    /* compiled from: MediaControllerCompat */
    private static class C0022c extends C0017a {

        /* renamed from: a */
        private final WeakReference<MediaControllerCompat> f78a;

        C0022c(MediaControllerCompat cVar) {
            this.f78a = new WeakReference<>(cVar);
        }

        /* renamed from: c */
        public void mo102c(int i) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(9, Integer.valueOf(i), null);
            }
        }

        /* renamed from: d */
        public void mo103d(boolean z) throws RemoteException {
        }

        /* renamed from: e */
        public void mo52e(CharSequence charSequence) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(6, charSequence, null);
            }
        }

        /* renamed from: f */
        public void mo53f() throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(8, null, null);
            }
        }

        /* renamed from: g */
        public void mo54g(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(3, mediaMetadataCompat, null);
            }
        }

        /* renamed from: h */
        public void mo104h(int i) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(12, Integer.valueOf(i), null);
            }
        }

        /* renamed from: i */
        public void mo105i() throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(13, null, null);
            }
        }

        /* renamed from: j */
        public void mo55j(Bundle bundle) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(7, bundle, null);
            }
        }

        /* renamed from: k */
        public void mo56k(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(5, list, null);
            }
        }

        /* renamed from: l */
        public void mo106l(boolean z) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(11, Boolean.valueOf(z), null);
            }
        }

        /* renamed from: m */
        public void mo107m(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(2, playbackStateCompat, null);
            }
        }

        /* renamed from: n */
        public void mo108n(String str, Bundle bundle) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(1, str, bundle);
            }
        }

        /* renamed from: o */
        public void mo57o(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            MediaControllerCompat cVar = (MediaControllerCompat) this.f78a.get();
            if (cVar != null) {
                cVar.mo122i(4, parcelableVolumeInfo != null ? new C0023d(parcelableVolumeInfo.f50a, parcelableVolumeInfo.f51b, parcelableVolumeInfo.f52c, parcelableVolumeInfo.f53d, parcelableVolumeInfo.f54e) : null, null);
            }
        }
    }

    public MediaControllerCompat() {
        if (VERSION.SDK_INT >= 21) {
            this.f74a = new C0020a(this);
            return;
        }
        this.f74a = null;
        this.f76c = new C0022c(this);
    }

    /* renamed from: a */
    public void mo113a(C0023d dVar) {
    }

    /* renamed from: b */
    public void mo114b(Bundle bundle) {
    }

    public void binderDied() {
        mo122i(8, null, null);
    }

    /* renamed from: c */
    public void mo116c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo117d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo118e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo119f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo120g() {
    }

    /* renamed from: h */
    public void mo121h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo122i(int i, Object obj, Bundle bundle) {
        if (this.f75b != null) {
            throw null;
        }
    }
}
