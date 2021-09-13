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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.statistics.proto.b */
public class IdSnapshot implements TBase<IdSnapshot, C3256e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<C3256e, FieldMetaData> f17797d;

    /* renamed from: e */
    private static final long f17798e = -6496538196005191531L;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final TStruct f17799f = new TStruct("IdSnapshot");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final TField f17800g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final TField f17801h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TField f17802i;

    /* renamed from: j */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f17803j;

    /* renamed from: k */
    private static final int f17804k = 0;

    /* renamed from: l */
    private static final int f17805l = 1;

    /* renamed from: a */
    public String f17806a;

    /* renamed from: b */
    public long f17807b;

    /* renamed from: c */
    public int f17808c;

    /* renamed from: m */
    private byte f17809m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$a */
    /* compiled from: IdSnapshot */
    private static class C3252a extends StandardScheme<IdSnapshot> {
        private C3252a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, IdSnapshot bVar) throws TException {
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
                            TProtocolUtil.m21871a(bpVar, b);
                        } else if (b == 8) {
                            bVar.f17808c = bpVar.mo19049w();
                            bVar.mo19483c(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 10) {
                        bVar.f17807b = bpVar.mo19050x();
                        bVar.mo19481b(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 11) {
                    bVar.f17806a = bpVar.mo19052z();
                    bVar.mo19478a(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
            bpVar.mo19037k();
            if (!bVar.mo19487g()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Required field 'ts' was not found in serialized data! Struct: ");
                sb.append(toString());
                throw new TProtocolException(sb.toString());
            } else if (bVar.mo19490j()) {
                bVar.mo19491k();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Required field 'version' was not found in serialized data! Struct: ");
                sb2.append(toString());
                throw new TProtocolException(sb2.toString());
            }
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, IdSnapshot bVar) throws TException {
            bVar.mo19491k();
            bpVar.mo19020a(IdSnapshot.f17799f);
            if (bVar.f17806a != null) {
                bpVar.mo19015a(IdSnapshot.f17800g);
                bpVar.mo19021a(bVar.f17806a);
                bpVar.mo19027c();
            }
            bpVar.mo19015a(IdSnapshot.f17801h);
            bpVar.mo19014a(bVar.f17807b);
            bpVar.mo19027c();
            bpVar.mo19015a(IdSnapshot.f17802i);
            bpVar.mo19013a(bVar.f17808c);
            bpVar.mo19027c();
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b */
    /* compiled from: IdSnapshot */
    private static class C3253b implements SchemeFactory {
        private C3253b() {
        }

        /* renamed from: a */
        public C3252a mo18934b() {
            return new C3252a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$c */
    /* compiled from: IdSnapshot */
    private static class C3254c extends TupleScheme<IdSnapshot> {
        private C3254c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, IdSnapshot bVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19021a(bVar.f17806a);
            bvVar.mo19014a(bVar.f17807b);
            bvVar.mo19013a(bVar.f17808c);
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, IdSnapshot bVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bVar.f17806a = bvVar.mo19052z();
            bVar.mo19478a(true);
            bVar.f17807b = bvVar.mo19050x();
            bVar.mo19481b(true);
            bVar.f17808c = bvVar.mo19049w();
            bVar.mo19483c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$d */
    /* compiled from: IdSnapshot */
    private static class C3255d implements SchemeFactory {
        private C3255d() {
        }

        /* renamed from: a */
        public C3254c mo18934b() {
            return new C3254c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$e */
    /* compiled from: IdSnapshot */
    public enum C3256e implements TFieldIdEnum {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, "version");
        

        /* renamed from: d */
        private static final Map<String, C3256e> f17813d = null;

        /* renamed from: e */
        private final short f17815e;

        /* renamed from: f */
        private final String f17816f;

        static {
            f17813d = new HashMap();
            Iterator it = EnumSet.allOf(C3256e.class).iterator();
            while (it.hasNext()) {
                C3256e eVar = (C3256e) it.next();
                f17813d.put(eVar.mo18939b(), eVar);
            }
        }

        private C3256e(short s, String str) {
            this.f17815e = s;
            this.f17816f = str;
        }

        /* renamed from: a */
        public static C3256e m22718a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        /* renamed from: b */
        public static C3256e m22720b(int i) {
            C3256e a = m22718a(i);
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
            return this.f17816f;
        }

        /* renamed from: a */
        public static C3256e m22719a(String str) {
            return (C3256e) f17813d.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17815e;
        }
    }

    static {
        String str = "identity";
        f17800g = new TField(str, 11, 1);
        String str2 = "ts";
        f17801h = new TField(str2, 10, 2);
        String str3 = "version";
        f17802i = new TField(str3, 8, 3);
        HashMap hashMap = new HashMap();
        f17803j = hashMap;
        hashMap.put(StandardScheme.class, new C3253b());
        hashMap.put(TupleScheme.class, new C3255d());
        EnumMap enumMap = new EnumMap(C3256e.class);
        enumMap.put(C3256e.IDENTITY, new FieldMetaData(str, 1, new FieldValueMetaData(11)));
        enumMap.put(C3256e.TS, new FieldMetaData(str2, 1, new FieldValueMetaData(10)));
        enumMap.put(C3256e.VERSION, new FieldMetaData(str3, 1, new FieldValueMetaData(8)));
        Map<C3256e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f17797d = unmodifiableMap;
        FieldMetaData.m21706a(IdSnapshot.class, unmodifiableMap);
    }

    public IdSnapshot() {
        this.f17809m = 0;
    }

    /* renamed from: a */
    public IdSnapshot deepCopy() {
        return new IdSnapshot(this);
    }

    /* renamed from: b */
    public String mo19480b() {
        return this.f17806a;
    }

    /* renamed from: c */
    public void mo19482c() {
        this.f17806a = null;
    }

    public void clear() {
        this.f17806a = null;
        mo19481b(false);
        this.f17807b = 0;
        mo19483c(false);
        this.f17808c = 0;
    }

    /* renamed from: d */
    public boolean mo19484d() {
        return this.f17806a != null;
    }

    /* renamed from: e */
    public long mo19485e() {
        return this.f17807b;
    }

    /* renamed from: f */
    public void mo19486f() {
        this.f17809m = EncodingUtils.m21616b(this.f17809m, 0);
    }

    /* renamed from: g */
    public boolean mo19487g() {
        return EncodingUtils.m21612a(this.f17809m, 0);
    }

    /* renamed from: h */
    public int mo19488h() {
        return this.f17808c;
    }

    /* renamed from: i */
    public void mo19489i() {
        this.f17809m = EncodingUtils.m21616b(this.f17809m, 1);
    }

    /* renamed from: j */
    public boolean mo19490j() {
        return EncodingUtils.m21612a(this.f17809m, 1);
    }

    /* renamed from: k */
    public void mo19491k() throws TException {
        if (this.f17806a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'identity' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17803j.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f17806a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String str2 = ", ";
        sb.append(str2);
        sb.append("ts:");
        sb.append(this.f17807b);
        sb.append(str2);
        sb.append("version:");
        sb.append(this.f17808c);
        sb.append(")");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17803j.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: a */
    public IdSnapshot mo19477a(String str) {
        this.f17806a = str;
        return this;
    }

    /* renamed from: b */
    public void mo19481b(boolean z) {
        this.f17809m = EncodingUtils.m21604a(this.f17809m, 0, z);
    }

    /* renamed from: c */
    public void mo19483c(boolean z) {
        this.f17809m = EncodingUtils.m21604a(this.f17809m, 1, z);
    }

    public IdSnapshot(String str, long j, int i) {
        this();
        this.f17806a = str;
        this.f17807b = j;
        mo19481b(true);
        this.f17808c = i;
        mo19483c(true);
    }

    /* renamed from: a */
    public void mo19478a(boolean z) {
        if (!z) {
            this.f17806a = null;
        }
    }

    /* renamed from: b */
    public C3256e fieldForId(int i) {
        return C3256e.m22718a(i);
    }

    /* renamed from: a */
    public IdSnapshot mo19476a(long j) {
        this.f17807b = j;
        mo19481b(true);
        return this;
    }

    /* renamed from: a */
    public IdSnapshot mo19475a(int i) {
        this.f17808c = i;
        mo19483c(true);
        return this;
    }

    /* renamed from: a */
    private void m22683a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    public IdSnapshot(IdSnapshot bVar) {
        this.f17809m = 0;
        this.f17809m = bVar.f17809m;
        if (bVar.mo19484d()) {
            this.f17806a = bVar.f17806a;
        }
        this.f17807b = bVar.f17807b;
        this.f17808c = bVar.f17808c;
    }

    /* renamed from: a */
    private void m22682a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f17809m = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }
}
