package androidx.lifecycle;

/* renamed from: androidx.lifecycle.s */
public class ViewModelProvider {

    /* renamed from: a */
    private final C0382a f2656a;

    /* renamed from: b */
    private final ViewModelStore f2657b;

    /* renamed from: androidx.lifecycle.s$a */
    /* compiled from: ViewModelProvider */
    public interface C0382a {
        /* renamed from: a */
        <T extends ViewModel> T mo2870a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.s$b */
    /* compiled from: ViewModelProvider */
    static abstract class C0383b extends C0384c implements C0382a {
        C0383b() {
        }

        /* renamed from: a */
        public <T extends ViewModel> T mo2870a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends ViewModel> T mo3035c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.s$c */
    /* compiled from: ViewModelProvider */
    static class C0384c {
        C0384c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3036b(ViewModel rVar) {
        }
    }

    public ViewModelProvider(ViewModelStoreOwner uVar, C0382a aVar) {
        this(uVar.mo144p(), aVar);
    }

    /* renamed from: a */
    public <T extends ViewModel> T mo3033a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo3034b(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends ViewModel> T mo3034b(String str, Class<T> cls) {
        T t;
        T b = this.f2657b.mo3038b(str);
        if (cls.isInstance(b)) {
            C0382a aVar = this.f2656a;
            if (aVar instanceof C0384c) {
                ((C0384c) aVar).mo3036b(b);
            }
            return b;
        }
        C0382a aVar2 = this.f2656a;
        if (aVar2 instanceof C0383b) {
            t = ((C0383b) aVar2).mo3035c(str, cls);
        } else {
            t = aVar2.mo2870a(cls);
        }
        this.f2657b.mo3040d(str, t);
        return t;
    }

    public ViewModelProvider(ViewModelStore tVar, C0382a aVar) {
        this.f2656a = aVar;
        this.f2657b = tVar;
    }
}
