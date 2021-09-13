package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView.C2123d;
import java.util.Arrays;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0635b;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1271c;
import p067c.p068a.p069a.p114b.C1288d;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

class ClockFaceView extends RadialViewGroup implements C2123d {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final ClockHandView f13514A;

    /* renamed from: B */
    private final Rect f13515B;

    /* renamed from: C */
    private final RectF f13516C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final SparseArray<TextView> f13517D;

    /* renamed from: G */
    private final AccessibilityDelegateCompat f13518G;

    /* renamed from: H */
    private final int[] f13519H;

    /* renamed from: I */
    private final float[] f13520I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final int f13521J;

    /* renamed from: K */
    private String[] f13522K;

    /* renamed from: L */
    private float f13523L;

    /* renamed from: M */
    private final ColorStateList f13524M;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class C2118a implements OnPreDrawListener {
        C2118a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo16411w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f13514A.mo16416g()) - ClockFaceView.this.f13521J);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C2119b extends AccessibilityDelegateCompat {
        C2119b() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            int intValue = ((Integer) view.getTag(C1291f.material_value_index)).intValue();
            if (intValue > 0) {
                cVar.mo5092v0((View) ClockFaceView.this.f13517D.get(intValue - 1));
            }
            cVar.mo5055a0(C0636c.m5416a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.materialClockStyle);
    }

    /* renamed from: D */
    private void m16595D() {
        RectF d = this.f13514A.mo16414d();
        for (int i = 0; i < this.f13517D.size(); i++) {
            TextView textView = (TextView) this.f13517D.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f13515B);
                this.f13515B.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f13515B);
                this.f13516C.set(this.f13515B);
                textView.getPaint().setShader(m16596E(d, this.f13516C));
                textView.invalidate();
            }
        }
    }

    /* renamed from: E */
    private RadialGradient m16596E(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        RadialGradient radialGradient = new RadialGradient(rectF.centerX() - this.f13516C.left, rectF.centerY() - this.f13516C.top, rectF.width() * 0.5f, this.f13519H, this.f13520I, TileMode.CLAMP);
        return radialGradient;
    }

    /* renamed from: G */
    private void m16597G(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f13517D.size();
        for (int i2 = 0; i2 < Math.max(this.f13522K.length, size); i2++) {
            TextView textView = (TextView) this.f13517D.get(i2);
            if (i2 >= this.f13522K.length) {
                removeView(textView);
                this.f13517D.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C1293h.material_clockface_textview, this, false);
                    this.f13517D.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f13522K[i2]);
                textView.setTag(C1291f.material_value_index, Integer.valueOf(i2));
                ViewCompat.m5573o0(textView, this.f13518G);
                textView.setTextColor(this.f13524M);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f13522K[i2]}));
                }
            }
        }
    }

    /* renamed from: F */
    public void mo16408F(String[] strArr, int i) {
        this.f13522K = strArr;
        m16597G(i);
    }

    /* renamed from: a */
    public void mo16409a(float f, boolean z) {
        if (Math.abs(this.f13523L - f) > 0.001f) {
            this.f13523L = f;
            m16595D();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo).mo5053Z(C0635b.m5415a(1, this.f13522K.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m16595D();
    }

    /* renamed from: w */
    public void mo16411w(int i) {
        if (i != mo16437v()) {
            super.mo16411w(i);
            this.f13514A.mo16417j(mo16437v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13515B = new Rect();
        this.f13516C = new RectF();
        this.f13517D = new SparseArray<>();
        this.f13520I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1297l.f9355T0, i, C1296k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9369V0);
        this.f13524M = a;
        LayoutInflater.from(context).inflate(C1293h.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C1291f.material_clock_hand);
        this.f13514A = clockHandView;
        this.f13521J = resources.getDimensionPixelSize(C1288d.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f13519H = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo16413b(this);
        int defaultColor = AppCompatResources.m4142c(context, C1271c.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = MaterialResources.m11600a(context, obtainStyledAttributes, C1297l.f9362U0);
        if (a2 != null) {
            defaultColor = a2.getDefaultColor();
        }
        setBackgroundColor(defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C2118a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f13518G = new C2119b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo16408F(strArr, 0);
    }
}
