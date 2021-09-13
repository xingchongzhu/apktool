package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.EncodingUtils;
import com.umeng.analytics.pro.FieldMetaData;
import com.umeng.analytics.pro.FieldValueMetaData;
import com.umeng.analytics.pro.IScheme;
import com.umeng.analytics.pro.SchemeFactory;
import com.umeng.analytics.pro.StandardScheme;
import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TCompactProtocol;
import com.umeng.analytics.pro.TException;
import com.umeng.analytics.pro.TField;
import com.umeng.analytics.pro.TFieldIdEnum;
import com.umeng.analytics.pro.TIOStreamTransport;
import com.umeng.analytics.pro.TProtocol;
import com.umeng.analytics.pro.TProtocolException;
import com.umeng.analytics.pro.TProtocolUtil;
import com.umeng.analytics.pro.TStruct;
import com.umeng.analytics.pro.TTupleProtocol;
import com.umeng.analytics.pro.TupleScheme;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.a */
public class IdJournal implements TBase<IdJournal, C3250e>, Serializable, Cloneable {

    /* renamed from: e */
    public static final Map<C3250e, FieldMetaData> f17774e;

    /* renamed from: f */
    private static final long f17775f = 9132678615281394583L;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final TStruct f17776g = new TStruct("IdJournal");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final TField f17777h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TField f17778i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final TField f17779j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final TField f17780k;

    /* renamed from: l */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f17781l;

    /* renamed from: m */
    private static final int f17782m = 0;

    /* renamed from: a */
    public String f17783a;

    /* renamed from: b */
    public String f17784b;

    /* renamed from: c */
    public String f17785c;

    /* renamed from: d */
    public long f17786d;

    /* renamed from: n */
    private byte f17787n;

    /* renamed from: o */
    private C3250e[] f17788o;

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a */
    /* compiled from: IdJournal */
    private static class C3246a extends StandardScheme<IdJournal> {
        private C3246a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, IdJournal aVar) throws TException {
            bpVar.mo19036j();
            while (true) {
                TField l = bpVar.mo19038l();
                byte b = l.f16825b;
                if (b == 0) {
                    break;
                }
                short s = l.f16826c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                TProtocolUtil.m21871a(bpVar, b);
                            } else if (b == 10) {
                                aVar.f17786d = bpVar.mo19050x();
                                aVar.mo19455d(true);
                            } else {
                                TProtocolUtil.m21871a(bpVar, b);
                            }
                        } else if (b == 11) {
                            aVar.f17785c = bpVar.mo19052z();
                            aVar.mo19454c(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 11) {
                        aVar.f17784b = bpVar.mo19052z();
                        aVar.mo19451b(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 11) {
                    aVar.f17783a = bpVar.mo19052z();
                    aVar.mo19448a(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
            bpVar.mo19037k();
            if (aVar.mo19465m()) {
                aVar.mo19466n();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'ts' was not found in serialized data! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, IdJournal aVar) throws TException {
            aVar.mo19466n();
            bpVar.mo19020a(IdJournal.f17776g);
            if (aVar.f17783a != null) {
                bpVar.mo19015a(IdJournal.f17777h);
                bpVar.mo19021a(aVar.f17783a);
                bpVar.mo19027c();
            }
            if (aVar.f17784b != null && aVar.mo19459g()) {
                bpVar.mo19015a(IdJournal.f17778i);
                bpVar.mo19021a(aVar.f17784b);
                bpVar.mo19027c();
            }
            if (aVar.f17785c != null) {
                bpVar.mo19015a(IdJournal.f17779j);
                bpVar.mo19021a(aVar.f17785c);
                bpVar.mo19027c();
            }
            bpVar.mo19015a(IdJournal.f17780k);
            bpVar.mo19014a(aVar.f17786d);
            bpVar.mo19027c();
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$b */
    /* compiled from: IdJournal */
    private static class C3247b implements SchemeFactory {
        private C3247b() {
        }

        /* renamed from: a */
        public C3246a mo18934b() {
            return new C3246a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$c */
    /* compiled from: IdJournal */
    private static class C3248c extends TupleScheme<IdJournal> {
        private C3248c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, IdJournal aVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19021a(aVar.f17783a);
            bvVar.mo19021a(aVar.f17785c);
            bvVar.mo19014a(aVar.f17786d);
            BitSet bitSet = new BitSet();
            if (aVar.mo19459g()) {
                bitSet.set(0);
            }
            bvVar.mo19064a(bitSet, 1);
            if (aVar.mo19459g()) {
                bvVar.mo19021a(aVar.f17784b);
            }
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, IdJournal aVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            aVar.f17783a = bvVar.mo19052z();
            aVar.mo19448a(true);
            aVar.f17785c = bvVar.mo19052z();
            aVar.mo19454c(true);
            aVar.f17786d = bvVar.mo19050x();
            aVar.mo19455d(true);
            if (bvVar.mo19065b(1).get(0)) {
                aVar.f17784b = bvVar.mo19052z();
                aVar.mo19451b(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$d */
    /* compiled from: IdJournal */
    private static class C3249d implements SchemeFactory {
        private C3249d() {
        }

        /* renamed from: a */
        public C3248c mo18934b() {
            return new C3248c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$e */
    /* compiled from: IdJournal */
    public enum C3250e implements TFieldIdEnum {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");
        

        /* renamed from: e */
        private static final Map<String, C3250e> f17793e = null;

        /* renamed from: f */
        private final short f17795f;

        /* renamed from: g */
        private final String f17796g;

        static {
            f17793e = new HashMap();
            Iterator it = EnumSet.allOf(C3250e.class).iterator();
            while (it.hasNext()) {
                C3250e eVar = (C3250e) it.next();
                f17793e.put(eVar.mo18939b(), eVar);
            }
        }

        private C3250e(short s, String str) {
            this.f17795f = s;
            this.f17796g = str;
        }

        /* renamed from: a */
        public static C3250e m22677a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        /* renamed from: b */
        public static C3250e m22679b(int i) {
            C3250e a = m22677a(i);
            if (a != null) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Field ");
            sb.append(i);
            sb.append(" doesn't exist!");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public String mo18939b() {
            return this.f17796g;
        }

        /* renamed from: a */
        public static C3250e m22678a(String str) {
            return (C3250e) f17793e.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17795f;
        }
    }

    static {
        String str = "domain";
        f17777h = new TField(str, 11, 1);
        String str2 = "old_id";
        f17778i = new TField(str2, 11, 2);
        String str3 = "new_id";
        f17779j = new TField(str3, 11, 3);
        String str4 = "ts";
        f17780k = new TField(str4, 10, 4);
        HashMap hashMap = new HashMap();
        f17781l = hashMap;
        hashMap.put(StandardScheme.class, new C3247b());
        hashMap.put(TupleScheme.class, new C3249d());
        EnumMap enumMap = new EnumMap(C3250e.class);
        enumMap.put(C3250e.DOMAIN, new FieldMetaData(str, 1, new FieldValueMetaData(11)));
        enumMap.put(C3250e.OLD_ID, new FieldMetaData(str2, 2, new FieldValueMetaData(11)));
        enumMap.put(C3250e.NEW_ID, new FieldMetaData(str3, 1, new FieldValueMetaData(11)));
        enumMap.put(C3250e.TS, new FieldMetaData(str4, 1, new FieldValueMetaData(10)));
        Map<C3250e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f17774e = unmodifiableMap;
        FieldMetaData.m21706a(IdJournal.class, unmodifiableMap);
    }

    public IdJournal() {
        this.f17787n = 0;
        this.f17788o = new C3250e[]{C3250e.OLD_ID};
    }

    /* renamed from: a */
    public IdJournal deepCopy() {
        return new IdJournal(this);
    }

    /* renamed from: b */
    public String mo19450b() {
        return this.f17783a;
    }

    /* renamed from: c */
    public void mo19453c() {
        this.f17783a = null;
    }

    public void clear() {
        this.f17783a = null;
        this.f17784b = null;
        this.f17785c = null;
        mo19455d(false);
        this.f17786d = 0;
    }

    /* renamed from: d */
    public boolean mo19456d() {
        return this.f17783a != null;
    }

    /* renamed from: e */
    public String mo19457e() {
        return this.f17784b;
    }

    /* renamed from: f */
    public void mo19458f() {
        this.f17784b = null;
    }

    /* renamed from: g */
    public boolean mo19459g() {
        return this.f17784b != null;
    }

    /* renamed from: h */
    public String mo19460h() {
        return this.f17785c;
    }

    /* renamed from: i */
    public void mo19461i() {
        this.f17785c = null;
    }

    /* renamed from: j */
    public boolean mo19462j() {
        return this.f17785c != null;
    }

    /* renamed from: k */
    public long mo19463k() {
        return this.f17786d;
    }

    /* renamed from: l */
    public void mo19464l() {
        this.f17787n = EncodingUtils.m21616b(this.f17787n, 0);
    }

    /* renamed from: m */
    public boolean mo19465m() {
        return EncodingUtils.m21612a(this.f17787n, 0);
    }

    /* renamed from: n */
    public void mo19466n() throws TException {
        if (this.f17783a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'domain' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        } else if (this.f17785c == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Required field 'new_id' was not present! Struct: ");
            sb2.append(toString());
            throw new TProtocolException(sb2.toString());
        }
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17781l.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f17783a;
        String str2 = "null";
        if (str == null) {
            sb.append(str2);
        } else {
            sb.append(str);
        }
        String str3 = ", ";
        if (mo19459g()) {
            sb.append(str3);
            sb.append("old_id:");
            String str4 = this.f17784b;
            if (str4 == null) {
                sb.append(str2);
            } else {
                sb.append(str4);
            }
        }
        sb.append(str3);
        sb.append("new_id:");
        String str5 = this.f17785c;
        if (str5 == null) {
            sb.append(str2);
        } else {
            sb.append(str5);
        }
        sb.append(str3);
        sb.append("ts:");
        sb.append(this.f17786d);
        sb.append(")");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17781l.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: a */
    public IdJournal mo19447a(String str) {
        this.f17783a = str;
        return this;
    }

    /* renamed from: b */
    public IdJournal mo19449b(String str) {
        this.f17784b = str;
        return this;
    }

    /* renamed from: c */
    public IdJournal mo19452c(String str) {
        this.f17785c = str;
        return this;
    }

    /* renamed from: d */
    public void mo19455d(boolean z) {
        this.f17787n = EncodingUtils.m21604a(this.f17787n, 0, z);
    }

    /* renamed from: a */
    public void mo19448a(boolean z) {
        if (!z) {
            this.f17783a = null;
        }
    }

    /* renamed from: b */
    public void mo19451b(boolean z) {
        if (!z) {
            this.f17784b = null;
        }
    }

    /* renamed from: c */
    public void mo19454c(boolean z) {
        if (!z) {
            this.f17785c = null;
        }
    }

    public IdJournal(String str, String str2, long j) {
        this();
        this.f17783a = str;
        this.f17785c = str2;
        this.f17786d = j;
        mo19455d(true);
    }

    /* renamed from: a */
    public IdJournal mo19446a(long j) {
        this.f17786d = j;
        mo19455d(true);
        return this;
    }

    /* renamed from: a */
    public C3250e fieldForId(int i) {
        return C3250e.m22677a(i);
    }

    /* renamed from: a */
    private void m22636a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    public IdJournal(IdJournal aVar) {
        this.f17787n = 0;
        this.f17788o = new C3250e[]{C3250e.OLD_ID};
        this.f17787n = aVar.f17787n;
        if (aVar.mo19456d()) {
            this.f17783a = aVar.f17783a;
        }
        if (aVar.mo19459g()) {
            this.f17784b = aVar.f17784b;
        }
        if (aVar.mo19462j()) {
            this.f17785c = aVar.f17785c;
        }
        this.f17786d = aVar.f17786d;
    }

    /* renamed from: a */
    private void m22635a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f17787n = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }
}
