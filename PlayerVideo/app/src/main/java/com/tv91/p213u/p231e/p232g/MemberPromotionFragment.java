package com.tv91.p213u.p231e.p232g;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.p006f.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.chip.ninetyonetv.R;
import com.tv91.features.authentication.AuthActivity.C2145a;
import com.tv91.features.authentication.p204r.VerifyFragment.C2284a;
import com.tv91.features.shared.UmengObserver;
import com.tv91.features.shared.ViewSupplier;
import com.tv91.features.shared.widget.CustomDialog;
import com.tv91.model.Promotion;
import com.tv91.p207q.p208a.ErrorHandler;
import com.tv91.p210r.ViewPromotionMemberBinding;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p213u.p231e.C2797b;
import com.tv91.p213u.p231e.MemberScreen;
import com.tv91.p213u.p231e.p234i.PromotionStatementFragment.C2842a;
import com.tv91.p213u.p231e.p235j.GenerateQRCodeUseCase;
import com.tv91.p213u.p231e.p235j.LoadPromotionUseCase;
import com.tv91.p252x.FragmentKey;
import com.tv91.p252x.Navigator;
import com.tv91.utils.FragmentUtils;
import p067c.google.p138c.p141j.BitMatrix;

/* renamed from: com.tv91.u.e.g.x */
public final class MemberPromotionFragment extends Hilt_MemberPromotionFragment {

    /* renamed from: h0 */
    LoadPromotionUseCase f15599h0;

    /* renamed from: i0 */
    GenerateQRCodeUseCase f15600i0;

    /* renamed from: j0 */
    private final ViewSupplier<C2797b> f15601j0 = new ViewSupplier<>(this, C2804e.f15573a);

    /* renamed from: k0 */
    private Navigator f15602k0;

    /* renamed from: l0 */
    private Promotion f15603l0;

    /* renamed from: m0 */
    private int f15604m0;

    /* renamed from: n0 */
    private int f15605n0;

    /* renamed from: o0 */
    private Bitmap f15606o0;

    /* renamed from: p0 */
    private final ActivityResultLauncher<String> f15607p0 = mo2371J1(new C2823b(), new C2807h(this));

    /* renamed from: com.tv91.u.e.g.x$b */
    /* compiled from: MemberPromotionFragment */
    private static class C2823b extends ActivityResultContracts {
        private C2823b() {
        }

        /* renamed from: d */
        public Intent mo208a(Context context, String str) {
            return super.mo212d(context, str).addCategory("android.intent.category.OPENABLE").setType("image/jpg");
        }
    }

    /* renamed from: com.tv91.u.e.g.x$c */
    /* compiled from: MemberPromotionFragment */
    public static final class C2824c extends FragmentKey {
        public static final Creator<C2824c> CREATOR = new C2825a();

        /* renamed from: com.tv91.u.e.g.x$c$a */
        /* compiled from: MemberPromotionFragment */
        static class C2825a implements Creator<C2824c> {
            C2825a() {
            }

            /* renamed from: a */
            public C2824c createFromParcel(Parcel parcel) {
                return new C2824c(parcel);
            }

            /* renamed from: b */
            public C2824c[] newArray(int i) {
                return new C2824c[i];
            }
        }

        public C2824c() {
            super("會員推廣頁面");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Fragment getFragment() {
            return new MemberPromotionFragment();
        }

        /* renamed from: o */
        public void setCustomAnimations(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_fade, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_to_right);
            }
        }

        /* renamed from: p */
        public void mo16546p(FragmentTransaction xVar, boolean z) {
            if (z) {
                xVar.mo2944r(R.anim.enter_from_right, 0);
            } else {
                xVar.mo2944r(0, R.anim.exit_fade);
            }
        }

        protected C2824c(Parcel parcel) {
            super(parcel);
        }
    }

    public MemberPromotionFragment() {
        super(R.layout.view_promotion_member);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public /* synthetic */ void mo18047B2(ErrorBundle cVar) {
        ((C2797b) this.f15601j0.mo4947a()).mo18013R1(cVar.mo17112b(), new C2801b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void mo18048D2() {
        ((C2797b) this.f15601j0.mo4947a()).mo18017a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void mo18049F2(Promotion promotion) {
        C2797b bVar = (C2797b) this.f15601j0.mo4947a();
        this.f15603l0 = promotion;
        bVar.mo18020i2(promotion);
        mo18060q2(promotion.url, this.f15604m0, this.f15605n0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void mo18050H2(ErrorBundle cVar) {
        ((C2797b) this.f15601j0.mo4947a()).mo18017a(false);
        mo18061r2(cVar);
    }

    /* renamed from: I2 */
    static /* synthetic */ C2797b m19635I2(View view) {
        return new MemberView(ViewPromotionMemberBinding.m17789b(view));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r4 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        throw r1;
     */
    /* renamed from: J2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo18051K2(android.net.Uri r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x003e
            androidx.fragment.app.e r0 = r3.mo2379M1()     // Catch:{ Exception -> 0x002b }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x002b }
            java.io.OutputStream r4 = r0.openOutputStream(r4)     // Catch:{ Exception -> 0x002b }
            android.graphics.Bitmap r0 = r3.f15606o0     // Catch:{ all -> 0x001d }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x001d }
            r2 = 100
            r0.compress(r1, r2, r4)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x003e
            r4.close()     // Catch:{ Exception -> 0x002b }
            goto L_0x003e
        L_0x001d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001f }
        L_0x001f:
            r1 = move-exception
            if (r4 == 0) goto L_0x002a
            r4.close()     // Catch:{ all -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch:{ Exception -> 0x002b }
        L_0x002a:
            throw r1     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            r4 = move-exception
            p295h.p296a.Timber.m24041c(r4)
            com.tv91.features.shared.ViewSupplier<com.tv91.u.e.b> r0 = r3.f15601j0
            com.tv91.q.a.f r0 = r0.mo4947a()
            com.tv91.u.e.b r0 = (com.tv91.p213u.p231e.C2797b) r0
            java.lang.String r4 = r4.getMessage()
            r0.mo16552g0(r4)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tv91.p213u.p231e.p232g.MemberPromotionFragment.mo18051K2(android.net.Uri):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public /* synthetic */ void mo18052M2() {
        this.f15602k0.mo18588e(new C2145a());
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public /* synthetic */ void mo18053O2() {
        this.f15602k0.mo18589h(new C2284a());
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void mo18054Q2(MemberScreen aVar) {
        this.f15604m0 = aVar.f15558a;
        this.f15605n0 = aVar.f15559b;
        if (this.f15603l0 == null || this.f15606o0 == null) {
            mo18059Z2();
            return;
        }
        ((C2797b) this.f15601j0.mo4947a()).mo18020i2(this.f15603l0);
        ((C2797b) this.f15601j0.mo4947a()).mo18012G0(this.f15606o0);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void mo18055S2() {
        this.f15602k0.mo18587d();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void mo18056U2() {
        this.f15602k0.mo18588e(new C2842a());
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public /* synthetic */ void mo18057W2() {
        this.f15607p0.mo194a(FragmentUtils.m20582c("%s_qrcode.jpg", mo2443i0(R.string.app_name)));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void mo18058Y2(String str) {
        ((ClipboardManager) ContextCompat.m1761g(mo2385O1(), ClipboardManager.class)).setPrimaryClip(ClipData.newPlainText(str, this.f15603l0.url));
        ((C2797b) this.f15601j0.mo4947a()).mo18019e1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void mo18062t2() {
        ((C2797b) this.f15601j0.mo4947a()).mo18017a(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void mo18063v2(int i, int i2, BitMatrix bVar) {
        this.f15606o0 = Bitmap.createBitmap(i, i2, Config.RGB_565);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                this.f15606o0.setPixel(i3, i4, bVar.mo8569d(i3, i4) ? -16777216 : -1);
            }
        }
        ((C2797b) this.f15601j0.mo4947a()).mo18012G0(this.f15606o0);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void mo18064x2(ErrorBundle cVar) {
        ((C2797b) this.f15601j0.mo4947a()).mo16552g0(cVar.mo17114d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void mo18065z2(ErrorBundle cVar) {
        CustomDialog.m17424b(mo2379M1(), new C2810k(this));
    }

    /* renamed from: J0 */
    public void mo2370J0(Bundle bundle) {
        super.mo2370J0(bundle);
        mo132b().mo2999a(new UmengObserver(mo18584l2().getClassName()));
        this.f15602k0 = Navigator.m20631b(this);
    }

    /* renamed from: Z2 */
    public void mo18059Z2() {
        this.f15599h0.mo18137v(new C2806g(this)).mo18138w(new C2809j(this)).mo18136u(new C2816q(this)).mo18132o();
    }

    /* renamed from: g1 */
    public void mo2437g1() {
        super.mo2437g1();
        ((C2797b) this.f15601j0.mo4947a()).mo18014V0(new C2812m(this));
        ((C2797b) this.f15601j0.mo4947a()).mo18018b(new C2808i(this));
        ((C2797b) this.f15601j0.mo4947a()).mo18015V1(new C2803d(this));
        ((C2797b) this.f15601j0.mo4947a()).mo18016X1(new C2811l(this));
        ((C2797b) this.f15601j0.mo4947a()).mo18011F(new C2814o(this));
    }

    /* renamed from: h1 */
    public void mo2440h1() {
        super.mo2440h1();
        this.f15599h0.mo17051a();
        this.f15600i0.mo17051a();
    }

    /* renamed from: q2 */
    public void mo18060q2(String str, int i, int i2) {
        this.f15600i0.mo18122v(new C2802c(this)).mo18123w(new C2817r(this, i, i2)).mo18121u(new C2800a(this)).mo18117o(str, i, i2);
    }

    /* renamed from: r2 */
    public void mo18061r2(ErrorBundle cVar) {
        String str = "A000084";
        ErrorHandler.m17647d(new C2813n(this)).mo17046c("0000001", new C2815p(this)).mo17046c(str, new C2805f(this)).mo4887a(cVar);
    }
}
