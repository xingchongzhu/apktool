package com.tv91.p207q.p208a;

import com.chip.ninetyonetv.R;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p211s.InputError;
import com.tv91.p211s.ServerException;
import com.tv91.utils.C3049d;
import com.tv91.utils.FragmentUtils;
import com.tv91.utils.Timber;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import androidx.core.util.Consumer;

/* renamed from: com.tv91.q.a.g */
public final class ErrorHandler implements Consumer<ErrorBundle> {

    /* renamed from: a */
    private static final EnumMap<InputError, Integer> f14264a = C3049d.m20567b(InputError.class, C3049d.m20566a(InputError.EMPTY_ACCOUNT, Integer.valueOf(R.string.error_account_empty)), C3049d.m20566a(InputError.INVALID_ACCOUNT, Integer.valueOf(R.string.error_account_email_format)), C3049d.m20566a(InputError.EMPTY_PWD, Integer.valueOf(R.string.error_password_empty)), C3049d.m20566a(InputError.EMPTY_NEW_PWD, Integer.valueOf(R.string.error_new_password_empty)), C3049d.m20566a(InputError.EMPTY_PHONE, Integer.valueOf(R.string.error_phone_empty)), C3049d.m20566a(InputError.EMPTY_SMS, Integer.valueOf(R.string.error_code_empty)), C3049d.m20566a(InputError.SHORT_PWD, Integer.valueOf(R.string.error_password_length)), C3049d.m20566a(InputError.MISMATCH_PWD, Integer.valueOf(R.string.error_confirm_new_password_not_match)), C3049d.m20566a(InputError.USED_ACCOUNT, Integer.valueOf(R.string.error_account_registered)), C3049d.m20566a(InputError.EMPTY_NICKNAME, Integer.valueOf(R.string.error_nickname_empty)), C3049d.m20566a(InputError.USED_NICKNAME, Integer.valueOf(R.string.error_nickname_used)), C3049d.m20566a(InputError.EMPTY_CODE, Integer.valueOf(R.string.error_verification_empty)), C3049d.m20566a(InputError.EMPTY_EMAIL, Integer.valueOf(R.string.error_email_empty)), C3049d.m20566a(InputError.INVALID_EMAIL, Integer.valueOf(R.string.error_email_format)), C3049d.m20566a(InputError.EMPTY_WITHDRAW_ANY, Integer.valueOf(0)));

    /* renamed from: b */
    private final Map<String, Consumer<ErrorBundle>> f14265b = new HashMap();

    /* renamed from: c */
    private Consumer<Integer> f14266c = C2337a.f14260a;

    /* renamed from: d */
    private Consumer<ErrorBundle> f14267d = C2338b.f14261a;

    /* renamed from: e */
    private Consumer<ErrorBundle> f14268e = C2340d.f14263a;

    /* renamed from: d */
    public static ErrorHandler m17647d(Consumer<ErrorBundle> aVar) {
        ErrorHandler gVar = new ErrorHandler();
        gVar.f14268e = new C2339c(aVar);
        return gVar;
    }

    /* renamed from: f */
    static /* synthetic */ void m17648f(Consumer aVar, ErrorBundle cVar) {
        Timber.m24041c(cVar.mo17113c());
        aVar.accept(cVar);
    }

    /* renamed from: g */
    static /* synthetic */ void m17649g(Integer num) {
    }

    /* renamed from: h */
    static /* synthetic */ void m17650h(ErrorBundle cVar) {
    }

    /* renamed from: i */
    static /* synthetic */ void m17651i(ErrorBundle cVar) {
    }

    @Override
    /* renamed from: b */
    public void accept(ErrorBundle cVar) {
        InputError e = cVar.mo17115e();
        if (e != null) {
            this.f14266c.accept(f14264a.get(e));
        } else if (cVar.mo17113c() instanceof ServerException) {
            this.f14267d.accept(cVar);
        } else {
            Consumer aVar = (Consumer) this.f14265b.get(cVar.mo17111a());
            if (aVar != null) {
                aVar.accept(cVar);
            } else {
                this.f14268e.accept(cVar);
            }
        }
    }

    /* renamed from: c */
    public ErrorHandler mo17046c(String str, Consumer<ErrorBundle> aVar) {
        if (this.f14265b.get(str) == null) {
            this.f14265b.put(str, aVar);
            if (FragmentUtils.m20581b("0000001", str)) {
                String str2 = "NotLogin";
                if (this.f14265b.get(str2) == null) {
                    this.f14265b.put(str2, aVar);
                }
            }
        }
        return this;
    }

    /* renamed from: e */
    public ErrorHandler mo17047e(Consumer<Integer> aVar) {
        this.f14266c = aVar;
        return this;
    }

    /* renamed from: j */
    public ErrorHandler mo17048j(Consumer<ErrorBundle> aVar) {
        this.f14267d = aVar;
        return this;
    }
}
