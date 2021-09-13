package p010b.p034g.p043k.p044f0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.p259uc.crashsdk.export.LogType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p034g.C0576b;
import p010b.p034g.p039g.BuildCompat;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0640a;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0641b;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0642c;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0643d;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0644e;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0645f;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0646g;
import p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0647h;

/* renamed from: b.g.k.f0.c */
public class AccessibilityNodeInfoCompat {

    /* renamed from: a */
    private static int f4663a;

    /* renamed from: b */
    private final AccessibilityNodeInfo f4664b;

    /* renamed from: c */
    public int f4665c = -1;

    /* renamed from: d */
    private int f4666d = -1;

    /* renamed from: b.g.k.f0.c$a */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0634a {

        /* renamed from: A */
        public static final C0634a f4667A;

        /* renamed from: B */
        public static final C0634a f4668B;

        /* renamed from: C */
        public static final C0634a f4669C;

        /* renamed from: D */
        public static final C0634a f4670D;

        /* renamed from: E */
        public static final C0634a f4671E;

        /* renamed from: F */
        public static final C0634a f4672F;

        /* renamed from: G */
        public static final C0634a f4673G;

        /* renamed from: H */
        public static final C0634a f4674H;

        /* renamed from: I */
        public static final C0634a f4675I;

        /* renamed from: J */
        public static final C0634a f4676J;

        /* renamed from: K */
        public static final C0634a f4677K;

        /* renamed from: L */
        public static final C0634a f4678L;

        /* renamed from: M */
        public static final C0634a f4679M;

        /* renamed from: a */
        public static final C0634a f4680a = new C0634a(1, null);

        /* renamed from: b */
        public static final C0634a f4681b = new C0634a(2, null);

        /* renamed from: c */
        public static final C0634a f4682c = new C0634a(4, null);

        /* renamed from: d */
        public static final C0634a f4683d = new C0634a(8, null);

        /* renamed from: e */
        public static final C0634a f4684e = new C0634a(16, null);

        /* renamed from: f */
        public static final C0634a f4685f = new C0634a(32, null);

        /* renamed from: g */
        public static final C0634a f4686g = new C0634a(64, null);

        /* renamed from: h */
        public static final C0634a f4687h = new C0634a(128, null);

        /* renamed from: i */
        public static final C0634a f4688i;

        /* renamed from: j */
        public static final C0634a f4689j;

        /* renamed from: k */
        public static final C0634a f4690k;

        /* renamed from: l */
        public static final C0634a f4691l;

        /* renamed from: m */
        public static final C0634a f4692m = new C0634a(4096, null);

        /* renamed from: n */
        public static final C0634a f4693n = new C0634a(8192, null);

        /* renamed from: o */
        public static final C0634a f4694o = new C0634a(16384, null);

        /* renamed from: p */
        public static final C0634a f4695p = new C0634a(32768, null);

        /* renamed from: q */
        public static final C0634a f4696q = new C0634a(65536, null);

        /* renamed from: r */
        public static final C0634a f4697r = new C0634a(131072, (CharSequence) null, C0646g.class);

        /* renamed from: s */
        public static final C0634a f4698s = new C0634a(262144, null);

        /* renamed from: t */
        public static final C0634a f4699t = new C0634a(524288, null);

        /* renamed from: u */
        public static final C0634a f4700u = new C0634a(LogType.ANR, null);

        /* renamed from: v */
        public static final C0634a f4701v = new C0634a(2097152, (CharSequence) null, C0647h.class);

        /* renamed from: w */
        public static final C0634a f4702w;

        /* renamed from: x */
        public static final C0634a f4703x;

        /* renamed from: y */
        public static final C0634a f4704y;

        /* renamed from: z */
        public static final C0634a f4705z;

        /* renamed from: N */
        final Object f4706N;

        /* renamed from: O */
        private final int f4707O;

        /* renamed from: P */
        private final Class<? extends C0640a> f4708P;

        /* renamed from: Q */
        protected final AccessibilityViewCommand f4709Q;

        static {
            Class<C0642c> cls = C0642c.class;
            Class<C0641b> cls2 = C0641b.class;
            AccessibilityAction accessibilityAction = null;
            f4688i = new C0634a((int) LogType.UNEXP, (CharSequence) null, cls2);
            f4689j = new C0634a(512, (CharSequence) null, cls2);
            f4690k = new C0634a(1024, (CharSequence) null, cls);
            f4691l = new C0634a(2048, (CharSequence) null, cls);
            int i = VERSION.SDK_INT;
            C0634a aVar = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            f4702w = aVar;
            C0634a aVar2 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, C0644e.class);
            f4703x = aVar2;
            C0634a aVar3 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f4704y = aVar3;
            C0634a aVar4 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f4705z = aVar4;
            C0634a aVar5 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f4667A = aVar5;
            C0634a aVar6 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f4668B = aVar6;
            C0634a aVar7 = new C0634a(i >= 29 ? AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f4669C = aVar7;
            C0634a aVar8 = new C0634a(i >= 29 ? AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f4670D = aVar8;
            C0634a aVar9 = new C0634a(i >= 29 ? AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f4671E = aVar9;
            C0634a aVar10 = new C0634a(i >= 29 ? AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f4672F = aVar10;
            C0634a aVar11 = new C0634a(i >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f4673G = aVar11;
            C0634a aVar12 = new C0634a(i >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, C0645f.class);
            f4674H = aVar12;
            C0634a aVar13 = new C0634a(i >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, C0643d.class);
            f4675I = aVar13;
            C0634a aVar14 = new C0634a(i >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            f4676J = aVar14;
            C0634a aVar15 = new C0634a(i >= 28 ? AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            f4677K = aVar15;
            C0634a aVar16 = new C0634a(i >= 30 ? AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            f4678L = aVar16;
            if (i >= 30) {
                accessibilityAction = AccessibilityAction.ACTION_IME_ENTER;
            }
            C0634a aVar17 = new C0634a(accessibilityAction, 16908372, null, null, null);
            f4679M = aVar17;
        }

        public C0634a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C0634a mo5097a(CharSequence charSequence, AccessibilityViewCommand fVar) {
            C0634a aVar = new C0634a(null, this.f4707O, charSequence, fVar, this.f4708P);
            return aVar;
        }

        /* renamed from: b */
        public int mo5098b() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f4706N).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo5099c() {
            if (VERSION.SDK_INT >= 21) {
                return ((AccessibilityAction) this.f4706N).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5100d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                b.g.k.f0.f r0 = r4.f4709Q
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends b.g.k.f0.f$a> r2 = r4.f4708P
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                b.g.k.f0.f$a r1 = (p010b.p034g.p043k.p044f0.AccessibilityViewCommand.C0640a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo5115a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends b.g.k.f0.f$a> r1 = r4.f4708P
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                b.g.k.f0.f r6 = r4.f4709Q
                boolean r5 = r6.mo5114a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p010b.p034g.p043k.p044f0.AccessibilityNodeInfoCompat.C0634a.mo5100d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0634a)) {
                return false;
            }
            C0634a aVar = (C0634a) obj;
            Object obj2 = this.f4706N;
            if (obj2 == null) {
                if (aVar.f4706N != null) {
                    return false;
                }
            } else if (!obj2.equals(aVar.f4706N)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f4706N;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C0634a(int i, CharSequence charSequence, AccessibilityViewCommand fVar) {
            this(null, i, charSequence, fVar, null);
        }

        C0634a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C0634a(int i, CharSequence charSequence, Class<? extends C0640a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C0634a(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand fVar, Class<? extends C0640a> cls) {
            this.f4707O = i;
            this.f4709Q = fVar;
            if (VERSION.SDK_INT < 21 || obj != null) {
                this.f4706N = obj;
            } else {
                this.f4706N = new AccessibilityAction(i, charSequence);
            }
            this.f4708P = cls;
        }
    }

    /* renamed from: b.g.k.f0.c$b */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0635b {

        /* renamed from: a */
        final Object f4710a;

        C0635b(Object obj) {
            this.f4710a = obj;
        }

        /* renamed from: a */
        public static C0635b m5415a(int i, int i2, boolean z, int i3) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 21) {
                return new C0635b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new C0635b(CollectionInfo.obtain(i, i2, z));
            }
            return new C0635b(null);
        }
    }

    /* renamed from: b.g.k.f0.c$c */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0636c {

        /* renamed from: a */
        final Object f4711a;

        C0636c(Object obj) {
            this.f4711a = obj;
        }

        /* renamed from: a */
        public static C0636c m5416a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = VERSION.SDK_INT;
            if (i5 >= 21) {
                return new C0636c(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new C0636c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0636c(null);
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4664b = accessibilityNodeInfo;
    }

    /* renamed from: K */
    public static AccessibilityNodeInfoCompat m5334K() {
        return m5349y0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: L */
    public static AccessibilityNodeInfoCompat m5335L(View view) {
        return m5349y0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: M */
    public static AccessibilityNodeInfoCompat m5336M(AccessibilityNodeInfoCompat cVar) {
        return m5349y0(AccessibilityNodeInfo.obtain(cVar.f4664b));
    }

    /* renamed from: Q */
    private void m5337Q(View view) {
        SparseArray u = m5346u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u.size(); i++) {
                if (((WeakReference) u.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: S */
    private void m5338S(int i, boolean z) {
        Bundle r = mo5084r();
        if (r != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = r.getInt(str, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            r.putInt(str, i | i2);
        }
    }

    /* renamed from: d */
    private void m5339d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m5340f() {
        if (VERSION.SDK_INT >= 19) {
            this.f4664b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f4664b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f4664b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f4664b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: g */
    private List<Integer> m5341g(String str) {
        if (VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList integerArrayList = this.f4664b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            integerArrayList = new ArrayList();
            this.f4664b.getExtras().putIntegerArrayList(str, integerArrayList);
        }
        return integerArrayList;
    }

    /* renamed from: i */
    private static String m5342i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case LogType.UNEXP /*256*/:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m5343k(int i) {
        Bundle r = mo5084r();
        boolean z = false;
        if (r == null) {
            return false;
        }
        if ((r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            z = true;
        }
        return z;
    }

    /* renamed from: p */
    public static ClickableSpan[] m5344p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray<WeakReference<ClickableSpan>> m5345s(View view) {
        SparseArray<WeakReference<ClickableSpan>> u = m5346u(view);
        if (u != null) {
            return u;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0576b.f4382I, sparseArray);
        return sparseArray;
    }

    /* renamed from: u */
    private SparseArray<WeakReference<ClickableSpan>> m5346u(View view) {
        return (SparseArray) view.getTag(C0576b.f4382I);
    }

    /* renamed from: x */
    private boolean m5347x() {
        return !m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    private int m5348y(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f4663a;
        f4663a = i2 + 1;
        return i2;
    }

    /* renamed from: y0 */
    public static AccessibilityNodeInfoCompat m5349y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    /* renamed from: A */
    public boolean mo5033A() {
        return this.f4664b.isChecked();
    }

    /* renamed from: B */
    public boolean mo5034B() {
        return this.f4664b.isClickable();
    }

    /* renamed from: C */
    public boolean mo5035C() {
        return this.f4664b.isEnabled();
    }

    /* renamed from: D */
    public boolean mo5036D() {
        return this.f4664b.isFocusable();
    }

    /* renamed from: E */
    public boolean mo5037E() {
        return this.f4664b.isFocused();
    }

    /* renamed from: F */
    public boolean mo5038F() {
        return this.f4664b.isLongClickable();
    }

    /* renamed from: G */
    public boolean mo5039G() {
        return this.f4664b.isPassword();
    }

    /* renamed from: H */
    public boolean mo5040H() {
        return this.f4664b.isScrollable();
    }

    /* renamed from: I */
    public boolean mo5041I() {
        return this.f4664b.isSelected();
    }

    /* renamed from: J */
    public boolean mo5042J() {
        if (VERSION.SDK_INT >= 26) {
            return this.f4664b.isShowingHintText();
        }
        return m5343k(4);
    }

    /* renamed from: N */
    public boolean mo5043N(int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return this.f4664b.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: O */
    public void mo5044O() {
        this.f4664b.recycle();
    }

    /* renamed from: P */
    public boolean mo5045P(C0634a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f4664b.removeAction((AccessibilityAction) aVar.f4706N);
        }
        return false;
    }

    /* renamed from: R */
    public void mo5046R(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f4664b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: T */
    public void mo5047T(Rect rect) {
        this.f4664b.setBoundsInParent(rect);
    }

    /* renamed from: U */
    public void mo5048U(Rect rect) {
        this.f4664b.setBoundsInScreen(rect);
    }

    /* renamed from: V */
    public void mo5049V(boolean z) {
        this.f4664b.setCheckable(z);
    }

    /* renamed from: W */
    public void mo5050W(boolean z) {
        this.f4664b.setChecked(z);
    }

    /* renamed from: X */
    public void mo5051X(CharSequence charSequence) {
        this.f4664b.setClassName(charSequence);
    }

    /* renamed from: Y */
    public void mo5052Y(boolean z) {
        this.f4664b.setClickable(z);
    }

    /* renamed from: Z */
    public void mo5053Z(Object obj) {
        CollectionInfo collectionInfo;
        if (VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f4664b;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (CollectionInfo) ((C0635b) obj).f4710a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    /* renamed from: a */
    public void mo5054a(int i) {
        this.f4664b.addAction(i);
    }

    /* renamed from: a0 */
    public void mo5055a0(Object obj) {
        CollectionItemInfo collectionItemInfo;
        if (VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f4664b;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (CollectionItemInfo) ((C0636c) obj).f4711a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: b */
    public void mo5056b(C0634a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f4664b.addAction((AccessibilityAction) aVar.f4706N);
        }
    }

    /* renamed from: b0 */
    public void mo5057b0(CharSequence charSequence) {
        this.f4664b.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public void mo5058c(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f4664b.addChild(view, i);
        }
    }

    /* renamed from: c0 */
    public void mo5059c0(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f4664b.setDismissable(z);
        }
    }

    /* renamed from: d0 */
    public void mo5060d0(boolean z) {
        this.f4664b.setEnabled(z);
    }

    /* renamed from: e */
    public void mo5061e(CharSequence charSequence, View view) {
        int i = VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m5340f();
            m5337Q(view);
            ClickableSpan[] p = m5344p(charSequence);
            if (p != null && p.length > 0) {
                mo5084r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0576b.f4389a);
                SparseArray s = m5345s(view);
                for (int i2 = 0; i2 < p.length; i2++) {
                    int y = m5348y(p[i2], s);
                    s.put(y, new WeakReference(p[i2]));
                    m5339d(p[i2], (Spanned) charSequence, y);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo5062e0(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f4664b.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat cVar = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4664b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f4664b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f4664b)) {
            return false;
        }
        return this.f4666d == cVar.f4666d && this.f4665c == cVar.f4665c;
    }

    /* renamed from: f0 */
    public void mo5064f0(boolean z) {
        this.f4664b.setFocusable(z);
    }

    /* renamed from: g0 */
    public void mo5065g0(boolean z) {
        this.f4664b.setFocused(z);
    }

    /* renamed from: h */
    public List<C0634a> mo5066h() {
        List actionList = VERSION.SDK_INT >= 21 ? this.f4664b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0634a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void mo5067h0(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f4664b.setHeading(z);
        } else {
            m5338S(2, z);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4664b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void mo5069i0(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            this.f4664b.setHintText(charSequence);
        } else if (i >= 19) {
            this.f4664b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: j */
    public int mo5070j() {
        return this.f4664b.getActions();
    }

    /* renamed from: j0 */
    public void mo5071j0(int i) {
        if (VERSION.SDK_INT >= 21) {
            this.f4664b.setMaxTextLength(i);
        }
    }

    /* renamed from: k0 */
    public void mo5072k0(CharSequence charSequence) {
        this.f4664b.setPackageName(charSequence);
    }

    @Deprecated
    /* renamed from: l */
    public void mo5073l(Rect rect) {
        this.f4664b.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void mo5074l0(CharSequence charSequence) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            this.f4664b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f4664b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: m */
    public void mo5075m(Rect rect) {
        this.f4664b.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void mo5076m0(View view) {
        this.f4665c = -1;
        this.f4664b.setParent(view);
    }

    /* renamed from: n */
    public int mo5077n() {
        return this.f4664b.getChildCount();
    }

    /* renamed from: n0 */
    public void mo5078n0(View view, int i) {
        this.f4665c = i;
        if (VERSION.SDK_INT >= 16) {
            this.f4664b.setParent(view, i);
        }
    }

    /* renamed from: o */
    public CharSequence mo5079o() {
        return this.f4664b.getClassName();
    }

    /* renamed from: o0 */
    public void mo5080o0(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 19) {
            this.f4664b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: p0 */
    public void mo5081p0(boolean z) {
        if (VERSION.SDK_INT >= 28) {
            this.f4664b.setScreenReaderFocusable(z);
        } else {
            m5338S(1, z);
        }
    }

    /* renamed from: q */
    public CharSequence mo5082q() {
        return this.f4664b.getContentDescription();
    }

    /* renamed from: q0 */
    public void mo5083q0(boolean z) {
        this.f4664b.setScrollable(z);
    }

    /* renamed from: r */
    public Bundle mo5084r() {
        if (VERSION.SDK_INT >= 19) {
            return this.f4664b.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: r0 */
    public void mo5085r0(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f4664b.setShowingHintText(z);
        } else {
            m5338S(4, z);
        }
    }

    /* renamed from: s0 */
    public void mo5086s0(View view, int i) {
        this.f4666d = i;
        if (VERSION.SDK_INT >= 16) {
            this.f4664b.setSource(view, i);
        }
    }

    /* renamed from: t */
    public CharSequence mo5087t() {
        return this.f4664b.getPackageName();
    }

    /* renamed from: t0 */
    public void mo5088t0(CharSequence charSequence) {
        if (BuildCompat.m5070a()) {
            this.f4664b.setStateDescription(charSequence);
        } else if (VERSION.SDK_INT >= 19) {
            this.f4664b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo5073l(rect);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo5075m(rect);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo5087t());
        sb.append("; className: ");
        sb.append(mo5079o());
        sb.append("; text: ");
        sb.append(mo5091v());
        sb.append("; contentDescription: ");
        sb.append(mo5082q());
        sb.append("; viewId: ");
        sb.append(mo5093w());
        sb.append("; checkable: ");
        sb.append(mo5096z());
        sb.append("; checked: ");
        sb.append(mo5033A());
        sb.append("; focusable: ");
        sb.append(mo5036D());
        sb.append("; focused: ");
        sb.append(mo5037E());
        sb.append("; selected: ");
        sb.append(mo5041I());
        sb.append("; clickable: ");
        sb.append(mo5034B());
        sb.append("; longClickable: ");
        sb.append(mo5038F());
        sb.append("; enabled: ");
        sb.append(mo5035C());
        sb.append("; password: ");
        sb.append(mo5039G());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(mo5040H());
        sb.append(sb4.toString());
        sb.append("; [");
        String str = ", ";
        if (VERSION.SDK_INT >= 21) {
            List h = mo5066h();
            for (int i = 0; i < h.size(); i++) {
                C0634a aVar = (C0634a) h.get(i);
                String i2 = m5342i(aVar.mo5098b());
                if (i2.equals("ACTION_UNKNOWN") && aVar.mo5099c() != null) {
                    i2 = aVar.mo5099c().toString();
                }
                sb.append(i2);
                if (i != h.size() - 1) {
                    sb.append(str);
                }
            }
        } else {
            int j = mo5070j();
            while (j != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(j);
                j &= numberOfTrailingZeros ^ -1;
                sb.append(m5342i(numberOfTrailingZeros));
                if (j != 0) {
                    sb.append(str);
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void mo5090u0(CharSequence charSequence) {
        this.f4664b.setText(charSequence);
    }

    /* renamed from: v */
    public CharSequence mo5091v() {
        if (!m5347x()) {
            return this.f4664b.getText();
        }
        List g = m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g2 = m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g3 = m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g4 = m5341g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4664b.getText(), 0, this.f4664b.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) g4.get(i)).intValue(), this, mo5084r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g.get(i)).intValue(), ((Integer) g2.get(i)).intValue(), ((Integer) g3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: v0 */
    public void mo5092v0(View view) {
        if (VERSION.SDK_INT >= 22) {
            this.f4664b.setTraversalAfter(view);
        }
    }

    /* renamed from: w */
    public String mo5093w() {
        if (VERSION.SDK_INT >= 18) {
            return this.f4664b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: w0 */
    public void mo5094w0(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f4664b.setVisibleToUser(z);
        }
    }

    /* renamed from: x0 */
    public AccessibilityNodeInfo mo5095x0() {
        return this.f4664b;
    }

    /* renamed from: z */
    public boolean mo5096z() {
        return this.f4664b.isCheckable();
    }
}
