package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0410g;
import java.util.Calendar;
import java.util.Locale;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;

/* renamed from: com.google.android.material.datepicker.t */
class YearGridAdapter extends C0410g<C2019b> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaterialCalendar<?> f12952c;

    /* renamed from: com.google.android.material.datepicker.t$a */
    /* compiled from: YearGridAdapter */
    class C2018a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f12953a;

        C2018a(int i) {
            this.f12953a = i;
        }

        public void onClick(View view) {
            YearGridAdapter.this.f12952c.mo15633E2(YearGridAdapter.this.f12952c.mo15637w2().mo15593p(Month.m15880m(this.f12953a, YearGridAdapter.this.f12952c.mo15639y2().f12925b)));
            YearGridAdapter.this.f12952c.mo15634F2(C2007k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.t$b */
    /* compiled from: YearGridAdapter */
    public static class C2019b extends C0407d0 {

        /* renamed from: t */
        final TextView f12955t;

        C2019b(TextView textView) {
            super(textView);
            this.f12955t = textView;
        }
    }

    YearGridAdapter(MaterialCalendar<?> hVar) {
        this.f12952c = hVar;
    }

    /* renamed from: y */
    private OnClickListener m15939y(int i) {
        return new C2018a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public int mo15694A(int i) {
        return this.f12952c.mo15637w2().mo15598u().f12926c + i;
    }

    /* renamed from: B */
    public void mo3419m(C2019b bVar, int i) {
        int A = mo15694A(i);
        String string = bVar.f12955t.getContext().getString(C1295j.mtrl_picker_navigate_to_year_description);
        bVar.f12955t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(A)}));
        bVar.f12955t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(A)}));
        CalendarStyle x2 = this.f12952c.mo15638x2();
        Calendar i2 = UtcDates.m15933i();
        CalendarItemStyle bVar2 = i2.get(1) == A ? x2.f12853f : x2.f12851d;
        for (Long longValue : this.f12952c.mo15640z2().mo15615g()) {
            i2.setTimeInMillis(longValue.longValue());
            if (i2.get(1) == A) {
                bVar2 = x2.f12852e;
            }
        }
        bVar2.mo15610d(bVar.f12955t);
        bVar.f12955t.setOnClickListener(m15939y(A));
    }

    /* renamed from: C */
    public C2019b mo3421o(ViewGroup viewGroup, int i) {
        return new C2019b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1293h.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: c */
    public int mo3409c() {
        return this.f12952c.mo15637w2().mo15599v();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public int mo15697z(int i) {
        return i - this.f12952c.mo15637w2().mo15598u().f12926c;
    }
}
