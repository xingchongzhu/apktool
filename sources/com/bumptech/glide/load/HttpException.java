package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.e */
public final class HttpException extends IOException {

    /* renamed from: a */
    private final int f10334a;

    public HttpException(int i) {
        this("Http request failed", i);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    public HttpException(String str, int i, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", status code: ");
        sb.append(i);
        super(sb.toString(), th);
        this.f10334a = i;
    }
}
