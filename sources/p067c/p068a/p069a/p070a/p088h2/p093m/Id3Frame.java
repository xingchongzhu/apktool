package p067c.p068a.p069a.p070a.p088h2.p093m;

import p067c.p068a.p069a.p070a.Format;
import p067c.p068a.p069a.p070a.p088h2.C1035b;
import p067c.p068a.p069a.p070a.p088h2.Metadata.C1034b;

/* renamed from: c.a.a.a.h2.m.i */
public abstract class Id3Frame implements C1034b {

    /* renamed from: a */
    public final String f7299a;

    public Id3Frame(String str) {
        this.f7299a = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public /* synthetic */ Format mo6559f() {
        return C1035b.m8698b(this);
    }

    /* renamed from: i */
    public /* synthetic */ byte[] mo6560i() {
        return C1035b.m8697a(this);
    }

    public String toString() {
        return this.f7299a;
    }
}
