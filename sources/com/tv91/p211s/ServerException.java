package com.tv91.p211s;

import com.tv91.utils.C3052g;
import java.io.IOException;

/* renamed from: com.tv91.s.g */
public final class ServerException extends IOException {

    /* renamed from: a */
    public final int f14717a;

    public ServerException(int i, String str) {
        super(str);
        this.f14717a = i;
    }

    public String getLocalizedMessage() {
        return C3052g.m20582c("ServerError %d: %s", Integer.valueOf(this.f14717a), super.getMessage());
    }
}
