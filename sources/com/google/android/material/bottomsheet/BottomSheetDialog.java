package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C1965f;
import com.p259uc.crashsdk.export.LogType;
import p010b.p034g.p043k.AccessibilityDelegateCompat;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1291f;
import p067c.p068a.p069a.p114b.C1293h;
import p067c.p068a.p069a.p114b.C1296k;

/* renamed from: com.google.android.material.bottomsheet.a */
public class BottomSheetDialog extends AppCompatDialog {

    /* renamed from: c */
    private BottomSheetBehavior<FrameLayout> f12658c;

    /* renamed from: d */
    private FrameLayout f12659d;

    /* renamed from: e */
    boolean f12660e;

    /* renamed from: f */
    boolean f12661f = true;

    /* renamed from: g */
    private boolean f12662g = true;

    /* renamed from: h */
    private boolean f12663h;

    /* renamed from: i */
    private C1965f f12664i = new C1972d();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    /* compiled from: BottomSheetDialog */
    class C1969a implements OnClickListener {
        C1969a() {
        }

        public void onClick(View view) {
            BottomSheetDialog aVar = BottomSheetDialog.this;
            if (aVar.f12661f && aVar.isShowing() && BottomSheetDialog.this.mo15169i()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    /* compiled from: BottomSheetDialog */
    class C1970b extends AccessibilityDelegateCompat {
        C1970b() {
        }

        /* renamed from: g */
        public void mo2302g(View view, AccessibilityNodeInfoCompat cVar) {
            super.mo2302g(view, cVar);
            if (BottomSheetDialog.this.f12661f) {
                cVar.mo5054a(LogType.ANR);
                cVar.mo5059c0(true);
                return;
            }
            cVar.mo5059c0(false);
        }

        /* renamed from: j */
        public boolean mo2303j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog aVar = BottomSheetDialog.this;
                if (aVar.f12661f) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo2303j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    /* compiled from: BottomSheetDialog */
    class C1971c implements OnTouchListener {
        C1971c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    /* compiled from: BottomSheetDialog */
    class C1972d extends C1965f {
        C1972d() {
        }

        /* renamed from: a */
        public void mo15158a(View view, float f) {
        }

        /* renamed from: b */
        public void mo15159b(View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    public BottomSheetDialog(Context context, int i) {
        super(context, m15480b(context, i));
        mo422d(1);
    }

    /* renamed from: b */
    private static int m15480b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C1270b.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C1296k.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: e */
    private FrameLayout m15481e() {
        if (this.f12659d == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C1293h.design_bottom_sheet_dialog, null);
            this.f12659d = frameLayout;
            BottomSheetBehavior<FrameLayout> W = BottomSheetBehavior.m15419W((FrameLayout) frameLayout.findViewById(C1291f.design_bottom_sheet));
            this.f12658c = W;
            W.mo15134M(this.f12664i);
            this.f12658c.mo15145j0(this.f12661f);
        }
        return this.f12659d;
    }

    /* renamed from: j */
    private View m15482j(int i, View view, LayoutParams layoutParams) {
        m15481e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f12659d.findViewById(C1291f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f12659d.findViewById(C1291f.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C1291f.touch_outside).setOnClickListener(new C1969a());
        ViewCompat.m5573o0(frameLayout, new C1970b());
        frameLayout.setOnTouchListener(new C1971c());
        return this.f12659d;
    }

    public void cancel() {
        BottomSheetBehavior g = mo15168g();
        if (!this.f12660e || g.mo15138Y() == 5) {
            super.cancel();
        } else {
            g.mo15150o0(5);
        }
    }

    /* renamed from: g */
    public BottomSheetBehavior<FrameLayout> mo15168g() {
        if (this.f12658c == null) {
            m15481e();
        }
        return this.f12658c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo15169i() {
        if (!this.f12663h) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f12662g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f12663h = true;
        }
        return this.f12662g;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f12658c;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo15138Y() == 5) {
            this.f12658c.mo15150o0(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f12661f != z) {
            this.f12661f = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f12658c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo15145j0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f12661f) {
            this.f12661f = true;
        }
        this.f12662g = z;
        this.f12663h = true;
    }

    public void setContentView(int i) {
        super.setContentView(m15482j(i, null, null));
    }

    public void setContentView(View view) {
        super.setContentView(m15482j(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m15482j(0, view, layoutParams));
    }
}
