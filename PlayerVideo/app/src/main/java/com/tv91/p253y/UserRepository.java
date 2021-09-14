package com.tv91.p253y;

import com.tv91.model.User;
import com.tv91.p211s.ApiException;

/* renamed from: com.tv91.y.g */
public final /* synthetic */ class UserRepository {
    /* renamed from: a */
    public static void m20695a(C3060h _this) {
        _this.mo18620j(null);
    }

    /* renamed from: b */
    public static void m20696b(C3060h _this) {
        _this.mo18618h(null);
    }

    /* renamed from: c */
    public static String m20697c(C3060h _this) throws ApiException {
        User e = _this.mo18615e();
        if (e != null) {
            return e.f14097id;
        }
        throw new ApiException("NotLogin");
    }

    /* renamed from: d */
    public static String m20698d(C3060h _this) throws ApiException {
        User e = _this.mo18615e();
        if (e != null) {
            return e.token;
        }
        throw new ApiException("NotLogin");
    }
}
