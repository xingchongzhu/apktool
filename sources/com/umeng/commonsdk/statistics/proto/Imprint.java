package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.EncodingUtils;
import com.umeng.analytics.pro.FieldMetaData;
import com.umeng.analytics.pro.FieldValueMetaData;
import com.umeng.analytics.pro.IScheme;
import com.umeng.analytics.pro.MapMetaData;
import com.umeng.analytics.pro.SchemeFactory;
import com.umeng.analytics.pro.StandardScheme;
import com.umeng.analytics.pro.StructMetaData;
import com.umeng.analytics.pro.TBase;
import com.umeng.analytics.pro.TCompactProtocol;
import com.umeng.analytics.pro.TException;
import com.umeng.analytics.pro.TField;
import com.umeng.analytics.pro.TFieldIdEnum;
import com.umeng.analytics.pro.TIOStreamTransport;
import com.umeng.analytics.pro.TMap;
import com.umeng.analytics.pro.TProtocol;
import com.umeng.analytics.pro.TProtocolException;
import com.umeng.analytics.pro.TProtocolUtil;
import com.umeng.analytics.pro.TStruct;
import com.umeng.analytics.pro.TTupleProtocol;
import com.umeng.analytics.pro.TType;
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
import java.util.Map.Entry;

/* renamed from: com.umeng.commonsdk.statistics.proto.d */
public class Imprint implements TBase<Imprint, C3268e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<C3268e, FieldMetaData> f17835d;

    /* renamed from: e */
    private static final long f17836e = 2846460275012375038L;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final TStruct f17837f = new TStruct("Imprint");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final TField f17838g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final TField f17839h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TField f17840i;

    /* renamed from: j */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f17841j;

    /* renamed from: k */
    private static final int f17842k = 0;

    /* renamed from: a */
    public Map<String, ImprintValue> f17843a;

    /* renamed from: b */
    public int f17844b;

    /* renamed from: c */
    public String f17845c;

    /* renamed from: l */
    private byte f17846l;

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$a */
    /* compiled from: Imprint */
    private static class C3264a extends StandardScheme<Imprint> {
        private C3264a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, Imprint dVar) throws TException {
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
                        } else if (b == 11) {
                            dVar.f17845c = bpVar.mo19052z();
                            dVar.mo19539c(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 8) {
                        dVar.f17844b = bpVar.mo19049w();
                        dVar.mo19537b(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 13) {
                    TMap n = bpVar.mo19040n();
                    dVar.f17843a = new HashMap(n.f16831c * 2);
                    for (int i = 0; i < n.f16831c; i++) {
                        String z = bpVar.mo19052z();
                        ImprintValue eVar = new ImprintValue();
                        eVar.read(bpVar);
                        dVar.f17843a.put(z, eVar);
                    }
                    bpVar.mo19041o();
                    dVar.mo19534a(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
            bpVar.mo19037k();
            if (dVar.mo19544h()) {
                dVar.mo19548l();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'version' was not found in serialized data! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, Imprint dVar) throws TException {
            dVar.mo19548l();
            bpVar.mo19020a(Imprint.f17837f);
            if (dVar.f17843a != null) {
                bpVar.mo19015a(Imprint.f17838g);
                bpVar.mo19017a(new TMap(11, 12, dVar.f17843a.size()));
                for (Entry entry : dVar.f17843a.entrySet()) {
                    bpVar.mo19021a((String) entry.getKey());
                    ((ImprintValue) entry.getValue()).write(bpVar);
                }
                bpVar.mo19031e();
                bpVar.mo19027c();
            }
            bpVar.mo19015a(Imprint.f17839h);
            bpVar.mo19013a(dVar.f17844b);
            bpVar.mo19027c();
            if (dVar.f17845c != null) {
                bpVar.mo19015a(Imprint.f17840i);
                bpVar.mo19021a(dVar.f17845c);
                bpVar.mo19027c();
            }
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$b */
    /* compiled from: Imprint */
    private static class C3265b implements SchemeFactory {
        private C3265b() {
        }

        /* renamed from: a */
        public C3264a mo18934b() {
            return new C3264a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$c */
    /* compiled from: Imprint */
    private static class C3266c extends TupleScheme<Imprint> {
        private C3266c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, Imprint dVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19013a(dVar.f17843a.size());
            for (Entry entry : dVar.f17843a.entrySet()) {
                bvVar.mo19021a((String) entry.getKey());
                ((ImprintValue) entry.getValue()).write(bvVar);
            }
            bvVar.mo19013a(dVar.f17844b);
            bvVar.mo19021a(dVar.f17845c);
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, Imprint dVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            TMap bmVar = new TMap(11, 12, bvVar.mo19049w());
            dVar.f17843a = new HashMap(bmVar.f16831c * 2);
            for (int i = 0; i < bmVar.f16831c; i++) {
                String z = bvVar.mo19052z();
                ImprintValue eVar = new ImprintValue();
                eVar.read(bvVar);
                dVar.f17843a.put(z, eVar);
            }
            dVar.mo19534a(true);
            dVar.f17844b = bvVar.mo19049w();
            dVar.mo19537b(true);
            dVar.f17845c = bvVar.mo19052z();
            dVar.mo19539c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d */
    /* compiled from: Imprint */
    private static class C3267d implements SchemeFactory {
        private C3267d() {
        }

        /* renamed from: a */
        public C3266c mo18934b() {
            return new C3266c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$e */
    /* compiled from: Imprint */
    public enum C3268e implements TFieldIdEnum {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d */
        private static final Map<String, C3268e> f17850d = null;

        /* renamed from: e */
        private final short f17852e;

        /* renamed from: f */
        private final String f17853f;

        static {
            f17850d = new HashMap();
            Iterator it = EnumSet.allOf(C3268e.class).iterator();
            while (it.hasNext()) {
                C3268e eVar = (C3268e) it.next();
                f17850d.put(eVar.mo18939b(), eVar);
            }
        }

        private C3268e(short s, String str) {
            this.f17852e = s;
            this.f17853f = str;
        }

        /* renamed from: a */
        public static C3268e m22807a(int i) {
            if (i == 1) {
                return PROPERTY;
            }
            if (i == 2) {
                return VERSION;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static C3268e m22809b(int i) {
            C3268e a = m22807a(i);
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
            return this.f17853f;
        }

        /* renamed from: a */
        public static C3268e m22808a(String str) {
            return (C3268e) f17850d.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17852e;
        }
    }

    static {
        String str = "property";
        f17838g = new TField(str, TType.f16862k, 1);
        String str2 = "version";
        f17839h = new TField(str2, 8, 2);
        String str3 = "checksum";
        f17840i = new TField(str3, 11, 3);
        HashMap hashMap = new HashMap();
        f17841j = hashMap;
        hashMap.put(StandardScheme.class, new C3265b());
        hashMap.put(TupleScheme.class, new C3267d());
        EnumMap enumMap = new EnumMap(C3268e.class);
        enumMap.put(C3268e.PROPERTY, new FieldMetaData(str, 1, new MapMetaData(TType.f16862k, new FieldValueMetaData(11), new StructMetaData(12, ImprintValue.class))));
        enumMap.put(C3268e.VERSION, new FieldMetaData(str2, 1, new FieldValueMetaData(8)));
        enumMap.put(C3268e.CHECKSUM, new FieldMetaData(str3, 1, new FieldValueMetaData(11)));
        Map<C3268e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f17835d = unmodifiableMap;
        FieldMetaData.m21706a(Imprint.class, unmodifiableMap);
    }

    public Imprint() {
        this.f17846l = 0;
    }

    /* renamed from: a */
    public Imprint deepCopy() {
        return new Imprint(this);
    }

    /* renamed from: b */
    public int mo19535b() {
        Map<String, ImprintValue> map = this.f17843a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, ImprintValue> mo19538c() {
        return this.f17843a;
    }

    public void clear() {
        this.f17843a = null;
        mo19537b(false);
        this.f17844b = 0;
        this.f17845c = null;
    }

    /* renamed from: d */
    public void mo19540d() {
        this.f17843a = null;
    }

    /* renamed from: e */
    public boolean mo19541e() {
        return this.f17843a != null;
    }

    /* renamed from: f */
    public int mo19542f() {
        return this.f17844b;
    }

    /* renamed from: g */
    public void mo19543g() {
        this.f17846l = EncodingUtils.m21616b(this.f17846l, 0);
    }

    /* renamed from: h */
    public boolean mo19544h() {
        return EncodingUtils.m21612a(this.f17846l, 0);
    }

    /* renamed from: i */
    public String mo19545i() {
        return this.f17845c;
    }

    /* renamed from: j */
    public void mo19546j() {
        this.f17845c = null;
    }

    /* renamed from: k */
    public boolean mo19547k() {
        return this.f17845c != null;
    }

    /* renamed from: l */
    public void mo19548l() throws TException {
        if (this.f17843a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'property' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        } else if (this.f17845c == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Required field 'checksum' was not present! Struct: ");
            sb2.append(toString());
            throw new TProtocolException(sb2.toString());
        }
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17841j.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, ImprintValue> map = this.f17843a;
        String str = "null";
        if (map == null) {
            sb.append(str);
        } else {
            sb.append(map);
        }
        String str2 = ", ";
        sb.append(str2);
        sb.append("version:");
        sb.append(this.f17844b);
        sb.append(str2);
        sb.append("checksum:");
        String str3 = this.f17845c;
        if (str3 == null) {
            sb.append(str);
        } else {
            sb.append(str3);
        }
        sb.append(")");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17841j.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: a */
    public void mo19533a(String str, ImprintValue eVar) {
        if (this.f17843a == null) {
            this.f17843a = new HashMap();
        }
        this.f17843a.put(str, eVar);
    }

    /* renamed from: b */
    public void mo19537b(boolean z) {
        this.f17846l = EncodingUtils.m21604a(this.f17846l, 0, z);
    }

    /* renamed from: c */
    public void mo19539c(boolean z) {
        if (!z) {
            this.f17845c = null;
        }
    }

    public Imprint(Map<String, ImprintValue> map, int i, String str) {
        this();
        this.f17843a = map;
        this.f17844b = i;
        mo19537b(true);
        this.f17845c = str;
    }

    /* renamed from: b */
    public C3268e fieldForId(int i) {
        return C3268e.m22807a(i);
    }

    /* renamed from: a */
    public Imprint mo19532a(Map<String, ImprintValue> map) {
        this.f17843a = map;
        return this;
    }

    /* renamed from: a */
    public void mo19534a(boolean z) {
        if (!z) {
            this.f17843a = null;
        }
    }

    /* renamed from: a */
    public Imprint mo19530a(int i) {
        this.f17844b = i;
        mo19537b(true);
        return this;
    }

    public Imprint(Imprint dVar) {
        this.f17846l = 0;
        this.f17846l = dVar.f17846l;
        if (dVar.mo19541e()) {
            HashMap hashMap = new HashMap();
            for (Entry entry : dVar.f17843a.entrySet()) {
                hashMap.put((String) entry.getKey(), new ImprintValue((ImprintValue) entry.getValue()));
            }
            this.f17843a = hashMap;
        }
        this.f17844b = dVar.f17844b;
        if (dVar.mo19547k()) {
            this.f17845c = dVar.f17845c;
        }
    }

    /* renamed from: a */
    public Imprint mo19531a(String str) {
        this.f17845c = str;
        return this;
    }

    /* renamed from: a */
    private void m22770a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m22769a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f17846l = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }
}
