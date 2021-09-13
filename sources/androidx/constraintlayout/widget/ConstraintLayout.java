package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p259uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.HashMap;
import p010b.p026e.p030b.p031k.C0563k;
import p010b.p026e.p030b.p031k.ConstraintWidget;
import p010b.p026e.p030b.p031k.ConstraintWidget.C0561b;
import p010b.p026e.p030b.p031k.ConstraintWidgetContainer;
import p010b.p026e.p030b.p031k.Guideline;
import p010b.p026e.p030b.p031k.Optimizer;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0564a;
import p010b.p026e.p030b.p031k.p032m.BasicMeasure.C0565b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    SparseArray<View> f1311a = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<ConstraintHelper> f1312b = new ArrayList<>(4);

    /* renamed from: c */
    protected ConstraintWidgetContainer f1313c = new ConstraintWidgetContainer();

    /* renamed from: d */
    private int f1314d = 0;

    /* renamed from: e */
    private int f1315e = 0;

    /* renamed from: f */
    private int f1316f = Integer.MAX_VALUE;

    /* renamed from: g */
    private int f1317g = Integer.MAX_VALUE;

    /* renamed from: h */
    protected boolean f1318h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1319i = 257;

    /* renamed from: j */
    private ConstraintSet f1320j = null;

    /* renamed from: k */
    protected ConstraintLayoutStates f1321k = null;

    /* renamed from: l */
    private int f1322l = -1;

    /* renamed from: m */
    private HashMap<String, Integer> f1323m = new HashMap<>();

    /* renamed from: n */
    private int f1324n = -1;

    /* renamed from: o */
    private int f1325o = -1;

    /* renamed from: p */
    int f1326p = -1;

    /* renamed from: q */
    int f1327q = -1;

    /* renamed from: r */
    int f1328r = 0;

    /* renamed from: s */
    int f1329s = 0;

    /* renamed from: t */
    private SparseArray<ConstraintWidget> f1330t = new SparseArray<>();

    /* renamed from: u */
    C0214c f1331u = new C0214c(this);

    /* renamed from: v */
    private int f1332v = 0;

    /* renamed from: w */
    private int f1333w = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0211a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1334a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                b.e.b.k.e$b[] r0 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1334a = r0
                b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1334a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1334a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1334a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0211a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0212b extends MarginLayoutParams {

        /* renamed from: A */
        public float f1335A = 0.5f;

        /* renamed from: B */
        public String f1336B = null;

        /* renamed from: C */
        float f1337C = 0.0f;

        /* renamed from: D */
        int f1338D = 1;

        /* renamed from: E */
        public float f1339E = -1.0f;

        /* renamed from: F */
        public float f1340F = -1.0f;

        /* renamed from: G */
        public int f1341G = 0;

        /* renamed from: H */
        public int f1342H = 0;

        /* renamed from: I */
        public int f1343I = 0;

        /* renamed from: J */
        public int f1344J = 0;

        /* renamed from: K */
        public int f1345K = 0;

        /* renamed from: L */
        public int f1346L = 0;

        /* renamed from: M */
        public int f1347M = 0;

        /* renamed from: N */
        public int f1348N = 0;

        /* renamed from: O */
        public float f1349O = 1.0f;

        /* renamed from: P */
        public float f1350P = 1.0f;

        /* renamed from: Q */
        public int f1351Q = -1;

        /* renamed from: R */
        public int f1352R = -1;

        /* renamed from: S */
        public int f1353S = -1;

        /* renamed from: T */
        public boolean f1354T = false;

        /* renamed from: U */
        public boolean f1355U = false;

        /* renamed from: V */
        public String f1356V = null;

        /* renamed from: W */
        boolean f1357W = true;

        /* renamed from: X */
        boolean f1358X = true;

        /* renamed from: Y */
        boolean f1359Y = false;

        /* renamed from: Z */
        boolean f1360Z = false;

        /* renamed from: a */
        public int f1361a = -1;

        /* renamed from: a0 */
        boolean f1362a0 = false;

        /* renamed from: b */
        public int f1363b = -1;

        /* renamed from: b0 */
        boolean f1364b0 = false;

        /* renamed from: c */
        public float f1365c = -1.0f;

        /* renamed from: c0 */
        boolean f1366c0 = false;

        /* renamed from: d */
        public int f1367d = -1;

        /* renamed from: d0 */
        int f1368d0 = -1;

        /* renamed from: e */
        public int f1369e = -1;

        /* renamed from: e0 */
        int f1370e0 = -1;

        /* renamed from: f */
        public int f1371f = -1;

        /* renamed from: f0 */
        int f1372f0 = -1;

        /* renamed from: g */
        public int f1373g = -1;

        /* renamed from: g0 */
        int f1374g0 = -1;

        /* renamed from: h */
        public int f1375h = -1;

        /* renamed from: h0 */
        int f1376h0 = -1;

        /* renamed from: i */
        public int f1377i = -1;

        /* renamed from: i0 */
        int f1378i0 = -1;

        /* renamed from: j */
        public int f1379j = -1;

        /* renamed from: j0 */
        float f1380j0 = 0.5f;

        /* renamed from: k */
        public int f1381k = -1;

        /* renamed from: k0 */
        int f1382k0;

        /* renamed from: l */
        public int f1383l = -1;

        /* renamed from: l0 */
        int f1384l0;

        /* renamed from: m */
        public int f1385m = -1;

        /* renamed from: m0 */
        float f1386m0;

        /* renamed from: n */
        public int f1387n = 0;

        /* renamed from: n0 */
        ConstraintWidget f1388n0 = new ConstraintWidget();

        /* renamed from: o */
        public float f1389o = 0.0f;

        /* renamed from: o0 */
        public boolean f1390o0 = false;

        /* renamed from: p */
        public int f1391p = -1;

        /* renamed from: q */
        public int f1392q = -1;

        /* renamed from: r */
        public int f1393r = -1;

        /* renamed from: s */
        public int f1394s = -1;

        /* renamed from: t */
        public int f1395t = -1;

        /* renamed from: u */
        public int f1396u = -1;

        /* renamed from: v */
        public int f1397v = -1;

        /* renamed from: w */
        public int f1398w = -1;

        /* renamed from: x */
        public int f1399x = -1;

        /* renamed from: y */
        public int f1400y = -1;

        /* renamed from: z */
        public float f1401z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0213a {

            /* renamed from: a */
            public static final SparseIntArray f1402a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1402a = sparseIntArray;
                sparseIntArray.append(C0226i.f1649N1, 8);
                sparseIntArray.append(C0226i.f1655O1, 9);
                sparseIntArray.append(C0226i.f1667Q1, 10);
                sparseIntArray.append(C0226i.f1673R1, 11);
                sparseIntArray.append(C0226i.f1709X1, 12);
                sparseIntArray.append(C0226i.f1703W1, 13);
                sparseIntArray.append(C0226i.f1863v1, 14);
                sparseIntArray.append(C0226i.f1857u1, 15);
                sparseIntArray.append(C0226i.f1845s1, 16);
                sparseIntArray.append(C0226i.f1869w1, 2);
                sparseIntArray.append(C0226i.f1881y1, 3);
                sparseIntArray.append(C0226i.f1875x1, 4);
                sparseIntArray.append(C0226i.f1763f2, 49);
                sparseIntArray.append(C0226i.f1770g2, 50);
                sparseIntArray.append(C0226i.f1583C1, 5);
                sparseIntArray.append(C0226i.f1589D1, 6);
                sparseIntArray.append(C0226i.f1595E1, 7);
                sparseIntArray.append(C0226i.f1734b1, 1);
                sparseIntArray.append(C0226i.f1679S1, 17);
                sparseIntArray.append(C0226i.f1685T1, 18);
                sparseIntArray.append(C0226i.f1577B1, 19);
                sparseIntArray.append(C0226i.f1571A1, 20);
                sparseIntArray.append(C0226i.f1791j2, 21);
                sparseIntArray.append(C0226i.f1810m2, 22);
                sparseIntArray.append(C0226i.f1798k2, 23);
                sparseIntArray.append(C0226i.f1777h2, 24);
                sparseIntArray.append(C0226i.f1804l2, 25);
                sparseIntArray.append(C0226i.f1784i2, 26);
                sparseIntArray.append(C0226i.f1625J1, 29);
                sparseIntArray.append(C0226i.f1715Y1, 30);
                sparseIntArray.append(C0226i.f1887z1, 44);
                sparseIntArray.append(C0226i.f1637L1, 45);
                sparseIntArray.append(C0226i.f1728a2, 46);
                sparseIntArray.append(C0226i.f1631K1, 47);
                sparseIntArray.append(C0226i.f1721Z1, 48);
                sparseIntArray.append(C0226i.f1833q1, 27);
                sparseIntArray.append(C0226i.f1827p1, 28);
                sparseIntArray.append(C0226i.f1735b2, 31);
                sparseIntArray.append(C0226i.f1601F1, 32);
                sparseIntArray.append(C0226i.f1749d2, 33);
                sparseIntArray.append(C0226i.f1742c2, 34);
                sparseIntArray.append(C0226i.f1756e2, 35);
                sparseIntArray.append(C0226i.f1613H1, 36);
                sparseIntArray.append(C0226i.f1607G1, 37);
                sparseIntArray.append(C0226i.f1619I1, 38);
                sparseIntArray.append(C0226i.f1643M1, 39);
                sparseIntArray.append(C0226i.f1697V1, 40);
                sparseIntArray.append(C0226i.f1661P1, 41);
                sparseIntArray.append(C0226i.f1851t1, 42);
                sparseIntArray.append(C0226i.f1839r1, 43);
                f1402a.append(C0226i.f1691U1, 51);
            }
        }

        public C0212b(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1727a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0213a.f1402a.get(index);
                String str = "ConstraintLayout";
                switch (i3) {
                    case 1:
                        this.f1353S = obtainStyledAttributes.getInt(index, this.f1353S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1385m);
                        this.f1385m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f1385m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f1387n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1387n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1389o) % 360.0f;
                        this.f1389o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f1389o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f1361a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1361a);
                        break;
                    case 6:
                        this.f1363b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1363b);
                        break;
                    case 7:
                        this.f1365c = obtainStyledAttributes.getFloat(index, this.f1365c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1367d);
                        this.f1367d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f1367d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1369e);
                        this.f1369e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f1369e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1371f);
                        this.f1371f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f1371f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1373g);
                        this.f1373g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f1373g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1375h);
                        this.f1375h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f1375h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1377i);
                        this.f1377i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f1377i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1379j);
                        this.f1379j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f1379j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1381k);
                        this.f1381k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f1381k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1383l);
                        this.f1383l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f1383l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1391p);
                        this.f1391p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f1391p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1392q);
                        this.f1392q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f1392q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1393r);
                        this.f1393r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f1393r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1394s);
                        this.f1394s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f1394s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f1395t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1395t);
                        break;
                    case 22:
                        this.f1396u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1396u);
                        break;
                    case 23:
                        this.f1397v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1397v);
                        break;
                    case 24:
                        this.f1398w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1398w);
                        break;
                    case 25:
                        this.f1399x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1399x);
                        break;
                    case 26:
                        this.f1400y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1400y);
                        break;
                    case 27:
                        this.f1354T = obtainStyledAttributes.getBoolean(index, this.f1354T);
                        break;
                    case 28:
                        this.f1355U = obtainStyledAttributes.getBoolean(index, this.f1355U);
                        break;
                    case 29:
                        this.f1401z = obtainStyledAttributes.getFloat(index, this.f1401z);
                        break;
                    case 30:
                        this.f1335A = obtainStyledAttributes.getFloat(index, this.f1335A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f1343I = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f1344J = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f1345K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1345K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1345K) != -2) {
                                break;
                            } else {
                                this.f1345K = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1347M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1347M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1347M) != -2) {
                                break;
                            } else {
                                this.f1347M = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f1349O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1349O));
                        this.f1343I = 2;
                        break;
                    case 36:
                        try {
                            this.f1346L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1346L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1346L) != -2) {
                                break;
                            } else {
                                this.f1346L = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1348N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1348N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1348N) != -2) {
                                break;
                            } else {
                                this.f1348N = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f1350P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1350P));
                        this.f1344J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1336B = string;
                                this.f1337C = Float.NaN;
                                this.f1338D = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f1336B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f1336B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1338D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1338D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1336B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f1336B.substring(i, indexOf2);
                                        String substring3 = this.f1336B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f1338D != 1) {
                                                        this.f1337C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.f1337C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f1336B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.f1337C = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f1339E = obtainStyledAttributes.getFloat(index, this.f1339E);
                                break;
                            case 46:
                                this.f1340F = obtainStyledAttributes.getFloat(index, this.f1340F);
                                break;
                            case 47:
                                this.f1341G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1342H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1351Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1351Q);
                                break;
                            case 50:
                                this.f1352R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1352R);
                                break;
                            case 51:
                                this.f1356V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo1937a();
        }

        /* renamed from: a */
        public void mo1937a() {
            this.f1360Z = false;
            this.f1357W = true;
            this.f1358X = true;
            int i = this.width;
            if (i == -2 && this.f1354T) {
                this.f1357W = false;
                if (this.f1343I == 0) {
                    this.f1343I = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f1355U) {
                this.f1358X = false;
                if (this.f1344J == 0) {
                    this.f1344J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1357W = false;
                if (i == 0 && this.f1343I == 1) {
                    this.width = -2;
                    this.f1354T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1358X = false;
                if (i2 == 0 && this.f1344J == 1) {
                    this.height = -2;
                    this.f1355U = true;
                }
            }
            if (this.f1365c != -1.0f || this.f1361a != -1 || this.f1363b != -1) {
                this.f1360Z = true;
                this.f1357W = true;
                this.f1358X = true;
                if (!(this.f1388n0 instanceof Guideline)) {
                    this.f1388n0 = new Guideline();
                }
                ((Guideline) this.f1388n0).mo4785j1(this.f1353S);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                if (r4 != r10) goto L_0x0017
                r10 = 1
                goto L_0x0018
            L_0x0017:
                r10 = 0
            L_0x0018:
                r2 = -1
                r9.f1372f0 = r2
                r9.f1374g0 = r2
                r9.f1368d0 = r2
                r9.f1370e0 = r2
                r9.f1376h0 = r2
                r9.f1378i0 = r2
                int r5 = r9.f1395t
                r9.f1376h0 = r5
                int r5 = r9.f1397v
                r9.f1378i0 = r5
                float r5 = r9.f1401z
                r9.f1380j0 = r5
                int r6 = r9.f1361a
                r9.f1382k0 = r6
                int r7 = r9.f1363b
                r9.f1384l0 = r7
                float r8 = r9.f1365c
                r9.f1386m0 = r8
                if (r10 == 0) goto L_0x0098
                int r10 = r9.f1391p
                if (r10 == r2) goto L_0x0047
                r9.f1372f0 = r10
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r10 = r9.f1392q
                if (r10 == r2) goto L_0x004e
                r9.f1374g0 = r10
                goto L_0x0045
            L_0x004e:
                int r10 = r9.f1393r
                if (r10 == r2) goto L_0x0055
                r9.f1370e0 = r10
                r3 = 1
            L_0x0055:
                int r10 = r9.f1394s
                if (r10 == r2) goto L_0x005c
                r9.f1368d0 = r10
                r3 = 1
            L_0x005c:
                int r10 = r9.f1399x
                if (r10 == r2) goto L_0x0062
                r9.f1378i0 = r10
            L_0x0062:
                int r10 = r9.f1400y
                if (r10 == r2) goto L_0x0068
                r9.f1376h0 = r10
            L_0x0068:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0070
                float r3 = r10 - r5
                r9.f1380j0 = r3
            L_0x0070:
                boolean r3 = r9.f1360Z
                if (r3 == 0) goto L_0x00bc
                int r3 = r9.f1353S
                if (r3 != r4) goto L_0x00bc
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x0086
                float r10 = r10 - r8
                r9.f1386m0 = r10
                r9.f1382k0 = r2
                r9.f1384l0 = r2
                goto L_0x00bc
            L_0x0086:
                if (r6 == r2) goto L_0x008f
                r9.f1384l0 = r6
                r9.f1382k0 = r2
                r9.f1386m0 = r3
                goto L_0x00bc
            L_0x008f:
                if (r7 == r2) goto L_0x00bc
                r9.f1382k0 = r7
                r9.f1384l0 = r2
                r9.f1386m0 = r3
                goto L_0x00bc
            L_0x0098:
                int r10 = r9.f1391p
                if (r10 == r2) goto L_0x009e
                r9.f1370e0 = r10
            L_0x009e:
                int r10 = r9.f1392q
                if (r10 == r2) goto L_0x00a4
                r9.f1368d0 = r10
            L_0x00a4:
                int r10 = r9.f1393r
                if (r10 == r2) goto L_0x00aa
                r9.f1372f0 = r10
            L_0x00aa:
                int r10 = r9.f1394s
                if (r10 == r2) goto L_0x00b0
                r9.f1374g0 = r10
            L_0x00b0:
                int r10 = r9.f1399x
                if (r10 == r2) goto L_0x00b6
                r9.f1376h0 = r10
            L_0x00b6:
                int r10 = r9.f1400y
                if (r10 == r2) goto L_0x00bc
                r9.f1378i0 = r10
            L_0x00bc:
                int r10 = r9.f1393r
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f1394s
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f1392q
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f1391p
                if (r10 != r2) goto L_0x0106
                int r10 = r9.f1371f
                if (r10 == r2) goto L_0x00db
                r9.f1372f0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r9.rightMargin = r1
                goto L_0x00e9
            L_0x00db:
                int r10 = r9.f1373g
                if (r10 == r2) goto L_0x00e9
                r9.f1374g0 = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00e9
                if (r1 <= 0) goto L_0x00e9
                r9.rightMargin = r1
            L_0x00e9:
                int r10 = r9.f1367d
                if (r10 == r2) goto L_0x00f8
                r9.f1368d0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r9.leftMargin = r0
                goto L_0x0106
            L_0x00f8:
                int r10 = r9.f1369e
                if (r10 == r2) goto L_0x0106
                r9.f1370e0 = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x0106
                if (r0 <= 0) goto L_0x0106
                r9.leftMargin = r0
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0212b.resolveLayoutDirection(int):void");
        }

        public C0212b(int i, int i2) {
            super(i, i2);
        }

        public C0212b(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0214c implements C0565b {

        /* renamed from: a */
        ConstraintLayout f1403a;

        /* renamed from: b */
        int f1404b;

        /* renamed from: c */
        int f1405c;

        /* renamed from: d */
        int f1406d;

        /* renamed from: e */
        int f1407e;

        /* renamed from: f */
        int f1408f;

        /* renamed from: g */
        int f1409g;

        public C0214c(ConstraintLayout constraintLayout) {
            this.f1403a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m1523d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = MeasureSpec.getMode(i);
            MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (mode2 == 1073741824 && ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size)) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongCall"})
        /* renamed from: a */
        public final void mo1939a(ConstraintWidget eVar, C0564a aVar) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            ConstraintWidget eVar2 = eVar;
            C0564a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.mo4689Q() == 8 && !eVar.mo4708a0()) {
                    aVar2.f4273h = 0;
                    aVar2.f4274i = 0;
                    aVar2.f4275j = 0;
                } else if (eVar.mo4673I() != null) {
                    C0561b bVar = aVar2.f4269d;
                    C0561b bVar2 = aVar2.f4270e;
                    int i8 = aVar2.f4271f;
                    int i9 = aVar2.f4272g;
                    int i10 = this.f1404b + this.f1405c;
                    int i11 = this.f1406d;
                    View view = (View) eVar.mo4731q();
                    int[] iArr = C0211a.f1334a;
                    int i12 = iArr[bVar.ordinal()];
                    if (i12 == 1) {
                        i = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else if (i12 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f1408f, i11, -2);
                    } else if (i12 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f1408f, i11 + eVar.mo4749z(), -1);
                    } else if (i12 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f1408f, i11, -2);
                        boolean z = eVar2.f4182q == 1;
                        int i13 = aVar2.f4278m;
                        if (i13 == C0564a.f4267b || i13 == C0564a.f4268c) {
                            if (aVar2.f4278m == C0564a.f4268c || !z || (z && (view.getMeasuredHeight() == eVar.mo4741v())) || (view instanceof Placeholder) || eVar.mo4624e0()) {
                                i = MeasureSpec.makeMeasureSpec(eVar.mo4691R(), 1073741824);
                            }
                        }
                    }
                    int i14 = iArr[bVar2.ordinal()];
                    if (i14 == 1) {
                        i2 = MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i14 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1409g, i10, -2);
                    } else if (i14 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1409g, i10 + eVar.mo4687P(), -1);
                    } else if (i14 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f1409g, i10, -2);
                        boolean z2 = eVar2.f4184r == 1;
                        int i15 = aVar2.f4278m;
                        if (i15 == C0564a.f4267b || i15 == C0564a.f4268c) {
                            if (aVar2.f4278m == C0564a.f4268c || !z2 || (z2 && (view.getMeasuredWidth() == eVar.mo4691R())) || (view instanceof Placeholder) || eVar.mo4626f0()) {
                                i2 = MeasureSpec.makeMeasureSpec(eVar.mo4741v(), 1073741824);
                            }
                        }
                    }
                    ConstraintWidgetContainer fVar = (ConstraintWidgetContainer) eVar.mo4673I();
                    if (fVar != null && Optimizer.m4852b(ConstraintLayout.this.f1319i, LogType.UNEXP) && view.getMeasuredWidth() == eVar.mo4691R() && view.getMeasuredWidth() < fVar.mo4691R() && view.getMeasuredHeight() == eVar.mo4741v() && view.getMeasuredHeight() < fVar.mo4741v() && view.getBaseline() == eVar.mo4725n() && !eVar.mo4711d0()) {
                        if (m1523d(eVar.mo4657A(), i, eVar.mo4691R()) && m1523d(eVar.mo4659B(), i2, eVar.mo4741v())) {
                            aVar2.f4273h = eVar.mo4691R();
                            aVar2.f4274i = eVar.mo4741v();
                            aVar2.f4275j = eVar.mo4725n();
                            return;
                        }
                    }
                    C0561b bVar3 = C0561b.MATCH_CONSTRAINT;
                    boolean z3 = bVar == bVar3;
                    boolean z4 = bVar2 == bVar3;
                    C0561b bVar4 = C0561b.MATCH_PARENT;
                    boolean z5 = bVar2 == bVar4 || bVar2 == C0561b.FIXED;
                    boolean z6 = bVar == bVar4 || bVar == C0561b.FIXED;
                    boolean z7 = z3 && eVar2.f4148X > 0.0f;
                    boolean z8 = z4 && eVar2.f4148X > 0.0f;
                    if (view != null) {
                        C0212b bVar5 = (C0212b) view.getLayoutParams();
                        int i16 = aVar2.f4278m;
                        if (i16 == C0564a.f4267b || i16 == C0564a.f4268c || !z3 || eVar2.f4182q != 0 || !z4 || eVar2.f4184r != 0) {
                            if (!(view instanceof VirtualLayout) || !(eVar2 instanceof C0563k)) {
                                view.measure(i, i2);
                            } else {
                                ((VirtualLayout) view).mo2000o((C0563k) eVar2, i, i2);
                            }
                            eVar2.mo4668F0(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i4 = view.getBaseline();
                            int i17 = eVar2.f4188t;
                            i3 = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                            int i18 = eVar2.f4190u;
                            if (i18 > 0) {
                                i3 = Math.min(i18, i3);
                            }
                            int i19 = eVar2.f4194w;
                            if (i19 > 0) {
                                i5 = Math.max(i19, measuredHeight);
                                i7 = i;
                            } else {
                                i7 = i;
                                i5 = measuredHeight;
                            }
                            int i20 = eVar2.f4196x;
                            if (i20 > 0) {
                                i5 = Math.min(i20, i5);
                            }
                            if (!Optimizer.m4852b(ConstraintLayout.this.f1319i, 1)) {
                                if (z7 && z5) {
                                    i3 = (int) ((((float) i5) * eVar2.f4148X) + 0.5f);
                                } else if (z8 && z6) {
                                    i5 = (int) ((((float) i3) / eVar2.f4148X) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i3 && measuredHeight == i5)) {
                                int makeMeasureSpec = measuredWidth != i3 ? MeasureSpec.makeMeasureSpec(i3, 1073741824) : i7;
                                if (measuredHeight != i5) {
                                    i2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i2);
                                eVar2.mo4668F0(makeMeasureSpec, i2);
                                i3 = view.getMeasuredWidth();
                                i5 = view.getMeasuredHeight();
                                i4 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        boolean z9 = i4 != i6;
                        aVar2.f4277l = (i3 == aVar2.f4271f && i5 == aVar2.f4272g) ? false : true;
                        if (bVar5.f1359Y) {
                            z9 = true;
                        }
                        if (!(!z9 || i4 == -1 || eVar.mo4725n() == i4)) {
                            aVar2.f4277l = true;
                        }
                        aVar2.f4273h = i3;
                        aVar2.f4274i = i5;
                        aVar2.f4276k = z9;
                        aVar2.f4275j = i4;
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo1940b() {
            int childCount = this.f1403a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1403a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo1993a(this.f1403a);
                }
            }
            int size = this.f1403a.f1312b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f1403a.f1312b.get(i2)).mo1953k(this.f1403a);
                }
            }
        }

        /* renamed from: c */
        public void mo1941c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1404b = i3;
            this.f1405c = i4;
            this.f1406d = i5;
            this.f1407e = i6;
            this.f1408f = i;
            this.f1409g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1506k(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    /* renamed from: h */
    private final ConstraintWidget m1505h(int i) {
        ConstraintWidget eVar;
        if (i == 0) {
            return this.f1313c;
        }
        View view = (View) this.f1311a.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f1313c;
        }
        if (view == null) {
            eVar = null;
        } else {
            eVar = ((C0212b) view.getLayoutParams()).f1388n0;
        }
        return eVar;
    }

    /* renamed from: k */
    private void m1506k(AttributeSet attributeSet, int i, int i2) {
        this.f1313c.mo4722l0(this);
        this.f1313c.mo4752D1(this.f1331u);
        this.f1311a.put(getId(), this);
        this.f1320j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0226i.f1727a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0226i.f1762f1) {
                    this.f1314d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1314d);
                } else if (index == C0226i.f1769g1) {
                    this.f1315e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1315e);
                } else if (index == C0226i.f1748d1) {
                    this.f1316f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1316f);
                } else if (index == C0226i.f1755e1) {
                    this.f1317g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1317g);
                } else if (index == C0226i.f1816n2) {
                    this.f1319i = obtainStyledAttributes.getInt(index, this.f1319i);
                } else if (index == C0226i.f1821o1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1917n(resourceId);
                        } catch (NotFoundException unused) {
                            this.f1321k = null;
                        }
                    }
                } else if (index == C0226i.f1803l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet dVar = new ConstraintSet();
                        this.f1320j = dVar;
                        dVar.mo1973m(getContext(), resourceId2);
                    } catch (NotFoundException unused2) {
                        this.f1320j = null;
                    }
                    this.f1322l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1313c.mo4753E1(this.f1319i);
    }

    /* renamed from: m */
    private void m1507m() {
        this.f1318h = true;
        this.f1324n = -1;
        this.f1325o = -1;
        this.f1326p = -1;
        this.f1327q = -1;
        this.f1328r = 0;
        this.f1329s = 0;
    }

    /* renamed from: q */
    private void m1508q() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget j = mo1915j(getChildAt(i));
            if (j != null) {
                j.mo4715h0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo1924r(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1505h(childAt.getId()).mo4724m0(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        }
        if (this.f1322l != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f1322l && (childAt2 instanceof Constraints)) {
                    this.f1320j = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet dVar = this.f1320j;
        if (dVar != null) {
            dVar.mo1967d(this, true);
        }
        this.f1313c.mo4796d1();
        int size = this.f1312b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((ConstraintHelper) this.f1312b.get(i4)).mo1955m(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo1994b(this);
            }
        }
        this.f1330t.clear();
        this.f1330t.put(0, this.f1313c);
        this.f1330t.put(getId(), this.f1313c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f1330t.put(childAt4.getId(), mo1915j(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget j2 = mo1915j(childAt5);
            if (j2 != null) {
                C0212b bVar = (C0212b) childAt5.getLayoutParams();
                this.f1313c.mo4793a(j2);
                mo1900d(isInEditMode, childAt5, j2, bVar, this.f1330t);
            }
        }
    }

    /* renamed from: t */
    private boolean m1509t() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m1508q();
        }
        return z;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0212b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0200  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1900d(boolean r20, android.view.View r21, p010b.p026e.p030b.p031k.ConstraintWidget r22, androidx.constraintlayout.widget.ConstraintLayout.C0212b r23, android.util.SparseArray<p010b.p026e.p030b.p031k.ConstraintWidget> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.mo1937a()
            r10 = 0
            r8.f1390o0 = r10
            int r2 = r21.getVisibility()
            r7.mo4696T0(r2)
            boolean r2 = r8.f1364b0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo4664D0(r11)
            r2 = 8
            r7.mo4696T0(r2)
        L_0x0024:
            r7.mo4722l0(r1)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0036
            androidx.constraintlayout.widget.b r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            b.e.b.k.f r2 = r0.f1313c
            boolean r2 = r2.mo4773x1()
            r1.mo1892i(r7, r2)
        L_0x0036:
            boolean r1 = r8.f1360Z
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0069
            r1 = r7
            b.e.b.k.g r1 = (p010b.p026e.p030b.p031k.Guideline) r1
            int r3 = r8.f1382k0
            int r4 = r8.f1384l0
            float r5 = r8.f1386m0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x0050
            int r3 = r8.f1361a
            int r4 = r8.f1363b
            float r5 = r8.f1365c
        L_0x0050:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x005b
            r1.mo4784i1(r5)
            goto L_0x02cd
        L_0x005b:
            if (r3 == r12) goto L_0x0062
            r1.mo4782g1(r3)
            goto L_0x02cd
        L_0x0062:
            if (r4 == r12) goto L_0x02cd
            r1.mo4783h1(r4)
            goto L_0x02cd
        L_0x0069:
            int r1 = r8.f1368d0
            int r3 = r8.f1370e0
            int r4 = r8.f1372f0
            int r5 = r8.f1374g0
            int r6 = r8.f1376h0
            int r13 = r8.f1378i0
            float r14 = r8.f1380j0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00b1
            int r1 = r8.f1367d
            int r2 = r8.f1369e
            int r4 = r8.f1371f
            int r5 = r8.f1373g
            int r3 = r8.f1395t
            int r6 = r8.f1397v
            float r14 = r8.f1401z
            if (r1 != r12) goto L_0x0098
            if (r2 != r12) goto L_0x0098
            int r13 = r8.f1392q
            if (r13 == r12) goto L_0x0093
            r1 = r13
            goto L_0x0098
        L_0x0093:
            int r13 = r8.f1391p
            if (r13 == r12) goto L_0x0098
            r2 = r13
        L_0x0098:
            if (r4 != r12) goto L_0x00ac
            if (r5 != r12) goto L_0x00ac
            int r13 = r8.f1393r
            if (r13 == r12) goto L_0x00a1
            goto L_0x00ad
        L_0x00a1:
            int r13 = r8.f1394s
            if (r13 == r12) goto L_0x00ac
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r3 = r2
            r13 = r4
            goto L_0x00b8
        L_0x00ac:
            r13 = r4
        L_0x00ad:
            r15 = r6
            r6 = r3
            r3 = r2
            goto L_0x00b3
        L_0x00b1:
            r15 = r13
            r13 = r4
        L_0x00b3:
            r18 = r14
            r14 = r5
            r5 = r18
        L_0x00b8:
            int r2 = r8.f1385m
            if (r2 == r12) goto L_0x00cd
            java.lang.Object r1 = r9.get(r2)
            b.e.b.k.e r1 = (p010b.p026e.p030b.p031k.ConstraintWidget) r1
            if (r1 == 0) goto L_0x01fe
            float r2 = r8.f1389o
            int r3 = r8.f1387n
            r7.mo4717j(r1, r2, r3)
            goto L_0x01fe
        L_0x00cd:
            if (r1 == r12) goto L_0x00ec
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00e9
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r16 = r2
            r2 = r4
            r17 = r5
            r5 = r16
            r1.mo4703X(r2, r3, r4, r5, r6)
            goto L_0x0104
        L_0x00e9:
            r17 = r5
            goto L_0x0104
        L_0x00ec:
            r17 = r5
            if (r3 == r12) goto L_0x0104
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0104
            b.e.b.k.d$b r2 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
            r1.mo4703X(r2, r3, r4, r5, r6)
        L_0x0104:
            if (r13 == r12) goto L_0x011c
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0132
            b.e.b.k.d$b r2 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            r6 = r15
            r1.mo4703X(r2, r3, r4, r5, r6)
            goto L_0x0132
        L_0x011c:
            if (r14 == r12) goto L_0x0132
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0132
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
            r6 = r15
            r1.mo4703X(r2, r3, r4, r5, r6)
        L_0x0132:
            int r1 = r8.f1375h
            if (r1 == r12) goto L_0x014c
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0166
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            int r5 = r8.topMargin
            int r6 = r8.f1396u
            r1 = r22
            r2 = r4
            r1.mo4703X(r2, r3, r4, r5, r6)
            goto L_0x0166
        L_0x014c:
            int r1 = r8.f1377i
            if (r1 == r12) goto L_0x0166
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0166
            b.e.b.k.d$b r2 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f1396u
            r1 = r22
            r1.mo4703X(r2, r3, r4, r5, r6)
        L_0x0166:
            int r1 = r8.f1379j
            if (r1 == r12) goto L_0x0181
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x019a
            b.e.b.k.d$b r2 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f1398w
            r1 = r22
            r1.mo4703X(r2, r3, r4, r5, r6)
            goto L_0x019a
        L_0x0181:
            int r1 = r8.f1381k
            if (r1 == r12) goto L_0x019a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            b.e.b.k.e r3 = (p010b.p026e.p030b.p031k.ConstraintWidget) r3
            if (r3 == 0) goto L_0x019a
            b.e.b.k.d$b r4 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f1398w
            r1 = r22
            r2 = r4
            r1.mo4703X(r2, r3, r4, r5, r6)
        L_0x019a:
            int r1 = r8.f1383l
            if (r1 == r12) goto L_0x01eb
            android.util.SparseArray<android.view.View> r2 = r0.f1311a
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f1383l
            java.lang.Object r2 = r9.get(r2)
            b.e.b.k.e r2 = (p010b.p026e.p030b.p031k.ConstraintWidget) r2
            if (r2 == 0) goto L_0x01eb
            if (r1 == 0) goto L_0x01eb
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0212b
            if (r3 == 0) goto L_0x01eb
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$b r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0212b) r1
            r8.f1359Y = r11
            r1.f1359Y = r11
            b.e.b.k.d$b r3 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BASELINE
            b.e.b.k.d r4 = r7.mo4723m(r3)
            b.e.b.k.d r2 = r2.mo4723m(r3)
            r4.mo4637a(r2, r10, r12, r11)
            r7.mo4740u0(r11)
            b.e.b.k.e r1 = r1.f1388n0
            r1.mo4740u0(r11)
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            b.e.b.k.d r1 = r7.mo4723m(r1)
            r1.mo4652p()
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d r1 = r7.mo4723m(r1)
            r1.mo4652p()
        L_0x01eb:
            r1 = 0
            r14 = r17
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x01f5
            r7.mo4744w0(r14)
        L_0x01f5:
            float r2 = r8.f1335A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x01fe
            r7.mo4684N0(r2)
        L_0x01fe:
            if (r20 == 0) goto L_0x020d
            int r1 = r8.f1351Q
            if (r1 != r12) goto L_0x0208
            int r2 = r8.f1352R
            if (r2 == r12) goto L_0x020d
        L_0x0208:
            int r2 = r8.f1352R
            r7.mo4680L0(r1, r2)
        L_0x020d:
            boolean r1 = r8.f1357W
            r2 = -2
            if (r1 != 0) goto L_0x0243
            int r1 = r8.width
            if (r1 != r12) goto L_0x023a
            boolean r1 = r8.f1354T
            if (r1 == 0) goto L_0x0220
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            r7.mo4750z0(r1)
            goto L_0x0225
        L_0x0220:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            r7.mo4750z0(r1)
        L_0x0225:
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.LEFT
            b.e.b.k.d r1 = r7.mo4723m(r1)
            int r3 = r8.leftMargin
            r1.f4107g = r3
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.RIGHT
            b.e.b.k.d r1 = r7.mo4723m(r1)
            int r3 = r8.rightMargin
            r1.f4107g = r3
            goto L_0x0256
        L_0x023a:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            r7.mo4750z0(r1)
            r7.mo4698U0(r10)
            goto L_0x0256
        L_0x0243:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r7.mo4750z0(r1)
            int r1 = r8.width
            r7.mo4698U0(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0256
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            r7.mo4750z0(r1)
        L_0x0256:
            boolean r1 = r8.f1358X
            if (r1 != 0) goto L_0x028b
            int r1 = r8.height
            if (r1 != r12) goto L_0x0282
            boolean r1 = r8.f1355U
            if (r1 == 0) goto L_0x0268
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            r7.mo4690Q0(r1)
            goto L_0x026d
        L_0x0268:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_PARENT
            r7.mo4690Q0(r1)
        L_0x026d:
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.TOP
            b.e.b.k.d r1 = r7.mo4723m(r1)
            int r2 = r8.topMargin
            r1.f4107g = r2
            b.e.b.k.d$b r1 = p010b.p026e.p030b.p031k.ConstraintAnchor.C0559b.BOTTOM
            b.e.b.k.d r1 = r7.mo4723m(r1)
            int r2 = r8.bottomMargin
            r1.f4107g = r2
            goto L_0x029e
        L_0x0282:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.MATCH_CONSTRAINT
            r7.mo4690Q0(r1)
            r7.mo4742v0(r10)
            goto L_0x029e
        L_0x028b:
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.FIXED
            r7.mo4690Q0(r1)
            int r1 = r8.height
            r7.mo4742v0(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x029e
            b.e.b.k.e$b r1 = p010b.p026e.p030b.p031k.ConstraintWidget.C0561b.WRAP_CONTENT
            r7.mo4690Q0(r1)
        L_0x029e:
            java.lang.String r1 = r8.f1336B
            r7.mo4726n0(r1)
            float r1 = r8.f1339E
            r7.mo4660B0(r1)
            float r1 = r8.f1340F
            r7.mo4694S0(r1)
            int r1 = r8.f1341G
            r7.mo4746x0(r1)
            int r1 = r8.f1342H
            r7.mo4686O0(r1)
            int r1 = r8.f1343I
            int r2 = r8.f1345K
            int r3 = r8.f1347M
            float r4 = r8.f1349O
            r7.mo4658A0(r1, r2, r3, r4)
            int r1 = r8.f1344J
            int r2 = r8.f1346L
            int r3 = r8.f1348N
            float r4 = r8.f1350P
            r7.mo4692R0(r1, r2, r3, r4)
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1900d(boolean, android.view.View, b.e.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<ConstraintHelper> arrayList = this.f1312b;
        if (arrayList != null) {
            int size = arrayList.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    ((ConstraintHelper) this.f1312b.get(i)).mo1954l(this);
                }
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i3;
                            float f2 = (float) (i3 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i4;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i4 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0212b generateDefaultLayoutParams() {
        return new C0212b(-2, -2);
    }

    /* renamed from: f */
    public C0212b generateLayoutParams(AttributeSet attributeSet) {
        return new C0212b(getContext(), attributeSet);
    }

    public void forceLayout() {
        m1507m();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object mo1905g(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f1323m;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f1323m.get(str);
            }
        }
        return null;
    }

    public int getMaxHeight() {
        return this.f1317g;
    }

    public int getMaxWidth() {
        return this.f1316f;
    }

    public int getMinHeight() {
        return this.f1315e;
    }

    public int getMinWidth() {
        return this.f1314d;
    }

    public int getOptimizationLevel() {
        return this.f1313c.mo4768s1();
    }

    /* renamed from: i */
    public View mo1914i(int i) {
        return (View) this.f1311a.get(i);
    }

    /* renamed from: j */
    public final ConstraintWidget mo1915j(View view) {
        ConstraintWidget eVar;
        if (view == this) {
            return this.f1313c;
        }
        if (view == null) {
            eVar = null;
        } else {
            eVar = ((C0212b) view.getLayoutParams()).f1388n0;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo1916l() {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo1917n(int i) {
        this.f1321k = new ConstraintLayoutStates(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo1918o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0214c cVar = this.f1331u;
        int i5 = i3 + cVar.f1406d;
        int i6 = i4 + cVar.f1407e;
        if (VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i2, 0) & 16777215;
            int min = Math.min(this.f1316f, ViewGroup.resolveSizeAndState(i5, i, 0) & 16777215);
            int min2 = Math.min(this.f1317g, resolveSizeAndState);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f1324n = min;
            this.f1325o = min2;
            return;
        }
        setMeasuredDimension(i5, i6);
        this.f1324n = i5;
        this.f1325o = i6;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0212b bVar = (C0212b) childAt.getLayoutParams();
            ConstraintWidget eVar = bVar.f1388n0;
            if ((childAt.getVisibility() != 8 || bVar.f1360Z || bVar.f1362a0 || bVar.f1366c0 || isInEditMode) && !bVar.f1364b0) {
                int S = eVar.mo4693S();
                int T = eVar.mo4695T();
                int R = eVar.mo4691R() + S;
                int v = eVar.mo4741v() + T;
                childAt.layout(S, T, R, v);
                if (childAt instanceof Placeholder) {
                    View content = ((Placeholder) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(S, T, R, v);
                    }
                }
            }
        }
        int size = this.f1312b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) this.f1312b.get(i6)).mo1952j(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f1318h) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.f1318h = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.f1318h) {
            int i4 = this.f1332v;
            if (i4 == i && this.f1333w == i2) {
                mo1918o(i, i2, this.f1313c.mo4691R(), this.f1313c.mo4741v(), this.f1313c.mo4774y1(), this.f1313c.mo4772w1());
                return;
            } else if (i4 == i && MeasureSpec.getMode(i) == 1073741824 && MeasureSpec.getMode(i2) == Integer.MIN_VALUE && MeasureSpec.getMode(this.f1333w) == Integer.MIN_VALUE && MeasureSpec.getSize(i2) >= this.f1313c.mo4741v()) {
                this.f1332v = i;
                this.f1333w = i2;
                mo1918o(i, i2, this.f1313c.mo4691R(), this.f1313c.mo4741v(), this.f1313c.mo4774y1(), this.f1313c.mo4772w1());
                return;
            }
        }
        this.f1332v = i;
        this.f1333w = i2;
        this.f1313c.mo4754F1(mo1916l());
        if (this.f1318h) {
            this.f1318h = false;
            if (m1509t()) {
                this.f1313c.mo4756H1();
            }
        }
        mo1923p(this.f1313c, this.f1319i, i, i2);
        mo1918o(i, i2, this.f1313c.mo4691R(), this.f1313c.mo4741v(), this.f1313c.mo4774y1(), this.f1313c.mo4772w1());
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget j = mo1915j(view);
        if ((view instanceof Guideline) && !(j instanceof Guideline)) {
            C0212b bVar = (C0212b) view.getLayoutParams();
            Guideline gVar = new Guideline();
            bVar.f1388n0 = gVar;
            bVar.f1360Z = true;
            gVar.mo4785j1(bVar.f1353S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper bVar2 = (ConstraintHelper) view;
            bVar2.mo1956n();
            ((C0212b) view.getLayoutParams()).f1362a0 = true;
            if (!this.f1312b.contains(bVar2)) {
                this.f1312b.add(bVar2);
            }
        }
        this.f1311a.put(view.getId(), view);
        this.f1318h = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1311a.remove(view.getId());
        this.f1313c.mo4795c1(mo1915j(view));
        this.f1312b.remove(view);
        this.f1318h = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo1923p(ConstraintWidgetContainer fVar, int i, int i2, int i3) {
        int i4;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1331u.mo1941c(i2, i3, max, max2, paddingWidth, i5);
        if (VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo1916l()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo1927s(fVar, mode, i6, mode2, i7);
        fVar.mo4775z1(i, mode, i6, mode2, i7, this.f1324n, this.f1325o, i4, max);
    }

    /* renamed from: r */
    public void mo1924r(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1323m == null) {
                this.f1323m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1323m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        m1507m();
        super.requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo1927s(ConstraintWidgetContainer fVar, int i, int i2, int i3, int i4) {
        C0561b bVar;
        C0214c cVar = this.f1331u;
        int i5 = cVar.f1407e;
        int i6 = cVar.f1406d;
        C0561b bVar2 = C0561b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C0561b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f1314d);
                }
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.f1316f - i6, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = C0561b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f1314d);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = C0561b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f1315e);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f1317g - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = C0561b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f1315e);
            }
        }
        if (!(i2 == fVar.mo4691R() && i4 == fVar.mo4741v())) {
            fVar.mo4771v1();
        }
        fVar.mo4700V0(0);
        fVar.mo4702W0(0);
        fVar.mo4672H0(this.f1316f - i6);
        fVar.mo4670G0(this.f1317g - i5);
        fVar.mo4678K0(0);
        fVar.mo4676J0(0);
        fVar.mo4750z0(bVar);
        fVar.mo4698U0(i2);
        fVar.mo4690Q0(bVar2);
        fVar.mo4742v0(i4);
        fVar.mo4678K0(this.f1314d - i6);
        fVar.mo4676J0(this.f1315e - i5);
    }

    public void setConstraintSet(ConstraintSet dVar) {
        this.f1320j = dVar;
    }

    public void setId(int i) {
        this.f1311a.remove(getId());
        super.setId(i);
        this.f1311a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1317g) {
            this.f1317g = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1316f) {
            this.f1316f = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1315e) {
            this.f1315e = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1314d) {
            this.f1314d = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener fVar) {
        ConstraintLayoutStates cVar = this.f1321k;
        if (cVar != null) {
            cVar.mo1964c(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1319i = i;
        this.f1313c.mo4753E1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0212b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1506k(attributeSet, i, 0);
    }
}
