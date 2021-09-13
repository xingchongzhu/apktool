package android.support.p004v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Creator<PlaybackStateCompat> CREATOR = new C0016a();

    /* renamed from: a */
    final int f55a;

    /* renamed from: b */
    final long f56b;

    /* renamed from: c */
    final long f57c;

    /* renamed from: d */
    final float f58d;

    /* renamed from: e */
    final long f59e;

    /* renamed from: f */
    final int f60f;

    /* renamed from: g */
    final CharSequence f61g;

    /* renamed from: h */
    final long f62h;

    /* renamed from: i */
    List<CustomAction> f63i;

    /* renamed from: j */
    final long f64j;

    /* renamed from: k */
    final Bundle f65k;

    /* renamed from: l */
    private PlaybackState f66l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Creator<CustomAction> CREATOR = new C0015a();

        /* renamed from: a */
        private final String f67a;

        /* renamed from: b */
        private final CharSequence f68b;

        /* renamed from: c */
        private final int f69c;

        /* renamed from: d */
        private final Bundle f70d;

        /* renamed from: e */
        private android.media.session.PlaybackState.CustomAction f71e;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0015a implements Creator<CustomAction> {
            C0015a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f67a = str;
            this.f68b = charSequence;
            this.f69c = i;
            this.f70d = bundle;
        }

        /* renamed from: l */
        public static CustomAction m52l(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.m36a(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.f71e = customAction;
            return customAction2;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Action:mName='");
            sb.append(this.f68b);
            sb.append(", mIcon=");
            sb.append(this.f69c);
            sb.append(", mExtras=");
            sb.append(this.f70d);
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f67a);
            TextUtils.writeToParcel(this.f68b, parcel, i);
            parcel.writeInt(this.f69c);
            parcel.writeBundle(this.f70d);
        }

        CustomAction(Parcel parcel) {
            this.f67a = parcel.readString();
            this.f68b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f69c = parcel.readInt();
            this.f70d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0016a implements Creator<PlaybackStateCompat> {
        C0016a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f55a = i;
        this.f56b = j;
        this.f57c = j2;
        this.f58d = f;
        this.f59e = j3;
        this.f60f = i2;
        this.f61g = charSequence;
        this.f62h = j4;
        this.f63i = new ArrayList(list);
        this.f64j = j5;
        this.f65k = bundle;
    }

    /* renamed from: l */
    public static PlaybackStateCompat m51l(Object obj) {
        List list;
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<Object> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList = new ArrayList(customActions.size());
            for (Object l : customActions) {
                arrayList.add(CustomAction.m52l(l));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
            MediaSessionCompat.m36a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f66l = playbackState;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {");
        sb.append("state=");
        sb.append(this.f55a);
        sb.append(", position=");
        sb.append(this.f56b);
        sb.append(", buffered position=");
        sb.append(this.f57c);
        sb.append(", speed=");
        sb.append(this.f58d);
        sb.append(", updated=");
        sb.append(this.f62h);
        sb.append(", actions=");
        sb.append(this.f59e);
        sb.append(", error code=");
        sb.append(this.f60f);
        sb.append(", error message=");
        sb.append(this.f61g);
        sb.append(", custom actions=");
        sb.append(this.f63i);
        sb.append(", active item id=");
        sb.append(this.f64j);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55a);
        parcel.writeLong(this.f56b);
        parcel.writeFloat(this.f58d);
        parcel.writeLong(this.f62h);
        parcel.writeLong(this.f57c);
        parcel.writeLong(this.f59e);
        TextUtils.writeToParcel(this.f61g, parcel, i);
        parcel.writeTypedList(this.f63i);
        parcel.writeLong(this.f64j);
        parcel.writeBundle(this.f65k);
        parcel.writeInt(this.f60f);
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f55a = parcel.readInt();
        this.f56b = parcel.readLong();
        this.f58d = parcel.readFloat();
        this.f62h = parcel.readLong();
        this.f57c = parcel.readLong();
        this.f59e = parcel.readLong();
        this.f61g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f63i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f64j = parcel.readLong();
        this.f65k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f60f = parcel.readInt();
    }
}
