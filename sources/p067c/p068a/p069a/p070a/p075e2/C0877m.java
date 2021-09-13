package p067c.p068a.p069a.p070a.p075e2;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;
import p067c.p068a.p069a.p070a.p075e2.ExoMediaDrm.C0866b;

/* renamed from: c.a.a.a.e2.m */
/* compiled from: lambda */
public final /* synthetic */ class C0877m implements OnEventListener {

    /* renamed from: a */
    public final /* synthetic */ FrameworkMediaDrm f5843a;

    /* renamed from: b */
    public final /* synthetic */ C0866b f5844b;

    public /* synthetic */ C0877m(FrameworkMediaDrm f0Var, C0866b bVar) {
        this.f5843a = f0Var;
        this.f5844b = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f5843a.mo6060w(this.f5844b, mediaDrm, bArr, i, i2, bArr2);
    }
}
