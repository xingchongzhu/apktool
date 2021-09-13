package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.C0382a;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.q */
final class FragmentManagerViewModel extends ViewModel {

    /* renamed from: c */
    private static final C0382a f2469c = new C0349a();

    /* renamed from: d */
    private final HashMap<String, Fragment> f2470d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, FragmentManagerViewModel> f2471e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, ViewModelStore> f2472f = new HashMap<>();

    /* renamed from: g */
    private final boolean f2473g;

    /* renamed from: h */
    private boolean f2474h = false;

    /* renamed from: i */
    private boolean f2475i = false;

    /* renamed from: j */
    private boolean f2476j = false;

    /* renamed from: androidx.fragment.app.q$a */
    /* compiled from: FragmentManagerViewModel */
    class C0349a implements C0382a {
        C0349a() {
        }

        /* renamed from: a */
        public <T extends ViewModel> T mo2870a(Class<T> cls) {
            return new FragmentManagerViewModel(true);
        }
    }

    FragmentManagerViewModel(boolean z) {
        this.f2473g = z;
    }

    /* renamed from: i */
    static FragmentManagerViewModel m2558i(ViewModelStore tVar) {
        return (FragmentManagerViewModel) new ViewModelProvider(tVar, f2469c).mo3033a(FragmentManagerViewModel.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2856d() {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2474h = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2857e(Fragment fragment) {
        String str = "FragmentManager";
        if (this.f2476j) {
            if (FragmentManager.m2408G0(2)) {
                Log.v(str, "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f2470d.containsKey(fragment.f2159g)) {
            this.f2470d.put(fragment.f2159g, fragment);
            if (FragmentManager.m2408G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fragment);
                Log.v(str, sb.toString());
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel qVar = (FragmentManagerViewModel) obj;
        if (!this.f2470d.equals(qVar.f2470d) || !this.f2471e.equals(qVar.f2471e) || !this.f2472f.equals(qVar.f2472f)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2859f(Fragment fragment) {
        if (FragmentManager.m2408G0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        FragmentManagerViewModel qVar = (FragmentManagerViewModel) this.f2471e.get(fragment.f2159g);
        if (qVar != null) {
            qVar.mo2856d();
            this.f2471e.remove(fragment.f2159g);
        }
        ViewModelStore tVar = (ViewModelStore) this.f2472f.get(fragment.f2159g);
        if (tVar != null) {
            tVar.mo3037a();
            this.f2472f.remove(fragment.f2159g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Fragment mo2860g(String str) {
        return (Fragment) this.f2470d.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public FragmentManagerViewModel mo2861h(Fragment fragment) {
        FragmentManagerViewModel qVar = (FragmentManagerViewModel) this.f2471e.get(fragment.f2159g);
        if (qVar != null) {
            return qVar;
        }
        FragmentManagerViewModel qVar2 = new FragmentManagerViewModel(this.f2473g);
        this.f2471e.put(fragment.f2159g, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f2470d.hashCode() * 31) + this.f2471e.hashCode()) * 31) + this.f2472f.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public Collection<Fragment> mo2863j() {
        return new ArrayList(this.f2470d.values());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public ViewModelStore mo2864k(Fragment fragment) {
        ViewModelStore tVar = (ViewModelStore) this.f2472f.get(fragment.f2159g);
        if (tVar != null) {
            return tVar;
        }
        ViewModelStore tVar2 = new ViewModelStore();
        this.f2472f.put(fragment.f2159g, tVar2);
        return tVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo2865l() {
        return this.f2474h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2866m(Fragment fragment) {
        String str = "FragmentManager";
        if (this.f2476j) {
            if (FragmentManager.m2408G0(2)) {
                Log.v(str, "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if ((this.f2470d.remove(fragment.f2159g) != null) && FragmentManager.m2408G0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo2867n(boolean z) {
        this.f2476j = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo2868o(Fragment fragment) {
        if (!this.f2470d.containsKey(fragment.f2159g)) {
            return true;
        }
        if (this.f2473g) {
            return this.f2474h;
        }
        return !this.f2475i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2470d.values().iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2471e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2472f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
