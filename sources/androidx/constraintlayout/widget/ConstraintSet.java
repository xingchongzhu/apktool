package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.C0212b;
import androidx.constraintlayout.widget.Constraints.C0224a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p026e.p027a.p028a.Easing;
import p010b.p026e.p027a.p029b.Debug;

/* renamed from: androidx.constraintlayout.widget.d */
public class ConstraintSet {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int[] f1451a = {0, 4, 8};

    /* renamed from: b */
    private static SparseIntArray f1452b;

    /* renamed from: c */
    private HashMap<String, ConstraintAttribute> f1453c = new HashMap<>();

    /* renamed from: d */
    private boolean f1454d = true;

    /* renamed from: e */
    private HashMap<Integer, C0219a> f1455e = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* compiled from: ConstraintSet */
    public static class C0219a {

        /* renamed from: a */
        int f1456a;

        /* renamed from: b */
        public final C0222d f1457b = new C0222d();

        /* renamed from: c */
        public final C0221c f1458c = new C0221c();

        /* renamed from: d */
        public final C0220b f1459d = new C0220b();

        /* renamed from: e */
        public final C0223e f1460e = new C0223e();

        /* renamed from: f */
        public HashMap<String, ConstraintAttribute> f1461f = new HashMap<>();

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m1568f(int i, C0212b bVar) {
            this.f1456a = i;
            C0220b bVar2 = this.f1459d;
            bVar2.f1504i = bVar.f1367d;
            bVar2.f1506j = bVar.f1369e;
            bVar2.f1508k = bVar.f1371f;
            bVar2.f1510l = bVar.f1373g;
            bVar2.f1511m = bVar.f1375h;
            bVar2.f1512n = bVar.f1377i;
            bVar2.f1513o = bVar.f1379j;
            bVar2.f1514p = bVar.f1381k;
            bVar2.f1515q = bVar.f1383l;
            bVar2.f1516r = bVar.f1391p;
            bVar2.f1517s = bVar.f1392q;
            bVar2.f1518t = bVar.f1393r;
            bVar2.f1519u = bVar.f1394s;
            bVar2.f1520v = bVar.f1401z;
            bVar2.f1521w = bVar.f1335A;
            bVar2.f1522x = bVar.f1336B;
            bVar2.f1523y = bVar.f1385m;
            bVar2.f1524z = bVar.f1387n;
            bVar2.f1463A = bVar.f1389o;
            bVar2.f1464B = bVar.f1351Q;
            bVar2.f1465C = bVar.f1352R;
            bVar2.f1466D = bVar.f1353S;
            bVar2.f1502h = bVar.f1365c;
            bVar2.f1498f = bVar.f1361a;
            bVar2.f1500g = bVar.f1363b;
            C0220b bVar3 = this.f1459d;
            bVar3.f1494d = bVar.width;
            bVar3.f1496e = bVar.height;
            bVar3.f1467E = bVar.leftMargin;
            bVar3.f1468F = bVar.rightMargin;
            bVar3.f1469G = bVar.topMargin;
            bVar3.f1470H = bVar.bottomMargin;
            bVar3.f1479Q = bVar.f1340F;
            bVar3.f1480R = bVar.f1339E;
            bVar3.f1482T = bVar.f1342H;
            bVar3.f1481S = bVar.f1341G;
            bVar3.f1505i0 = bVar.f1354T;
            bVar3.f1507j0 = bVar.f1355U;
            bVar3.f1483U = bVar.f1343I;
            bVar3.f1484V = bVar.f1344J;
            bVar3.f1485W = bVar.f1347M;
            bVar3.f1486X = bVar.f1348N;
            bVar3.f1487Y = bVar.f1345K;
            bVar3.f1488Z = bVar.f1346L;
            bVar3.f1489a0 = bVar.f1349O;
            bVar3.f1491b0 = bVar.f1350P;
            bVar3.f1503h0 = bVar.f1356V;
            bVar3.f1474L = bVar.f1396u;
            bVar3.f1476N = bVar.f1398w;
            bVar3.f1473K = bVar.f1395t;
            bVar3.f1475M = bVar.f1397v;
            C0220b bVar4 = this.f1459d;
            bVar4.f1478P = bVar.f1399x;
            bVar4.f1477O = bVar.f1400y;
            if (VERSION.SDK_INT >= 17) {
                bVar4.f1471I = bVar.getMarginEnd();
                this.f1459d.f1472J = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public void m1569g(int i, C0224a aVar) {
            m1568f(i, aVar);
            this.f1457b.f1536d = aVar.f1555p0;
            C0223e eVar = this.f1460e;
            eVar.f1540c = aVar.f1558s0;
            eVar.f1541d = aVar.f1559t0;
            eVar.f1542e = aVar.f1560u0;
            eVar.f1543f = aVar.f1561v0;
            eVar.f1544g = aVar.f1562w0;
            eVar.f1545h = aVar.f1563x0;
            eVar.f1546i = aVar.f1564y0;
            eVar.f1547j = aVar.f1565z0;
            eVar.f1548k = aVar.f1553A0;
            eVar.f1549l = aVar.f1554B0;
            eVar.f1551n = aVar.f1557r0;
            eVar.f1550m = aVar.f1556q0;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m1570h(ConstraintHelper bVar, int i, C0224a aVar) {
            m1569g(i, aVar);
            if (bVar instanceof Barrier) {
                C0220b bVar2 = this.f1459d;
                bVar2.f1497e0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1493c0 = barrier.getType();
                this.f1459d.f1499f0 = barrier.getReferencedIds();
                this.f1459d.f1495d0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void mo1976d(C0212b bVar) {
            C0220b bVar2 = this.f1459d;
            bVar.f1367d = bVar2.f1504i;
            bVar.f1369e = bVar2.f1506j;
            bVar.f1371f = bVar2.f1508k;
            bVar.f1373g = bVar2.f1510l;
            bVar.f1375h = bVar2.f1511m;
            bVar.f1377i = bVar2.f1512n;
            bVar.f1379j = bVar2.f1513o;
            bVar.f1381k = bVar2.f1514p;
            bVar.f1383l = bVar2.f1515q;
            bVar.f1391p = bVar2.f1516r;
            bVar.f1392q = bVar2.f1517s;
            bVar.f1393r = bVar2.f1518t;
            bVar.f1394s = bVar2.f1519u;
            bVar.leftMargin = bVar2.f1467E;
            bVar.rightMargin = bVar2.f1468F;
            bVar.topMargin = bVar2.f1469G;
            bVar.bottomMargin = bVar2.f1470H;
            bVar.f1399x = bVar2.f1478P;
            bVar.f1400y = bVar2.f1477O;
            bVar.f1396u = bVar2.f1474L;
            bVar.f1398w = bVar2.f1476N;
            bVar.f1401z = bVar2.f1520v;
            bVar.f1335A = bVar2.f1521w;
            bVar.f1385m = bVar2.f1523y;
            bVar.f1387n = bVar2.f1524z;
            C0220b bVar3 = this.f1459d;
            bVar.f1389o = bVar3.f1463A;
            bVar.f1336B = bVar3.f1522x;
            bVar.f1351Q = bVar3.f1464B;
            bVar.f1352R = bVar3.f1465C;
            bVar.f1340F = bVar3.f1479Q;
            bVar.f1339E = bVar3.f1480R;
            bVar.f1342H = bVar3.f1482T;
            bVar.f1341G = bVar3.f1481S;
            bVar.f1354T = bVar3.f1505i0;
            bVar.f1355U = bVar3.f1507j0;
            bVar.f1343I = bVar3.f1483U;
            bVar.f1344J = bVar3.f1484V;
            bVar.f1347M = bVar3.f1485W;
            bVar.f1348N = bVar3.f1486X;
            bVar.f1345K = bVar3.f1487Y;
            bVar.f1346L = bVar3.f1488Z;
            bVar.f1349O = bVar3.f1489a0;
            bVar.f1350P = bVar3.f1491b0;
            bVar.f1353S = bVar3.f1466D;
            bVar.f1365c = bVar3.f1502h;
            bVar.f1361a = bVar3.f1498f;
            bVar.f1363b = bVar3.f1500g;
            bVar.width = bVar3.f1494d;
            bVar.height = bVar3.f1496e;
            String str = bVar3.f1503h0;
            if (str != null) {
                bVar.f1356V = str;
            }
            if (VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f1459d.f1472J);
                bVar.setMarginEnd(this.f1459d.f1471I);
            }
            bVar.mo1937a();
        }

        /* renamed from: e */
        public C0219a clone() {
            C0219a aVar = new C0219a();
            aVar.f1459d.mo1978a(this.f1459d);
            aVar.f1458c.mo1980a(this.f1458c);
            aVar.f1457b.mo1982a(this.f1457b);
            aVar.f1460e.mo1984a(this.f1460e);
            aVar.f1456a = this.f1456a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* compiled from: ConstraintSet */
    public static class C0220b {

        /* renamed from: a */
        private static SparseIntArray f1462a;

        /* renamed from: A */
        public float f1463A = 0.0f;

        /* renamed from: B */
        public int f1464B = -1;

        /* renamed from: C */
        public int f1465C = -1;

        /* renamed from: D */
        public int f1466D = -1;

        /* renamed from: E */
        public int f1467E = -1;

        /* renamed from: F */
        public int f1468F = -1;

        /* renamed from: G */
        public int f1469G = -1;

        /* renamed from: H */
        public int f1470H = -1;

        /* renamed from: I */
        public int f1471I = -1;

        /* renamed from: J */
        public int f1472J = -1;

        /* renamed from: K */
        public int f1473K = -1;

        /* renamed from: L */
        public int f1474L = -1;

        /* renamed from: M */
        public int f1475M = -1;

        /* renamed from: N */
        public int f1476N = -1;

        /* renamed from: O */
        public int f1477O = -1;

        /* renamed from: P */
        public int f1478P = -1;

        /* renamed from: Q */
        public float f1479Q = -1.0f;

        /* renamed from: R */
        public float f1480R = -1.0f;

        /* renamed from: S */
        public int f1481S = 0;

        /* renamed from: T */
        public int f1482T = 0;

        /* renamed from: U */
        public int f1483U = 0;

        /* renamed from: V */
        public int f1484V = 0;

        /* renamed from: W */
        public int f1485W = -1;

        /* renamed from: X */
        public int f1486X = -1;

        /* renamed from: Y */
        public int f1487Y = -1;

        /* renamed from: Z */
        public int f1488Z = -1;

        /* renamed from: a0 */
        public float f1489a0 = 1.0f;

        /* renamed from: b */
        public boolean f1490b = false;

        /* renamed from: b0 */
        public float f1491b0 = 1.0f;

        /* renamed from: c */
        public boolean f1492c = false;

        /* renamed from: c0 */
        public int f1493c0 = -1;

        /* renamed from: d */
        public int f1494d;

        /* renamed from: d0 */
        public int f1495d0 = 0;

        /* renamed from: e */
        public int f1496e;

        /* renamed from: e0 */
        public int f1497e0 = -1;

        /* renamed from: f */
        public int f1498f = -1;

        /* renamed from: f0 */
        public int[] f1499f0;

        /* renamed from: g */
        public int f1500g = -1;

        /* renamed from: g0 */
        public String f1501g0;

        /* renamed from: h */
        public float f1502h = -1.0f;

        /* renamed from: h0 */
        public String f1503h0;

        /* renamed from: i */
        public int f1504i = -1;

        /* renamed from: i0 */
        public boolean f1505i0 = false;

        /* renamed from: j */
        public int f1506j = -1;

        /* renamed from: j0 */
        public boolean f1507j0 = false;

        /* renamed from: k */
        public int f1508k = -1;

        /* renamed from: k0 */
        public boolean f1509k0 = true;

        /* renamed from: l */
        public int f1510l = -1;

        /* renamed from: m */
        public int f1511m = -1;

        /* renamed from: n */
        public int f1512n = -1;

        /* renamed from: o */
        public int f1513o = -1;

        /* renamed from: p */
        public int f1514p = -1;

        /* renamed from: q */
        public int f1515q = -1;

        /* renamed from: r */
        public int f1516r = -1;

        /* renamed from: s */
        public int f1517s = -1;

        /* renamed from: t */
        public int f1518t = -1;

        /* renamed from: u */
        public int f1519u = -1;

        /* renamed from: v */
        public float f1520v = 0.5f;

        /* renamed from: w */
        public float f1521w = 0.5f;

        /* renamed from: x */
        public String f1522x = null;

        /* renamed from: y */
        public int f1523y = -1;

        /* renamed from: z */
        public int f1524z = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1462a = sparseIntArray;
            sparseIntArray.append(C0226i.f1603F3, 24);
            f1462a.append(C0226i.f1609G3, 25);
            f1462a.append(C0226i.f1621I3, 28);
            f1462a.append(C0226i.f1627J3, 29);
            f1462a.append(C0226i.f1657O3, 35);
            f1462a.append(C0226i.f1651N3, 34);
            f1462a.append(C0226i.f1835q3, 4);
            f1462a.append(C0226i.f1829p3, 3);
            f1462a.append(C0226i.f1817n3, 1);
            f1462a.append(C0226i.f1687T3, 6);
            f1462a.append(C0226i.f1693U3, 7);
            f1462a.append(C0226i.f1877x3, 17);
            f1462a.append(C0226i.f1883y3, 18);
            f1462a.append(C0226i.f1889z3, 19);
            f1462a.append(C0226i.f1716Y2, 26);
            f1462a.append(C0226i.f1633K3, 31);
            f1462a.append(C0226i.f1639L3, 32);
            f1462a.append(C0226i.f1871w3, 10);
            f1462a.append(C0226i.f1865v3, 9);
            f1462a.append(C0226i.f1711X3, 13);
            f1462a.append(C0226i.f1730a4, 16);
            f1462a.append(C0226i.f1717Y3, 14);
            f1462a.append(C0226i.f1699V3, 11);
            f1462a.append(C0226i.f1723Z3, 15);
            f1462a.append(C0226i.f1705W3, 12);
            f1462a.append(C0226i.f1675R3, 38);
            f1462a.append(C0226i.f1591D3, 37);
            f1462a.append(C0226i.f1585C3, 39);
            f1462a.append(C0226i.f1669Q3, 40);
            f1462a.append(C0226i.f1579B3, 20);
            f1462a.append(C0226i.f1663P3, 36);
            f1462a.append(C0226i.f1859u3, 5);
            f1462a.append(C0226i.f1597E3, 76);
            f1462a.append(C0226i.f1645M3, 76);
            f1462a.append(C0226i.f1615H3, 76);
            f1462a.append(C0226i.f1823o3, 76);
            f1462a.append(C0226i.f1811m3, 76);
            f1462a.append(C0226i.f1736b3, 23);
            f1462a.append(C0226i.f1750d3, 27);
            f1462a.append(C0226i.f1764f3, 30);
            f1462a.append(C0226i.f1771g3, 8);
            f1462a.append(C0226i.f1743c3, 33);
            f1462a.append(C0226i.f1757e3, 2);
            f1462a.append(C0226i.f1722Z2, 22);
            f1462a.append(C0226i.f1729a3, 21);
            f1462a.append(C0226i.f1841r3, 61);
            f1462a.append(C0226i.f1853t3, 62);
            f1462a.append(C0226i.f1847s3, 63);
            f1462a.append(C0226i.f1681S3, 69);
            f1462a.append(C0226i.f1573A3, 70);
            f1462a.append(C0226i.f1799k3, 71);
            f1462a.append(C0226i.f1785i3, 72);
            f1462a.append(C0226i.f1792j3, 73);
            f1462a.append(C0226i.f1805l3, 74);
            f1462a.append(C0226i.f1778h3, 75);
        }

        /* renamed from: a */
        public void mo1978a(C0220b bVar) {
            this.f1490b = bVar.f1490b;
            this.f1494d = bVar.f1494d;
            this.f1492c = bVar.f1492c;
            this.f1496e = bVar.f1496e;
            this.f1498f = bVar.f1498f;
            this.f1500g = bVar.f1500g;
            this.f1502h = bVar.f1502h;
            this.f1504i = bVar.f1504i;
            this.f1506j = bVar.f1506j;
            this.f1508k = bVar.f1508k;
            this.f1510l = bVar.f1510l;
            this.f1511m = bVar.f1511m;
            this.f1512n = bVar.f1512n;
            this.f1513o = bVar.f1513o;
            this.f1514p = bVar.f1514p;
            this.f1515q = bVar.f1515q;
            this.f1516r = bVar.f1516r;
            this.f1517s = bVar.f1517s;
            this.f1518t = bVar.f1518t;
            this.f1519u = bVar.f1519u;
            this.f1520v = bVar.f1520v;
            this.f1521w = bVar.f1521w;
            this.f1522x = bVar.f1522x;
            this.f1523y = bVar.f1523y;
            this.f1524z = bVar.f1524z;
            this.f1463A = bVar.f1463A;
            this.f1464B = bVar.f1464B;
            this.f1465C = bVar.f1465C;
            this.f1466D = bVar.f1466D;
            this.f1467E = bVar.f1467E;
            this.f1468F = bVar.f1468F;
            this.f1469G = bVar.f1469G;
            this.f1470H = bVar.f1470H;
            this.f1471I = bVar.f1471I;
            this.f1472J = bVar.f1472J;
            this.f1473K = bVar.f1473K;
            this.f1474L = bVar.f1474L;
            this.f1475M = bVar.f1475M;
            this.f1476N = bVar.f1476N;
            this.f1477O = bVar.f1477O;
            this.f1478P = bVar.f1478P;
            this.f1479Q = bVar.f1479Q;
            this.f1480R = bVar.f1480R;
            this.f1481S = bVar.f1481S;
            this.f1482T = bVar.f1482T;
            this.f1483U = bVar.f1483U;
            this.f1484V = bVar.f1484V;
            this.f1485W = bVar.f1485W;
            this.f1486X = bVar.f1486X;
            this.f1487Y = bVar.f1487Y;
            this.f1488Z = bVar.f1488Z;
            this.f1489a0 = bVar.f1489a0;
            this.f1491b0 = bVar.f1491b0;
            this.f1493c0 = bVar.f1493c0;
            this.f1495d0 = bVar.f1495d0;
            this.f1497e0 = bVar.f1497e0;
            this.f1503h0 = bVar.f1503h0;
            int[] iArr = bVar.f1499f0;
            if (iArr != null) {
                this.f1499f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1499f0 = null;
            }
            this.f1501g0 = bVar.f1501g0;
            this.f1505i0 = bVar.f1505i0;
            this.f1507j0 = bVar.f1507j0;
            this.f1509k0 = bVar.f1509k0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1979b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1710X2);
            this.f1492c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1462a.get(index);
                if (i2 == 80) {
                    this.f1505i0 = obtainStyledAttributes.getBoolean(index, this.f1505i0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1515q = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1515q);
                            break;
                        case 2:
                            this.f1470H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1470H);
                            break;
                        case 3:
                            this.f1514p = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1514p);
                            break;
                        case 4:
                            this.f1513o = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1513o);
                            break;
                        case 5:
                            this.f1522x = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1464B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1464B);
                            break;
                        case 7:
                            this.f1465C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1465C);
                            break;
                        case 8:
                            if (VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f1471I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1471I);
                                break;
                            }
                        case 9:
                            this.f1519u = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1519u);
                            break;
                        case 10:
                            this.f1518t = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1518t);
                            break;
                        case 11:
                            this.f1476N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1476N);
                            break;
                        case 12:
                            this.f1477O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1477O);
                            break;
                        case 13:
                            this.f1473K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1473K);
                            break;
                        case 14:
                            this.f1475M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1475M);
                            break;
                        case 15:
                            this.f1478P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1478P);
                            break;
                        case 16:
                            this.f1474L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1474L);
                            break;
                        case 17:
                            this.f1498f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1498f);
                            break;
                        case 18:
                            this.f1500g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1500g);
                            break;
                        case 19:
                            this.f1502h = obtainStyledAttributes.getFloat(index, this.f1502h);
                            break;
                        case 20:
                            this.f1520v = obtainStyledAttributes.getFloat(index, this.f1520v);
                            break;
                        case 21:
                            this.f1496e = obtainStyledAttributes.getLayoutDimension(index, this.f1496e);
                            break;
                        case 22:
                            this.f1494d = obtainStyledAttributes.getLayoutDimension(index, this.f1494d);
                            break;
                        case 23:
                            this.f1467E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1467E);
                            break;
                        case 24:
                            this.f1504i = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1504i);
                            break;
                        case 25:
                            this.f1506j = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1506j);
                            break;
                        case 26:
                            this.f1466D = obtainStyledAttributes.getInt(index, this.f1466D);
                            break;
                        case 27:
                            this.f1468F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1468F);
                            break;
                        case 28:
                            this.f1508k = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1508k);
                            break;
                        case 29:
                            this.f1510l = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1510l);
                            break;
                        case 30:
                            if (VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f1472J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1472J);
                                break;
                            }
                        case 31:
                            this.f1516r = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1516r);
                            break;
                        case 32:
                            this.f1517s = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1517s);
                            break;
                        case 33:
                            this.f1469G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1469G);
                            break;
                        case 34:
                            this.f1512n = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1512n);
                            break;
                        case 35:
                            this.f1511m = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1511m);
                            break;
                        case 36:
                            this.f1521w = obtainStyledAttributes.getFloat(index, this.f1521w);
                            break;
                        case 37:
                            this.f1480R = obtainStyledAttributes.getFloat(index, this.f1480R);
                            break;
                        case 38:
                            this.f1479Q = obtainStyledAttributes.getFloat(index, this.f1479Q);
                            break;
                        case 39:
                            this.f1481S = obtainStyledAttributes.getInt(index, this.f1481S);
                            break;
                        case 40:
                            this.f1482T = obtainStyledAttributes.getInt(index, this.f1482T);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1483U = obtainStyledAttributes.getInt(index, this.f1483U);
                                    break;
                                case 55:
                                    this.f1484V = obtainStyledAttributes.getInt(index, this.f1484V);
                                    break;
                                case 56:
                                    this.f1485W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1485W);
                                    break;
                                case 57:
                                    this.f1486X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1486X);
                                    break;
                                case 58:
                                    this.f1487Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1487Y);
                                    break;
                                case 59:
                                    this.f1488Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1488Z);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1523y = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1523y);
                                            break;
                                        case 62:
                                            this.f1524z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1524z);
                                            break;
                                        case 63:
                                            this.f1463A = obtainStyledAttributes.getFloat(index, this.f1463A);
                                            break;
                                        default:
                                            String str = "   ";
                                            String str2 = "ConstraintSet";
                                            switch (i2) {
                                                case 69:
                                                    this.f1489a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1491b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e(str2, "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f1493c0 = obtainStyledAttributes.getInt(index, this.f1493c0);
                                                    break;
                                                case 73:
                                                    this.f1495d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1495d0);
                                                    break;
                                                case 74:
                                                    this.f1501g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1509k0 = obtainStyledAttributes.getBoolean(index, this.f1509k0);
                                                    break;
                                                case 76:
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("unused attribute 0x");
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append(str);
                                                    sb.append(f1462a.get(index));
                                                    Log.w(str2, sb.toString());
                                                    break;
                                                case 77:
                                                    this.f1503h0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Unknown attribute 0x");
                                                    sb2.append(Integer.toHexString(index));
                                                    sb2.append(str);
                                                    sb2.append(f1462a.get(index));
                                                    Log.w(str2, sb2.toString());
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1507j0 = obtainStyledAttributes.getBoolean(index, this.f1507j0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* compiled from: ConstraintSet */
    public static class C0221c {

        /* renamed from: a */
        private static SparseIntArray f1525a;

        /* renamed from: b */
        public boolean f1526b = false;

        /* renamed from: c */
        public int f1527c = -1;

        /* renamed from: d */
        public String f1528d = null;

        /* renamed from: e */
        public int f1529e = -1;

        /* renamed from: f */
        public int f1530f = 0;

        /* renamed from: g */
        public float f1531g = Float.NaN;

        /* renamed from: h */
        public float f1532h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1525a = sparseIntArray;
            sparseIntArray.append(C0226i.f1806l4, 1);
            f1525a.append(C0226i.f1818n4, 2);
            f1525a.append(C0226i.f1824o4, 3);
            f1525a.append(C0226i.f1800k4, 4);
            f1525a.append(C0226i.f1793j4, 5);
            f1525a.append(C0226i.f1812m4, 6);
        }

        /* renamed from: a */
        public void mo1980a(C0221c cVar) {
            this.f1526b = cVar.f1526b;
            this.f1527c = cVar.f1527c;
            this.f1528d = cVar.f1528d;
            this.f1529e = cVar.f1529e;
            this.f1530f = cVar.f1530f;
            this.f1532h = cVar.f1532h;
            this.f1531g = cVar.f1531g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1981b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1786i4);
            this.f1526b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1525a.get(index)) {
                    case 1:
                        this.f1532h = obtainStyledAttributes.getFloat(index, this.f1532h);
                        break;
                    case 2:
                        this.f1529e = obtainStyledAttributes.getInt(index, this.f1529e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f1528d = Easing.f3974b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f1528d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f1530f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1527c = ConstraintSet.m1554o(obtainStyledAttributes, index, this.f1527c);
                        break;
                    case 6:
                        this.f1531g = obtainStyledAttributes.getFloat(index, this.f1531g);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* compiled from: ConstraintSet */
    public static class C0222d {

        /* renamed from: a */
        public boolean f1533a = false;

        /* renamed from: b */
        public int f1534b = 0;

        /* renamed from: c */
        public int f1535c = 0;

        /* renamed from: d */
        public float f1536d = 1.0f;

        /* renamed from: e */
        public float f1537e = Float.NaN;

        /* renamed from: a */
        public void mo1982a(C0222d dVar) {
            this.f1533a = dVar.f1533a;
            this.f1534b = dVar.f1534b;
            this.f1536d = dVar.f1536d;
            this.f1537e = dVar.f1537e;
            this.f1535c = dVar.f1535c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1983b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1878x4);
            this.f1533a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0226i.f1890z4) {
                    this.f1536d = obtainStyledAttributes.getFloat(index, this.f1536d);
                } else if (index == C0226i.f1884y4) {
                    this.f1534b = obtainStyledAttributes.getInt(index, this.f1534b);
                    this.f1534b = ConstraintSet.f1451a[this.f1534b];
                } else if (index == C0226i.f1580B4) {
                    this.f1535c = obtainStyledAttributes.getInt(index, this.f1535c);
                } else if (index == C0226i.f1574A4) {
                    this.f1537e = obtainStyledAttributes.getFloat(index, this.f1537e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* compiled from: ConstraintSet */
    public static class C0223e {

        /* renamed from: a */
        private static SparseIntArray f1538a;

        /* renamed from: b */
        public boolean f1539b = false;

        /* renamed from: c */
        public float f1540c = 0.0f;

        /* renamed from: d */
        public float f1541d = 0.0f;

        /* renamed from: e */
        public float f1542e = 0.0f;

        /* renamed from: f */
        public float f1543f = 1.0f;

        /* renamed from: g */
        public float f1544g = 1.0f;

        /* renamed from: h */
        public float f1545h = Float.NaN;

        /* renamed from: i */
        public float f1546i = Float.NaN;

        /* renamed from: j */
        public float f1547j = 0.0f;

        /* renamed from: k */
        public float f1548k = 0.0f;

        /* renamed from: l */
        public float f1549l = 0.0f;

        /* renamed from: m */
        public boolean f1550m = false;

        /* renamed from: n */
        public float f1551n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1538a = sparseIntArray;
            sparseIntArray.append(C0226i.f1700V4, 1);
            f1538a.append(C0226i.f1706W4, 2);
            f1538a.append(C0226i.f1712X4, 3);
            f1538a.append(C0226i.f1688T4, 4);
            f1538a.append(C0226i.f1694U4, 5);
            f1538a.append(C0226i.f1664P4, 6);
            f1538a.append(C0226i.f1670Q4, 7);
            f1538a.append(C0226i.f1676R4, 8);
            f1538a.append(C0226i.f1682S4, 9);
            f1538a.append(C0226i.f1718Y4, 10);
            f1538a.append(C0226i.f1724Z4, 11);
        }

        /* renamed from: a */
        public void mo1984a(C0223e eVar) {
            this.f1539b = eVar.f1539b;
            this.f1540c = eVar.f1540c;
            this.f1541d = eVar.f1541d;
            this.f1542e = eVar.f1542e;
            this.f1543f = eVar.f1543f;
            this.f1544g = eVar.f1544g;
            this.f1545h = eVar.f1545h;
            this.f1546i = eVar.f1546i;
            this.f1547j = eVar.f1547j;
            this.f1548k = eVar.f1548k;
            this.f1549l = eVar.f1549l;
            this.f1550m = eVar.f1550m;
            this.f1551n = eVar.f1551n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1985b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1658O4);
            this.f1539b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1538a.get(index)) {
                    case 1:
                        this.f1540c = obtainStyledAttributes.getFloat(index, this.f1540c);
                        break;
                    case 2:
                        this.f1541d = obtainStyledAttributes.getFloat(index, this.f1541d);
                        break;
                    case 3:
                        this.f1542e = obtainStyledAttributes.getFloat(index, this.f1542e);
                        break;
                    case 4:
                        this.f1543f = obtainStyledAttributes.getFloat(index, this.f1543f);
                        break;
                    case 5:
                        this.f1544g = obtainStyledAttributes.getFloat(index, this.f1544g);
                        break;
                    case 6:
                        this.f1545h = obtainStyledAttributes.getDimension(index, this.f1545h);
                        break;
                    case 7:
                        this.f1546i = obtainStyledAttributes.getDimension(index, this.f1546i);
                        break;
                    case 8:
                        this.f1547j = obtainStyledAttributes.getDimension(index, this.f1547j);
                        break;
                    case 9:
                        this.f1548k = obtainStyledAttributes.getDimension(index, this.f1548k);
                        break;
                    case 10:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1549l = obtainStyledAttributes.getDimension(index, this.f1549l);
                            break;
                        }
                    case 11:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1550m = true;
                            this.f1551n = obtainStyledAttributes.getDimension(index, this.f1551n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1452b = sparseIntArray;
        sparseIntArray.append(C0226i.f1856u0, 25);
        f1452b.append(C0226i.f1862v0, 26);
        f1452b.append(C0226i.f1874x0, 29);
        f1452b.append(C0226i.f1880y0, 30);
        f1452b.append(C0226i.f1594E0, 36);
        f1452b.append(C0226i.f1588D0, 35);
        f1452b.append(C0226i.f1740c0, 4);
        f1452b.append(C0226i.f1733b0, 3);
        f1452b.append(C0226i.f1719Z, 1);
        f1452b.append(C0226i.f1642M0, 6);
        f1452b.append(C0226i.f1648N0, 7);
        f1452b.append(C0226i.f1789j0, 17);
        f1452b.append(C0226i.f1796k0, 18);
        f1452b.append(C0226i.f1802l0, 19);
        f1452b.append(C0226i.f1843s, 27);
        f1452b.append(C0226i.f1886z0, 32);
        f1452b.append(C0226i.f1570A0, 33);
        f1452b.append(C0226i.f1782i0, 10);
        f1452b.append(C0226i.f1775h0, 9);
        f1452b.append(C0226i.f1666Q0, 13);
        f1452b.append(C0226i.f1684T0, 16);
        f1452b.append(C0226i.f1672R0, 14);
        f1452b.append(C0226i.f1654O0, 11);
        f1452b.append(C0226i.f1678S0, 15);
        f1452b.append(C0226i.f1660P0, 12);
        f1452b.append(C0226i.f1612H0, 40);
        f1452b.append(C0226i.f1844s0, 39);
        f1452b.append(C0226i.f1838r0, 41);
        f1452b.append(C0226i.f1606G0, 42);
        f1452b.append(C0226i.f1832q0, 20);
        f1452b.append(C0226i.f1600F0, 37);
        f1452b.append(C0226i.f1768g0, 5);
        f1452b.append(C0226i.f1850t0, 82);
        f1452b.append(C0226i.f1582C0, 82);
        f1452b.append(C0226i.f1868w0, 82);
        f1452b.append(C0226i.f1726a0, 82);
        f1452b.append(C0226i.f1713Y, 82);
        f1452b.append(C0226i.f1873x, 24);
        f1452b.append(C0226i.f1885z, 28);
        f1452b.append(C0226i.f1635L, 31);
        f1452b.append(C0226i.f1641M, 8);
        f1452b.append(C0226i.f1879y, 34);
        f1452b.append(C0226i.f1569A, 2);
        f1452b.append(C0226i.f1861v, 23);
        f1452b.append(C0226i.f1867w, 21);
        f1452b.append(C0226i.f1855u, 22);
        f1452b.append(C0226i.f1575B, 43);
        f1452b.append(C0226i.f1653O, 44);
        f1452b.append(C0226i.f1623J, 45);
        f1452b.append(C0226i.f1629K, 46);
        f1452b.append(C0226i.f1617I, 60);
        f1452b.append(C0226i.f1605G, 47);
        f1452b.append(C0226i.f1611H, 48);
        f1452b.append(C0226i.f1581C, 49);
        f1452b.append(C0226i.f1587D, 50);
        f1452b.append(C0226i.f1593E, 51);
        f1452b.append(C0226i.f1599F, 52);
        f1452b.append(C0226i.f1647N, 53);
        f1452b.append(C0226i.f1618I0, 54);
        f1452b.append(C0226i.f1808m0, 55);
        f1452b.append(C0226i.f1624J0, 56);
        f1452b.append(C0226i.f1814n0, 57);
        f1452b.append(C0226i.f1630K0, 58);
        f1452b.append(C0226i.f1820o0, 59);
        f1452b.append(C0226i.f1747d0, 61);
        f1452b.append(C0226i.f1761f0, 62);
        f1452b.append(C0226i.f1754e0, 63);
        f1452b.append(C0226i.f1659P, 64);
        f1452b.append(C0226i.f1708X0, 65);
        f1452b.append(C0226i.f1695V, 66);
        f1452b.append(C0226i.f1714Y0, 67);
        f1452b.append(C0226i.f1696V0, 79);
        f1452b.append(C0226i.f1849t, 38);
        f1452b.append(C0226i.f1690U0, 68);
        f1452b.append(C0226i.f1636L0, 69);
        f1452b.append(C0226i.f1826p0, 70);
        f1452b.append(C0226i.f1683T, 71);
        f1452b.append(C0226i.f1671R, 72);
        f1452b.append(C0226i.f1677S, 73);
        f1452b.append(C0226i.f1689U, 74);
        f1452b.append(C0226i.f1665Q, 75);
        f1452b.append(C0226i.f1702W0, 76);
        f1452b.append(C0226i.f1576B0, 77);
        f1452b.append(C0226i.f1720Z0, 78);
        f1452b.append(C0226i.f1707X, 80);
        f1452b.append(C0226i.f1701W, 81);
    }

    /* renamed from: j */
    private int[] m1551j(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0225h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object g = ((ConstraintLayout) view.getParent()).mo1905g(0, trim);
                if (g != null && (g instanceof Integer)) {
                    i = ((Integer) g).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: k */
    private C0219a m1552k(Context context, AttributeSet attributeSet) {
        C0219a aVar = new C0219a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0226i.f1837r);
        m1555p(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: l */
    private C0219a m1553l(int i) {
        if (!this.f1455e.containsKey(Integer.valueOf(i))) {
            this.f1455e.put(Integer.valueOf(i), new C0219a());
        }
        return (C0219a) this.f1455e.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static int m1554o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: p */
    private void m1555p(Context context, C0219a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0226i.f1849t || C0226i.f1635L == index || C0226i.f1641M == index)) {
                aVar.f1458c.f1526b = true;
                aVar.f1459d.f1492c = true;
                aVar.f1457b.f1533a = true;
                aVar.f1460e.f1539b = true;
            }
            String str = "   ";
            String str2 = "ConstraintSet";
            switch (f1452b.get(index)) {
                case 1:
                    C0220b bVar = aVar.f1459d;
                    bVar.f1515q = m1554o(typedArray, index, bVar.f1515q);
                    break;
                case 2:
                    C0220b bVar2 = aVar.f1459d;
                    bVar2.f1470H = typedArray.getDimensionPixelSize(index, bVar2.f1470H);
                    break;
                case 3:
                    C0220b bVar3 = aVar.f1459d;
                    bVar3.f1514p = m1554o(typedArray, index, bVar3.f1514p);
                    break;
                case 4:
                    C0220b bVar4 = aVar.f1459d;
                    bVar4.f1513o = m1554o(typedArray, index, bVar4.f1513o);
                    break;
                case 5:
                    aVar.f1459d.f1522x = typedArray.getString(index);
                    break;
                case 6:
                    C0220b bVar5 = aVar.f1459d;
                    bVar5.f1464B = typedArray.getDimensionPixelOffset(index, bVar5.f1464B);
                    break;
                case 7:
                    C0220b bVar6 = aVar.f1459d;
                    bVar6.f1465C = typedArray.getDimensionPixelOffset(index, bVar6.f1465C);
                    break;
                case 8:
                    if (VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0220b bVar7 = aVar.f1459d;
                        bVar7.f1471I = typedArray.getDimensionPixelSize(index, bVar7.f1471I);
                        break;
                    }
                case 9:
                    C0220b bVar8 = aVar.f1459d;
                    bVar8.f1519u = m1554o(typedArray, index, bVar8.f1519u);
                    break;
                case 10:
                    C0220b bVar9 = aVar.f1459d;
                    bVar9.f1518t = m1554o(typedArray, index, bVar9.f1518t);
                    break;
                case 11:
                    C0220b bVar10 = aVar.f1459d;
                    bVar10.f1476N = typedArray.getDimensionPixelSize(index, bVar10.f1476N);
                    break;
                case 12:
                    C0220b bVar11 = aVar.f1459d;
                    bVar11.f1477O = typedArray.getDimensionPixelSize(index, bVar11.f1477O);
                    break;
                case 13:
                    C0220b bVar12 = aVar.f1459d;
                    bVar12.f1473K = typedArray.getDimensionPixelSize(index, bVar12.f1473K);
                    break;
                case 14:
                    C0220b bVar13 = aVar.f1459d;
                    bVar13.f1475M = typedArray.getDimensionPixelSize(index, bVar13.f1475M);
                    break;
                case 15:
                    C0220b bVar14 = aVar.f1459d;
                    bVar14.f1478P = typedArray.getDimensionPixelSize(index, bVar14.f1478P);
                    break;
                case 16:
                    C0220b bVar15 = aVar.f1459d;
                    bVar15.f1474L = typedArray.getDimensionPixelSize(index, bVar15.f1474L);
                    break;
                case 17:
                    C0220b bVar16 = aVar.f1459d;
                    bVar16.f1498f = typedArray.getDimensionPixelOffset(index, bVar16.f1498f);
                    break;
                case 18:
                    C0220b bVar17 = aVar.f1459d;
                    bVar17.f1500g = typedArray.getDimensionPixelOffset(index, bVar17.f1500g);
                    break;
                case 19:
                    C0220b bVar18 = aVar.f1459d;
                    bVar18.f1502h = typedArray.getFloat(index, bVar18.f1502h);
                    break;
                case 20:
                    C0220b bVar19 = aVar.f1459d;
                    bVar19.f1520v = typedArray.getFloat(index, bVar19.f1520v);
                    break;
                case 21:
                    C0220b bVar20 = aVar.f1459d;
                    bVar20.f1496e = typedArray.getLayoutDimension(index, bVar20.f1496e);
                    break;
                case 22:
                    C0222d dVar = aVar.f1457b;
                    dVar.f1534b = typedArray.getInt(index, dVar.f1534b);
                    C0222d dVar2 = aVar.f1457b;
                    dVar2.f1534b = f1451a[dVar2.f1534b];
                    break;
                case 23:
                    C0220b bVar21 = aVar.f1459d;
                    bVar21.f1494d = typedArray.getLayoutDimension(index, bVar21.f1494d);
                    break;
                case 24:
                    C0220b bVar22 = aVar.f1459d;
                    bVar22.f1467E = typedArray.getDimensionPixelSize(index, bVar22.f1467E);
                    break;
                case 25:
                    C0220b bVar23 = aVar.f1459d;
                    bVar23.f1504i = m1554o(typedArray, index, bVar23.f1504i);
                    break;
                case 26:
                    C0220b bVar24 = aVar.f1459d;
                    bVar24.f1506j = m1554o(typedArray, index, bVar24.f1506j);
                    break;
                case 27:
                    C0220b bVar25 = aVar.f1459d;
                    bVar25.f1466D = typedArray.getInt(index, bVar25.f1466D);
                    break;
                case 28:
                    C0220b bVar26 = aVar.f1459d;
                    bVar26.f1468F = typedArray.getDimensionPixelSize(index, bVar26.f1468F);
                    break;
                case 29:
                    C0220b bVar27 = aVar.f1459d;
                    bVar27.f1508k = m1554o(typedArray, index, bVar27.f1508k);
                    break;
                case 30:
                    C0220b bVar28 = aVar.f1459d;
                    bVar28.f1510l = m1554o(typedArray, index, bVar28.f1510l);
                    break;
                case 31:
                    if (VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0220b bVar29 = aVar.f1459d;
                        bVar29.f1472J = typedArray.getDimensionPixelSize(index, bVar29.f1472J);
                        break;
                    }
                case 32:
                    C0220b bVar30 = aVar.f1459d;
                    bVar30.f1516r = m1554o(typedArray, index, bVar30.f1516r);
                    break;
                case 33:
                    C0220b bVar31 = aVar.f1459d;
                    bVar31.f1517s = m1554o(typedArray, index, bVar31.f1517s);
                    break;
                case 34:
                    C0220b bVar32 = aVar.f1459d;
                    bVar32.f1469G = typedArray.getDimensionPixelSize(index, bVar32.f1469G);
                    break;
                case 35:
                    C0220b bVar33 = aVar.f1459d;
                    bVar33.f1512n = m1554o(typedArray, index, bVar33.f1512n);
                    break;
                case 36:
                    C0220b bVar34 = aVar.f1459d;
                    bVar34.f1511m = m1554o(typedArray, index, bVar34.f1511m);
                    break;
                case 37:
                    C0220b bVar35 = aVar.f1459d;
                    bVar35.f1521w = typedArray.getFloat(index, bVar35.f1521w);
                    break;
                case 38:
                    aVar.f1456a = typedArray.getResourceId(index, aVar.f1456a);
                    break;
                case 39:
                    C0220b bVar36 = aVar.f1459d;
                    bVar36.f1480R = typedArray.getFloat(index, bVar36.f1480R);
                    break;
                case 40:
                    C0220b bVar37 = aVar.f1459d;
                    bVar37.f1479Q = typedArray.getFloat(index, bVar37.f1479Q);
                    break;
                case 41:
                    C0220b bVar38 = aVar.f1459d;
                    bVar38.f1481S = typedArray.getInt(index, bVar38.f1481S);
                    break;
                case 42:
                    C0220b bVar39 = aVar.f1459d;
                    bVar39.f1482T = typedArray.getInt(index, bVar39.f1482T);
                    break;
                case 43:
                    C0222d dVar3 = aVar.f1457b;
                    dVar3.f1536d = typedArray.getFloat(index, dVar3.f1536d);
                    break;
                case 44:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0223e eVar = aVar.f1460e;
                        eVar.f1550m = true;
                        eVar.f1551n = typedArray.getDimension(index, eVar.f1551n);
                        break;
                    }
                case 45:
                    C0223e eVar2 = aVar.f1460e;
                    eVar2.f1541d = typedArray.getFloat(index, eVar2.f1541d);
                    break;
                case 46:
                    C0223e eVar3 = aVar.f1460e;
                    eVar3.f1542e = typedArray.getFloat(index, eVar3.f1542e);
                    break;
                case 47:
                    C0223e eVar4 = aVar.f1460e;
                    eVar4.f1543f = typedArray.getFloat(index, eVar4.f1543f);
                    break;
                case 48:
                    C0223e eVar5 = aVar.f1460e;
                    eVar5.f1544g = typedArray.getFloat(index, eVar5.f1544g);
                    break;
                case 49:
                    C0223e eVar6 = aVar.f1460e;
                    eVar6.f1545h = typedArray.getDimension(index, eVar6.f1545h);
                    break;
                case 50:
                    C0223e eVar7 = aVar.f1460e;
                    eVar7.f1546i = typedArray.getDimension(index, eVar7.f1546i);
                    break;
                case 51:
                    C0223e eVar8 = aVar.f1460e;
                    eVar8.f1547j = typedArray.getDimension(index, eVar8.f1547j);
                    break;
                case 52:
                    C0223e eVar9 = aVar.f1460e;
                    eVar9.f1548k = typedArray.getDimension(index, eVar9.f1548k);
                    break;
                case 53:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0223e eVar10 = aVar.f1460e;
                        eVar10.f1549l = typedArray.getDimension(index, eVar10.f1549l);
                        break;
                    }
                case 54:
                    C0220b bVar40 = aVar.f1459d;
                    bVar40.f1483U = typedArray.getInt(index, bVar40.f1483U);
                    break;
                case 55:
                    C0220b bVar41 = aVar.f1459d;
                    bVar41.f1484V = typedArray.getInt(index, bVar41.f1484V);
                    break;
                case 56:
                    C0220b bVar42 = aVar.f1459d;
                    bVar42.f1485W = typedArray.getDimensionPixelSize(index, bVar42.f1485W);
                    break;
                case 57:
                    C0220b bVar43 = aVar.f1459d;
                    bVar43.f1486X = typedArray.getDimensionPixelSize(index, bVar43.f1486X);
                    break;
                case 58:
                    C0220b bVar44 = aVar.f1459d;
                    bVar44.f1487Y = typedArray.getDimensionPixelSize(index, bVar44.f1487Y);
                    break;
                case 59:
                    C0220b bVar45 = aVar.f1459d;
                    bVar45.f1488Z = typedArray.getDimensionPixelSize(index, bVar45.f1488Z);
                    break;
                case 60:
                    C0223e eVar11 = aVar.f1460e;
                    eVar11.f1540c = typedArray.getFloat(index, eVar11.f1540c);
                    break;
                case 61:
                    C0220b bVar46 = aVar.f1459d;
                    bVar46.f1523y = m1554o(typedArray, index, bVar46.f1523y);
                    break;
                case 62:
                    C0220b bVar47 = aVar.f1459d;
                    bVar47.f1524z = typedArray.getDimensionPixelSize(index, bVar47.f1524z);
                    break;
                case 63:
                    C0220b bVar48 = aVar.f1459d;
                    bVar48.f1463A = typedArray.getFloat(index, bVar48.f1463A);
                    break;
                case 64:
                    C0221c cVar = aVar.f1458c;
                    cVar.f1527c = m1554o(typedArray, index, cVar.f1527c);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f1458c.f1528d = Easing.f3974b[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f1458c.f1528d = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f1458c.f1530f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0221c cVar2 = aVar.f1458c;
                    cVar2.f1532h = typedArray.getFloat(index, cVar2.f1532h);
                    break;
                case 68:
                    C0222d dVar4 = aVar.f1457b;
                    dVar4.f1537e = typedArray.getFloat(index, dVar4.f1537e);
                    break;
                case 69:
                    aVar.f1459d.f1489a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1459d.f1491b0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(str2, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0220b bVar49 = aVar.f1459d;
                    bVar49.f1493c0 = typedArray.getInt(index, bVar49.f1493c0);
                    break;
                case 73:
                    C0220b bVar50 = aVar.f1459d;
                    bVar50.f1495d0 = typedArray.getDimensionPixelSize(index, bVar50.f1495d0);
                    break;
                case 74:
                    aVar.f1459d.f1501g0 = typedArray.getString(index);
                    break;
                case 75:
                    C0220b bVar51 = aVar.f1459d;
                    bVar51.f1509k0 = typedArray.getBoolean(index, bVar51.f1509k0);
                    break;
                case 76:
                    C0221c cVar3 = aVar.f1458c;
                    cVar3.f1529e = typedArray.getInt(index, cVar3.f1529e);
                    break;
                case 77:
                    aVar.f1459d.f1503h0 = typedArray.getString(index);
                    break;
                case 78:
                    C0222d dVar5 = aVar.f1457b;
                    dVar5.f1535c = typedArray.getInt(index, dVar5.f1535c);
                    break;
                case 79:
                    C0221c cVar4 = aVar.f1458c;
                    cVar4.f1531g = typedArray.getFloat(index, cVar4.f1531g);
                    break;
                case 80:
                    C0220b bVar52 = aVar.f1459d;
                    bVar52.f1505i0 = typedArray.getBoolean(index, bVar52.f1505i0);
                    break;
                case 81:
                    C0220b bVar53 = aVar.f1459d;
                    bVar53.f1507j0 = typedArray.getBoolean(index, bVar53.f1507j0);
                    break;
                case 82:
                    StringBuilder sb = new StringBuilder();
                    sb.append("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append(str);
                    sb.append(f1452b.get(index));
                    Log.w(str2, sb.toString());
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append(str);
                    sb2.append(f1452b.get(index));
                    Log.w(str2, sb2.toString());
                    break;
            }
        }
    }

    /* renamed from: c */
    public void mo1966c(ConstraintLayout constraintLayout) {
        mo1967d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1967d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1455e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            String str = "ConstraintSet";
            if (!this.f1455e.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(Debug.m4527a(childAt));
                Log.w(str, sb.toString());
            } else if (this.f1454d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1455e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0219a aVar = (C0219a) this.f1455e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1459d.f1497e0 = 1;
                    }
                    int i2 = aVar.f1459d.f1497e0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1459d.f1493c0);
                        barrier.setMargin(aVar.f1459d.f1495d0);
                        barrier.setAllowsGoneWidget(aVar.f1459d.f1509k0);
                        C0220b bVar = aVar.f1459d;
                        int[] iArr = bVar.f1499f0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = bVar.f1501g0;
                            if (str2 != null) {
                                bVar.f1499f0 = m1551j(barrier, str2);
                                barrier.setReferencedIds(aVar.f1459d.f1499f0);
                            }
                        }
                    }
                    C0212b bVar2 = (C0212b) childAt.getLayoutParams();
                    bVar2.mo1937a();
                    aVar.mo1976d(bVar2);
                    if (z) {
                        ConstraintAttribute.m1529c(childAt, aVar.f1461f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0222d dVar = aVar.f1457b;
                    if (dVar.f1535c == 0) {
                        childAt.setVisibility(dVar.f1534b);
                    }
                    int i3 = VERSION.SDK_INT;
                    if (i3 >= 17) {
                        childAt.setAlpha(aVar.f1457b.f1536d);
                        childAt.setRotation(aVar.f1460e.f1540c);
                        childAt.setRotationX(aVar.f1460e.f1541d);
                        childAt.setRotationY(aVar.f1460e.f1542e);
                        childAt.setScaleX(aVar.f1460e.f1543f);
                        childAt.setScaleY(aVar.f1460e.f1544g);
                        if (!Float.isNaN(aVar.f1460e.f1545h)) {
                            childAt.setPivotX(aVar.f1460e.f1545h);
                        }
                        if (!Float.isNaN(aVar.f1460e.f1546i)) {
                            childAt.setPivotY(aVar.f1460e.f1546i);
                        }
                        childAt.setTranslationX(aVar.f1460e.f1547j);
                        childAt.setTranslationY(aVar.f1460e.f1548k);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(aVar.f1460e.f1549l);
                            C0223e eVar = aVar.f1460e;
                            if (eVar.f1550m) {
                                childAt.setElevation(eVar.f1551n);
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                    Log.v(str, sb2.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0219a aVar2 = (C0219a) this.f1455e.get(num);
            int i4 = aVar2.f1459d.f1497e0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0220b bVar3 = aVar2.f1459d;
                int[] iArr2 = bVar3.f1499f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar3.f1501g0;
                    if (str3 != null) {
                        bVar3.f1499f0 = m1551j(barrier2, str3);
                        barrier2.setReferencedIds(aVar2.f1459d.f1499f0);
                    }
                }
                barrier2.setType(aVar2.f1459d.f1493c0);
                barrier2.setMargin(aVar2.f1459d.f1495d0);
                C0212b e = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo1956n();
                aVar2.mo1976d(e);
                constraintLayout.addView(barrier2, e);
            }
            if (aVar2.f1459d.f1490b) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0212b e2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo1976d(e2);
                constraintLayout.addView(guideline, e2);
            }
        }
    }

    /* renamed from: e */
    public void mo1968e(int i, int i2) {
        if (this.f1455e.containsKey(Integer.valueOf(i))) {
            C0219a aVar = (C0219a) this.f1455e.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0220b bVar = aVar.f1459d;
                    bVar.f1506j = -1;
                    bVar.f1504i = -1;
                    bVar.f1467E = -1;
                    bVar.f1473K = -1;
                    return;
                case 2:
                    C0220b bVar2 = aVar.f1459d;
                    bVar2.f1510l = -1;
                    bVar2.f1508k = -1;
                    bVar2.f1468F = -1;
                    bVar2.f1475M = -1;
                    return;
                case 3:
                    C0220b bVar3 = aVar.f1459d;
                    bVar3.f1512n = -1;
                    bVar3.f1511m = -1;
                    bVar3.f1469G = -1;
                    bVar3.f1474L = -1;
                    return;
                case 4:
                    C0220b bVar4 = aVar.f1459d;
                    bVar4.f1513o = -1;
                    bVar4.f1514p = -1;
                    bVar4.f1470H = -1;
                    bVar4.f1476N = -1;
                    return;
                case 5:
                    aVar.f1459d.f1515q = -1;
                    return;
                case 6:
                    C0220b bVar5 = aVar.f1459d;
                    bVar5.f1516r = -1;
                    bVar5.f1517s = -1;
                    bVar5.f1472J = -1;
                    bVar5.f1478P = -1;
                    return;
                case 7:
                    C0220b bVar6 = aVar.f1459d;
                    bVar6.f1518t = -1;
                    bVar6.f1519u = -1;
                    bVar6.f1471I = -1;
                    bVar6.f1477O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: f */
    public void mo1969f(Context context, int i) {
        mo1970g((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    /* renamed from: g */
    public void mo1970g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1455e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0212b bVar = (C0212b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1454d || id != -1) {
                if (!this.f1455e.containsKey(Integer.valueOf(id))) {
                    this.f1455e.put(Integer.valueOf(id), new C0219a());
                }
                C0219a aVar = (C0219a) this.f1455e.get(Integer.valueOf(id));
                aVar.f1461f = ConstraintAttribute.m1527a(this.f1453c, childAt);
                aVar.m1568f(id, bVar);
                aVar.f1457b.f1534b = childAt.getVisibility();
                int i2 = VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.f1457b.f1536d = childAt.getAlpha();
                    aVar.f1460e.f1540c = childAt.getRotation();
                    aVar.f1460e.f1541d = childAt.getRotationX();
                    aVar.f1460e.f1542e = childAt.getRotationY();
                    aVar.f1460e.f1543f = childAt.getScaleX();
                    aVar.f1460e.f1544g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0223e eVar = aVar.f1460e;
                        eVar.f1545h = pivotX;
                        eVar.f1546i = pivotY;
                    }
                    aVar.f1460e.f1547j = childAt.getTranslationX();
                    aVar.f1460e.f1548k = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.f1460e.f1549l = childAt.getTranslationZ();
                        C0223e eVar2 = aVar.f1460e;
                        if (eVar2.f1550m) {
                            eVar2.f1551n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1459d.f1509k0 = barrier.mo1893o();
                    aVar.f1459d.f1499f0 = barrier.getReferencedIds();
                    aVar.f1459d.f1493c0 = barrier.getType();
                    aVar.f1459d.f1495d0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: h */
    public void mo1971h(Constraints eVar) {
        int childCount = eVar.getChildCount();
        this.f1455e.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0224a aVar = (C0224a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1454d || id != -1) {
                if (!this.f1455e.containsKey(Integer.valueOf(id))) {
                    this.f1455e.put(Integer.valueOf(id), new C0219a());
                }
                C0219a aVar2 = (C0219a) this.f1455e.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar2.m1570h((ConstraintHelper) childAt, id, aVar);
                }
                aVar2.m1569g(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: i */
    public void mo1972i(int i, int i2, int i3, float f) {
        C0220b bVar = m1553l(i).f1459d;
        bVar.f1523y = i2;
        bVar.f1524z = i3;
        bVar.f1463A = f;
    }

    /* renamed from: m */
    public void mo1973m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0219a k = m1552k(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        k.f1459d.f1490b = true;
                    }
                    this.f1455e.put(Integer.valueOf(k.f1456a), k);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0179, code lost:
        continue;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1974n(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1455e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.f1456a     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f1461f     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.ConstraintAttribute.m1528b(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.d$c r0 = r2.f1458c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo1981b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.d$b r0 = r2.f1459d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo1979b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.d$e r0 = r2.f1460e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo1985b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.d$d r0 = r2.f1457b     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.mo1983b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1552k(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1459d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1497e0 = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1552k(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1459d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1490b = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f1492c = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.m1552k(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.mo1974n(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
