package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.p007c.ResourcesCompat;
import androidx.core.content.p007c.ResourcesCompat.C0257a;
import p010b.p011a.p012k.p013a.AppCompatResources;

/* renamed from: androidx.appcompat.widget.x0 */
public class TintTypedArray {

    /* renamed from: a */
    private final Context f1260a;

    /* renamed from: b */
    private final TypedArray f1261b;

    /* renamed from: c */
    private TypedValue f1262c;

    private TintTypedArray(Context context, TypedArray typedArray) {
        this.f1260a = context;
        this.f1261b = typedArray;
    }

    /* renamed from: t */
    public static TintTypedArray m1404t(Context context, int i, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: u */
    public static TintTypedArray m1405u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static TintTypedArray m1406v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean mo1832a(int i, boolean z) {
        return this.f1261b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int mo1833b(int i, int i2) {
        return this.f1261b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList mo1834c(int i) {
        if (this.f1261b.hasValue(i)) {
            int resourceId = this.f1261b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList c = AppCompatResources.m4142c(this.f1260a, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return this.f1261b.getColorStateList(i);
    }

    /* renamed from: d */
    public float mo1835d(int i, float f) {
        return this.f1261b.getDimension(i, f);
    }

    /* renamed from: e */
    public int mo1836e(int i, int i2) {
        return this.f1261b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int mo1837f(int i, int i2) {
        return this.f1261b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable mo1838g(int i) {
        if (this.f1261b.hasValue(i)) {
            int resourceId = this.f1261b.getResourceId(i, 0);
            if (resourceId != 0) {
                return AppCompatResources.m4143d(this.f1260a, resourceId);
            }
        }
        return this.f1261b.getDrawable(i);
    }

    /* renamed from: h */
    public Drawable mo1839h(int i) {
        if (this.f1261b.hasValue(i)) {
            int resourceId = this.f1261b.getResourceId(i, 0);
            if (resourceId != 0) {
                return AppCompatDrawableManager.m1158b().mo1499d(this.f1260a, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: i */
    public float mo1840i(int i, float f) {
        return this.f1261b.getFloat(i, f);
    }

    /* renamed from: j */
    public Typeface mo1841j(int i, int i2, C0257a aVar) {
        int resourceId = this.f1261b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1262c == null) {
            this.f1262c = new TypedValue();
        }
        return ResourcesCompat.m1813c(this.f1260a, resourceId, this.f1262c, i2, aVar);
    }

    /* renamed from: k */
    public int mo1842k(int i, int i2) {
        return this.f1261b.getInt(i, i2);
    }

    /* renamed from: l */
    public int mo1843l(int i, int i2) {
        return this.f1261b.getInteger(i, i2);
    }

    /* renamed from: m */
    public int mo1844m(int i, int i2) {
        return this.f1261b.getLayoutDimension(i, i2);
    }

    /* renamed from: n */
    public int mo1845n(int i, int i2) {
        return this.f1261b.getResourceId(i, i2);
    }

    /* renamed from: o */
    public String mo1846o(int i) {
        return this.f1261b.getString(i);
    }

    /* renamed from: p */
    public CharSequence mo1847p(int i) {
        return this.f1261b.getText(i);
    }

    /* renamed from: q */
    public CharSequence[] mo1848q(int i) {
        return this.f1261b.getTextArray(i);
    }

    /* renamed from: r */
    public TypedArray mo1849r() {
        return this.f1261b;
    }

    /* renamed from: s */
    public boolean mo1850s(int i) {
        return this.f1261b.hasValue(i);
    }

    /* renamed from: w */
    public void mo1851w() {
        this.f1261b.recycle();
    }
}
