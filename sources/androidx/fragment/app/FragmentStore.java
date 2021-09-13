package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.w */
class FragmentStore {

    /* renamed from: a */
    private final ArrayList<Fragment> f2505a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, FragmentStateManager> f2506b = new HashMap<>();

    /* renamed from: c */
    private FragmentManagerViewModel f2507c;

    FragmentStore() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2911a(Fragment fragment) {
        if (!this.f2505a.contains(fragment)) {
            synchronized (this.f2505a) {
                this.f2505a.add(fragment);
            }
            fragment.f2165m = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2912b() {
        this.f2506b.values().removeAll(Collections.singleton(null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2913c(String str) {
        return this.f2506b.get(str) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2914d(int i) {
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                uVar.mo2897u(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2915e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.f2506b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (FragmentStateManager uVar : this.f2506b.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment k = uVar.mo2889k();
                    printWriter.println(k);
                    k.mo2480x(sb2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2505a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2505a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Fragment mo2916f(String str) {
        FragmentStateManager uVar = (FragmentStateManager) this.f2506b.get(str);
        if (uVar != null) {
            return uVar.mo2889k();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Fragment mo2917g(int i) {
        for (int size = this.f2505a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2505a.get(size);
            if (fragment != null && fragment.f2176x == i) {
                return fragment;
            }
        }
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                Fragment k = uVar.mo2889k();
                if (k.f2176x == i) {
                    return k;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Fragment mo2918h(String str) {
        if (str != null) {
            for (int size = this.f2505a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2505a.get(size);
                if (fragment != null && str.equals(fragment.f2178z)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (FragmentStateManager uVar : this.f2506b.values()) {
                if (uVar != null) {
                    Fragment k = uVar.mo2889k();
                    if (str.equals(k.f2178z)) {
                        return k;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Fragment mo2919i(String str) {
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                Fragment z = uVar.mo2889k().mo2485z(str);
                if (z != null) {
                    return z;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo2920j(Fragment fragment) {
        ViewGroup viewGroup = fragment.f2134J;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2505a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = (Fragment) this.f2505a.get(i);
            if (fragment2.f2134J == viewGroup) {
                View view = fragment2.f2135K;
                if (view != null) {
                    return viewGroup.indexOfChild(view) + 1;
                }
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2505a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f2505a.get(indexOf);
            if (fragment3.f2134J == viewGroup) {
                View view2 = fragment3.f2135K;
                if (view2 != null) {
                    return viewGroup.indexOfChild(view2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public List<FragmentStateManager> mo2921k() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public List<Fragment> mo2922l() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                arrayList.add(uVar.mo2889k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public FragmentStateManager mo2923m(String str) {
        return (FragmentStateManager) this.f2506b.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public List<Fragment> mo2924n() {
        ArrayList arrayList;
        if (this.f2505a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2505a) {
            arrayList = new ArrayList(this.f2505a);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public FragmentManagerViewModel mo2925o() {
        return this.f2507c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo2926p(FragmentStateManager uVar) {
        Fragment k = uVar.mo2889k();
        if (!mo2913c(k.f2159g)) {
            this.f2506b.put(k.f2159g, uVar);
            if (k.f2130D) {
                if (k.f2129C) {
                    this.f2507c.mo2857e(k);
                } else {
                    this.f2507c.mo2866m(k);
                }
                k.f2130D = false;
            }
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(k);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo2927q(FragmentStateManager uVar) {
        Fragment k = uVar.mo2889k();
        if (k.f2129C) {
            this.f2507c.mo2866m(k);
        }
        if (((FragmentStateManager) this.f2506b.put(k.f2159g, null)) != null && FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo2928r() {
        Iterator it = this.f2505a.iterator();
        while (it.hasNext()) {
            FragmentStateManager uVar = (FragmentStateManager) this.f2506b.get(((Fragment) it.next()).f2159g);
            if (uVar != null) {
                uVar.mo2890m();
            }
        }
        for (FragmentStateManager uVar2 : this.f2506b.values()) {
            if (uVar2 != null) {
                uVar2.mo2890m();
                Fragment k = uVar2.mo2889k();
                if (k.f2166n && !k.mo2475v0()) {
                    mo2927q(uVar2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo2929s(Fragment fragment) {
        synchronized (this.f2505a) {
            this.f2505a.remove(fragment);
        }
        fragment.f2165m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo2930t() {
        this.f2506b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2931u(List<String> list) {
        this.f2505a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f = mo2916f(str);
                if (f != null) {
                    if (FragmentManager.m2408G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(f);
                        Log.v("FragmentManager", sb.toString());
                    }
                    mo2911a(f);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No instantiated fragment for (");
                    sb2.append(str);
                    sb2.append(")");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public ArrayList<FragmentState> mo2932v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f2506b.size());
        for (FragmentStateManager uVar : this.f2506b.values()) {
            if (uVar != null) {
                Fragment k = uVar.mo2889k();
                FragmentState s = uVar.mo2895s();
                arrayList.add(s);
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k);
                    sb.append(": ");
                    sb.append(s.f2489m);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public ArrayList<String> mo2933w() {
        synchronized (this.f2505a) {
            if (this.f2505a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2505a.size());
            Iterator it = this.f2505a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.f2159g);
                if (FragmentManager.m2408G0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(fragment.f2159g);
                    sb.append("): ");
                    sb.append(fragment);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo2934x(FragmentManagerViewModel qVar) {
        this.f2507c = qVar;
    }
}
