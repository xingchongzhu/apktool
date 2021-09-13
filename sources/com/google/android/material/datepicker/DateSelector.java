package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
import p010b.p034g.p042j.Pair;

/* renamed from: com.google.android.material.datepicker.d */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: a */
    String mo15611a(Context context);

    /* renamed from: b */
    int mo15612b(Context context);

    /* renamed from: c */
    Collection<Pair<Long, Long>> mo15613c();

    /* renamed from: e */
    boolean mo15614e();

    /* renamed from: g */
    Collection<Long> mo15615g();

    /* renamed from: h */
    S mo15616h();

    /* renamed from: j */
    void mo15617j(long j);

    /* renamed from: k */
    View mo15618k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints aVar, OnSelectionChangedListener<S> oVar);
}
