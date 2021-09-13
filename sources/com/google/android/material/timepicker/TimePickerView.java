package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.button.MaterialButtonToggleGroup.C1981e;
import com.google.android.material.chip.Chip;
import p010b.p034g.p043k.ViewCompat;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A */
    private final ClockFaceView f13546A;

    /* renamed from: B */
    private final MaterialButtonToggleGroup f13547B;

    /* renamed from: C */
    private final OnClickListener f13548C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C2129f f13549D;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C2130g f13550G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C2128e f13551H;

    /* renamed from: x */
    private final Chip f13552x;

    /* renamed from: y */
    private final Chip f13553y;

    /* renamed from: z */
    private final ClockHandView f13554z;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    class C2124a implements OnClickListener {
        C2124a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f13550G != null) {
                TimePickerView.this.f13550G.mo16433a(((Integer) view.getTag(C1291f.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    class C2125b implements C1981e {
        C2125b() {
        }

        /* renamed from: a */
        public void mo15257a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == C1291f.material_clock_period_pm_button ? 1 : 0;
            if (TimePickerView.this.f13549D != null && z) {
                TimePickerView.this.f13549D.mo16432a(i2);
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    class C2126c extends SimpleOnGestureListener {
        C2126c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.f13551H != null) {
                TimePickerView.this.f13551H.mo16431a();
            }
            return onDoubleTap;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    class C2127d implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ GestureDetector f13558a;

        C2127d(GestureDetector gestureDetector) {
            this.f13558a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f13558a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    interface C2128e {
        /* renamed from: a */
        void mo16431a();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    interface C2129f {
        /* renamed from: a */
        void mo16432a(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    interface C2130g {
        /* renamed from: a */
        void mo16433a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: x */
    private void m16620x() {
        Chip chip = this.f13552x;
        int i = C1291f.selection_type;
        chip.setTag(i, Integer.valueOf(12));
        this.f13553y.setTag(i, Integer.valueOf(10));
        this.f13552x.setOnClickListener(this.f13548C);
        this.f13553y.setOnClickListener(this.f13548C);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: y */
    private void m16621y() {
        C2127d dVar = new C2127d(new GestureDetector(getContext(), new C2126c()));
        this.f13552x.setOnTouchListener(dVar);
        this.f13553y.setOnTouchListener(dVar);
    }

    /* renamed from: z */
    private void m16622z() {
        if (this.f13547B.getVisibility() == 0) {
            ConstraintSet dVar = new ConstraintSet();
            dVar.mo1970g(this);
            int i = 1;
            if (ViewCompat.m5514C(this) == 0) {
                i = 2;
            }
            dVar.mo1968e(C1291f.material_clock_display, i);
            dVar.mo1966c(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m16622z();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m16622z();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13548C = new C2124a();
        LayoutInflater.from(context).inflate(C1293h.material_timepicker, this);
        this.f13546A = (ClockFaceView) findViewById(C1291f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C1291f.material_clock_period_toggle);
        this.f13547B = materialButtonToggleGroup;
        materialButtonToggleGroup.mo15240g(new C2125b());
        this.f13552x = (Chip) findViewById(C1291f.material_minute_tv);
        this.f13553y = (Chip) findViewById(C1291f.material_hour_tv);
        this.f13554z = (ClockHandView) findViewById(C1291f.material_clock_hand);
        m16621y();
        m16620x();
    }
}
