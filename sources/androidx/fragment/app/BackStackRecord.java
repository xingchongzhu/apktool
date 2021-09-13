package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Lifecycle.C0378c;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
final class BackStackRecord extends FragmentTransaction implements C0345o {

    /* renamed from: t */
    final FragmentManager f2224t;

    /* renamed from: u */
    boolean f2225u;

    /* renamed from: v */
    int f2226v;

    BackStackRecord(FragmentManager nVar) {
        super(nVar.mo2817r0(), nVar.mo2822u0() != null ? nVar.mo2822u0().mo2721i().getClassLoader() : null);
        this.f2226v = -1;
        this.f2224t = nVar;
    }

    /* renamed from: F */
    private static boolean m2167F(C0353a aVar) {
        Fragment fragment = aVar.f2528b;
        return fragment != null && fragment.f2165m && fragment.f2135K != null && !fragment.f2128B && !fragment.f2127A && fragment.mo2481x0();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo2506A(boolean z) {
        for (int size = this.f2510c.size() - 1; size >= 0; size--) {
            C0353a aVar = (C0353a) this.f2510c.get(size);
            Fragment fragment = aVar.f2528b;
            if (fragment != null) {
                fragment.mo2428d2(true);
                fragment.mo2422b2(FragmentManager.m2427h1(this.f2515h));
                fragment.mo2438g2(this.f2524q, this.f2523p);
            }
            switch (aVar.f2527a) {
                case 1:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, true);
                    this.f2224t.mo2789c1(fragment);
                    break;
                case 3:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2793g(fragment);
                    break;
                case 4:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2815p1(fragment);
                    break;
                case 5:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, true);
                    this.f2224t.mo2749D0(fragment);
                    break;
                case 6:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2806l(fragment);
                    break;
                case 7:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, true);
                    this.f2224t.mo2827y(fragment);
                    break;
                case 8:
                    this.f2224t.mo2811n1(null);
                    break;
                case 9:
                    this.f2224t.mo2811n1(fragment);
                    break;
                case 10:
                    this.f2224t.mo2810m1(fragment, aVar.f2533g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2527a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!this.f2525r && aVar.f2527a != 3 && fragment != null && !FragmentManager.f2397b) {
                this.f2224t.mo2767O0(fragment);
            }
        }
        if (!this.f2525r && z && !FragmentManager.f2397b) {
            FragmentManager nVar = this.f2224t;
            nVar.mo2769P0(nVar.f2430s, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public Fragment mo2507B(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2510c.size()) {
            C0353a aVar = (C0353a) this.f2510c.get(i);
            int i2 = aVar.f2527a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2528b;
                    int i3 = fragment3.f2177y;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList2.get(size);
                        if (fragment4.f2177y == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2510c.add(i, new C0353a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0353a aVar2 = new C0353a(3, fragment4);
                                aVar2.f2529c = aVar.f2529c;
                                aVar2.f2531e = aVar.f2531e;
                                aVar2.f2530d = aVar.f2530d;
                                aVar2.f2532f = aVar.f2532f;
                                this.f2510c.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2510c.remove(i);
                        i--;
                    } else {
                        aVar.f2527a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2528b);
                    Fragment fragment5 = aVar.f2528b;
                    if (fragment5 == fragment2) {
                        this.f2510c.add(i, new C0353a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2510c.add(i, new C0353a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2528b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2528b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: C */
    public String mo2508C() {
        return this.f2518k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public boolean mo2509D(int i) {
        int size = this.f2510c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C0353a) this.f2510c.get(i2)).f2528b;
            int i3 = fragment != null ? fragment.f2177y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo2510E(ArrayList<BackStackRecord> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2510c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C0353a) this.f2510c.get(i4)).f2528b;
            int i5 = fragment != null ? fragment.f2177y : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    BackStackRecord aVar = (BackStackRecord) arrayList.get(i6);
                    int size2 = aVar.f2510c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C0353a) aVar.f2510c.get(i7)).f2528b;
                        if ((fragment2 != null ? fragment2.f2177y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo2511G() {
        for (int i = 0; i < this.f2510c.size(); i++) {
            if (m2167F((C0353a) this.f2510c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public void mo2512H() {
        if (this.f2526s != null) {
            for (int i = 0; i < this.f2526s.size(); i++) {
                ((Runnable) this.f2526s.get(i)).run();
            }
            this.f2526s = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public void mo2513I(C0285k kVar) {
        for (int i = 0; i < this.f2510c.size(); i++) {
            C0353a aVar = (C0353a) this.f2510c.get(i);
            if (m2167F(aVar)) {
                aVar.f2528b.mo2425c2(kVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public Fragment mo2514J(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2510c.size() - 1; size >= 0; size--) {
            C0353a aVar = (C0353a) this.f2510c.get(size);
            int i = aVar.f2527a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2528b;
                            break;
                        case 10:
                            aVar.f2534h = aVar.f2533g;
                            break;
                    }
                }
                arrayList.add(aVar.f2528b);
            }
            arrayList.remove(aVar.f2528b);
        }
        return fragment;
    }

    /* renamed from: a */
    public boolean mo2515a(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f2516i) {
            this.f2224t.mo2790e(this);
        }
        return true;
    }

    /* renamed from: h */
    public int mo2516h() {
        return mo2526w(false);
    }

    /* renamed from: i */
    public int mo2517i() {
        return mo2526w(true);
    }

    /* renamed from: j */
    public void mo2518j() {
        mo2941m();
        this.f2224t.mo2788c0(this, false);
    }

    /* renamed from: k */
    public void mo2519k() {
        mo2941m();
        this.f2224t.mo2788c0(this, true);
    }

    /* renamed from: l */
    public FragmentTransaction mo2520l(Fragment fragment) {
        FragmentManager nVar = fragment.f2172t;
        if (nVar == null || nVar == this.f2224t) {
            return super.mo2520l(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2521n(int i, Fragment fragment, String str, int i2) {
        super.mo2521n(i, fragment, str, i2);
        fragment.f2172t = this.f2224t;
    }

    /* renamed from: o */
    public FragmentTransaction mo2522o(Fragment fragment) {
        FragmentManager nVar = fragment.f2172t;
        if (nVar == null || nVar == this.f2224t) {
            return super.mo2522o(fragment);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: t */
    public FragmentTransaction mo2523t(Fragment fragment, C0378c cVar) {
        if (fragment.f2172t == this.f2224t) {
            String str = "Cannot set maximum Lifecycle to ";
            if (cVar == C0378c.INITIALIZED && fragment.f2152b > -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(cVar);
                sb.append(" after the Fragment has been created");
                throw new IllegalArgumentException(sb.toString());
            } else if (cVar != C0378c.DESTROYED) {
                return super.mo2523t(fragment, cVar);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(cVar);
                sb2.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb3.append(this.f2224t);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2226v >= 0) {
            sb.append(" #");
            sb.append(this.f2226v);
        }
        if (this.f2518k != null) {
            sb.append(" ");
            sb.append(this.f2518k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo2525v(int i) {
        if (this.f2516i) {
            String str = "FragmentManager";
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f2510c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0353a aVar = (C0353a) this.f2510c.get(i2);
                Fragment fragment = aVar.f2528b;
                if (fragment != null) {
                    fragment.f2171s += i;
                    if (FragmentManager.m2408G0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f2528b);
                        sb2.append(" to ");
                        sb2.append(aVar.f2528b.f2171s);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public int mo2526w(boolean z) {
        if (!this.f2225u) {
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new LogWriter(str));
                mo2527x("  ", printWriter);
                printWriter.close();
            }
            this.f2225u = true;
            if (this.f2516i) {
                this.f2226v = this.f2224t.mo2801j();
            } else {
                this.f2226v = -1;
            }
            this.f2224t.mo2784Z(this, z);
            return this.f2226v;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: x */
    public void mo2527x(String str, PrintWriter printWriter) {
        mo2528y(str, printWriter, true);
    }

    /* renamed from: y */
    public void mo2528y(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2518k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2226v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2225u);
            if (this.f2515h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2515h));
            }
            if (!(this.f2511d == 0 && this.f2512e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2511d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2512e));
            }
            if (!(this.f2513f == 0 && this.f2514g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2513f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2514g));
            }
            if (!(this.f2519l == 0 && this.f2520m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2519l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2520m);
            }
            if (!(this.f2521n == 0 && this.f2522o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2521n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2522o);
            }
        }
        if (!this.f2510c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2510c.size();
            for (int i = 0; i < size; i++) {
                C0353a aVar = (C0353a) this.f2510c.get(i);
                switch (aVar.f2527a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.f2527a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2528b);
                if (z) {
                    if (!(aVar.f2529c == 0 && aVar.f2530d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2529c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2530d));
                    }
                    if (aVar.f2531e != 0 || aVar.f2532f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2531e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2532f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo2529z() {
        int size = this.f2510c.size();
        for (int i = 0; i < size; i++) {
            C0353a aVar = (C0353a) this.f2510c.get(i);
            Fragment fragment = aVar.f2528b;
            if (fragment != null) {
                fragment.mo2428d2(false);
                fragment.mo2422b2(this.f2515h);
                fragment.mo2438g2(this.f2523p, this.f2524q);
            }
            switch (aVar.f2527a) {
                case 1:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, false);
                    this.f2224t.mo2793g(fragment);
                    break;
                case 3:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2789c1(fragment);
                    break;
                case 4:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2749D0(fragment);
                    break;
                case 5:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, false);
                    this.f2224t.mo2815p1(fragment);
                    break;
                case 6:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2827y(fragment);
                    break;
                case 7:
                    fragment.mo2401U1(aVar.f2529c, aVar.f2530d, aVar.f2531e, aVar.f2532f);
                    this.f2224t.mo2807l1(fragment, false);
                    this.f2224t.mo2806l(fragment);
                    break;
                case 8:
                    this.f2224t.mo2811n1(fragment);
                    break;
                case 9:
                    this.f2224t.mo2811n1(null);
                    break;
                case 10:
                    this.f2224t.mo2810m1(fragment, aVar.f2534h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2527a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!this.f2525r && aVar.f2527a != 1 && fragment != null && !FragmentManager.f2397b) {
                this.f2224t.mo2767O0(fragment);
            }
        }
        if (!this.f2525r && !FragmentManager.f2397b) {
            FragmentManager nVar = this.f2224t;
            nVar.mo2769P0(nVar.f2430s, true);
        }
    }
}
