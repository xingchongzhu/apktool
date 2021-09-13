package com.tv91.p252x;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.tv91.x.b */
public final class BrowserKey extends ActivityKey {
    public static final Creator<BrowserKey> CREATOR = new C3054a();

    /* renamed from: a */
    private final String f16075a;

    /* renamed from: com.tv91.x.b$a */
    /* compiled from: BrowserKey */
    static class C3054a implements Creator<BrowserKey> {
        C3054a() {
        }

        /* renamed from: a */
        public BrowserKey createFromParcel(Parcel parcel) {
            return new BrowserKey(parcel);
        }

        /* renamed from: b */
        public BrowserKey[] newArray(int i) {
            return new BrowserKey[i];
        }
    }

    public BrowserKey(String str) {
        this.f16075a = str;
    }

    /* renamed from: n */
    public Intent mo16474n(Context context) {
        return new Intent("android.intent.action.VIEW", Uri.parse(this.f16075a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Boolean mo18574o() {
        return Boolean.TRUE;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f16075a);
    }

    protected BrowserKey(Parcel parcel) {
        super(parcel);
        this.f16075a = parcel.readString();
    }
}
