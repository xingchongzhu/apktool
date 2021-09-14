package p067c.google.android.p114b.p123q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p067c.google.android.p114b.C1270b;
import p067c.google.android.p114b.C1296k;
import p067c.google.android.p114b.C1297l;
import p067c.google.android.p114b.p126s.MaterialColors;
import p067c.google.android.p114b.p133z.MaterialResources;

/* renamed from: c.a.a.b.q.a */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: d */
    private static final int f9677d = C1296k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: e */
    private static final int[][] f9678e = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    private ColorStateList f9679f;

    /* renamed from: g */
    private boolean f9680g;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.f9068e);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9679f == null) {
            int[][] iArr = f9678e;
            int[] iArr2 = new int[iArr.length];
            int c = MaterialColors.m11575c(this, C1270b.f9069h);
            int c2 = MaterialColors.m11575c(this, C1270b.colorSurface);
            int c3 = MaterialColors.m11575c(this, C1270b.colorOnSurface);
            iArr2[0] = MaterialColors.m11578f(c2, c, 1.0f);
            iArr2[1] = MaterialColors.m11578f(c2, c3, 0.54f);
            iArr2[2] = MaterialColors.m11578f(c2, c3, 0.38f);
            iArr2[3] = MaterialColors.m11578f(c2, c3, 0.38f);
            this.f9679f = new ColorStateList(iArr, iArr2);
        }
        return this.f9679f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9680g && CompoundButtonCompat.m1957b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9680g = z;
        if (z) {
            CompoundButtonCompat.m1958c(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.m1958c(this, null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = f9677d;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9315N2, i, i2, new int[0]);
        int i3 = C1297l.f9322O2;
        if (h.hasValue(i3)) {
            CompoundButtonCompat.m1958c(this, MaterialResources.m11600a(context2, h, i3));
        }
        this.f9680g = h.getBoolean(C1297l.f9329P2, false);
        h.recycle();
    }
}
