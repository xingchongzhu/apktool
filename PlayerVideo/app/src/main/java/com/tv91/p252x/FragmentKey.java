package com.tv91.p252x;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.tv91.utils.FragmentUtils;

/* renamed from: com.tv91.x.c */
public abstract class FragmentKey implements NavKey, Parcelable {

    /* renamed from: a */
    private final String className;

    public FragmentKey(String str) {
        if (FragmentUtils.m20586g(str)) {
            str = getClass().getName();
        }
        this.className = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public final Fragment createFragment() {
        Fragment n = getFragment();
        Bundle G = n.getArguments();
        if (G == null) {
            G = new Bundle();
            n.setArguments(G);
        }
        G.putParcelable("fragment-key-tag", this);
        return n;
    }

    /* renamed from: m */
    public final String getClassName() {
        return this.className;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Fragment getFragment();

    /* renamed from: o */
    public void setCustomAnimations(FragmentTransaction fragmentTransaction, boolean z) {
        fragmentTransaction.setCustomAnimations(0, 0, 0, 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.className);
    }

    protected FragmentKey(Parcel parcel) {
        this.className = parcel.readString();
    }
}
