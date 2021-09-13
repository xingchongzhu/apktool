package com.tv91.p255z;

import com.tv91.model.DownloadRecord;
import java.io.File;
import java.io.FileDescriptor;
import p010b.p034g.p042j.Consumer;

/* renamed from: com.tv91.z.c */
public interface DownloadApi {

    /* renamed from: com.tv91.z.c$a */
    /* compiled from: DownloadApi */
    public interface C3064a {
        /* renamed from: a */
        void mo17541a(Number number);
    }

    /* renamed from: a */
    void mo18684a(DownloadRecord aVar);

    /* renamed from: b */
    void mo18685b(DownloadRecord aVar, FileDescriptor fileDescriptor, String str) throws Exception;

    /* renamed from: c */
    void mo18686c(DownloadRecord aVar) throws Exception;

    /* renamed from: d */
    void mo18687d(DownloadRecord aVar) throws Exception;

    /* renamed from: e */
    void mo18688e(DownloadRecord aVar, C3064a aVar2);

    /* renamed from: f */
    void mo18689f(DownloadRecord aVar, Consumer<File> aVar2, Consumer<Exception> aVar3);

    /* renamed from: g */
    File mo18690g(String str, File file) throws Exception;
}
