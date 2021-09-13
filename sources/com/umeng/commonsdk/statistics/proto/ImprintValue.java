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

/* renamed from: com.umeng.commonsdk.statistics.proto.e */
public class ImprintValue implements TBase<ImprintValue, C3274e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<C3274e, FieldMetaData> f17854d;

    /* renamed from: e */
    private static final long f17855e = 7501688097813630241L;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final TStruct f17856f = new TStruct("ImprintValue");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final TField f17857g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final TField f17858h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TField f17859i;

    /* renamed from: j */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f17860j;

    /* renamed from: k */
    private static final int f17861k = 0;

    /* renamed from: a */
    public String f17862a;

    /* renamed from: b */
    public long f17863b;

    /* renamed from: c */
    public String f17864c;

    /* renamed from: l */
    private byte f17865l;

    /* renamed from: m */
    private C3274e[] f17866m;

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$a */
    /* compiled from: ImprintValue */
    private static class C3270a extends StandardScheme<ImprintValue> {
        private C3270a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, ImprintValue eVar) throws TException {
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
                            eVar.f17864c = bpVar.mo19052z();
                            eVar.mo19565c(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 10) {
                        eVar.f17863b = bpVar.mo19050x();
                        eVar.mo19563b(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 11) {
                    eVar.f17862a = bpVar.mo19052z();
                    eVar.mo19560a(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
            bpVar.mo19037k();
            if (eVar.mo19569g()) {
                eVar.mo19573k();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'ts' was not found in serialized data! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, ImprintValue eVar) throws TException {
            eVar.mo19573k();
            bpVar.mo19020a(ImprintValue.f17856f);
            if (eVar.f17862a != null && eVar.mo19566d()) {
                bpVar.mo19015a(ImprintValue.f17857g);
                bpVar.mo19021a(eVar.f17862a);
                bpVar.mo19027c();
            }
            bpVar.mo19015a(ImprintValue.f17858h);
            bpVar.mo19014a(eVar.f17863b);
            bpVar.mo19027c();
            if (eVar.f17864c != null) {
                bpVar.mo19015a(ImprintValue.f17859i);
                bpVar.mo19021a(eVar.f17864c);
                bpVar.mo19027c();
            }
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$b */
    /* compiled from: ImprintValue */
    private static class C3271b implements SchemeFactory {
        private C3271b() {
        }

        /* renamed from: a */
        public C3270a mo18934b() {
            return new C3270a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$c */
    /* compiled from: ImprintValue */
    private static class C3272c extends TupleScheme<ImprintValue> {
        private C3272c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, ImprintValue eVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19014a(eVar.f17863b);
            bvVar.mo19021a(eVar.f17864c);
            BitSet bitSet = new BitSet();
            if (eVar.mo19566d()) {
                bitSet.set(0);
            }
            bvVar.mo19064a(bitSet, 1);
            if (eVar.mo19566d()) {
                bvVar.mo19021a(eVar.f17862a);
            }
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, ImprintValue eVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            eVar.f17863b = bvVar.mo19050x();
            eVar.mo19563b(true);
            eVar.f17864c = bvVar.mo19052z();
            eVar.mo19565c(true);
            if (bvVar.mo19065b(1).get(0)) {
                eVar.f17862a = bvVar.mo19052z();
                eVar.mo19560a(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$d */
    /* compiled from: ImprintValue */
    private static class C3273d implements SchemeFactory {
        private C3273d() {
        }

        /* renamed from: a */
        public C3272c mo18934b() {
            return new C3272c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e */
    /* compiled from: ImprintValue */
    public enum C3274e implements TFieldIdEnum {
        VALUE(1, "value"),
        TS(2, "ts"),
        GUID(3, "guid");
        

        /* renamed from: d */
        private static final Map<String, C3274e> f17870d = null;

        /* renamed from: e */
        private final short f17872e;

        /* renamed from: f */
        private final String f17873f;

        static {
            f17870d = new HashMap();
            Iterator it = EnumSet.allOf(C3274e.class).iterator();
            while (it.hasNext()) {
                C3274e eVar = (C3274e) it.next();
                f17870d.put(eVar.mo18939b(), eVar);
            }
        }

        private C3274e(short s, String str) {
            this.f17872e = s;
            this.f17873f = str;
        }

        /* renamed from: a */
        public static C3274e m22848a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        /* renamed from: b */
        public static C3274e m22850b(int i) {
            C3274e a = m22848a(i);
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
            return this.f17873f;
        }

        /* renamed from: a */
        public static C3274e m22849a(String str) {
            return (C3274e) f17870d.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17872e;
        }
    }

    static {
        String str = "value";
        f17857g = new TField(str, 11, 1);
        String str2 = "ts";
        f17858h = new TField(str2, 10, 2);
        String str3 = "guid";
        f17859i = new TField(str3, 11, 3);
        HashMap hashMap = new HashMap();
        f17860j = hashMap;
        hashMap.put(StandardScheme.class, new C3271b());
        hashMap.put(TupleScheme.class, new C3273d());
        EnumMap enumMap = new EnumMap(C3274e.class);
        enumMap.put(C3274e.VALUE, new FieldMetaData(str, 2, new FieldValueMetaData(11)));
        enumMap.put(C3274e.TS, new FieldMetaData(str2, 1, new FieldValueMetaData(10)));
        enumMap.put(C3274e.GUID, new FieldMetaData(str3, 1, new FieldValueMetaData(11)));
        Map<C3274e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f17854d = unmodifiableMap;
        FieldMetaData.m21706a(ImprintValue.class, unmodifiableMap);
    }

    public ImprintValue() {
        this.f17865l = 0;
        this.f17866m = new C3274e[]{C3274e.VALUE};
    }

    /* renamed from: a */
    public ImprintValue deepCopy() {
        return new ImprintValue(this);
    }

    /* renamed from: b */
    public String mo19562b() {
        return this.f17862a;
    }

    /* renamed from: c */
    public void mo19564c() {
        this.f17862a = null;
    }

    public void clear() {
        this.f17862a = null;
        mo19563b(false);
        this.f17863b = 0;
        this.f17864c = null;
    }

    /* renamed from: d */
    public boolean mo19566d() {
        return this.f17862a != null;
    }

    /* renamed from: e */
    public long mo19567e() {
        return this.f17863b;
    }

    /* renamed from: f */
    public void mo19568f() {
        this.f17865l = EncodingUtils.m21616b(this.f17865l, 0);
    }

    /* renamed from: g */
    public boolean mo19569g() {
        return EncodingUtils.m21612a(this.f17865l, 0);
    }

    /* renamed from: h */
    public String mo19570h() {
        return this.f17864c;
    }

    /* renamed from: i */
    public void mo19571i() {
        this.f17864c = null;
    }

    /* renamed from: j */
    public boolean mo19572j() {
        return this.f17864c != null;
    }

    /* renamed from: k */
    public void mo19573k() throws TException {
        if (this.f17864c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'guid' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17860j.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        String str = "null";
        if (mo19566d()) {
            sb.append("value:");
            String str2 = this.f17862a;
            if (str2 == null) {
                sb.append(str);
            } else {
                sb.append(str2);
            }
            z = false;
        } else {
            z = true;
        }
        String str3 = ", ";
        if (!z) {
            sb.append(str3);
        }
        sb.append("ts:");
        sb.append(this.f17863b);
        sb.append(str3);
        sb.append("guid:");
        String str4 = this.f17864c;
        if (str4 == null) {
            sb.append(str);
        } else {
            sb.append(str4);
        }
        sb.append(")");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17860j.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: a */
    public ImprintValue mo19559a(String str) {
        this.f17862a = str;
        return this;
    }

    /* renamed from: b */
    public void mo19563b(boolean z) {
        this.f17865l = EncodingUtils.m21604a(this.f17865l, 0, z);
    }

    /* renamed from: c */
    public void mo19565c(boolean z) {
        if (!z) {
            this.f17864c = null;
        }
    }

    /* renamed from: a */
    public void mo19560a(boolean z) {
        if (!z) {
            this.f17862a = null;
        }
    }

    /* renamed from: b */
    public ImprintValue mo19561b(String str) {
        this.f17864c = str;
        return this;
    }

    public ImprintValue(long j, String str) {
        this();
        this.f17863b = j;
        mo19563b(true);
        this.f17864c = str;
    }

    /* renamed from: a */
    public ImprintValue mo19558a(long j) {
        this.f17863b = j;
        mo19563b(true);
        return this;
    }

    /* renamed from: a */
    public C3274e fieldForId(int i) {
        return C3274e.m22848a(i);
    }

    /* renamed from: a */
    private void m22813a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    public ImprintValue(ImprintValue eVar) {
        this.f17865l = 0;
        this.f17866m = new C3274e[]{C3274e.VALUE};
        this.f17865l = eVar.f17865l;
        if (eVar.mo19566d()) {
            this.f17862a = eVar.f17862a;
        }
        this.f17863b = eVar.f17863b;
        if (eVar.mo19572j()) {
            this.f17864c = eVar.f17864c;
        }
    }

    /* renamed from: a */
    private void m22812a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f17865l = 0;
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }
}
