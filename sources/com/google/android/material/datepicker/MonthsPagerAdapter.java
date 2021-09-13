package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C0407d0;
import androidx.recyclerview.widget.RecyclerView.C0410g;
import androidx.recyclerview.widget.RecyclerView.C0426p;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;

/* renamed from: com.google.android.material.datepicker.n */
class MonthsPagerAdapter extends C0410g<C2016b> {

    /* renamed from: c */
    private final Context f12937c;

    /* renamed from: d */
    private final CalendarConstraints f12938d;

    /* renamed from: e */
    private final DateSelector<?> f12939e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2008l f12940f;

    /* renamed from: g */
    private final int f12941g;

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* compiled from: MonthsPagerAdapter */
    class C2015a implements OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ MaterialCalendarGridView f12942a;

        C2015a(MaterialCalendarGridView materialCalendarGridView) {
            this.f12942a = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f12942a.getAdapter().mo15684n(i)) {
                MonthsPagerAdapter.this.f12940f.mo15642a(this.f12942a.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C2016b extends C0407d0 {

        /* renamed from: t */
        final TextView f12944t;

        /* renamed from: u */
        final MaterialCalendarGridView f12945u;

        C2016b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1291f.month_title);
            this.f12944t = textView;
            ViewCompat.m5575p0(textView, true);
            this.f12945u = (MaterialCalendarGridView) linearLayout.findViewById(C1291f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    MonthsPagerAdapter(Context context, DateSelector<?> dVar, CalendarConstraints aVar, C2008l lVar) {
        Month u = aVar.mo15598u();
        Month r = aVar.mo15595r();
        Month t = aVar.mo15597t();
        if (u.compareTo(t) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (t.compareTo(r) <= 0) {
            int A2 = MonthAdapter.f12931a * MaterialCalendar.m15814A2(context);
            int A22 = MaterialDatePicker.m15859P2(context) ? MaterialCalendar.m15814A2(context) : 0;
            this.f12937c = context;
            this.f12941g = A2 + A22;
            this.f12938d = aVar;
            this.f12939e = dVar;
            this.f12940f = lVar;
            mo3428v(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public int mo15685A(Month lVar) {
        return this.f12938d.mo15598u().mo15664v(lVar);
    }

    /* renamed from: B */
    public void mo3419m(C2016b bVar, int i) {
        Month u = this.f12938d.mo15598u().mo15663u(i);
        bVar.f12944t.setText(u.mo15661s(bVar.f2841b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f12945u.findViewById(C1291f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !u.equals(materialCalendarGridView.getAdapter().f12932b)) {
            MonthAdapter mVar = new MonthAdapter(u, this.f12939e, this.f12938d);
            materialCalendarGridView.setNumColumns(u.f12927d);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo15683m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C2015a(materialCalendarGridView));
    }

    /* renamed from: C */
    public C2016b mo3421o(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1293h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m15859P2(viewGroup.getContext())) {
            return new C2016b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0426p(-1, this.f12941g));
        return new C2016b(linearLayout, true);
    }

    /* renamed from: c */
    public int mo3409c() {
        return this.f12938d.mo15596s();
    }

    /* renamed from: d */
    public long mo3410d(int i) {
        return this.f12938d.mo15598u().mo15663u(i).mo15662t();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public Month mo15688y(int i) {
        return this.f12938d.mo15598u().mo15663u(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public CharSequence mo15689z(int i) {
        return mo15688y(i).mo15661s(this.f12937c);
    }
}
