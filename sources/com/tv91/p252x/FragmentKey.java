package com.tv91.p252x;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.tv91.utils.C3052g;

/* renamed from: com.tv91.x.c */
public abstract class FragmentKey implements NavKey, Parcelable {

    /* renamed from: a */
    private final String f16076a;

    public FragmentKey(String str) {
        if (C3052g.m20586g(str)) {
            str = getClass().getName();
        }
        this.f16076a = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: l */
    public final Fragment mo18580l() {
        Fragment n = mo16544n();
        Bundle G = n.mo2361G();
        if (G == null) {
            G = new Bundle();
            n.mo2407W1(G);
        }
        G.putParcelable("fragment-key-tag", this);
        return n;
    }

    /* renamed from: m */
    public final String mo18581m() {
        return this.f16076a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Fragment mo16544n();

    /* renamed from: o */
    public void mo16545o(FragmentTransaction xVar, boolean z) {
        xVar.mo2945s(0, 0, 0, 0);
    }

    /* renamed from: p */
    public void mo16546p(FragmentTransaction xVar, boolean z) {
        xVar.mo2945s(0, 0, 0, 0);
    }

    /* renamed from: q */
    public void mo18582q(FragmentTransaction xVar, boolean z) {
        xVar.mo2945s(0, 0, 0, 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16076a);
    }

    protected FragmentKey(Parcel parcel) {
        this.f16076a = parcel.readString();
    }
}
