package com.tv91.p252x;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tv91.x.a */
public abstract class ActivityKey implements NavKey, Parcelable {
    public ActivityKey() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public final Intent mo18572l(Context context) {
        Intent n = mo16474n(context);
        if (mo18574o().booleanValue()) {
            return n;
        }
        Bundle extras = n.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putParcelable("activity-key-extra", this);
        return n.replaceExtras(extras);
    }

    /* renamed from: m */
    public Bundle mo18573m(Activity activity) {
        return null;
    }

    /* renamed from: n */
    public abstract Intent mo16474n(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Boolean mo18574o() {
        return Boolean.FALSE;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public ActivityKey(Parcel parcel) {
    }
}
