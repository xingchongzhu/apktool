package p067c.p068a.p069a.p070a;

import p067c.p068a.p069a.p070a.Timeline.C1257c;

/* renamed from: c.a.a.a.g0 */
public abstract class BasePlayer implements C1155l1 {

    /* renamed from: a */
    protected final C1257c f7024a = new C1257c();

    /* renamed from: a0 */
    private int m8334a0() {
        int K = mo7196K();
        if (K == 1) {
            return 0;
        }
        return K;
    }

    /* renamed from: B */
    public final int mo6399B() {
        Timeline M = mo7198M();
        if (M.mo7743q()) {
            return -1;
        }
        return M.mo5989e(mo7203R(), m8334a0(), mo7200O());
    }

    /* renamed from: Z */
    public final long mo6400Z() {
        Timeline M = mo7198M();
        if (M.mo7743q()) {
            return -9223372036854775807L;
        }
        return M.mo7742n(mo7203R(), this.f7024a).mo7765d();
    }

    /* renamed from: b0 */
    public final void mo6401b0() {
        mo7211f(true);
    }

    public final boolean hasNext() {
        return mo6399B() != -1;
    }

    public final boolean hasPrevious() {
        return mo6404l() != -1;
    }

    /* renamed from: l */
    public final int mo6404l() {
        Timeline M = mo7198M();
        if (M.mo7743q()) {
            return -1;
        }
        return M.mo5992l(mo7203R(), m8334a0(), mo7200O());
    }

    /* renamed from: t */
    public final boolean mo6405t() {
        return mo7219q() == 3 && mo7217n() && mo7194H() == 0;
    }

    /* renamed from: w */
    public final boolean mo6406w() {
        Timeline M = mo7198M();
        return !M.mo7743q() && M.mo7742n(mo7203R(), this.f7024a).f8965j;
    }
}
