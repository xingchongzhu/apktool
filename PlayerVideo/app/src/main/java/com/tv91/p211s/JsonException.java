package com.tv91.p211s;

import java.io.IOException;

/* renamed from: com.tv91.s.f */
public final class JsonException extends IOException {

    /* renamed from: a */
    public final String f14716a;

    public JsonException(String str) {
        this(str, null);
    }

    public String getLocalizedMessage() {
        if (getCause() == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14716a);
        sb.append("\n");
        sb.append(getCause().getMessage());
        return sb.toString();
    }

    public String getMessage() {
        return getCause() == null ? super.getMessage() : getCause().getMessage();
    }

    public JsonException(String str, Exception exc) {
        super(str, exc);
        this.f14716a = str;
    }
}
