package p010b.p057m.p058a;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: b.m.a.a */
public abstract class LoaderManager {
    /* renamed from: b */
    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager m5850b(T t) {
        return new LoaderManagerImpl(t, ((ViewModelStoreOwner) t).mo144p());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo5291a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract void mo5292c();
}
