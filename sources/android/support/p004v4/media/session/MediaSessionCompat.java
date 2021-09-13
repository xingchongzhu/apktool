package android.support.p004v4.media.session;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.versionedparcelable.VersionedParcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C0011a();

        /* renamed from: a */
        private final MediaDescriptionCompat f42a;

        /* renamed from: b */
        private final long f43b;

        /* renamed from: c */
        private android.media.session.MediaSession.QueueItem f44c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        class C0011a implements Creator<QueueItem> {
            C0011a() {
            }

            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        private QueueItem(android.media.session.MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f42a = mediaDescriptionCompat;
                this.f43b = j;
                this.f44c = queueItem;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        /* renamed from: l */
        public static QueueItem m38l(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            android.media.session.MediaSession.QueueItem queueItem = (android.media.session.MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m11l(queueItem.getDescription()), queueItem.getQueueId());
        }

        /* renamed from: m */
        public static List<QueueItem> m39m(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object l : list) {
                arrayList.add(m38l(l));
            }
            return arrayList;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaSession.QueueItem {Description=");
            sb.append(this.f42a);
            sb.append(", Id=");
            sb.append(this.f43b);
            sb.append(" }");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f42a.writeToParcel(parcel, i);
            parcel.writeLong(this.f43b);
        }

        QueueItem(Parcel parcel) {
            this.f42a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f43b = parcel.readLong();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C0012a();

        /* renamed from: a */
        ResultReceiver f45a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        class C0012a implements Creator<ResultReceiverWrapper> {
            C0012a() {
            }

            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f45a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f45a.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C0013a();

        /* renamed from: a */
        private final Object f46a;

        /* renamed from: b */
        private final Object f47b;

        /* renamed from: c */
        private IMediaSession f48c;

        /* renamed from: d */
        private VersionedParcelable f49d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        class C0013a implements Creator<Token> {
            C0013a() {
            }

            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: b */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f47b;
            if (obj2 == null) {
                if (token.f47b != null) {
                    z = false;
                }
                return z;
            }
            Object obj3 = token.f47b;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f47b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: l */
        public IMediaSession mo74l() {
            IMediaSession bVar;
            synchronized (this.f46a) {
                bVar = this.f48c;
            }
            return bVar;
        }

        /* renamed from: m */
        public void mo75m(IMediaSession bVar) {
            synchronized (this.f46a) {
                this.f48c = bVar;
            }
        }

        /* renamed from: n */
        public void mo76n(VersionedParcelable dVar) {
            synchronized (this.f46a) {
                this.f49d = dVar;
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f47b, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f47b);
            }
        }

        Token(Object obj, IMediaSession bVar, VersionedParcelable dVar) {
            this.f46a = new Object();
            this.f47b = obj;
            this.f48c = bVar;
            this.f49d = dVar;
        }
    }

    /* renamed from: a */
    public static void m36a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: b */
    public static Bundle m37b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m36a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }
}
