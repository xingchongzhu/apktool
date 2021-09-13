package p010b.p057m.p058a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.C0382a;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b.p025d.SparseArrayCompat;
import p010b.p034g.p042j.DebugUtils;
import p010b.p057m.p059b.Loader;

/* renamed from: b.m.a.b */
class LoaderManagerImpl extends LoaderManager {

    /* renamed from: a */
    static boolean f4931a = false;

    /* renamed from: b */
    private final LifecycleOwner f4932b;

    /* renamed from: c */
    private final C0692c f4933c;

    /* renamed from: b.m.a.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C0690a<D> extends MutableLiveData<D> {

        /* renamed from: l */
        private final int f4934l;

        /* renamed from: m */
        private final Bundle f4935m;

        /* renamed from: n */
        private final Loader<D> f4936n;

        /* renamed from: o */
        private LifecycleOwner f4937o;

        /* renamed from: p */
        private C0691b<D> f4938p;

        /* renamed from: q */
        private Loader<D> f4939q;

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo2974g() {
            if (LoaderManagerImpl.f4931a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo2975h() {
            if (LoaderManagerImpl.f4931a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            throw null;
        }

        /* renamed from: i */
        public void mo2976i(Observer<? super D> oVar) {
            super.mo2976i(oVar);
            this.f4937o = null;
        }

        /* renamed from: j */
        public void mo2977j(D d) {
            super.mo2977j(d);
            if (this.f4939q != null) {
                throw null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public Loader<D> mo5294k(boolean z) {
            if (LoaderManagerImpl.f4931a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            throw null;
        }

        /* renamed from: l */
        public void mo5295l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4934l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4935m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4936n);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            sb.toString();
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo5296m() {
            LifecycleOwner iVar = this.f4937o;
            C0691b<D> bVar = this.f4938p;
            if (iVar != null && bVar != null) {
                super.mo2976i(bVar);
                mo2972e(iVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4934l);
            sb.append(" : ");
            DebugUtils.m5174a(this.f4936n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: b.m.a.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C0691b<D> implements Observer<D> {
    }

    /* renamed from: b.m.a.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C0692c extends ViewModel {

        /* renamed from: c */
        private static final C0382a f4940c = new C0693a();

        /* renamed from: d */
        private SparseArrayCompat<C0690a> f4941d = new SparseArrayCompat<>();

        /* renamed from: e */
        private boolean f4942e = false;

        /* renamed from: b.m.a.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C0693a implements C0382a {
            C0693a() {
            }

            /* renamed from: a */
            public <T extends ViewModel> T mo2870a(Class<T> cls) {
                return new C0692c();
            }
        }

        C0692c() {
        }

        /* renamed from: f */
        static C0692c m5862f(ViewModelStore tVar) {
            return (C0692c) new ViewModelProvider(tVar, f4940c).mo3033a(C0692c.class);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2856d() {
            super.mo2856d();
            int j = this.f4941d.mo4531j();
            for (int i = 0; i < j; i++) {
                ((C0690a) this.f4941d.mo4532k(i)).mo5294k(true);
            }
            this.f4941d.mo4523b();
        }

        /* renamed from: e */
        public void mo5298e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4941d.mo4531j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f4941d.mo4531j(); i++) {
                    C0690a aVar = (C0690a) this.f4941d.mo4532k(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4941d.mo4529h(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo5295l(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo5299g() {
            int j = this.f4941d.mo4531j();
            for (int i = 0; i < j; i++) {
                ((C0690a) this.f4941d.mo4532k(i)).mo5296m();
            }
        }
    }

    LoaderManagerImpl(LifecycleOwner iVar, ViewModelStore tVar) {
        this.f4932b = iVar;
        this.f4933c = C0692c.m5862f(tVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo5291a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4933c.mo5298e(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public void mo5292c() {
        this.f4933c.mo5299g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.m5174a(this.f4932b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
