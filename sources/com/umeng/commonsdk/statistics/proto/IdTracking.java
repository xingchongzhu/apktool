package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.FieldMetaData;
import com.umeng.analytics.pro.FieldValueMetaData;
import com.umeng.analytics.pro.IScheme;
import com.umeng.analytics.pro.ListMetaData;
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
import com.umeng.analytics.pro.TList;
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
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.umeng.commonsdk.statistics.proto.c */
public class IdTracking implements TBase<IdTracking, C3262e>, Serializable, Cloneable {

    /* renamed from: d */
    public static final Map<C3262e, FieldMetaData> f17817d;

    /* renamed from: e */
    private static final long f17818e = -5764118265293965743L;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final TStruct f17819f = new TStruct("IdTracking");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final TField f17820g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final TField f17821h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final TField f17822i;

    /* renamed from: j */
    private static final Map<Class<? extends IScheme>, SchemeFactory> f17823j;

    /* renamed from: a */
    public Map<String, IdSnapshot> f17824a;

    /* renamed from: b */
    public List<IdJournal> f17825b;

    /* renamed from: c */
    public String f17826c;

    /* renamed from: k */
    private C3262e[] f17827k;

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$a */
    /* compiled from: IdTracking */
    private static class C3258a extends StandardScheme<IdTracking> {
        private C3258a() {
        }

        /* renamed from: a */
        public void mo18932b(TProtocol bpVar, IdTracking cVar) throws TException {
            bpVar.mo19036j();
            while (true) {
                TField l = bpVar.mo19038l();
                byte b = l.f16825b;
                if (b == 0) {
                    bpVar.mo19037k();
                    cVar.mo19521n();
                    return;
                }
                short s = l.f16826c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            TProtocolUtil.m21871a(bpVar, b);
                        } else if (b == 11) {
                            cVar.f17826c = bpVar.mo19052z();
                            cVar.mo19510c(true);
                        } else {
                            TProtocolUtil.m21871a(bpVar, b);
                        }
                    } else if (b == 15) {
                        TList p = bpVar.mo19042p();
                        cVar.f17825b = new ArrayList(p.f16828b);
                        while (i < p.f16828b) {
                            IdJournal aVar = new IdJournal();
                            aVar.read(bpVar);
                            cVar.f17825b.add(aVar);
                            i++;
                        }
                        bpVar.mo19043q();
                        cVar.mo19508b(true);
                    } else {
                        TProtocolUtil.m21871a(bpVar, b);
                    }
                } else if (b == 13) {
                    TMap n = bpVar.mo19040n();
                    cVar.f17824a = new HashMap(n.f16831c * 2);
                    while (i < n.f16831c) {
                        String z = bpVar.mo19052z();
                        IdSnapshot bVar = new IdSnapshot();
                        bVar.read(bpVar);
                        cVar.f17824a.put(z, bVar);
                        i++;
                    }
                    bpVar.mo19041o();
                    cVar.mo19506a(true);
                } else {
                    TProtocolUtil.m21871a(bpVar, b);
                }
                bpVar.mo19039m();
            }
        }

        /* renamed from: b */
        public void mo18930a(TProtocol bpVar, IdTracking cVar) throws TException {
            cVar.mo19521n();
            bpVar.mo19020a(IdTracking.f17819f);
            if (cVar.f17824a != null) {
                bpVar.mo19015a(IdTracking.f17820g);
                bpVar.mo19017a(new TMap(11, 12, cVar.f17824a.size()));
                for (Entry entry : cVar.f17824a.entrySet()) {
                    bpVar.mo19021a((String) entry.getKey());
                    ((IdSnapshot) entry.getValue()).write(bpVar);
                }
                bpVar.mo19031e();
                bpVar.mo19027c();
            }
            if (cVar.f17825b != null && cVar.mo19517j()) {
                bpVar.mo19015a(IdTracking.f17821h);
                bpVar.mo19016a(new TList(12, cVar.f17825b.size()));
                for (IdJournal write : cVar.f17825b) {
                    write.write(bpVar);
                }
                bpVar.mo19032f();
                bpVar.mo19027c();
            }
            if (cVar.f17826c != null && cVar.mo19520m()) {
                bpVar.mo19015a(IdTracking.f17822i);
                bpVar.mo19021a(cVar.f17826c);
                bpVar.mo19027c();
            }
            bpVar.mo19029d();
            bpVar.mo19026b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$b */
    /* compiled from: IdTracking */
    private static class C3259b implements SchemeFactory {
        private C3259b() {
        }

        /* renamed from: a */
        public C3258a mo18934b() {
            return new C3258a();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c */
    /* compiled from: IdTracking */
    private static class C3260c extends TupleScheme<IdTracking> {
        private C3260c() {
        }

        /* renamed from: a */
        public void mo18930a(TProtocol bpVar, IdTracking cVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            bvVar.mo19013a(cVar.f17824a.size());
            for (Entry entry : cVar.f17824a.entrySet()) {
                bvVar.mo19021a((String) entry.getKey());
                ((IdSnapshot) entry.getValue()).write(bvVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.mo19517j()) {
                bitSet.set(0);
            }
            if (cVar.mo19520m()) {
                bitSet.set(1);
            }
            bvVar.mo19064a(bitSet, 2);
            if (cVar.mo19517j()) {
                bvVar.mo19013a(cVar.f17825b.size());
                for (IdJournal write : cVar.f17825b) {
                    write.write(bvVar);
                }
            }
            if (cVar.mo19520m()) {
                bvVar.mo19021a(cVar.f17826c);
            }
        }

        /* renamed from: b */
        public void mo18932b(TProtocol bpVar, IdTracking cVar) throws TException {
            TTupleProtocol bvVar = (TTupleProtocol) bpVar;
            TMap bmVar = new TMap(11, 12, bvVar.mo19049w());
            cVar.f17824a = new HashMap(bmVar.f16831c * 2);
            for (int i = 0; i < bmVar.f16831c; i++) {
                String z = bvVar.mo19052z();
                IdSnapshot bVar = new IdSnapshot();
                bVar.read(bvVar);
                cVar.f17824a.put(z, bVar);
            }
            cVar.mo19506a(true);
            BitSet b = bvVar.mo19065b(2);
            if (b.get(0)) {
                TList blVar = new TList(12, bvVar.mo19049w());
                cVar.f17825b = new ArrayList(blVar.f16828b);
                for (int i2 = 0; i2 < blVar.f16828b; i2++) {
                    IdJournal aVar = new IdJournal();
                    aVar.read(bvVar);
                    cVar.f17825b.add(aVar);
                }
                cVar.mo19508b(true);
            }
            if (b.get(1)) {
                cVar.f17826c = bvVar.mo19052z();
                cVar.mo19510c(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$d */
    /* compiled from: IdTracking */
    private static class C3261d implements SchemeFactory {
        private C3261d() {
        }

        /* renamed from: a */
        public C3260c mo18934b() {
            return new C3260c();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$e */
    /* compiled from: IdTracking */
    public enum C3262e implements TFieldIdEnum {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d */
        private static final Map<String, C3262e> f17831d = null;

        /* renamed from: e */
        private final short f17833e;

        /* renamed from: f */
        private final String f17834f;

        static {
            f17831d = new HashMap();
            Iterator it = EnumSet.allOf(C3262e.class).iterator();
            while (it.hasNext()) {
                C3262e eVar = (C3262e) it.next();
                f17831d.put(eVar.mo18939b(), eVar);
            }
        }

        private C3262e(short s, String str) {
            this.f17833e = s;
            this.f17834f = str;
        }

        /* renamed from: a */
        public static C3262e m22764a(int i) {
            if (i == 1) {
                return SNAPSHOTS;
            }
            if (i == 2) {
                return JOURNALS;
            }
            if (i != 3) {
                return null;
            }
            return CHECKSUM;
        }

        /* renamed from: b */
        public static C3262e m22766b(int i) {
            C3262e a = m22764a(i);
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
            return this.f17834f;
        }

        /* renamed from: a */
        public static C3262e m22765a(String str) {
            return (C3262e) f17831d.get(str);
        }

        /* renamed from: a */
        public short mo18938a() {
            return this.f17833e;
        }
    }

    static {
        String str = "snapshots";
        f17820g = new TField(str, TType.f16862k, 1);
        String str2 = "journals";
        f17821h = new TField(str2, TType.f16864m, 2);
        String str3 = "checksum";
        f17822i = new TField(str3, 11, 3);
        HashMap hashMap = new HashMap();
        f17823j = hashMap;
        hashMap.put(StandardScheme.class, new C3259b());
        hashMap.put(TupleScheme.class, new C3261d());
        EnumMap enumMap = new EnumMap(C3262e.class);
        enumMap.put(C3262e.SNAPSHOTS, new FieldMetaData(str, 1, new MapMetaData(TType.f16862k, new FieldValueMetaData(11), new StructMetaData(12, IdSnapshot.class))));
        enumMap.put(C3262e.JOURNALS, new FieldMetaData(str2, 2, new ListMetaData(TType.f16864m, new StructMetaData(12, IdJournal.class))));
        enumMap.put(C3262e.CHECKSUM, new FieldMetaData(str3, 2, new FieldValueMetaData(11)));
        Map<C3262e, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f17817d = unmodifiableMap;
        FieldMetaData.m21706a(IdTracking.class, unmodifiableMap);
    }

    public IdTracking() {
        this.f17827k = new C3262e[]{C3262e.JOURNALS, C3262e.CHECKSUM};
    }

    /* renamed from: a */
    public IdTracking deepCopy() {
        return new IdTracking(this);
    }

    /* renamed from: b */
    public int mo19507b() {
        Map<String, IdSnapshot> map = this.f17824a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    /* renamed from: c */
    public Map<String, IdSnapshot> mo19509c() {
        return this.f17824a;
    }

    public void clear() {
        this.f17824a = null;
        this.f17825b = null;
        this.f17826c = null;
    }

    /* renamed from: d */
    public void mo19511d() {
        this.f17824a = null;
    }

    /* renamed from: e */
    public boolean mo19512e() {
        return this.f17824a != null;
    }

    /* renamed from: f */
    public int mo19513f() {
        List<IdJournal> list = this.f17825b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: g */
    public Iterator<IdJournal> mo19514g() {
        List<IdJournal> list = this.f17825b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    /* renamed from: h */
    public List<IdJournal> mo19515h() {
        return this.f17825b;
    }

    /* renamed from: i */
    public void mo19516i() {
        this.f17825b = null;
    }

    /* renamed from: j */
    public boolean mo19517j() {
        return this.f17825b != null;
    }

    /* renamed from: k */
    public String mo19518k() {
        return this.f17826c;
    }

    /* renamed from: l */
    public void mo19519l() {
        this.f17826c = null;
    }

    /* renamed from: m */
    public boolean mo19520m() {
        return this.f17826c != null;
    }

    /* renamed from: n */
    public void mo19521n() throws TException {
        if (this.f17824a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Required field 'snapshots' was not present! Struct: ");
            sb.append(toString());
            throw new TProtocolException(sb.toString());
        }
    }

    public void read(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17823j.get(bpVar.mo19062D())).mo18934b().mo18932b(bpVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, IdSnapshot> map = this.f17824a;
        String str = "null";
        if (map == null) {
            sb.append(str);
        } else {
            sb.append(map);
        }
        String str2 = ", ";
        if (mo19517j()) {
            sb.append(str2);
            sb.append("journals:");
            List<IdJournal> list = this.f17825b;
            if (list == null) {
                sb.append(str);
            } else {
                sb.append(list);
            }
        }
        if (mo19520m()) {
            sb.append(str2);
            sb.append("checksum:");
            String str3 = this.f17826c;
            if (str3 == null) {
                sb.append(str);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void write(TProtocol bpVar) throws TException {
        ((SchemeFactory) f17823j.get(bpVar.mo19062D())).mo18934b().mo18930a(bpVar, this);
    }

    /* renamed from: a */
    public void mo19505a(String str, IdSnapshot bVar) {
        if (this.f17824a == null) {
            this.f17824a = new HashMap();
        }
        this.f17824a.put(str, bVar);
    }

    /* renamed from: b */
    public void mo19508b(boolean z) {
        if (!z) {
            this.f17825b = null;
        }
    }

    /* renamed from: c */
    public void mo19510c(boolean z) {
        if (!z) {
            this.f17826c = null;
        }
    }

    public IdTracking(Map<String, IdSnapshot> map) {
        this();
        this.f17824a = map;
    }

    public IdTracking(IdTracking cVar) {
        this.f17827k = new C3262e[]{C3262e.JOURNALS, C3262e.CHECKSUM};
        if (cVar.mo19512e()) {
            HashMap hashMap = new HashMap();
            for (Entry entry : cVar.f17824a.entrySet()) {
                hashMap.put((String) entry.getKey(), new IdSnapshot((IdSnapshot) entry.getValue()));
            }
            this.f17824a = hashMap;
        }
        if (cVar.mo19517j()) {
            ArrayList arrayList = new ArrayList();
            for (IdJournal aVar : cVar.f17825b) {
                arrayList.add(new IdJournal(aVar));
            }
            this.f17825b = arrayList;
        }
        if (cVar.mo19520m()) {
            this.f17826c = cVar.f17826c;
        }
    }

    /* renamed from: a */
    public IdTracking mo19503a(Map<String, IdSnapshot> map) {
        this.f17824a = map;
        return this;
    }

    /* renamed from: a */
    public void mo19506a(boolean z) {
        if (!z) {
            this.f17824a = null;
        }
    }

    /* renamed from: a */
    public void mo19504a(IdJournal aVar) {
        if (this.f17825b == null) {
            this.f17825b = new ArrayList();
        }
        this.f17825b.add(aVar);
    }

    /* renamed from: a */
    public IdTracking mo19502a(List<IdJournal> list) {
        this.f17825b = list;
        return this;
    }

    /* renamed from: a */
    public IdTracking mo19501a(String str) {
        this.f17826c = str;
        return this;
    }

    /* renamed from: a */
    public C3262e fieldForId(int i) {
        return C3262e.m22764a(i);
    }

    /* renamed from: a */
    private void m22724a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new TCompactProtocol(new TIOStreamTransport((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m22723a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new TCompactProtocol(new TIOStreamTransport((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e.getMessage());
        }
    }
}
