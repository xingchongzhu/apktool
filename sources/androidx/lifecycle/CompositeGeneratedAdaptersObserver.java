package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;

class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* renamed from: a */
    private final GeneratedAdapter[] f2594a;

    CompositeGeneratedAdaptersObserver(GeneratedAdapter[] eVarArr) {
        this.f2594a = eVarArr;
    }

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        MethodCallsLogger mVar = new MethodCallsLogger();
        for (GeneratedAdapter a : this.f2594a) {
            a.mo2998a(iVar, bVar, false, mVar);
        }
        for (GeneratedAdapter a2 : this.f2594a) {
            a2.mo2998a(iVar, bVar, true, mVar);
        }
    }
}
