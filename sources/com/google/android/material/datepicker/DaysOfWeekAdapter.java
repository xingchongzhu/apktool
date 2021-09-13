package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;

/* renamed from: com.google.android.material.datepicker.g */
class DaysOfWeekAdapter extends BaseAdapter {

    /* renamed from: a */
    private static final int f12857a = (VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: b */
    private final Calendar f12858b;

    /* renamed from: c */
    private final int f12859c;

    /* renamed from: d */
    private final int f12860d;

    public DaysOfWeekAdapter() {
        Calendar k = UtcDates.m15935k();
        this.f12858b = k;
        this.f12859c = k.getMaximum(7);
        this.f12860d = k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m15812b(int i) {
        int i2 = i + this.f12860d;
        int i3 = this.f12859c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f12859c) {
            return null;
        }
        return Integer.valueOf(m15812b(i));
    }

    public int getCount() {
        return this.f12859c;
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1293h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f12858b.set(7, m15812b(i));
        textView.setText(this.f12858b.getDisplayName(7, f12857a, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1295j.mtrl_picker_day_of_week_column_header), new Object[]{this.f12858b.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }
}
