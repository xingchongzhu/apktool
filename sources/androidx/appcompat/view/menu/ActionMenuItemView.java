package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.MenuBuilder.C0103b;
import androidx.appcompat.view.menu.MenuView.C0112a;
import androidx.appcompat.widget.ActionMenuView.C0121a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import p010b.p011a.C0511j;

public class ActionMenuItemView extends AppCompatTextView implements C0112a, OnClickListener, C0121a {

    /* renamed from: f */
    MenuItemImpl f455f;

    /* renamed from: g */
    private CharSequence f456g;

    /* renamed from: h */
    private Drawable f457h;

    /* renamed from: i */
    C0103b f458i;

    /* renamed from: j */
    private ForwardingListener f459j;

    /* renamed from: k */
    C0095b f460k;

    /* renamed from: l */
    private boolean f461l;

    /* renamed from: m */
    private boolean f462m;

    /* renamed from: n */
    private int f463n;

    /* renamed from: o */
    private int f464o;

    /* renamed from: p */
    private int f465p;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0094a extends ForwardingListener {
        public C0094a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public ShowableListMenu mo504b() {
            C0095b bVar = ActionMenuItemView.this.f460k;
            if (bVar != null) {
                return bVar.mo506a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo505c() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0103b bVar = actionMenuItemView.f458i;
            if (bVar == null || !bVar.mo507a(actionMenuItemView.f455f)) {
                return false;
            }
            ShowableListMenu b = mo504b();
            if (b == null || !b.mo602c()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0095b {
        /* renamed from: a */
        public abstract ShowableListMenu mo506a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m520g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: h */
    private void m521h() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f456g);
        if (this.f457h != null && (!this.f455f.mo724B() || (!this.f461l && !this.f462m))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f456g : null);
        CharSequence contentDescription = this.f455f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f455f.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f455f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f455f.getTitle();
            }
            TooltipCompat.m1498a(this, charSequence2);
            return;
        }
        TooltipCompat.m1498a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo485a() {
        return mo489f();
    }

    /* renamed from: b */
    public boolean mo486b() {
        return mo489f() && this.f455f.getIcon() == null;
    }

    /* renamed from: d */
    public boolean mo487d() {
        return true;
    }

    /* renamed from: e */
    public void mo488e(MenuItemImpl iVar, int i) {
        this.f455f = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo742i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f459j == null) {
            this.f459j = new C0094a();
        }
    }

    /* renamed from: f */
    public boolean mo489f() {
        return !TextUtils.isEmpty(getText());
    }

    public MenuItemImpl getItemData() {
        return this.f455f;
    }

    public void onClick(View view) {
        C0103b bVar = this.f458i;
        if (bVar != null) {
            bVar.mo507a(this.f455f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f461l = m520g();
        m521h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean f = mo489f();
        if (f) {
            int i4 = this.f464o;
            if (i4 >= 0) {
                super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f463n);
        } else {
            i3 = this.f463n;
        }
        if (mode != 1073741824 && this.f463n > 0 && measuredWidth < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!f && this.f457h != null) {
            super.setPadding((getMeasuredWidth() - this.f457h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f455f.hasSubMenu()) {
            ForwardingListener i0Var = this.f459j;
            if (i0Var != null && i0Var.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f462m != z) {
            this.f462m = z;
            MenuItemImpl iVar = this.f455f;
            if (iVar != null) {
                iVar.mo725c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f457h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f465p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m521h();
    }

    public void setItemInvoker(C0103b bVar) {
        this.f458i = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f464o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0095b bVar) {
        this.f460k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f456g = charSequence;
        m521h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f461l = m520g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0511j.f3660v, i, 0);
        this.f463n = obtainStyledAttributes.getDimensionPixelSize(C0511j.f3665w, 0);
        obtainStyledAttributes.recycle();
        this.f465p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f464o = -1;
        setSaveEnabled(false);
    }
}
