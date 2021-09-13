package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.ChipDrawable.C1991a;
import com.google.android.material.internal.C2053k;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.p198a.MaterialThemeOverlay;
import com.umeng.analytics.pro.UMCommonContent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p010b.p034g.p043k.ViewCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a;
import p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0636c;
import p010b.p048i.p050b.ExploreByTouchHelper;
import p067c.p068a.p069a.p114b.C1270b;
import p067c.p068a.p069a.p114b.C1295j;
import p067c.p068a.p069a.p114b.C1296k;
import p067c.p068a.p069a.p114b.C1297l;
import p067c.p068a.p069a.p114b.p115a0.RippleUtils;
import p067c.p068a.p069a.p114b.p117c0.MaterialShapeUtils;
import p067c.p068a.p069a.p114b.p117c0.ShapeAppearanceModel;
import p067c.p068a.p069a.p114b.p117c0.Shapeable;
import p067c.p068a.p069a.p114b.p119m.MotionSpec;
import p067c.p068a.p069a.p114b.p133z.MaterialResources;
import p067c.p068a.p069a.p114b.p133z.TextAppearance;
import p067c.p068a.p069a.p114b.p133z.TextAppearanceFontCallback;

public class Chip extends AppCompatCheckBox implements C1991a, Shapeable {

    /* renamed from: d */
    private static final int f12727d = C1296k.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Rect f12728e = new Rect();

    /* renamed from: f */
    private static final int[] f12729f = {16842913};

    /* renamed from: g */
    private static final int[] f12730g = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ChipDrawable f12731h;

    /* renamed from: i */
    private InsetDrawable f12732i;

    /* renamed from: j */
    private RippleDrawable f12733j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public OnClickListener f12734k;

    /* renamed from: l */
    private OnCheckedChangeListener f12735l;

    /* renamed from: m */
    private boolean f12736m;

    /* renamed from: n */
    private boolean f12737n;

    /* renamed from: o */
    private boolean f12738o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f12739p;

    /* renamed from: q */
    private boolean f12740q;

    /* renamed from: r */
    private int f12741r;

    /* renamed from: s */
    private int f12742s;

    /* renamed from: t */
    private final C1985c f12743t;

    /* renamed from: u */
    private final Rect f12744u;

    /* renamed from: v */
    private final RectF f12745v;

    /* renamed from: w */
    private final TextAppearanceFontCallback f12746w;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C1983a extends TextAppearanceFontCallback {
        C1983a() {
        }

        /* renamed from: a */
        public void mo8085a(int i) {
        }

        /* renamed from: b */
        public void mo8086b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f12731h.mo15494K2() ? Chip.this.f12731h.mo15534g1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C1984b extends ViewOutlineProvider {
        C1984b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f12731h != null) {
                Chip.this.f12731h.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C1985c extends ExploreByTouchHelper {
        C1985c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo5201B(float f, float f2) {
            return (!Chip.this.m15590n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo5202C(List<Integer> list) {
            list.add(Integer.valueOf(0));
            if (Chip.this.m15590n() && Chip.this.mo15330s() && Chip.this.f12734k != null) {
                list.add(Integer.valueOf(1));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public boolean mo5205J(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.mo15425t();
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public void mo5208M(AccessibilityNodeInfoCompat cVar) {
            cVar.mo5049V(Chip.this.mo15329r());
            cVar.mo5052Y(Chip.this.isClickable());
            if (Chip.this.mo15329r() || Chip.this.isClickable()) {
                cVar.mo5051X(Chip.this.mo15329r() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.mo5051X("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                cVar.mo5090u0(text);
            } else {
                cVar.mo5057b0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public void mo5209N(int i, AccessibilityNodeInfoCompat cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo5057b0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C1295j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.mo5057b0(context.getString(i2, objArr).trim());
                }
                cVar.mo5047T(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo5056b(C0634a.f4684e);
                cVar.mo5060d0(Chip.this.isEnabled());
                return;
            }
            cVar.mo5057b0(charSequence);
            cVar.mo5047T(Chip.f12728e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo5210O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f12739p = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1270b.chipStyle);
    }

    /* renamed from: A */
    private void m15576A() {
        if (!TextUtils.isEmpty(getText())) {
            ChipDrawable aVar = this.f12731h;
            if (aVar != null) {
                int I0 = (int) (aVar.mo15486I0() + this.f12731h.mo15542i1() + this.f12731h.mo15558p0());
                int N0 = (int) (this.f12731h.mo15499N0() + this.f12731h.mo15545j1() + this.f12731h.mo15548l0());
                if (this.f12732i != null) {
                    Rect rect = new Rect();
                    this.f12732i.getPadding(rect);
                    N0 += rect.left;
                    I0 += rect.right;
                }
                ViewCompat.m5511A0(this, N0, getPaddingTop(), I0, getPaddingBottom());
            }
        }
    }

    /* renamed from: B */
    private void m15577B() {
        TextPaint paint = getPaint();
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        TextAppearance textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo8093j(getContext(), paint, this.f12746w);
        }
    }

    /* renamed from: C */
    private void m15578C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String str = "http://schemas.android.com/apk/res/android";
            String str2 = "Chip";
            if (attributeSet.getAttributeValue(str, "background") != null) {
                Log.w(str2, "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str3 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str3);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str3);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    if (attributeSet.getAttributeIntValue(str, "gravity", 8388627) != 8388627) {
                        Log.w(str2, "Chip text must be vertically center and start aligned");
                    }
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f12745v.setEmpty();
        if (m15590n() && this.f12734k != null) {
            this.f12731h.mo15519X0(this.f12745v);
        }
        return this.f12745v;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f12744u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f12744u;
    }

    private TextAppearance getTextAppearance() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15540h1();
        }
        return null;
    }

    /* renamed from: i */
    private void m15586i(ChipDrawable aVar) {
        aVar.mo15555o2(this);
    }

    /* renamed from: j */
    private int[] m15587j() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f12739p) {
            i2++;
        }
        if (this.f12738o) {
            i2++;
        }
        if (this.f12737n) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f12739p) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f12738o) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f12737n) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m15588l() {
        if (getBackgroundDrawable() == this.f12732i && this.f12731h.getCallback() == null) {
            this.f12731h.setCallback(this.f12732i);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m15589m(MotionEvent motionEvent) {
        Class<ExploreByTouchHelper> cls = ExploreByTouchHelper.class;
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField(UMCommonContent.f16624av);
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f12743t)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f12743t, new Object[]{Integer.valueOf(Integer.MIN_VALUE)});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.e(str2, str, e2);
            } catch (InvocationTargetException e3) {
                Log.e(str2, str, e3);
            } catch (NoSuchFieldException e4) {
                Log.e(str2, str, e4);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m15590n() {
        ChipDrawable aVar = this.f12731h;
        return (aVar == null || aVar.mo15505Q0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m15591o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = ThemeEnforcement.m16228h(context, attributeSet, C1297l.f9361U, i, f12727d, new int[0]);
        this.f12740q = h.getBoolean(C1297l.f9223B0, false);
        this.f12742s = (int) Math.ceil((double) h.getDimension(C1297l.f9524p0, (float) Math.ceil((double) C2053k.m16231b(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: p */
    private void m15592p() {
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C1984b());
        }
    }

    /* renamed from: q */
    private void m15593q(int i, int i2, int i3, int i4) {
        InsetDrawable insetDrawable = new InsetDrawable(this.f12731h, i, i2, i3, i4);
        this.f12732i = insetDrawable;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f12738o != z) {
            this.f12738o = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f12737n != z) {
            this.f12737n = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m15594u() {
        if (this.f12732i != null) {
            this.f12732i = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m15597y();
        }
    }

    /* renamed from: w */
    private void m15595w(ChipDrawable aVar) {
        if (aVar != null) {
            aVar.mo15555o2(null);
        }
    }

    /* renamed from: x */
    private void m15596x() {
        if (!m15590n() || !mo15330s() || this.f12734k == null) {
            ViewCompat.m5573o0(this, null);
        } else {
            ViewCompat.m5573o0(this, this.f12743t);
        }
    }

    /* renamed from: y */
    private void m15597y() {
        if (RippleUtils.f9053a) {
            m15598z();
            return;
        }
        this.f12731h.mo15491J2(true);
        ViewCompat.m5579r0(this, getBackgroundDrawable());
        m15576A();
        m15588l();
    }

    /* renamed from: z */
    private void m15598z() {
        this.f12733j = new RippleDrawable(RippleUtils.m11253d(this.f12731h.mo15530e1()), getBackgroundDrawable(), null);
        this.f12731h.mo15491J2(false);
        ViewCompat.m5579r0(this, this.f12733j);
        m15576A();
    }

    /* renamed from: a */
    public void mo15286a() {
        mo15320k(this.f12742s);
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m15589m(motionEvent) || this.f12743t.mo5215v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f12743t.mo5216w(keyEvent) || this.f12743t.mo5200A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ChipDrawable aVar = this.f12731h;
        if ((aVar == null || !aVar.mo15554o1()) ? false : this.f12731h.mo15547k2(m15587j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12732i;
        return insetDrawable == null ? this.f12731h : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15474E0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15477F0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15480G0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo15483H0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12731h;
    }

    public float getChipEndPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15486I0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15489J0();
        }
        return null;
    }

    public float getChipIconSize() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15492K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15495L0();
        }
        return null;
    }

    public float getChipMinHeight() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15497M0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15499N0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15501O0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15503P0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15505Q0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15507R0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15509S0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15511T0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15513U0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15517W0();
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15523a1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f12743t.mo5200A() == 1 || this.f12743t.mo5217x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public MotionSpec getHideMotionSpec() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15524b1();
        }
        return null;
    }

    public float getIconEndPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15526c1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15528d1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15530e1();
        }
        return null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f12731h.mo7830C();
    }

    public MotionSpec getShowMotionSpec() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15532f1();
        }
        return null;
    }

    public float getTextEndPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15542i1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            return aVar.mo15545j1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public boolean mo15320k(int i) {
        this.f12742s = i;
        int i2 = 0;
        if (!mo15426v()) {
            if (this.f12732i != null) {
                m15594u();
            } else {
                m15597y();
            }
            return false;
        }
        int max = Math.max(0, i - this.f12731h.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f12731h.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f12732i != null) {
                Rect rect = new Rect();
                this.f12732i.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m15597y();
                    return true;
                }
            }
            if (VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m15593q(i3, i2, i3, i2);
            m15597y();
            return true;
        }
        if (this.f12732i != null) {
            m15594u();
        } else {
            m15597y();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m11338f(this, this.f12731h);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f12729f);
        }
        if (mo15329r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f12730g);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f12743t.mo5204I(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo15329r() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo15329r() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo15329r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat.m5349y0(accessibilityNodeInfo).mo5055a0(C0636c.m5416a(chipGroup.mo15974b(this), 1, chipGroup.mo15429c() ? chipGroup.mo15440o(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f12741r != i) {
            this.f12741r = i;
            m15576A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f12737n
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f12737n
            if (r0 == 0) goto L_0x0034
            r5.mo15425t()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo15329r() {
        ChipDrawable aVar = this.f12731h;
        return aVar != null && aVar.mo15552n1();
    }

    /* renamed from: s */
    public boolean mo15330s() {
        ChipDrawable aVar = this.f12731h;
        return aVar != null && aVar.mo15559p1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12733j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12733j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15572w1(z);
        }
    }

    public void setCheckableResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15574x1(i);
        }
    }

    public void setChecked(boolean z) {
        ChipDrawable aVar = this.f12731h;
        if (aVar == null) {
            this.f12736m = z;
        } else if (aVar.mo15552n1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.f12735l;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15576y1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15578z1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15466A1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15468B1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15470C1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15475E1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15478F1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15481G1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15484H1(i);
        }
    }

    public void setChipDrawable(ChipDrawable aVar) {
        ChipDrawable aVar2 = this.f12731h;
        if (aVar2 != aVar) {
            m15595w(aVar2);
            this.f12731h = aVar;
            aVar.mo15579z2(false);
            m15586i(this.f12731h);
            mo15320k(this.f12742s);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15487I1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15490J1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15493K1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15496L1(i);
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15498M1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15500N1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15502O1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15504P1(i);
        }
    }

    public void setChipIconVisible(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15506Q1(i);
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15510S1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15512T1(i);
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15514U1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15516V1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15518W1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15520X1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15521Y1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15522Z1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15525b2(drawable);
        }
        m15596x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15527c2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15529d2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15531e2(i);
        }
    }

    public void setCloseIconResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15533f2(i);
        }
        m15596x();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15535g2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15541h2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15543i2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15546j2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15550l2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15551m2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo7842W(f);
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f12731h != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ChipDrawable aVar = this.f12731h;
                if (aVar != null) {
                    aVar.mo15560p2(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f12740q = z;
        mo15320k(this.f12742s);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(MotionSpec hVar) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15561q2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15562r2(i);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15564s2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15567t2(i);
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15569u2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15571v2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f12731h != null && VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15573w2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f12735l = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f12734k = onClickListener;
        m15596x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15575x2(colorStateList);
        }
        if (!this.f12731h.mo15549l1()) {
            m15598z();
        }
    }

    public void setRippleColorResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15577y2(i);
            if (!this.f12731h.mo15549l1()) {
                m15598z();
            }
        }
    }

    public void setShapeAppearanceModel(ShapeAppearanceModel kVar) {
        this.f12731h.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(MotionSpec hVar) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15467A2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15469B2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.mo15494K2() ? null : charSequence, bufferType);
            ChipDrawable aVar2 = this.f12731h;
            if (aVar2 != null) {
                aVar2.mo15471C2(charSequence);
            }
        }
    }

    public void setTextAppearance(TextAppearance dVar) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15473D2(dVar);
        }
        m15577B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15479F2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15482G2(i);
        }
    }

    public void setTextStartPadding(float f) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15485H2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15488I2(i);
        }
    }

    /* renamed from: t */
    public boolean mo15425t() {
        boolean z = false;
        playSoundEffect(0);
        OnClickListener onClickListener = this.f12734k;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f12743t.mo5213U(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean mo15426v() {
        return this.f12740q;
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12727d;
        super(MaterialThemeOverlay.m16587c(context, attributeSet, i, i2), attributeSet, i);
        this.f12744u = new Rect();
        this.f12745v = new RectF();
        this.f12746w = new C1983a();
        Context context2 = getContext();
        m15578C(attributeSet);
        ChipDrawable u0 = ChipDrawable.m15657u0(context2, attributeSet, i, i2);
        m15591o(context2, attributeSet, i);
        setChipDrawable(u0);
        u0.mo7842W(ViewCompat.m5588w(this));
        TypedArray h = ThemeEnforcement.m16228h(context2, attributeSet, C1297l.f9361U, i, i2, new int[0]);
        if (VERSION.SDK_INT < 23) {
            setTextColor(MaterialResources.m11600a(context2, h, C1297l.f9382X));
        }
        boolean hasValue = h.hasValue(C1297l.f9263G0);
        h.recycle();
        this.f12743t = new C1985c(this);
        m15596x();
        if (!hasValue) {
            m15592p();
        }
        setChecked(this.f12736m);
        setText(u0.mo15534g1());
        setEllipsize(u0.mo15523a1());
        m15577B();
        if (!this.f12731h.mo15494K2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m15576A();
        if (mo15426v()) {
            setMinHeight(this.f12742s);
        }
        this.f12741r = ViewCompat.m5514C(this);
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15553n2(z);
        }
        m15596x();
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15472D1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15508R1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15476E2(i);
        }
        m15577B();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ChipDrawable aVar = this.f12731h;
        if (aVar != null) {
            aVar.mo15476E2(i);
        }
        m15577B();
    }
}
