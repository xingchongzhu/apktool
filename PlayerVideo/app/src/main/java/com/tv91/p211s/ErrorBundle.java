package com.tv91.p211s;

import com.tv91.utils.FragmentUtils;

/* renamed from: com.tv91.s.c */
public final class ErrorBundle {

    /* renamed from: a */
    private final Exception f14698a;

    public ErrorBundle() {
        this(null);
    }

    /* renamed from: a */
    public String mo17111a() {
        Exception exc = this.f14698a;
        if (exc instanceof ApiException) {
            return ((ApiException) exc).f14694a;
        }
        if (exc instanceof DownloadException) {
            return ((DownloadException) exc).f14696a;
        }
        return exc instanceof ServerException ? String.valueOf(((ServerException) exc).f14717a) : "E_UNKNOWN";
    }

    /* renamed from: b */
    public String mo17112b() {
        Exception exc = this.f14698a;
        return exc == null ? "Unknown error" : exc.getMessage();
    }

    /* renamed from: c */
    public Exception mo17113c() {
        return this.f14698a;
    }

    /* renamed from: d */
    public String mo17114d() {
        Exception exc = this.f14698a;
        return exc == null ? "Unknown error" : exc.getLocalizedMessage();
    }

    /* renamed from: e */
    public InputError mo17115e() {
        Exception exc = this.f14698a;
        if (exc instanceof InputException) {
            return ((InputException) exc).f14715a;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo17116f() {
        String a = mo17111a();
        return FragmentUtils.m20581b("NotLogin", a) || FragmentUtils.m20581b("0000001", a);
    }

    public ErrorBundle(Exception exc) {
        this.f14698a = exc;
    }
}
