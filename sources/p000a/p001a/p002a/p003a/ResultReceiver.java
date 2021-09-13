package p000a.p001a.p002a.p003a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p000a.p001a.p002a.p003a.IResultReceiver.C0000a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.a.a.a.b */
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C0002a();

    /* renamed from: a */
    final boolean f1a = false;

    /* renamed from: b */
    final Handler f2b = null;

    /* renamed from: c */
    IResultReceiver f3c;

    /* renamed from: a.a.a.a.b$a */
    /* compiled from: ResultReceiver */
    class C0002a implements Creator<ResultReceiver> {
        C0002a() {
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: a.a.a.a.b$b */
    /* compiled from: ResultReceiver */
    class C0003b extends C0000a {
        C0003b() {
        }

        /* renamed from: b */
        public void mo1b(int i, Bundle bundle) {
            ResultReceiver bVar = ResultReceiver.this;
            Handler handler = bVar.f2b;
            if (handler != null) {
                handler.post(new C0004c(i, bundle));
            } else {
                bVar.mo6l(i, bundle);
            }
        }
    }

    /* renamed from: a.a.a.a.b$c */
    /* compiled from: ResultReceiver */
    class C0004c implements Runnable {

        /* renamed from: a */
        final int f5a;

        /* renamed from: b */
        final Bundle f6b;

        C0004c(int i, Bundle bundle) {
            this.f5a = i;
            this.f6b = bundle;
        }

        public void run() {
            ResultReceiver.this.mo6l(this.f5a, this.f6b);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f3c = C0000a.m1p(parcel.readStrongBinder());
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo6l(int i, Bundle bundle) {
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3c == null) {
                this.f3c = new C0003b();
            }
            parcel.writeStrongBinder(this.f3c.asBinder());
        }
    }
}
