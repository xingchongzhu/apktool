package com.p259uc.crashsdk.p260a;

import com.p259uc.crashsdk.C3084b;
import com.p259uc.crashsdk.C3087e;
import com.p259uc.crashsdk.C3092f;
import com.p259uc.crashsdk.ProGuard;

/* renamed from: com.uc.crashsdk.a.e */
/* compiled from: ProGuard */
public class C3079e implements Runnable {

    /* renamed from: a */
    static final /* synthetic */ boolean f16266a = true;

    /* renamed from: b */
    private final int f16267b;

    /* renamed from: c */
    private final Object[] f16268c;

    static {
        Class<C3079e> cls = C3079e.class;
    }

    public C3079e(int i) {
        this.f16267b = i;
        this.f16268c = null;
    }

    /* renamed from: a */
    public final boolean mo18711a() {
        int i = this.f16267b;
        if (i == 451 || i == 452) {
            return C3087e.m21253b(i, this.f16268c);
        }
        switch (i) {
            case 351:
            case 352:
            case 353:
            case 354:
                return C3082h.m21076b(i, this.f16268c);
            default:
                switch (i) {
                    case 751:
                    case 752:
                    case 753:
                        return C3092f.m21332a(i, this.f16268c);
                    default:
                        StringBuilder sb = new StringBuilder("Unknown sync runnable: ");
                        sb.append(toString());
                        C3075a.m20981d("crashsdk", sb.toString());
                        if (f16266a) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    public void run() {
        int i = this.f16267b;
        if (i == 10) {
            C3080f.m21011a(i, this.f16268c);
        } else if (i == 500) {
            C3078d.m21001a(i);
        } else if (i == 700) {
            C3092f.m21339b(i);
        } else if (i == 800) {
            C3081g.m21023a(i);
        } else if (i == 201 || i == 202) {
            ProGuard.m20946a(i);
        } else {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                    C3084b.m21131a(i);
                    return;
                default:
                    switch (i) {
                        case 301:
                        case 302:
                        case 303:
                            C3082h.m21060a(i, this.f16268c);
                            return;
                        default:
                            switch (i) {
                                case 401:
                                case 402:
                                case 403:
                                    break;
                                default:
                                    switch (i) {
                                        case 405:
                                        case 406:
                                        case 407:
                                        case 408:
                                        case 409:
                                        case 410:
                                        case 411:
                                        case 412:
                                        case 413:
                                        case 414:
                                        case 415:
                                        case 416:
                                            break;
                                        default:
                                            StringBuilder sb = new StringBuilder("Unknown async runnable: ");
                                            sb.append(toString());
                                            C3075a.m20981d("crashsdk", sb.toString());
                                            if (!f16266a) {
                                                throw new AssertionError();
                                            }
                                            return;
                                    }
                            }
                            C3087e.m21218a(i, this.f16268c);
                            return;
                    }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("@action_");
        sb.append(this.f16267b);
        return sb.toString();
    }

    public C3079e(int i, Object[] objArr) {
        this.f16267b = i;
        this.f16268c = objArr;
    }
}
