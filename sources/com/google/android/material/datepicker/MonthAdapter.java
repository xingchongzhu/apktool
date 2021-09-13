package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.m */
class MonthAdapter extends BaseAdapter {

    /* renamed from: a */
    static final int f12931a = UtcDates.m15935k().getMaximum(4);

    /* renamed from: b */
    final Month f12932b;

    /* renamed from: c */
    final DateSelector<?> f12933c;

    /* renamed from: d */
    private Collection<Long> f12934d;

    /* renamed from: e */
    CalendarStyle f12935e;

    /* renamed from: f */
    final CalendarConstraints f12936f;

    MonthAdapter(Month lVar, DateSelector<?> dVar, CalendarConstraints aVar) {
        this.f12932b = lVar;
        this.f12933c = dVar;
        this.f12936f = aVar;
        this.f12934d = dVar.mo15615g();
    }

    /* renamed from: e */
    private void m15893e(Context context) {
        if (this.f12935e == null) {
            this.f12935e = new CalendarStyle(context);
        }
    }

    /* renamed from: h */
    private boolean m15894h(long j) {
        for (Long longValue : this.f12933c.mo15615g()) {
            if (UtcDates.m15925a(j) == UtcDates.m15925a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m15895k(TextView textView, long j) {
        CalendarItemStyle bVar;
        if (textView != null) {
            if (this.f12936f.mo15594q().mo15607d(j)) {
                textView.setEnabled(true);
                if (m15894h(j)) {
                    bVar = this.f12935e.f12849b;
                } else if (UtcDates.m15933i().getTimeInMillis() == j) {
                    bVar = this.f12935e.f12850c;
                } else {
                    bVar = this.f12935e.f12848a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f12935e.f12854g;
            }
            bVar.mo15610d(textView);
        }
    }

    /* renamed from: l */
    private void m15896l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m15881n(j).equals(this.f12932b)) {
            m15895k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo15670a(this.f12932b.mo15660r(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo15670a(int i) {
        return mo15671b() + (i - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo15671b() {
        return this.f12932b.mo15658p();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f12932b.mo15658p() || i > mo15681i()) {
            return null;
        }
        return Long.valueOf(this.f12932b.mo15659q(mo15682j(i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m15893e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p067c.p068a.p069a.p114b.C1293h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo15671b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.l r8 = r5.f12932b
            int r2 = r8.f12928e
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f12932b
            long r7 = r8.mo15659q(r7)
            com.google.android.material.datepicker.l r3 = r5.f12932b
            int r3 = r3.f12926c
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.Month.m15882o()
            int r4 = r4.f12926c
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.m15803a(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.m15806d(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.m15895k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo15674f(int i) {
        return i % this.f12932b.f12927d == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo15675g(int i) {
        return (i + 1) % this.f12932b.f12927d == 0;
    }

    public int getCount() {
        return this.f12932b.f12928e + mo15671b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f12932b.f12927d);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo15681i() {
        return (this.f12932b.mo15658p() + this.f12932b.f12928e) - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo15682j(int i) {
        return (i - this.f12932b.mo15658p()) + 1;
    }

    /* renamed from: m */
    public void mo15683m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f12934d) {
            m15896l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dVar = this.f12933c;
        if (dVar != null) {
            for (Long longValue2 : dVar.mo15615g()) {
                m15896l(materialCalendarGridView, longValue2.longValue());
            }
            this.f12934d = this.f12933c.mo15615g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo15684n(int i) {
        return i >= mo15671b() && i <= mo15681i();
    }
}
