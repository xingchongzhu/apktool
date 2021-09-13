package p067c.p068a.p069a.p114b.p132y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p126s.MaterialColors;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

/* renamed from: c.a.a.b.y.a */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: d */
    private static final int f9700d = C1296k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: e */
    private static final int[][] f9701e = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f */
    private ColorStateList f9702f;

    /* renamed from: g */
    private boolean f9703g;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.f9073x);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9702f == null) {
            int c = MaterialColors.m11575c(this, C1270b.f9069h);
            int c2 = MaterialColors.m11575c(this, C1270b.colorOnSurface);
            int c3 = MaterialColors.m11575c(this, C1270b.colorSurface);
            int[][] iArr = f9701e;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.m11578f(c3, c, 1.0f);
            iArr2[1] = MaterialColors.m11578f(c3, c2, 0.54f);
            iArr2[2] = MaterialColors.m11578f(c3, c2, 0.38f);
            iArr2[3] = MaterialColors.m11578f(c3, c2, 0.38f);
            this.f9702f = new ColorStateList(iArr, iArr2);
        }
        return this.f9702f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9703g && CompoundButtonCompat.m1957b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9703g = z;
        if (z) {
            CompoundButtonCompat.m1958c(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.m1958c(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f9700d;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9336Q2, i, i2, new int[0]);
        int i3 = C1297l.f9343R2;
        if (h.hasValue(i3)) {
            CompoundButtonCompat.m1958c(this, MaterialResources.m11600a(context2, h, i3));
        }
        this.f9703g = h.getBoolean(C1297l.f9350S2, false);
        h.recycle();
    }
}
