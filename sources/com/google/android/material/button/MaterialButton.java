package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.ViewCompat;
import p010b.p048i.p049a.AbsSavedState;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;

public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {

    /* renamed from: c */
    private static final int[] f12669c = {16842911};

    /* renamed from: d */
    private static final int[] f12670d = {16842912};

    /* renamed from: e */
    private static final int f12671e = C1296k.Widget_MaterialComponents_Button;

    /* renamed from: f */
    private final MaterialButtonHelper f12672f;

    /* renamed from: g */
    private final LinkedHashSet<C1973a> f12673g;

    /* renamed from: h */
    private C1974b f12674h;

    /* renamed from: i */
    private Mode f12675i;

    /* renamed from: j */
    private ColorStateList f12676j;

    /* renamed from: k */
    private Drawable f12677k;

    /* renamed from: l */
    private int f12678l;

    /* renamed from: m */
    private int f12679m;

    /* renamed from: n */
    private int f12680n;

    /* renamed from: o */
    private int f12681o;

    /* renamed from: p */
    private boolean f12682p;

    /* renamed from: q */
    private boolean f12683q;

    /* renamed from: r */
    private int f12684r;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C1973a {
        /* renamed from: a */
        void mo15230a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C1974b {
        /* renamed from: a */
        void mo15231a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    static class C1975c extends AbsSavedState {
        public static final Creator<C1975c> CREATOR = new C1976a();

        /* renamed from: c */
        boolean f12685c;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        static class C1976a implements ClassLoaderCreator<C1975c> {
            C1976a() {
            }

            /* renamed from: a */
            public C1975c createFromParcel(Parcel parcel) {
                return new C1975c(parcel, null);
            }

            /* renamed from: b */
            public C1975c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1975c(parcel, classLoader);
            }

            /* renamed from: c */
            public C1975c[] newArray(int i) {
                return new C1975c[i];
            }
        }

        public C1975c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: m */
        private void m15502m(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f12685c = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12685c ? 1 : 0);
        }

        public C1975c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C1975c.class.getClassLoader();
            }
            m15502m(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.materialButtonStyle);
    }

    /* renamed from: c */
    private boolean m15489c() {
        int i = this.f12684r;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    private boolean m15490d() {
        int i = this.f12684r;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    private boolean m15491e() {
        int i = this.f12684r;
        return i == 16 || i == 32;
    }

    /* renamed from: f */
    private boolean m15492f() {
        return ViewCompat.m5514C(this) == 1;
    }

    /* renamed from: g */
    private boolean m15493g() {
        MaterialButtonHelper aVar = this.f12672f;
        return aVar != null && !aVar.mo15274o();
    }

    private String getA11yClassName() {
        return (mo15176b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: i */
    private void m15494i() {
        if (m15490d()) {
            TextViewCompat.m1983l(this, this.f12677k, null, null, null);
        } else if (m15489c()) {
            TextViewCompat.m1983l(this, null, null, this.f12677k, null);
        } else if (m15491e()) {
            TextViewCompat.m1983l(this, null, this.f12677k, null, null);
        }
    }

    /* renamed from: j */
    private void m15495j(boolean z) {
        Drawable drawable = this.f12677k;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.m1859r(drawable).mutate();
            this.f12677k = mutate;
            DrawableCompat.m1856o(mutate, this.f12676j);
            Mode mode = this.f12675i;
            if (mode != null) {
                DrawableCompat.m1857p(this.f12677k, mode);
            }
            int i = this.f12678l;
            if (i == 0) {
                i = this.f12677k.getIntrinsicWidth();
            }
            int i2 = this.f12678l;
            if (i2 == 0) {
                i2 = this.f12677k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12677k;
            int i3 = this.f12679m;
            int i4 = this.f12680n;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m15494i();
            return;
        }
        Drawable[] a = TextViewCompat.m1972a(this);
        boolean z2 = false;
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((m15490d() && drawable3 != this.f12677k) || ((m15489c() && drawable5 != this.f12677k) || (m15491e() && drawable4 != this.f12677k))) {
            z2 = true;
        }
        if (z2) {
            m15494i();
        }
    }

    /* renamed from: k */
    private void m15496k(int i, int i2) {
        if (!(this.f12677k == null || getLayout() == null)) {
            if (m15490d() || m15489c()) {
                this.f12680n = 0;
                int i3 = this.f12684r;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f12679m = 0;
                    m15495j(false);
                } else {
                    int i4 = this.f12678l;
                    if (i4 == 0) {
                        i4 = this.f12677k.getIntrinsicWidth();
                    }
                    int textWidth = (((((i - getTextWidth()) - ViewCompat.m5524H(this)) - i4) - this.f12681o) - ViewCompat.m5526I(this)) / 2;
                    boolean f = m15492f();
                    if (this.f12684r != 4) {
                        z = false;
                    }
                    if (f != z) {
                        textWidth = -textWidth;
                    }
                    if (this.f12679m != textWidth) {
                        this.f12679m = textWidth;
                        m15495j(false);
                    }
                }
            } else if (m15491e()) {
                this.f12679m = 0;
                if (this.f12684r == 16) {
                    this.f12680n = 0;
                    m15495j(false);
                    return;
                }
                int i5 = this.f12678l;
                if (i5 == 0) {
                    i5 = this.f12677k.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f12681o) - getPaddingBottom()) / 2;
                if (this.f12680n != textHeight) {
                    this.f12680n = textHeight;
                    m15495j(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15175a(C1973a aVar) {
        this.f12673g.add(aVar);
    }

    /* renamed from: b */
    public boolean mo15176b() {
        MaterialButtonHelper aVar = this.f12672f;
        return aVar != null && aVar.mo15275p();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m15493g()) {
            return this.f12672f.mo15263b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f12677k;
    }

    public int getIconGravity() {
        return this.f12684r;
    }

    public int getIconPadding() {
        return this.f12681o;
    }

    public int getIconSize() {
        return this.f12678l;
    }

    public ColorStateList getIconTint() {
        return this.f12676j;
    }

    public Mode getIconTintMode() {
        return this.f12675i;
    }

    public int getInsetBottom() {
        return this.f12672f.mo15264c();
    }

    public int getInsetTop() {
        return this.f12672f.mo15265d();
    }

    public ColorStateList getRippleColor() {
        if (m15493g()) {
            return this.f12672f.mo15268h();
        }
        return null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m15493g()) {
            return this.f12672f.mo15269i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m15493g()) {
            return this.f12672f.mo15270j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m15493g()) {
            return this.f12672f.mo15271k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m15493g()) {
            return this.f12672f.mo15272l();
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (m15493g()) {
            return this.f12672f.mo15273m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void mo15192h(C1973a aVar) {
        this.f12673g.remove(aVar);
    }

    public boolean isChecked() {
        return this.f12682p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m15493g()) {
            MaterialShapeUtils.m11338f(this, this.f12672f.mo15267f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo15176b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f12669c);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f12670d);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo15176b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            MaterialButtonHelper aVar = this.f12672f;
            if (aVar != null) {
                aVar.mo15262H(i4 - i2, i3 - i);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1975c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1975c cVar = (C1975c) parcelable;
        super.onRestoreInstanceState(cVar.mo5193l());
        setChecked(cVar.f12685c);
    }

    public Parcelable onSaveInstanceState() {
        C1975c cVar = new C1975c(super.onSaveInstanceState());
        cVar.f12685c = this.f12682p;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m15496k(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m15496k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m15493g()) {
            this.f12672f.mo15277r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m15493g()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f12672f.mo15278s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m15493g()) {
            this.f12672f.mo15279t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo15176b() && isEnabled() && this.f12682p != z) {
            this.f12682p = z;
            refreshDrawableState();
            if (!this.f12683q) {
                this.f12683q = true;
                Iterator it = this.f12673g.iterator();
                while (it.hasNext()) {
                    ((C1973a) it.next()).mo15230a(this, this.f12682p);
                }
                this.f12683q = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m15493g()) {
            this.f12672f.mo15280u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m15493g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m15493g()) {
            this.f12672f.mo15267f().mo7842W(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12677k != drawable) {
            this.f12677k = drawable;
            m15495j(true);
            m15496k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f12684r != i) {
            this.f12684r = i;
            m15496k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f12681o != i) {
            this.f12681o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AppCompatResources.m4143d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f12678l != i) {
            this.f12678l = i;
            m15495j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12676j != colorStateList) {
            this.f12676j = colorStateList;
            m15495j(false);
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f12675i != mode) {
            this.f12675i = mode;
            m15495j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AppCompatResources.m4142c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f12672f.mo15281v(i);
    }

    public void setInsetTop(int i) {
        this.f12672f.mo15282w(i);
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: 0000 */
    public void setOnPressedChangeListenerInternal(C1974b bVar) {
        this.f12674h = bVar;
    }

    public void setPressed(boolean z) {
        C1974b bVar = this.f12674h;
        if (bVar != null) {
            bVar.mo15231a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m15493g()) {
            this.f12672f.mo15283x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m15493g()) {
            setRippleColor(AppCompatResources.m4142c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        if (m15493g()) {
            this.f12672f.mo15284y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: 0000 */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m15493g()) {
            this.f12672f.mo15285z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m15493g()) {
            this.f12672f.mo15258A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m15493g()) {
            setStrokeColor(AppCompatResources.m4142c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m15493g()) {
            this.f12672f.mo15259B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m15493g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m15493g()) {
            this.f12672f.mo15260C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (m15493g()) {
            this.f12672f.mo15261D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f12682p);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12671e;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f12673g = new LinkedHashSet<>();
        boolean z = false;
        this.f12682p = false;
        this.f12683q = false;
        Context context2 = getContext();
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9363U1, i, i2, new int[0]);
        this.f12681o = h.getDimensionPixelSize(C1297l.f9462h2, 0);
        this.f12675i = C2053k.m16234e(h.getInt(C1297l.f9486k2, -1), Mode.SRC_IN);
        this.f12676j = MaterialResources.m11600a(getContext(), h, C1297l.f9478j2);
        this.f12677k = MaterialResources.m11603d(getContext(), h, C1297l.f9446f2);
        this.f12684r = h.getInteger(C1297l.f9454g2, 1);
        this.f12678l = h.getDimensionPixelSize(C1297l.f9470i2, 0);
        MaterialButtonHelper aVar = new MaterialButtonHelper(this, ShapeAppearanceModel.m11345e(context2, attributeSet, i, i2).mo7905m());
        this.f12672f = aVar;
        aVar.mo15276q(h);
        h.recycle();
        setCompoundDrawablePadding(this.f12681o);
        if (this.f12677k != null) {
            z = true;
        }
        m15495j(z);
    }
}
