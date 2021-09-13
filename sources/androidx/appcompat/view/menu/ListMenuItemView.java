package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuView.C0112a;
import androidx.appcompat.widget.TintTypedArray;
import p010b.p011a.C0502a;
import p010b.p011a.C0507f;
import p010b.p011a.C0508g;
import p010b.p011a.C0511j;
import p010b.p034g.p043k.ViewCompat;

public class ListMenuItemView extends LinearLayout implements C0112a, SelectionBoundsAdjuster {

    /* renamed from: a */
    private MenuItemImpl f470a;

    /* renamed from: b */
    private ImageView f471b;

    /* renamed from: c */
    private RadioButton f472c;

    /* renamed from: d */
    private TextView f473d;

    /* renamed from: e */
    private CheckBox f474e;

    /* renamed from: f */
    private TextView f475f;

    /* renamed from: g */
    private ImageView f476g;

    /* renamed from: h */
    private ImageView f477h;

    /* renamed from: i */
    private LinearLayout f478i;

    /* renamed from: j */
    private Drawable f479j;

    /* renamed from: k */
    private int f480k;

    /* renamed from: l */
    private Context f481l;

    /* renamed from: m */
    private boolean f482m;

    /* renamed from: n */
    private Drawable f483n;

    /* renamed from: o */
    private boolean f484o;

    /* renamed from: p */
    private LayoutInflater f485p;

    /* renamed from: q */
    private boolean f486q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3267C);
    }

    /* renamed from: a */
    private void m532a(View view) {
        m533b(view, -1);
    }

    /* renamed from: b */
    private void m533b(View view, int i) {
        LinearLayout linearLayout = this.f478i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: c */
    private void m534c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C0508g.f3412h, this, false);
        this.f474e = checkBox;
        m532a(checkBox);
    }

    /* renamed from: f */
    private void m535f() {
        ImageView imageView = (ImageView) getInflater().inflate(C0508g.f3413i, this, false);
        this.f471b = imageView;
        m533b(imageView, 0);
    }

    /* renamed from: g */
    private void m536g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C0508g.f3415k, this, false);
        this.f472c = radioButton;
        m532a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f485p == null) {
            this.f485p = LayoutInflater.from(getContext());
        }
        return this.f485p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f476g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f477h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f477h.getLayoutParams();
            rect.top += this.f477h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: d */
    public boolean mo487d() {
        return false;
    }

    /* renamed from: e */
    public void mo488e(MenuItemImpl iVar, int i) {
        this.f470a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo742i(this));
        setCheckable(iVar.isCheckable());
        mo513h(iVar.mo723A(), iVar.mo727g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public MenuItemImpl getItemData() {
        return this.f470a;
    }

    /* renamed from: h */
    public void mo513h(boolean z, char c) {
        int i = (!z || !this.f470a.mo723A()) ? 8 : 0;
        if (i == 0) {
            this.f475f.setText(this.f470a.mo740h());
        }
        if (this.f475f.getVisibility() != i) {
            this.f475f.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m5579r0(this, this.f479j);
        TextView textView = (TextView) findViewById(C0507f.f3375M);
        this.f473d = textView;
        int i = this.f480k;
        if (i != -1) {
            textView.setTextAppearance(this.f481l, i);
        }
        this.f475f = (TextView) findViewById(C0507f.f3368F);
        ImageView imageView = (ImageView) findViewById(C0507f.f3371I);
        this.f476g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f483n);
        }
        this.f477h = (ImageView) findViewById(C0507f.f3396r);
        this.f478i = (LinearLayout) findViewById(C0507f.f3390l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f471b != null && this.f482m) {
            LayoutParams layoutParams = (LayoutParams) this.f471b.getLayoutParams();
            int i3 = getLayoutParams().height;
            if (i3 > 0 && layoutParams.width <= 0) {
                layoutParams.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f472c != null || this.f474e != null) {
            if (this.f470a.mo750m()) {
                if (this.f472c == null) {
                    m536g();
                }
                compoundButton2 = this.f472c;
                compoundButton = this.f474e;
            } else {
                if (this.f474e == null) {
                    m534c();
                }
                compoundButton2 = this.f474e;
                compoundButton = this.f472c;
            }
            if (z) {
                compoundButton2.setChecked(this.f470a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f474e;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f472c;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f470a.mo750m()) {
            if (this.f472c == null) {
                m536g();
            }
            compoundButton = this.f472c;
        } else {
            if (this.f474e == null) {
                m534c();
            }
            compoundButton = this.f474e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f486q = z;
        this.f482m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f477h;
        if (imageView != null) {
            imageView.setVisibility((this.f484o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f470a.mo780z() || this.f486q;
        if (z || this.f482m) {
            ImageView imageView = this.f471b;
            if (imageView != null || drawable != null || this.f482m) {
                if (imageView == null) {
                    m535f();
                }
                if (drawable != null || this.f482m) {
                    ImageView imageView2 = this.f471b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f471b.getVisibility() != 0) {
                        this.f471b.setVisibility(0);
                    }
                } else {
                    this.f471b.setVisibility(8);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f473d.setText(charSequence);
            if (this.f473d.getVisibility() != 0) {
                this.f473d.setVisibility(0);
            }
        } else if (this.f473d.getVisibility() != 8) {
            this.f473d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TintTypedArray v = TintTypedArray.m1406v(getContext(), attributeSet, C0511j.f3541W1, i, 0);
        this.f479j = v.mo1838g(C0511j.f3549Y1);
        this.f480k = v.mo1845n(C0511j.f3545X1, -1);
        this.f482m = v.mo1832a(C0511j.f3553Z1, false);
        this.f481l = context;
        this.f483n = v.mo1838g(C0511j.f3558a2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C0502a.f3303z, 0);
        this.f484o = obtainStyledAttributes.hasValue(0);
        v.mo1851w();
        obtainStyledAttributes.recycle();
    }
}
