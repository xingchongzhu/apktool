package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0401a0;
import androidx.recyclerview.widget.RecyclerView.C0420n;
import androidx.recyclerview.widget.RecyclerView.C0430t;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p010b.p034g.p042j.Pair;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1292g;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1295j;

/* renamed from: com.google.android.material.datepicker.h */
public final class MaterialCalendar<S> extends PickerFragment<S> {

    /* renamed from: e0 */
    static final Object f12861e0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: f0 */
    static final Object f12862f0 = "NAVIGATION_PREV_TAG";

    /* renamed from: g0 */
    static final Object f12863g0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: h0 */
    static final Object f12864h0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: i0 */
    private int f12865i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public DateSelector<S> f12866j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public CalendarConstraints f12867k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public Month f12868l0;

    /* renamed from: m0 */
    private C2007k f12869m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public CalendarStyle f12870n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public RecyclerView f12871o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public RecyclerView f12872p0;

    /* renamed from: q0 */
    private View f12873q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public View f12874r0;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* compiled from: MaterialCalendar */
    class C1997a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f12875a;

        C1997a(int i) {
            this.f12875a = i;
        }

        public void run() {
            MaterialCalendar.this.f12872p0.mo3280r1(this.f12875a);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* compiled from: MaterialCalendar */
    class C1998b extends AccessibilityDelegateCompat {
        C1998b() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            cVar.mo5053Z(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    /* compiled from: MaterialCalendar */
    class C1999c extends SmoothCalendarLayoutManager {

        /* renamed from: I */
        final /* synthetic */ int f12878I;

        C1999c(Context context, int i, boolean z, int i2) {
            this.f12878I = i2;
            super(context, i, z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: M1 */
        public void mo3109M1(C0401a0 a0Var, int[] iArr) {
            if (this.f12878I == 0) {
                iArr[0] = MaterialCalendar.this.f12872p0.getWidth();
                iArr[1] = MaterialCalendar.this.f12872p0.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f12872p0.getHeight();
            iArr[1] = MaterialCalendar.this.f12872p0.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    /* compiled from: MaterialCalendar */
    class C2000d implements C2008l {
        C2000d() {
        }

        /* renamed from: a */
        public void mo15642a(long j) {
            if (MaterialCalendar.this.f12867k0.mo15594q().mo15607d(j)) {
                MaterialCalendar.this.f12866j0.mo15617j(j);
                Iterator it = MaterialCalendar.this.f12946d0.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).mo15650a(MaterialCalendar.this.f12866j0.mo15616h());
                }
                MaterialCalendar.this.f12872p0.getAdapter().mo3414h();
                if (MaterialCalendar.this.f12871o0 != null) {
                    MaterialCalendar.this.f12871o0.getAdapter().mo3414h();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    /* compiled from: MaterialCalendar */
    class C2001e extends C0420n {

        /* renamed from: a */
        private final Calendar f12881a = UtcDates.m15935k();

        /* renamed from: b */
        private final Calendar f12882b = UtcDates.m15935k();

        C2001e() {
        }

        /* renamed from: g */
        public void mo3471g(Canvas canvas, RecyclerView recyclerView, C0401a0 a0Var) {
            int i;
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter tVar = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (Pair dVar : MaterialCalendar.this.f12866j0.mo15613c()) {
                    F f = dVar.f4587a;
                    if (!(f == null || dVar.f4588b == null)) {
                        this.f12881a.setTimeInMillis(((Long) f).longValue());
                        this.f12882b.setTimeInMillis(((Long) dVar.f4588b).longValue());
                        int z = tVar.mo15697z(this.f12881a.get(1));
                        int z2 = tVar.mo15697z(this.f12882b.get(1));
                        View C = gridLayoutManager.mo3101C(z);
                        View C2 = gridLayoutManager.mo3101C(z2);
                        int Z2 = z / gridLayoutManager.mo3078Z2();
                        int Z22 = z2 / gridLayoutManager.mo3078Z2();
                        int i2 = Z2;
                        while (i2 <= Z22) {
                            View C3 = gridLayoutManager.mo3101C(gridLayoutManager.mo3078Z2() * i2);
                            if (C3 != null) {
                                int top = C3.getTop() + MaterialCalendar.this.f12870n0.f12851d.mo15609c();
                                int bottom = C3.getBottom() - MaterialCalendar.this.f12870n0.f12851d.mo15608b();
                                int left = i2 == Z2 ? C.getLeft() + (C.getWidth() / 2) : 0;
                                if (i2 == Z22) {
                                    i = C2.getLeft() + (C2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, MaterialCalendar.this.f12870n0.f12855h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    /* compiled from: MaterialCalendar */
    class C2002f extends AccessibilityDelegateCompat {
        C2002f() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            String str;
            super.mo2302g(view, cVar);
            if (MaterialCalendar.this.f12874r0.getVisibility() == 0) {
                str = MaterialCalendar.this.mo2443i0(C1295j.mtrl_picker_toggle_to_year_selection);
            } else {
                str = MaterialCalendar.this.mo2443i0(C1295j.mtrl_picker_toggle_to_day_selection);
            }
            cVar.mo5069i0(str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    /* compiled from: MaterialCalendar */
    class C2003g extends C0430t {

        /* renamed from: a */
        final /* synthetic */ MonthsPagerAdapter f12885a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f12886b;

        C2003g(MonthsPagerAdapter nVar, MaterialButton materialButton) {
            this.f12885a = nVar;
            this.f12886b = materialButton;
        }

        /* renamed from: a */
        public void mo3583a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f12886b.getText();
                if (VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        /* renamed from: b */
        public void mo3584b(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = MaterialCalendar.this.mo15632B2().mo3118a2();
            } else {
                i3 = MaterialCalendar.this.mo15632B2().mo3122e2();
            }
            MaterialCalendar.this.f12868l0 = this.f12885a.mo15688y(i3);
            this.f12886b.setText(this.f12885a.mo15689z(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    /* compiled from: MaterialCalendar */
    class C2004h implements OnClickListener {
        C2004h() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.mo15635G2();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    /* compiled from: MaterialCalendar */
    class C2005i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MonthsPagerAdapter f12889a;

        C2005i(MonthsPagerAdapter nVar) {
            this.f12889a = nVar;
        }

        public void onClick(View view) {
            int a2 = MaterialCalendar.this.mo15632B2().mo3118a2() + 1;
            if (a2 < MaterialCalendar.this.f12872p0.getAdapter().mo3409c()) {
                MaterialCalendar.this.mo15633E2(this.f12889a.mo15688y(a2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    /* compiled from: MaterialCalendar */
    class C2006j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MonthsPagerAdapter f12891a;

        C2006j(MonthsPagerAdapter nVar) {
            this.f12891a = nVar;
        }

        public void onClick(View view) {
            int e2 = MaterialCalendar.this.mo15632B2().mo3122e2() - 1;
            if (e2 >= 0) {
                MaterialCalendar.this.mo15633E2(this.f12891a.mo15688y(e2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    /* compiled from: MaterialCalendar */
    enum C2007k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$l */
    /* compiled from: MaterialCalendar */
    interface C2008l {
        /* renamed from: a */
        void mo15642a(long j);
    }

    /* renamed from: A2 */
    static int m15814A2(Context context) {
        return context.getResources().getDimensionPixelSize(C1288d.mtrl_calendar_day_height);
    }

    /* renamed from: C2 */
    public static <T> MaterialCalendar<T> m15815C2(DateSelector<T> dVar, int i, CalendarConstraints aVar) {
        MaterialCalendar<T> hVar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.mo15597t());
        hVar.mo2407W1(bundle);
        return hVar;
    }

    /* renamed from: D2 */
    private void m15816D2(int i) {
        this.f12872p0.post(new C1997a(i));
    }

    /* renamed from: u2 */
    private void m15824u2(View view, MonthsPagerAdapter nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C1291f.month_navigation_fragment_toggle);
        materialButton.setTag(f12864h0);
        ViewCompat.m5573o0(materialButton, new C2002f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C1291f.month_navigation_previous);
        materialButton2.setTag(f12862f0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C1291f.month_navigation_next);
        materialButton3.setTag(f12863g0);
        this.f12873q0 = view.findViewById(C1291f.mtrl_calendar_year_selector_frame);
        this.f12874r0 = view.findViewById(C1291f.mtrl_calendar_day_selector_frame);
        mo15634F2(C2007k.DAY);
        materialButton.setText(this.f12868l0.mo15661s(view.getContext()));
        this.f12872p0.mo3254k(new C2003g(nVar, materialButton));
        materialButton.setOnClickListener(new C2004h());
        materialButton3.setOnClickListener(new C2005i(nVar));
        materialButton2.setOnClickListener(new C2006j(nVar));
    }

    /* renamed from: v2 */
    private C0420n m15825v2() {
        return new C2001e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B2 */
    public LinearLayoutManager mo15632B2() {
        return (LinearLayoutManager) this.f12872p0.getLayoutManager();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E2 */
    public void mo15633E2(Month lVar) {
        MonthsPagerAdapter nVar = (MonthsPagerAdapter) this.f12872p0.getAdapter();
        int A = nVar.mo15685A(lVar);
        int A2 = A - nVar.mo15685A(this.f12868l0);
        boolean z = true;
        boolean z2 = Math.abs(A2) > 3;
        if (A2 <= 0) {
            z = false;
        }
        this.f12868l0 = lVar;
        if (z2 && z) {
            this.f12872p0.mo3253j1(A - 3);
            m15816D2(A);
        } else if (z2) {
            this.f12872p0.mo3253j1(A + 3);
            m15816D2(A);
        } else {
            m15816D2(A);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F2 */
    public void mo15634F2(C2007k kVar) {
        this.f12869m0 = kVar;
        if (kVar == C2007k.YEAR) {
            this.f12871o0.getLayoutManager().mo3137x1(((YearGridAdapter) this.f12871o0.getAdapter()).mo15697z(this.f12868l0.f12926c));
            this.f12873q0.setVisibility(0);
            this.f12874r0.setVisibility(8);
        } else if (kVar == C2007k.DAY) {
            this.f12873q0.setVisibility(8);
            this.f12874r0.setVisibility(0);
            mo15633E2(this.f12868l0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G2 */
    public void mo15635G2() {
        C2007k kVar = this.f12869m0;
        C2007k kVar2 = C2007k.YEAR;
        if (kVar == kVar2) {
            mo15634F2(C2007k.DAY);
        } else if (kVar == C2007k.DAY) {
            mo15634F2(kVar2);
        }
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        if (bundle == null) {
            bundle = mo2361G();
        }
        this.f12865i0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f12866j0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f12867k0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12868l0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: N0 */
    public View mo2381N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2367I(), this.f12865i0);
        this.f12870n0 = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month u = this.f12867k0.mo15598u();
        if (MaterialDatePicker.m15859P2(contextThemeWrapper)) {
            i2 = C1293h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C1293h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C1291f.mtrl_calendar_days_of_week);
        ViewCompat.m5573o0(gridView, new C1998b());
        gridView.setAdapter(new DaysOfWeekAdapter());
        gridView.setNumColumns(u.f12927d);
        gridView.setEnabled(false);
        this.f12872p0 = (RecyclerView) inflate.findViewById(C1291f.mtrl_calendar_months);
        C1999c cVar = new C1999c(mo2367I(), i, false, i);
        this.f12872p0.setLayoutManager(cVar);
        this.f12872p0.setTag(f12861e0);
        MonthsPagerAdapter nVar = new MonthsPagerAdapter(contextThemeWrapper, this.f12866j0, this.f12867k0, new C2000d());
        this.f12872p0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(C1292g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C1291f.mtrl_calendar_year_selector_frame);
        this.f12871o0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f12871o0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f12871o0.setAdapter(new YearGridAdapter(this));
            this.f12871o0.mo3244h(m15825v2());
        }
        if (inflate.findViewById(C1291f.month_navigation_fragment_toggle) != null) {
            m15824u2(inflate, nVar);
        }
        if (!MaterialDatePicker.m15859P2(contextThemeWrapper)) {
            new PagerSnapHelper().mo3904b(this.f12872p0);
        }
        this.f12872p0.mo3253j1(nVar.mo15685A(this.f12868l0));
        return inflate;
    }

    /* renamed from: f1 */
    public void mo2434f1(Bundle bundle) {
        super.mo2434f1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f12865i0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f12866j0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12867k0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12868l0);
    }

    /* renamed from: l2 */
    public boolean mo15636l2(OnSelectionChangedListener<S> oVar) {
        return super.mo15636l2(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w2 */
    public CalendarConstraints mo15637w2() {
        return this.f12867k0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x2 */
    public CalendarStyle mo15638x2() {
        return this.f12870n0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y2 */
    public Month mo15639y2() {
        return this.f12868l0;
    }

    /* renamed from: z2 */
    public DateSelector<S> mo15640z2() {
        return this.f12866j0;
    }
}
