package androidx.lifecycle;

import androidx.lifecycle.Lifecycle.C0377b;

class FullLifecycleObserverAdapter implements LifecycleEventObserver {

    /* renamed from: a */
    private final FullLifecycleObserver f2595a;

    /* renamed from: b */
    private final LifecycleEventObserver f2596b;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    static /* synthetic */ class C0367a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2597a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.f$b[] r0 = androidx.lifecycle.Lifecycle.C0377b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2597a = r0
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2597a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.f$b r1 = androidx.lifecycle.Lifecycle.C0377b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.C0367a.<clinit>():void");
        }
    }

    FullLifecycleObserverAdapter(FullLifecycleObserver dVar, LifecycleEventObserver gVar) {
        this.f2595a = dVar;
        this.f2596b = gVar;
    }

    /* renamed from: c */
    public void mo154c(LifecycleOwner iVar, C0377b bVar) {
        switch (C0367a.f2597a[bVar.ordinal()]) {
            case 1:
                this.f2595a.mo2993b(iVar);
                break;
            case 2:
                this.f2595a.mo2994d(iVar);
                break;
            case 3:
                this.f2595a.onResume(iVar);
                break;
            case 4:
                this.f2595a.onPause(iVar);
                break;
            case 5:
                this.f2595a.mo2995e(iVar);
                break;
            case 6:
                this.f2595a.mo2992a(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver gVar = this.f2596b;
        if (gVar != null) {
            gVar.mo154c(iVar, bVar);
        }
    }
}
