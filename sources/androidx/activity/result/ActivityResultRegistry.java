package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.p006f.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C0377b;
import androidx.lifecycle.Lifecycle.C0378c;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private Random f122a = new Random();

    /* renamed from: b */
    private final Map<Integer, String> f123b = new HashMap();

    /* renamed from: c */
    private final Map<String, Integer> f124c = new HashMap();

    /* renamed from: d */
    private final Map<String, C0037d> f125d = new HashMap();

    /* renamed from: e */
    ArrayList<String> f126e = new ArrayList<>();

    /* renamed from: f */
    final transient Map<String, C0036c<?>> f127f = new HashMap();

    /* renamed from: g */
    final Map<String, Object> f128g = new HashMap();

    /* renamed from: h */
    final Bundle f129h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    class C0034a extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f134a;

        /* renamed from: b */
        final /* synthetic */ int f135b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f136c;

        C0034a(String str, int i, ActivityResultContract aVar) {
            this.f134a = str;
            this.f135b = i;
            this.f136c = aVar;
        }

        /* renamed from: b */
        public void mo180b(I i, ActivityOptionsCompat bVar) {
            ActivityResultRegistry.this.f126e.add(this.f134a);
            ActivityResultRegistry.this.mo156f(this.f135b, this.f136c, i, bVar);
        }

        /* renamed from: c */
        public void mo181c() {
            ActivityResultRegistry.this.mo179l(this.f134a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    class C0035b extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ String f138a;

        /* renamed from: b */
        final /* synthetic */ int f139b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f140c;

        C0035b(String str, int i, ActivityResultContract aVar) {
            this.f138a = str;
            this.f139b = i;
            this.f140c = aVar;
        }

        /* renamed from: b */
        public void mo180b(I i, ActivityOptionsCompat bVar) {
            ActivityResultRegistry.this.f126e.add(this.f138a);
            ActivityResultRegistry.this.mo156f(this.f139b, this.f140c, i, bVar);
        }

        /* renamed from: c */
        public void mo181c() {
            ActivityResultRegistry.this.mo179l(this.f138a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    private static class C0036c<O> {

        /* renamed from: a */
        final ActivityResultCallback<O> f142a;

        /* renamed from: b */
        final ActivityResultContract<?, O> f143b;

        C0036c(ActivityResultCallback<O> bVar, ActivityResultContract<?, O> aVar) {
            this.f142a = bVar;
            this.f143b = aVar;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    private static class C0037d {

        /* renamed from: a */
        final Lifecycle f144a;

        /* renamed from: b */
        private final ArrayList<LifecycleEventObserver> f145b = new ArrayList<>();

        C0037d(Lifecycle fVar) {
            this.f144a = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo182a(LifecycleEventObserver gVar) {
            this.f144a.mo2999a(gVar);
            this.f145b.add(gVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo183b() {
            Iterator it = this.f145b.iterator();
            while (it.hasNext()) {
                this.f144a.mo3001c((LifecycleEventObserver) it.next());
            }
            this.f145b.clear();
        }
    }

    /* renamed from: a */
    private void m127a(int i, String str) {
        this.f123b.put(Integer.valueOf(i), str);
        this.f124c.put(str, Integer.valueOf(i));
    }

    /* renamed from: d */
    private <O> void m128d(String str, int i, Intent intent, C0036c<O> cVar) {
        if (cVar != null) {
            ActivityResultCallback<O> bVar = cVar.f142a;
            if (bVar != null) {
                bVar.mo193a(cVar.f143b.mo210c(i, intent));
                return;
            }
        }
        this.f128g.remove(str);
        this.f129h.putParcelable(str, new ActivityResult(i, intent));
    }

    /* renamed from: e */
    private int m129e() {
        int nextInt = this.f122a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f123b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f122a.nextInt(2147418112);
        }
    }

    /* renamed from: k */
    private int m130k(String str) {
        Integer num = (Integer) this.f124c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int e = m129e();
        m127a(e, str);
        return e;
    }

    /* renamed from: b */
    public final boolean mo173b(int i, int i2, Intent intent) {
        String str = (String) this.f123b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f126e.remove(str);
        m128d(str, i2, intent, (C0036c) this.f127f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean mo174c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        String str = (String) this.f123b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f126e.remove(str);
        C0036c cVar = (C0036c) this.f127f.get(str);
        if (cVar != null) {
            ActivityResultCallback<O> bVar = cVar.f142a;
            if (bVar != null) {
                bVar.mo193a(o);
                return true;
            }
        }
        this.f129h.remove(str);
        this.f128g.put(str, o);
        return true;
    }

    /* renamed from: f */
    public abstract <I, O> void mo156f(int i, ActivityResultContract<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i2, ActivityOptionsCompat bVar);

    /* renamed from: g */
    public final void mo175g(Bundle bundle) {
        if (bundle != null) {
            ArrayList integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    m127a(((Integer) integerArrayList.get(i)).intValue(), (String) stringArrayList.get(i));
                }
                this.f126e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f122a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f129h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
    }

    /* renamed from: h */
    public final void mo176h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f123b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f123b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f126e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f129h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f122a);
    }

    /* renamed from: i */
    public final <I, O> ActivityResultLauncher<I> mo177i(String str, ActivityResultContract<I, O> aVar, ActivityResultCallback<O> bVar) {
        int k = m130k(str);
        this.f127f.put(str, new C0036c(bVar, aVar));
        if (this.f128g.containsKey(str)) {
            Object obj = this.f128g.get(str);
            this.f128g.remove(str);
            bVar.mo193a(obj);
        }
        ActivityResult aVar2 = (ActivityResult) this.f129h.getParcelable(str);
        if (aVar2 != null) {
            this.f129h.remove(str);
            bVar.mo193a(aVar.mo210c(aVar2.mo186m(), aVar2.mo185l()));
        }
        return new C0035b(str, k, aVar);
    }

    /* renamed from: j */
    public final <I, O> ActivityResultLauncher<I> mo178j(final String str, LifecycleOwner iVar, final ActivityResultContract<I, O> aVar, final ActivityResultCallback<O> bVar) {
        Lifecycle b = iVar.mo132b();
        if (!b.mo3000b().mo3003a(C0378c.STARTED)) {
            int k = m130k(str);
            C0037d dVar = (C0037d) this.f125d.get(str);
            if (dVar == null) {
                dVar = new C0037d(b);
            }
            dVar.mo182a(new LifecycleEventObserver() {
                /* renamed from: c */
                public void mo154c(LifecycleOwner iVar, C0377b bVar) {
                    if (C0377b.ON_START.equals(bVar)) {
                        ActivityResultRegistry.this.f127f.put(str, new C0036c(bVar, aVar));
                        if (ActivityResultRegistry.this.f128g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f128g.get(str);
                            ActivityResultRegistry.this.f128g.remove(str);
                            bVar.mo193a(obj);
                        }
                        ActivityResult aVar = (ActivityResult) ActivityResultRegistry.this.f129h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f129h.remove(str);
                            bVar.mo193a(aVar.mo210c(aVar.mo186m(), aVar.mo185l()));
                        }
                    } else if (C0377b.ON_STOP.equals(bVar)) {
                        ActivityResultRegistry.this.f127f.remove(str);
                    } else if (C0377b.ON_DESTROY.equals(bVar)) {
                        ActivityResultRegistry.this.mo179l(str);
                    }
                }
            });
            this.f125d.put(str, dVar);
            return new C0034a(str, k, aVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(iVar);
        sb.append(" is attempting to register while current state is ");
        sb.append(b.mo3000b());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo179l(String str) {
        if (!this.f126e.contains(str)) {
            Integer num = (Integer) this.f124c.remove(str);
            if (num != null) {
                this.f123b.remove(num);
            }
        }
        this.f127f.remove(str);
        String str2 = ": ";
        String str3 = "Dropping pending result for request ";
        String str4 = "ActivityResultRegistry";
        if (this.f128g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            sb.append(this.f128g.get(str));
            Log.w(str4, sb.toString());
            this.f128g.remove(str);
        }
        if (this.f129h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            sb2.append(this.f129h.getParcelable(str));
            Log.w(str4, sb2.toString());
            this.f129h.remove(str);
        }
        C0037d dVar = (C0037d) this.f125d.get(str);
        if (dVar != null) {
            dVar.mo183b();
            this.f125d.remove(str);
        }
    }
}
