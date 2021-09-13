package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import p010b.p011a.C0505d;
import p010b.p011a.C0507f;
import p010b.p011a.C0508g;
import p010b.p011a.C0510i;

/* renamed from: androidx.appcompat.widget.b1 */
class TooltipPopup {

    /* renamed from: a */
    private final Context f956a;

    /* renamed from: b */
    private final View f957b;

    /* renamed from: c */
    private final TextView f958c;

    /* renamed from: d */
    private final LayoutParams f959d;

    /* renamed from: e */
    private final Rect f960e = new Rect();

    /* renamed from: f */
    private final int[] f961f = new int[2];

    /* renamed from: g */
    private final int[] f962g = new int[2];

    TooltipPopup(Context context) {
        LayoutParams layoutParams = new LayoutParams();
        this.f959d = layoutParams;
        this.f956a = context;
        View inflate = LayoutInflater.from(context).inflate(C0508g.f3423s, null);
        this.f957b = inflate;
        this.f958c = (TextView) inflate.findViewById(C0507f.f3397s);
        layoutParams.setTitle(TooltipPopup.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0510i.f3437a;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m1026a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f956a.getResources().getDimensionPixelOffset(C0505d.f3320m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f956a.getResources().getDimensionPixelOffset(C0505d.f3319l);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f956a.getResources().getDimensionPixelOffset(z ? C0505d.f3322o : C0505d.f3321n);
        View b = m1027b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.f960e);
        Rect rect = this.f960e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f956a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f960e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.f962g);
        view.getLocationOnScreen(this.f961f);
        int[] iArr = this.f961f;
        int i5 = iArr[0];
        int[] iArr2 = this.f962g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (b.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f957b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f957b.getMeasuredHeight();
        int[] iArr3 = this.f961f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f960e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: b */
    private static View m1027b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1358c() {
        if (mo1359d()) {
            ((WindowManager) this.f956a.getSystemService("window")).removeView(this.f957b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1359d() {
        return this.f957b.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1360e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1359d()) {
            mo1358c();
        }
        this.f958c.setText(charSequence);
        m1026a(view, i, i2, z, this.f959d);
        ((WindowManager) this.f956a.getSystemService("window")).addView(this.f957b, this.f959d);
    }
}
