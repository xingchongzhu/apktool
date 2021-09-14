package com.tv91.p211s;

import com.tv91.utils.FragmentUtils;
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
        return FragmentUtils.m20582c("ServerError %d: %s", Integer.valueOf(this.f14717a), super.getMessage());
    }
}
