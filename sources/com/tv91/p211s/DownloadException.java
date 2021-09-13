package com.tv91.p211s;

import com.tv91.model.DownloadRecord;
import com.tv91.utils.C3052g;
import java.io.IOException;

/* renamed from: com.tv91.s.b */
public final class DownloadException extends IOException {

    /* renamed from: a */
    public final String f14696a;

    /* renamed from: b */
    public final DownloadRecord f14697b;

    public DownloadException(String str, DownloadRecord aVar) {
        this.f14696a = str;
        this.f14697b = aVar;
    }

    public String getLocalizedMessage() {
        return C3052g.m20582c("Download failed: \nCode: %s\nRecord: %s", this.f14696a, this.f14697b);
    }
}
