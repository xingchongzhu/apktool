package p067c.p068a.p069a.p070a;

/* renamed from: c.a.a.a.s1 */
public final class RendererConfiguration {

    /* renamed from: a */
    public static final RendererConfiguration f8791a = new RendererConfiguration(false);

    /* renamed from: b */
    public final boolean f8792b;

    public RendererConfiguration(boolean z) {
        this.f8792b = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || RendererConfiguration.class != obj.getClass()) {
            return false;
        }
        if (this.f8792b != ((RendererConfiguration) obj).f8792b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f8792b ^ true ? 1 : 0;
    }
}
