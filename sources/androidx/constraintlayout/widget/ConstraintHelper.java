package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;
import java.util.Arrays;
import java.util.HashMap;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.Helper;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    protected int[] f1427a = new int[32];

    /* renamed from: b */
    protected int f1428b;

    /* renamed from: c */
    protected Context f1429c;

    /* renamed from: d */
    protected Helper f1430d;

    /* renamed from: e */
    protected boolean f1431e = false;

    /* renamed from: f */
    protected String f1432f;

    /* renamed from: g */
    protected String f1433g;

    /* renamed from: h */
    private View[] f1434h = null;

    /* renamed from: i */
    private HashMap<Integer, String> f1435i = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f1429c = context;
        mo1891h(null);
    }

    /* renamed from: a */
    private void m1531a(String str) {
        if (str != null && str.length() != 0 && this.f1429c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int g = m1535g(trim);
            if (g != 0) {
                this.f1435i.put(Integer.valueOf(g), trim);
                m1532b(g);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }

    /* renamed from: b */
    private void m1532b(int i) {
        if (i != getId()) {
            int i2 = this.f1428b + 1;
            int[] iArr = this.f1427a;
            if (i2 > iArr.length) {
                this.f1427a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1427a;
            int i3 = this.f1428b;
            iArr2[i3] = i;
            this.f1428b = i3 + 1;
        }
    }

    /* renamed from: c */
    private void m1533c(String str) {
        if (str != null && str.length() != 0 && this.f1429c != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            String str2 = "ConstraintHelper";
            if (constraintLayout == null) {
                Log.w(str2, "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof C0212b) && trim.equals(((C0212b) layoutParams).f1356V)) {
                    if (childAt.getId() == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("to use ConstraintTag view ");
                        sb.append(childAt.getClass().getSimpleName());
                        sb.append(" must have an ID");
                        Log.w(str2, sb.toString());
                    } else {
                        m1532b(childAt.getId());
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private int m1534f(ConstraintLayout constraintLayout, String str) {
        if (!(str == null || constraintLayout == null)) {
            Resources resources = this.f1429c.getResources();
            if (resources == null) {
                return 0;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    String str2 = null;
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (NotFoundException unused) {
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    private int m1535g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g = constraintLayout.mo1905g(0, str);
            if (g instanceof Integer) {
                i = ((Integer) g).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m1534f(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0225h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i != 0) {
            return i;
        }
        return this.f1429c.getResources().getIdentifier(str, "id", this.f1429c.getPackageName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1949d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo1950e((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1950e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1428b; i++) {
            View i2 = constraintLayout.mo1914i(this.f1427a[i]);
            if (i2 != null) {
                i2.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    i2.setTranslationZ(i2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1427a, this.f1428b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo1891h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0226i.f1727a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1809m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1432f = string;
                    setIds(string);
                } else if (index == C0226i.f1815n1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1433g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i */
    public void mo1892i(ConstraintWidget eVar, boolean z) {
    }

    /* renamed from: j */
    public void mo1952j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void mo1953k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void mo1954l(ConstraintLayout constraintLayout) {
    }

    /* renamed from: m */
    public void mo1955m(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1432f);
        }
        Helper hVar = this.f1430d;
        if (hVar != null) {
            hVar.mo4788c();
            for (int i = 0; i < this.f1428b; i++) {
                int i2 = this.f1427a[i];
                View i3 = constraintLayout.mo1914i(i2);
                if (i3 == null) {
                    String str = (String) this.f1435i.get(Integer.valueOf(i2));
                    int f = m1534f(constraintLayout, str);
                    if (f != 0) {
                        this.f1427a[i] = f;
                        this.f1435i.put(Integer.valueOf(f), str);
                        i3 = constraintLayout.mo1914i(f);
                    }
                }
                if (i3 != null) {
                    this.f1430d.mo4786a(constraintLayout.mo1915j(i3));
                }
            }
            this.f1430d.mo4787b(constraintLayout.f1313c);
        }
    }

    /* renamed from: n */
    public void mo1956n() {
        if (this.f1430d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0212b) {
                ((C0212b) layoutParams).f1388n0 = (ConstraintWidget) this.f1430d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1432f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1433g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1431e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1432f = str;
        if (str != null) {
            int i = 0;
            this.f1428b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1531a(str.substring(i));
                    return;
                } else {
                    m1531a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f1433g = str;
        if (str != null) {
            int i = 0;
            this.f1428b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1533c(str.substring(i));
                    return;
                } else {
                    m1533c(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1432f = null;
        this.f1428b = 0;
        for (int b : iArr) {
            m1532b(b);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1432f == null) {
            m1532b(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1429c = context;
        mo1891h(attributeSet);
    }
}
