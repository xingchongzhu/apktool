package com.google.android.exoplayer2.p196ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p097j2.TrackGroup;
import p067c.p068a.p069a.p070a.p097j2.TrackGroupArray;
import p067c.p068a.p069a.p070a.p110l2.DefaultTrackSelector.C1170e;
import p067c.p068a.p069a.p070a.p110l2.MappingTrackSelector.C1177a;
import p067c.p068a.p069a.p070a.p111m2.Assertions;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    private final int f11985a;

    /* renamed from: b */
    private final LayoutInflater f11986b;

    /* renamed from: c */
    private final CheckedTextView f11987c;

    /* renamed from: d */
    private final CheckedTextView f11988d;

    /* renamed from: e */
    private final C1860b f11989e;

    /* renamed from: f */
    private final SparseArray<C1170e> f11990f;

    /* renamed from: g */
    private boolean f11991g;

    /* renamed from: h */
    private boolean f11992h;

    /* renamed from: i */
    private TrackNameProvider f11993i;

    /* renamed from: j */
    private CheckedTextView[][] f11994j;

    /* renamed from: k */
    private C1177a f11995k;

    /* renamed from: l */
    private int f11996l;

    /* renamed from: m */
    private TrackGroupArray f11997m;

    /* renamed from: n */
    private boolean f11998n;

    /* renamed from: o */
    private Comparator<C1861c> f11999o;

    /* renamed from: p */
    private C1862d f12000p;

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$b */
    private class C1860b implements OnClickListener {
        private C1860b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.m14810d(view);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$c */
    private static final class C1861c {

        /* renamed from: a */
        public final int f12002a;

        /* renamed from: b */
        public final int f12003b;

        /* renamed from: c */
        public final Format f12004c;

        public C1861c(int i, int i2, Format u0Var) {
            this.f12002a = i;
            this.f12003b = i2;
            this.f12004c = u0Var;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$d */
    public interface C1862d {
        /* renamed from: a */
        void mo14806a(boolean z, List<C1170e> list);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private static int[] m14808b(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    /* renamed from: c */
    private static int[] m14809c(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != i) {
                int i4 = i2 + 1;
                iArr2[i2] = i3;
                i2 = i4;
            }
        }
        return iArr2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14810d(View view) {
        if (view == this.f11987c) {
            m14812f();
        } else if (view == this.f11988d) {
            m14811e();
        } else {
            m14813g(view);
        }
        m14816j();
        C1862d dVar = this.f12000p;
        if (dVar != null) {
            dVar.mo14806a(getIsDisabled(), getOverrides());
        }
    }

    /* renamed from: e */
    private void m14811e() {
        this.f11998n = false;
        this.f11990f.clear();
    }

    /* renamed from: f */
    private void m14812f() {
        this.f11998n = true;
        this.f11990f.clear();
    }

    /* renamed from: g */
    private void m14813g(View view) {
        this.f11998n = false;
        C1861c cVar = (C1861c) Assertions.m10153e(view.getTag());
        int i = cVar.f12002a;
        int i2 = cVar.f12003b;
        C1170e eVar = (C1170e) this.f11990f.get(i);
        Assertions.m10153e(this.f11995k);
        if (eVar == null) {
            if (!this.f11992h && this.f11990f.size() > 0) {
                this.f11990f.clear();
            }
            this.f11990f.put(i, new C1170e(i, i2));
            return;
        }
        int i3 = eVar.f8251c;
        int[] iArr = eVar.f8250b;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean h = m14814h(i);
        boolean z = h || m14815i();
        if (!isChecked || !z) {
            if (isChecked) {
                return;
            }
            if (h) {
                this.f11990f.put(i, new C1170e(i, m14808b(iArr, i2)));
            } else {
                this.f11990f.put(i, new C1170e(i, i2));
            }
        } else if (i3 == 1) {
            this.f11990f.remove(i);
        } else {
            this.f11990f.put(i, new C1170e(i, m14809c(iArr, i2)));
        }
    }

    @RequiresNonNull({"mappedTrackInfo"})
    /* renamed from: h */
    private boolean m14814h(int i) {
        if (!this.f11991g || this.f11997m.mo6988l(i).f7606a <= 1 || this.f11995k.mo7315a(this.f11996l, i, false) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m14815i() {
        return this.f11992h && this.f11997m.f7610b > 1;
    }

    /* renamed from: j */
    private void m14816j() {
        this.f11987c.setChecked(this.f11998n);
        this.f11988d.setChecked(!this.f11998n && this.f11990f.size() == 0);
        for (int i = 0; i < this.f11994j.length; i++) {
            C1170e eVar = (C1170e) this.f11990f.get(i);
            int i2 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.f11994j;
                if (i2 >= checkedTextViewArr[i].length) {
                    break;
                }
                if (eVar != null) {
                    this.f11994j[i][i2].setChecked(eVar.mo7303l(((C1861c) Assertions.m10153e(checkedTextViewArr[i][i2].getTag())).f12003b));
                } else {
                    checkedTextViewArr[i][i2].setChecked(false);
                }
                i2++;
            }
        }
    }

    /* renamed from: k */
    private void m14817k() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f11995k == null) {
            this.f11987c.setEnabled(false);
            this.f11988d.setEnabled(false);
            return;
        }
        this.f11987c.setEnabled(true);
        this.f11988d.setEnabled(true);
        TrackGroupArray e = this.f11995k.mo7319e(this.f11996l);
        this.f11997m = e;
        this.f11994j = new CheckedTextView[e.f7610b][];
        boolean i = m14815i();
        int i2 = 0;
        while (true) {
            TrackGroupArray q0Var = this.f11997m;
            if (i2 < q0Var.f7610b) {
                TrackGroup l = q0Var.mo6988l(i2);
                boolean h = m14814h(i2);
                CheckedTextView[][] checkedTextViewArr = this.f11994j;
                int i3 = l.f7606a;
                checkedTextViewArr[i2] = new CheckedTextView[i3];
                C1861c[] cVarArr = new C1861c[i3];
                for (int i4 = 0; i4 < l.f7606a; i4++) {
                    cVarArr[i4] = new C1861c(i2, i4, l.mo6977l(i4));
                }
                Comparator<C1861c> comparator = this.f11999o;
                if (comparator != null) {
                    Arrays.sort(cVarArr, comparator);
                }
                for (int i5 = 0; i5 < i3; i5++) {
                    if (i5 == 0) {
                        addView(this.f11986b.inflate(C1877o.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.f11986b.inflate((h || i) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.f11985a);
                    checkedTextView.setText(this.f11993i.mo14814a(cVarArr[i5].f12004c));
                    checkedTextView.setTag(cVarArr[i5]);
                    if (this.f11995k.mo7320f(this.f11996l, i2, i5) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.f11989e);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f11994j[i2][i5] = checkedTextView;
                    addView(checkedTextView);
                }
                i2++;
            } else {
                m14816j();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f11998n;
    }

    public List<C1170e> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f11990f.size());
        for (int i = 0; i < this.f11990f.size(); i++) {
            arrayList.add((C1170e) this.f11990f.valueAt(i));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f11991g != z) {
            this.f11991g = z;
            m14817k();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f11992h != z) {
            this.f11992h = z;
            if (!z && this.f11990f.size() > 1) {
                for (int size = this.f11990f.size() - 1; size > 0; size--) {
                    this.f11990f.remove(size);
                }
            }
            m14817k();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f11987c.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider vVar) {
        this.f11993i = (TrackNameProvider) Assertions.m10153e(vVar);
        m14817k();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.f11990f = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f11985a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f11986b = from;
        C1860b bVar = new C1860b();
        this.f11989e = bVar;
        this.f11993i = new DefaultTrackNameProvider(getResources());
        this.f11997m = TrackGroupArray.f7609a;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f11987c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C1878p.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(C1877o.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f11988d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C1878p.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
