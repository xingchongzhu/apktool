package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.p259uc.crashsdk.export.LogType;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p010b.p011a.C0502a;
import p010b.p011a.C0505d;
import p010b.p011a.C0507f;
import p010b.p011a.C0508g;
import p010b.p011a.C0509h;
import p010b.p011a.C0511j;
import p010b.p011a.p017n.CollapsibleActionView;
import p010b.p034g.p043k.ViewCompat;
import p010b.p046h.p047a.CursorAdapter;
import p010b.p048i.p049a.AbsSavedState;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* renamed from: p */
    static final C0141n f781p = (VERSION.SDK_INT < 29 ? new C0141n() : null);

    /* renamed from: A */
    private Rect f782A;

    /* renamed from: B */
    private Rect f783B;

    /* renamed from: C */
    private int[] f784C;

    /* renamed from: D */
    private int[] f785D;

    /* renamed from: G */
    private final ImageView f786G;

    /* renamed from: H */
    private final Drawable f787H;

    /* renamed from: I */
    private final int f788I;

    /* renamed from: J */
    private final int f789J;

    /* renamed from: K */
    private final Intent f790K;

    /* renamed from: L */
    private final Intent f791L;

    /* renamed from: M */
    private final CharSequence f792M;

    /* renamed from: N */
    private C0139l f793N;

    /* renamed from: O */
    private C0138k f794O;

    /* renamed from: P */
    OnFocusChangeListener f795P;

    /* renamed from: Q */
    private C0140m f796Q;

    /* renamed from: R */
    private OnClickListener f797R;

    /* renamed from: S */
    private boolean f798S;

    /* renamed from: T */
    private boolean f799T;

    /* renamed from: U */
    CursorAdapter f800U;

    /* renamed from: V */
    private boolean f801V;

    /* renamed from: W */
    private CharSequence f802W;

    /* renamed from: a0 */
    private boolean f803a0;

    /* renamed from: b0 */
    private boolean f804b0;

    /* renamed from: c0 */
    private int f805c0;

    /* renamed from: d0 */
    private boolean f806d0;

    /* renamed from: e0 */
    private CharSequence f807e0;

    /* renamed from: f0 */
    private CharSequence f808f0;

    /* renamed from: g0 */
    private boolean f809g0;

    /* renamed from: h0 */
    private int f810h0;

    /* renamed from: i0 */
    SearchableInfo f811i0;

    /* renamed from: j0 */
    private Bundle f812j0;

    /* renamed from: k0 */
    private final Runnable f813k0;

    /* renamed from: l0 */
    private Runnable f814l0;

    /* renamed from: m0 */
    private final WeakHashMap<String, ConstantState> f815m0;

    /* renamed from: n0 */
    private final OnClickListener f816n0;

    /* renamed from: o0 */
    OnKeyListener f817o0;

    /* renamed from: p0 */
    private final OnEditorActionListener f818p0;

    /* renamed from: q */
    final SearchAutoComplete f819q;

    /* renamed from: q0 */
    private final OnItemClickListener f820q0;

    /* renamed from: r */
    private final View f821r;

    /* renamed from: r0 */
    private final OnItemSelectedListener f822r0;

    /* renamed from: s */
    private final View f823s;

    /* renamed from: s0 */
    private TextWatcher f824s0;

    /* renamed from: t */
    private final View f825t;

    /* renamed from: u */
    final ImageView f826u;

    /* renamed from: v */
    final ImageView f827v;

    /* renamed from: w */
    final ImageView f828w;

    /* renamed from: x */
    final ImageView f829x;

    /* renamed from: y */
    private final View f830y;

    /* renamed from: z */
    private C0144p f831z;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: d */
        private int f832d;

        /* renamed from: e */
        private SearchView f833e;

        /* renamed from: f */
        private boolean f834f;

        /* renamed from: g */
        final Runnable f835g;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0127a implements Runnable {
            C0127a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1121c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0502a.f3293p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return LogType.UNEXP;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1119a() {
            if (VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f781p.mo1154c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1120b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1121c() {
            if (this.f834f) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f834f = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f832d <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f834f) {
                removeCallbacks(this.f835g);
                post(this.f835g);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f833e.mo1085Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f833e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f833e.hasFocus() && getVisibility() == 0) {
                this.f834f = true;
                if (SearchView.m873M(getContext())) {
                    mo1119a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f834f = false;
                removeCallbacks(this.f835g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f834f = false;
                removeCallbacks(this.f835g);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f834f = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f833e = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f832d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f835g = new C0127a();
            this.f832d = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0128a implements TextWatcher {
        C0128a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1084Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0129b implements Runnable {
        C0129b() {
        }

        public void run() {
            SearchView.this.mo1089f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0130c implements Runnable {
        C0130c() {
        }

        public void run() {
            CursorAdapter aVar = SearchView.this.f800U;
            if (aVar instanceof SuggestionsAdapter) {
                aVar.mo1730a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0131d implements OnFocusChangeListener {
        C0131d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            OnFocusChangeListener onFocusChangeListener = searchView.f795P;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0132e implements OnLayoutChangeListener {
        C0132e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1073B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0133f implements OnClickListener {
        C0133f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f826u) {
                searchView.mo1081V();
            } else if (view == searchView.f828w) {
                searchView.mo1077R();
            } else if (view == searchView.f827v) {
                searchView.mo1082W();
            } else if (view == searchView.f829x) {
                searchView.mo1086a0();
            } else if (view == searchView.f819q) {
                searchView.mo1074H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0134g implements OnKeyListener {
        C0134g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f811i0 == null) {
                return false;
            }
            if (searchView.f819q.isPopupShowing() && SearchView.this.f819q.getListSelection() != -1) {
                return SearchView.this.mo1083X(view, i, keyEvent);
            }
            if (SearchView.this.f819q.mo1120b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1076P(0, null, searchView2.f819q.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0135h implements OnEditorActionListener {
        C0135h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1082W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0136i implements OnItemClickListener {
        C0136i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1078S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0137j implements OnItemSelectedListener {
        C0137j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1079T(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface C0138k {
        /* renamed from: a */
        boolean mo1147a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0139l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0140m {
        /* renamed from: a */
        boolean mo1150a(int i);

        /* renamed from: b */
        boolean mo1151b(int i);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    private static class C0141n {

        /* renamed from: a */
        private Method f847a = null;

        /* renamed from: b */
        private Method f848b = null;

        /* renamed from: c */
        private Method f849c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0141n() {
            m910d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f847a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f848b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f849c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m910d() {
            if (VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1152a(AutoCompleteTextView autoCompleteTextView) {
            m910d();
            Method method = this.f848b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1153b(AutoCompleteTextView autoCompleteTextView) {
            m910d();
            Method method = this.f847a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo1154c(AutoCompleteTextView autoCompleteTextView) {
            m910d();
            Method method = this.f849c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    static class C0142o extends AbsSavedState {
        public static final Creator<C0142o> CREATOR = new C0143a();

        /* renamed from: c */
        boolean f850c;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        class C0143a implements ClassLoaderCreator<C0142o> {
            C0143a() {
            }

            /* renamed from: a */
            public C0142o createFromParcel(Parcel parcel) {
                return new C0142o(parcel, null);
            }

            /* renamed from: b */
            public C0142o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0142o(parcel, classLoader);
            }

            /* renamed from: c */
            public C0142o[] newArray(int i) {
                return new C0142o[i];
            }
        }

        C0142o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f850c);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f850c));
        }

        public C0142o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f850c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0144p extends TouchDelegate {

        /* renamed from: a */
        private final View f851a;

        /* renamed from: b */
        private final Rect f852b = new Rect();

        /* renamed from: c */
        private final Rect f853c = new Rect();

        /* renamed from: d */
        private final Rect f854d = new Rect();

        /* renamed from: e */
        private final int f855e;

        /* renamed from: f */
        private boolean f856f;

        public C0144p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f855e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1163a(rect, rect2);
            this.f851a = view;
        }

        /* renamed from: a */
        public void mo1163a(Rect rect, Rect rect2) {
            this.f852b.set(rect);
            this.f854d.set(rect);
            Rect rect3 = this.f854d;
            int i = this.f855e;
            rect3.inset(-i, -i);
            this.f853c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f856f
                r7.f856f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f856f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f854d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f852b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f856f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.f853c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.f851a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f851a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.f853c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.f851a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0144p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private Intent m865C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f808f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f812j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f811i0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m866D(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        try {
            String o = SuggestionsAdapter.m1326o(cursor, "suggest_intent_action");
            if (o == null) {
                o = this.f811i0.getSuggestIntentAction();
            }
            if (o == null) {
                o = "android.intent.action.SEARCH";
            }
            String str2 = o;
            String o2 = SuggestionsAdapter.m1326o(cursor, "suggest_intent_data");
            if (o2 == null) {
                o2 = this.f811i0.getSuggestIntentData();
            }
            if (o2 != null) {
                String o3 = SuggestionsAdapter.m1326o(cursor, "suggest_intent_data_id");
                if (o3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(o2);
                    sb.append("/");
                    sb.append(Uri.encode(o3));
                    o2 = sb.toString();
                }
            }
            if (o2 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o2);
            }
            String o4 = SuggestionsAdapter.m1326o(cursor, "suggest_intent_query");
            return m865C(str2, uri, SuggestionsAdapter.m1326o(cursor, "suggest_intent_extra_data"), o4, i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m867E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f812j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m868F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: G */
    private void m869G() {
        this.f819q.dismissDropDown();
    }

    /* renamed from: I */
    private void m870I(View view, Rect rect) {
        view.getLocationInWindow(this.f784C);
        getLocationInWindow(this.f785D);
        int[] iArr = this.f784C;
        int i = iArr[1];
        int[] iArr2 = this.f785D;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m871J(CharSequence charSequence) {
        if (!this.f798S || this.f787H == null) {
            return charSequence;
        }
        double textSize = (double) this.f819q.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f787H.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f787H), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m872K() {
        SearchableInfo searchableInfo = this.f811i0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f811i0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f790K;
        } else if (this.f811i0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f791L;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m873M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m874N() {
        return (this.f801V || this.f806d0) && !mo1075L();
    }

    /* renamed from: O */
    private void m875O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m876Q(int i, int i2, String str) {
        Cursor b = this.f800U.mo5176b();
        if (b == null || !b.moveToPosition(i)) {
            return false;
        }
        m875O(m866D(b, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m877b0() {
        post(this.f813k0);
    }

    /* renamed from: c0 */
    private void m878c0(int i) {
        Editable text = this.f819q.getText();
        Cursor b = this.f800U.mo5176b();
        if (b != null) {
            if (b.moveToPosition(i)) {
                CharSequence c = this.f800U.mo1731c(b);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: e0 */
    private void m879e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f819q.getText());
        int i = 0;
        if (!z2 && (!this.f798S || this.f809g0)) {
            z = false;
        }
        ImageView imageView = this.f828w;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f828w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m880g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f819q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m871J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0505d.f3317g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0505d.f3318h);
    }

    /* renamed from: h0 */
    private void m881h0() {
        this.f819q.setThreshold(this.f811i0.getSuggestThreshold());
        this.f819q.setImeOptions(this.f811i0.getImeOptions());
        int inputType = this.f811i0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f811i0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f819q.setInputType(inputType);
        CursorAdapter aVar = this.f800U;
        if (aVar != null) {
            aVar.mo1730a(null);
        }
        if (this.f811i0.getSuggestAuthority() != null) {
            SuggestionsAdapter r0Var = new SuggestionsAdapter(getContext(), this, this.f811i0, this.f815m0);
            this.f800U = r0Var;
            this.f819q.setAdapter(r0Var);
            SuggestionsAdapter r0Var2 = (SuggestionsAdapter) this.f800U;
            if (this.f803a0) {
                i = 2;
            }
            r0Var2.mo1743x(i);
        }
    }

    /* renamed from: i0 */
    private void m882i0() {
        this.f825t.setVisibility((!m874N() || !(this.f827v.getVisibility() == 0 || this.f829x.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m883j0(boolean z) {
        this.f827v.setVisibility((!this.f801V || !m874N() || !hasFocus() || (!z && this.f806d0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m884k0(boolean z) {
        this.f799T = z;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f819q.getText());
        this.f826u.setVisibility(z ? 0 : 8);
        m883j0(z2);
        this.f821r.setVisibility(z ? 8 : 0);
        if (this.f786G.getDrawable() == null || this.f798S) {
            i = 8;
        }
        this.f786G.setVisibility(i);
        m879e0();
        m885l0(!z2);
        m882i0();
    }

    /* renamed from: l0 */
    private void m885l0(boolean z) {
        int i = 8;
        if (this.f806d0 && !mo1075L() && z) {
            this.f827v.setVisibility(8);
            i = 0;
        }
        this.f829x.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f819q.setText(charSequence);
        this.f819q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo1073B() {
        int i;
        if (this.f830y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f823s.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = ViewUtils.m1084b(this);
            int dimensionPixelSize = this.f798S ? resources.getDimensionPixelSize(C0505d.f3315e) + resources.getDimensionPixelSize(C0505d.f3316f) : 0;
            this.f819q.getDropDownBackground().getPadding(rect);
            if (b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.f819q.setDropDownHorizontalOffset(i);
            this.f819q.setDropDownWidth((((this.f830y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo1074H() {
        if (VERSION.SDK_INT >= 29) {
            this.f819q.refreshAutoCompleteResults();
            return;
        }
        C0141n nVar = f781p;
        nVar.mo1153b(this.f819q);
        nVar.mo1152a(this.f819q);
    }

    /* renamed from: L */
    public boolean mo1075L() {
        return this.f799T;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public void mo1076P(int i, String str, String str2) {
        getContext().startActivity(m865C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public void mo1077R() {
        if (!TextUtils.isEmpty(this.f819q.getText())) {
            this.f819q.setText("");
            this.f819q.requestFocus();
            this.f819q.setImeVisibility(true);
        } else if (this.f798S) {
            C0138k kVar = this.f794O;
            if (kVar == null || !kVar.mo1147a()) {
                clearFocus();
                m884k0(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: S */
    public boolean mo1078S(int i, int i2, String str) {
        C0140m mVar = this.f796Q;
        if (mVar != null && mVar.mo1151b(i)) {
            return false;
        }
        m876Q(i, 0, null);
        this.f819q.setImeVisibility(false);
        m869G();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: T */
    public boolean mo1079T(int i) {
        C0140m mVar = this.f796Q;
        if (mVar != null && mVar.mo1150a(i)) {
            return false;
        }
        m878c0(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public void mo1080U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo1081V() {
        m884k0(false);
        this.f819q.requestFocus();
        this.f819q.setImeVisibility(true);
        OnClickListener onClickListener = this.f797R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public void mo1082W() {
        Editable text = this.f819q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0139l lVar = this.f793N;
            if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
                if (this.f811i0 != null) {
                    mo1076P(0, null, text.toString());
                }
                this.f819q.setImeVisibility(false);
                m869G();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: X */
    public boolean mo1083X(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f811i0 != null && this.f800U != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1078S(this.f819q.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f819q.length();
                }
                this.f819q.setSelection(i2);
                this.f819q.setListSelection(0);
                this.f819q.clearListSelection();
                this.f819q.mo1119a();
                return true;
            } else if (i != 19 || this.f819q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Y */
    public void mo1084Y(CharSequence charSequence) {
        Editable text = this.f819q.getText();
        this.f808f0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m883j0(z);
        m885l0(!z);
        m879e0();
        m882i0();
        if (this.f793N != null && !TextUtils.equals(charSequence, this.f807e0)) {
            this.f793N.onQueryTextChange(charSequence.toString());
        }
        this.f807e0 = charSequence.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: Z */
    public void mo1085Z() {
        m884k0(mo1075L());
        m877b0();
        if (this.f819q.hasFocus()) {
            mo1074H();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a0 */
    public void mo1086a0() {
        SearchableInfo searchableInfo = this.f811i0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m868F(this.f790K, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m867E(this.f791L, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: c */
    public void mo847c() {
        if (!this.f809g0) {
            this.f809g0 = true;
            int imeOptions = this.f819q.getImeOptions();
            this.f810h0 = imeOptions;
            this.f819q.setImeOptions(imeOptions | 33554432);
            this.f819q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f804b0 = true;
        super.clearFocus();
        this.f819q.clearFocus();
        this.f819q.setImeVisibility(false);
        this.f804b0 = false;
    }

    /* renamed from: d0 */
    public void mo1088d0(CharSequence charSequence, boolean z) {
        this.f819q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f819q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f808f0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1082W();
        }
    }

    /* renamed from: f */
    public void mo848f() {
        mo1088d0("", false);
        clearFocus();
        m884k0(true);
        this.f819q.setImeOptions(this.f810h0);
        this.f809g0 = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f0 */
    public void mo1089f0() {
        int[] iArr = this.f819q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f823s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f825t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f819q.getImeOptions();
    }

    public int getInputType() {
        return this.f819q.getInputType();
    }

    public int getMaxWidth() {
        return this.f805c0;
    }

    public CharSequence getQuery() {
        return this.f819q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f802W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f811i0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f792M;
        }
        return getContext().getText(this.f811i0.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f789J;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f788I;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.f800U;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f813k0);
        post(this.f814l0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m870I(this.f819q, this.f782A);
            Rect rect = this.f783B;
            Rect rect2 = this.f782A;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0144p pVar = this.f831z;
            if (pVar == null) {
                C0144p pVar2 = new C0144p(this.f783B, this.f782A, this.f819q);
                this.f831z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1163a(this.f783B, this.f782A);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo1075L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i3 = this.f805c0;
            size = i3 > 0 ? Math.min(i3, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f805c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824) {
            int i4 = this.f805c0;
            if (i4 > 0) {
                size = Math.min(i4, size);
            }
        }
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0142o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0142o oVar = (C0142o) parcelable;
        super.onRestoreInstanceState(oVar.mo5193l());
        m884k0(oVar.f850c);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0142o oVar = new C0142o(super.onSaveInstanceState());
        oVar.f850c = mo1075L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m877b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f804b0 || !isFocusable()) {
            return false;
        }
        if (mo1075L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f819q.requestFocus(i, rect);
        if (requestFocus) {
            m884k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f812j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1077R();
        } else {
            mo1081V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f798S != z) {
            this.f798S = z;
            m884k0(z);
            m880g0();
        }
    }

    public void setImeOptions(int i) {
        this.f819q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f819q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f805c0 = i;
        requestLayout();
    }

    public void setOnCloseListener(C0138k kVar) {
        this.f794O = kVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f795P = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0139l lVar) {
        this.f793N = lVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f797R = onClickListener;
    }

    public void setOnSuggestionListener(C0140m mVar) {
        this.f796Q = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f802W = charSequence;
        m880g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f803a0 = z;
        CursorAdapter aVar = this.f800U;
        if (aVar instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) aVar).mo1743x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f811i0 = searchableInfo;
        if (searchableInfo != null) {
            m881h0();
            m880g0();
        }
        boolean K = m872K();
        this.f806d0 = K;
        if (K) {
            this.f819q.setPrivateImeOptions("nm");
        }
        m884k0(mo1075L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f801V = z;
        m884k0(mo1075L());
    }

    public void setSuggestionsAdapter(CursorAdapter aVar) {
        this.f800U = aVar;
        this.f819q.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0502a.f3272H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f782A = new Rect();
        this.f783B = new Rect();
        this.f784C = new int[2];
        this.f785D = new int[2];
        this.f813k0 = new C0129b();
        this.f814l0 = new C0130c();
        this.f815m0 = new WeakHashMap<>();
        C0133f fVar = new C0133f();
        this.f816n0 = fVar;
        this.f817o0 = new C0134g();
        C0135h hVar = new C0135h();
        this.f818p0 = hVar;
        C0136i iVar = new C0136i();
        this.f820q0 = iVar;
        C0137j jVar = new C0137j();
        this.f822r0 = jVar;
        this.f824s0 = new C0128a();
        TintTypedArray v = TintTypedArray.m1406v(context, attributeSet, C0511j.f3598i2, i, 0);
        LayoutInflater.from(context).inflate(v.mo1845n(C0511j.f3648s2, C0508g.f3422r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0507f.f3366D);
        this.f819q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f821r = findViewById(C0507f.f3404z);
        View findViewById = findViewById(C0507f.f3365C);
        this.f823s = findViewById;
        View findViewById2 = findViewById(C0507f.f3372J);
        this.f825t = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0507f.f3402x);
        this.f826u = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0507f.f3363A);
        this.f827v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0507f.f3403y);
        this.f828w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0507f.f3367E);
        this.f829x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0507f.f3364B);
        this.f786G = imageView5;
        ViewCompat.m5579r0(findViewById, v.mo1838g(C0511j.f3653t2));
        ViewCompat.m5579r0(findViewById2, v.mo1838g(C0511j.f3673x2));
        int i2 = C0511j.f3668w2;
        imageView.setImageDrawable(v.mo1838g(i2));
        imageView2.setImageDrawable(v.mo1838g(C0511j.f3638q2));
        imageView3.setImageDrawable(v.mo1838g(C0511j.f3623n2));
        imageView4.setImageDrawable(v.mo1838g(C0511j.f3683z2));
        imageView5.setImageDrawable(v.mo1838g(i2));
        this.f787H = v.mo1838g(C0511j.f3663v2);
        TooltipCompat.m1498a(imageView, getResources().getString(C0509h.f3436l));
        this.f788I = v.mo1845n(C0511j.f3678y2, C0508g.f3421q);
        this.f789J = v.mo1845n(C0511j.f3628o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f824s0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f817o0);
        searchAutoComplete.setOnFocusChangeListener(new C0131d());
        setIconifiedByDefault(v.mo1832a(C0511j.f3643r2, true));
        int f = v.mo1837f(C0511j.f3608k2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f792M = v.mo1847p(C0511j.f3633p2);
        this.f802W = v.mo1847p(C0511j.f3658u2);
        int k = v.mo1842k(C0511j.f3618m2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo1842k(C0511j.f3613l2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo1832a(C0511j.f3603j2, true));
        v.mo1851w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f790K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f791L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f830y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0132e());
        }
        m884k0(this.f798S);
        m880g0();
    }
}
