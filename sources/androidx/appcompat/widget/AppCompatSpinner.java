package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.C0060a;
import androidx.appcompat.view.menu.ShowableListMenu;
import p010b.p011a.C0502a;
import p010b.p011a.p012k.p013a.AppCompatResources;
import p010b.p034g.p043k.TintableBackgroundView;
import p010b.p034g.p043k.ViewCompat;

/* renamed from: androidx.appcompat.widget.x */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: a */
    private static final int[] f1231a = {16843505};

    /* renamed from: b */
    private final AppCompatBackgroundHelper f1232b;

    /* renamed from: c */
    private final Context f1233c;

    /* renamed from: d */
    private ForwardingListener f1234d;

    /* renamed from: e */
    private SpinnerAdapter f1235e;

    /* renamed from: f */
    private final boolean f1236f;

    /* renamed from: g */
    private C0206g f1237g;

    /* renamed from: h */
    int f1238h;

    /* renamed from: i */
    final Rect f1239i;

    /* renamed from: androidx.appcompat.widget.x$a */
    /* compiled from: AppCompatSpinner */
    class C0196a extends ForwardingListener {

        /* renamed from: j */
        final /* synthetic */ C0200e f1240j;

        C0196a(View view, C0200e eVar) {
            this.f1240j = eVar;
            super(view);
        }

        /* renamed from: b */
        public ShowableListMenu mo504b() {
            return this.f1240j;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo505c() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1795c()) {
                AppCompatSpinner.this.mo1768b();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$b */
    /* compiled from: AppCompatSpinner */
    class C0197b implements OnGlobalLayoutListener {
        C0197b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1795c()) {
                AppCompatSpinner.this.mo1768b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x$c */
    /* compiled from: AppCompatSpinner */
    class C0198c implements C0206g, OnClickListener {

        /* renamed from: a */
        AlertDialog f1243a;

        /* renamed from: b */
        private ListAdapter f1244b;

        /* renamed from: c */
        private CharSequence f1245c;

        C0198c() {
        }

        /* renamed from: b */
        public void mo1794b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: c */
        public boolean mo1795c() {
            AlertDialog bVar = this.f1243a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        /* renamed from: d */
        public int mo1796d() {
            return 0;
        }

        public void dismiss() {
            AlertDialog bVar = this.f1243a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1243a = null;
            }
        }

        /* renamed from: g */
        public Drawable mo1798g() {
            return null;
        }

        /* renamed from: i */
        public void mo1799i(CharSequence charSequence) {
            this.f1245c = charSequence;
        }

        /* renamed from: j */
        public void mo1800j(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: k */
        public void mo1801k(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: l */
        public void mo1802l(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: m */
        public void mo1803m(int i, int i2) {
            if (this.f1244b != null) {
                C0060a aVar = new C0060a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1245c;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                AlertDialog create = aVar.mo282e(this.f1244b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
                this.f1243a = create;
                ListView e = create.mo272e();
                if (VERSION.SDK_INT >= 17) {
                    e.setTextDirection(i);
                    e.setTextAlignment(i2);
                }
                this.f1243a.show();
            }
        }

        /* renamed from: n */
        public int mo1804n() {
            return 0;
        }

        /* renamed from: o */
        public CharSequence mo1805o() {
            return this.f1245c;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f1244b.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo1807p(ListAdapter listAdapter) {
            this.f1244b = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$d */
    /* compiled from: AppCompatSpinner */
    private static class C0199d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1247a;

        /* renamed from: b */
        private ListAdapter f1248b;

        public C0199d(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f1247a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1248b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter t0Var = (ThemedSpinnerAdapter) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1248b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1248b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1247a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x$e */
    /* compiled from: AppCompatSpinner */
    class C0200e extends ListPopupWindow implements C0206g {

        /* renamed from: L */
        private CharSequence f1249L;

        /* renamed from: M */
        ListAdapter f1250M;

        /* renamed from: N */
        private final Rect f1251N = new Rect();

        /* renamed from: O */
        private int f1252O;

        /* renamed from: androidx.appcompat.widget.x$e$a */
        /* compiled from: AppCompatSpinner */
        class C0201a implements OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AppCompatSpinner f1254a;

            C0201a(AppCompatSpinner xVar) {
                this.f1254a = xVar;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0200e eVar = C0200e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f1250M.getItemId(i));
                }
                C0200e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.x$e$b */
        /* compiled from: AppCompatSpinner */
        class C0202b implements OnGlobalLayoutListener {
            C0202b() {
            }

            public void onGlobalLayout() {
                C0200e eVar = C0200e.this;
                if (!eVar.mo1823U(AppCompatSpinner.this)) {
                    C0200e.this.dismiss();
                    return;
                }
                C0200e.this.mo1821S();
                C0200e.super.mo604e();
            }
        }

        /* renamed from: androidx.appcompat.widget.x$e$c */
        /* compiled from: AppCompatSpinner */
        class C0203c implements OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ OnGlobalLayoutListener f1257a;

            C0203c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1257a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1257a);
                }
            }
        }

        public C0200e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1561D(AppCompatSpinner.this);
            mo1567J(true);
            mo1571O(0);
            mo1569L(new C0201a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: S */
        public void mo1821S() {
            int i;
            int i2;
            Drawable g = mo1576g();
            int i3 = 0;
            if (g != null) {
                g.getPadding(AppCompatSpinner.this.f1239i);
                if (ViewUtils.m1084b(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f1239i.right;
                } else {
                    i2 = -AppCompatSpinner.this.f1239i.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f1239i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner xVar = AppCompatSpinner.this;
            int i4 = xVar.f1238h;
            if (i4 == -2) {
                int a = xVar.mo1767a((SpinnerAdapter) this.f1250M, mo1576g());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1239i;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a > i6) {
                    a = i6;
                }
                mo1563F(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                mo1563F((width - paddingLeft) - paddingRight);
            } else {
                mo1563F(i4);
            }
            if (ViewUtils.m1084b(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - mo1588z()) - mo1822T());
            } else {
                i = i3 + paddingLeft + mo1822T();
            }
            mo1578l(i);
        }

        /* renamed from: T */
        public int mo1822T() {
            return this.f1252O;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: U */
        public boolean mo1823U(View view) {
            return ViewCompat.m5536S(view) && view.getGlobalVisibleRect(this.f1251N);
        }

        /* renamed from: i */
        public void mo1799i(CharSequence charSequence) {
            this.f1249L = charSequence;
        }

        /* renamed from: k */
        public void mo1801k(int i) {
            this.f1252O = i;
        }

        /* renamed from: m */
        public void mo1803m(int i, int i2) {
            boolean c = mo602c();
            mo1821S();
            mo1566I(2);
            super.mo604e();
            ListView h = mo606h();
            h.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                h.setTextDirection(i);
                h.setTextAlignment(i2);
            }
            mo1572P(AppCompatSpinner.this.getSelectedItemPosition());
            if (!c) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0202b bVar = new C0202b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    mo1568K(new C0203c(bVar));
                }
            }
        }

        /* renamed from: o */
        public CharSequence mo1805o() {
            return this.f1249L;
        }

        /* renamed from: p */
        public void mo1580p(ListAdapter listAdapter) {
            super.mo1580p(listAdapter);
            this.f1250M = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$f */
    /* compiled from: AppCompatSpinner */
    static class C0204f extends BaseSavedState {
        public static final Creator<C0204f> CREATOR = new C0205a();

        /* renamed from: a */
        boolean f1259a;

        /* renamed from: androidx.appcompat.widget.x$f$a */
        /* compiled from: AppCompatSpinner */
        class C0205a implements Creator<C0204f> {
            C0205a() {
            }

            /* renamed from: a */
            public C0204f createFromParcel(Parcel parcel) {
                return new C0204f(parcel);
            }

            /* renamed from: b */
            public C0204f[] newArray(int i) {
                return new C0204f[i];
            }
        }

        C0204f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1259a ? (byte) 1 : 0);
        }

        C0204f(Parcel parcel) {
            super(parcel);
            this.f1259a = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.x$g */
    /* compiled from: AppCompatSpinner */
    interface C0206g {
        /* renamed from: b */
        void mo1794b(Drawable drawable);

        /* renamed from: c */
        boolean mo1795c();

        /* renamed from: d */
        int mo1796d();

        void dismiss();

        /* renamed from: g */
        Drawable mo1798g();

        /* renamed from: i */
        void mo1799i(CharSequence charSequence);

        /* renamed from: j */
        void mo1800j(int i);

        /* renamed from: k */
        void mo1801k(int i);

        /* renamed from: l */
        void mo1802l(int i);

        /* renamed from: m */
        void mo1803m(int i, int i2);

        /* renamed from: n */
        int mo1804n();

        /* renamed from: o */
        CharSequence mo1805o();

        /* renamed from: p */
        void mo1807p(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3274J);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1767a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1239i);
            Rect rect = this.f1239i;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1768b() {
        if (VERSION.SDK_INT >= 17) {
            this.f1237g.mo1803m(getTextDirection(), getTextAlignment());
        } else {
            this.f1237g.mo1803m(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            eVar.mo1388b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            return gVar.mo1796d();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            return gVar.mo1804n();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1237g != null) {
            return this.f1238h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final C0206g getInternalPopup() {
        return this.f1237g;
    }

    public Drawable getPopupBackground() {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            return gVar.mo1798g();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1233c;
    }

    public CharSequence getPrompt() {
        C0206g gVar = this.f1237g;
        return gVar != null ? gVar.mo1805o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            return eVar.mo1389c();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            return eVar.mo1390d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0206g gVar = this.f1237g;
        if (gVar != null && gVar.mo1795c()) {
            this.f1237g.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1237g != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1767a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0204f fVar = (C0204f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1259a) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0197b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        C0204f fVar = new C0204f(super.onSaveInstanceState());
        C0206g gVar = this.f1237g;
        fVar.f1259a = gVar != null && gVar.mo1795c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener i0Var = this.f1234d;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0206g gVar = this.f1237g;
        if (gVar == null) {
            return super.performClick();
        }
        if (!gVar.mo1795c()) {
            mo1768b();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            eVar.mo1392f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            eVar.mo1393g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            gVar.mo1801k(i);
            this.f1237g.mo1802l(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            gVar.mo1800j(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1237g != null) {
            this.f1238h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            gVar.mo1794b(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AppCompatResources.m4143d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0206g gVar = this.f1237g;
        if (gVar != null) {
            gVar.mo1799i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            eVar.mo1395i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        AppCompatBackgroundHelper eVar = this.f1232b;
        if (eVar != null) {
            eVar.mo1396j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1236f) {
            this.f1235e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1237g != null) {
            Context context = this.f1233c;
            if (context == null) {
                context = getContext();
            }
            this.f1237g.mo1807p(new C0199d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1239i = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.ThemeUtils.m1343a(r6, r0)
            int[] r0 = p010b.p011a.C0511j.f3443A2
            r1 = 0
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.TintTypedArray.m1406v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1232b = r2
            if (r11 == 0) goto L_0x0029
            b.a.n.d r2 = new b.a.n.d
            r2.<init>(r7, r11)
            r6.f1233c = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p010b.p011a.C0511j.f3468F2
            int r11 = r0.mo1845n(r11, r1)
            if (r11 == 0) goto L_0x0039
            b.a.n.d r2 = new b.a.n.d
            r2.<init>(r7, r11)
            r6.f1233c = r2
            goto L_0x003b
        L_0x0039:
            r6.f1233c = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1231a     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.x$e r10 = new androidx.appcompat.widget.x$e
            android.content.Context r3 = r6.f1233c
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1233c
            int[] r4 = p010b.p011a.C0511j.f3443A2
            androidx.appcompat.widget.x0 r1 = androidx.appcompat.widget.TintTypedArray.m1406v(r3, r8, r4, r9, r1)
            int r3 = p010b.p011a.C0511j.f3463E2
            r4 = -2
            int r3 = r1.mo1844m(r3, r4)
            r6.f1238h = r3
            int r3 = p010b.p011a.C0511j.f3453C2
            android.graphics.drawable.Drawable r3 = r1.mo1838g(r3)
            r10.mo1574b(r3)
            int r3 = p010b.p011a.C0511j.f3458D2
            java.lang.String r3 = r0.mo1846o(r3)
            r10.mo1799i(r3)
            r1.mo1851w()
            r6.f1237g = r10
            androidx.appcompat.widget.x$a r1 = new androidx.appcompat.widget.x$a
            r1.<init>(r6, r10)
            r6.f1234d = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.x$c r10 = new androidx.appcompat.widget.x$c
            r10.<init>()
            r6.f1237g = r10
            int r1 = p010b.p011a.C0511j.f3458D2
            java.lang.String r1 = r0.mo1846o(r1)
            r10.mo1799i(r1)
        L_0x00b8:
            int r10 = p010b.p011a.C0511j.f3448B2
            java.lang.CharSequence[] r10 = r0.mo1848q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p010b.p011a.C0508g.f3424t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00d0:
            r0.mo1851w()
            r6.f1236f = r11
            android.widget.SpinnerAdapter r7 = r6.f1235e
            if (r7 == 0) goto L_0x00de
            r6.setAdapter(r7)
            r6.f1235e = r2
        L_0x00de:
            androidx.appcompat.widget.e r7 = r6.f1232b
            r7.mo1391e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
