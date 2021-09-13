package com.tv91.p213u.p231e.p235j;

import com.tv91.p207q.p209b.C2345e;
import com.tv91.p207q.p209b.C2346f;
import com.tv91.p207q.p209b.C2346f.C2347a;
import com.tv91.p207q.p209b.C2346f.C2348b;
import com.tv91.p207q.p209b.C2346f.C2349c;
import com.tv91.p207q.p209b.C2346f.C2350d;
import com.tv91.p207q.p209b.ObservableUseCase;
import com.tv91.p211s.ErrorBundle;
import com.tv91.p212t.Schedulers;
import java.util.EnumMap;
import java.util.Map;
import p010b.p034g.p042j.Consumer;
import p067c.p068a.p138c.BarcodeFormat;
import p067c.p068a.p138c.EncodeHintType;
import p067c.p068a.p138c.MultiFormatWriter;
import p067c.p068a.p138c.WriterException;
import p067c.p068a.p138c.p141j.BitMatrix;
import p067c.p068a.p138c.p148n.p149b.ErrorCorrectionLevel;

/* renamed from: com.tv91.u.e.j.k */
public final class GenerateQRCodeUseCase extends ObservableUseCase<C2345e> {

    /* renamed from: i */
    private final Map<EncodeHintType, Object> f15668i;

    /* renamed from: j */
    private Consumer<BitMatrix> f15669j = ObservableUseCase.m17658b();

    /* renamed from: k */
    private final C2345e f15670k = new C2848b(this);

    public GenerateQRCodeUseCase(Schedulers bVar) {
        super(bVar);
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        this.f15668i = enumMap;
        enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        enumMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo18119r(String str, int i, int i2) {
        C2348b bVar;
        try {
            mo17054i(new C2349c());
            mo17054i(new C2350d(mo18118p(str, i, i2)));
            bVar = new C2348b();
        } catch (Exception e) {
            mo17054i(new C2347a(new ErrorBundle(e)));
            bVar = new C2348b();
        } catch (Throwable th) {
            mo17054i(new C2348b());
            throw th;
        }
        mo17054i(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo18120t(C2346f fVar) {
        if (fVar instanceof C2349c) {
            this.f14275c.run();
        } else if (fVar instanceof C2348b) {
            this.f14276d.run();
        } else if (fVar instanceof C2350d) {
            this.f15669j.mo4887a(((C2350d) fVar).f14282a);
        } else if (fVar instanceof C2347a) {
            this.f14277e.mo4887a(((C2347a) fVar).f14281a);
        }
    }

    /* renamed from: o */
    public void mo18117o(String str, int i, int i2) {
        mo17058m(this.f15670k);
        mo17055j(new C2847a(this, str, i, i2));
    }

    /* renamed from: p */
    public BitMatrix mo18118p(String str, int i, int i2) throws WriterException {
        return new MultiFormatWriter().mo8526a(str, BarcodeFormat.QR_CODE, i, i2, this.f15668i);
    }

    /* renamed from: u */
    public GenerateQRCodeUseCase mo18121u(Consumer<ErrorBundle> aVar) {
        this.f14277e = aVar;
        return this;
    }

    /* renamed from: v */
    public GenerateQRCodeUseCase mo18122v(Runnable runnable) {
        this.f14276d = runnable;
        return this;
    }

    /* renamed from: w */
    public GenerateQRCodeUseCase mo18123w(Consumer<BitMatrix> aVar) {
        this.f15669j = aVar;
        return this;
    }
}
