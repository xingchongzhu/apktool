package com.tv91.p211s;

import com.tv91.utils.C3052g;
import java.io.IOException;

/* renamed from: com.tv91.s.a */
public final class ApiException extends IOException {

    /* renamed from: a */
    public final String f14694a;

    /* renamed from: b */
    public final String f14695b;

    public ApiException(String str) {
        this(str, "");
    }

    public String getLocalizedMessage() {
        return C3052g.m20582c("%2$s (Code: %1$s)", this.f14694a, this.f14695b);
    }

    public ApiException(String str, String str2) {
        super(str2);
        this.f14694a = str;
        this.f14695b = str2;
    }
}
