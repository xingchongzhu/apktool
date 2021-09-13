package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.proto.IdJournal;
import com.umeng.commonsdk.statistics.proto.IdSnapshot;
import com.umeng.commonsdk.statistics.proto.IdTracking;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.a */
public abstract class AbstractIdTracker {

    /* renamed from: a */
    private final int f17711a = 10;

    /* renamed from: b */
    private final int f17712b = 100;

    /* renamed from: c */
    private final String f17713c;

    /* renamed from: d */
    private List<IdJournal> f17714d;

    /* renamed from: e */
    private IdSnapshot f17715e;

    public AbstractIdTracker(String str) {
        this.f17713c = str;
    }

    /* renamed from: g */
    private boolean mo19378g() {
        String str;
        int i;
        IdSnapshot bVar = this.f17715e;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.mo19480b();
        }
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.mo19488h();
        }
        String a = mo19356a(mo19365f());
        if (a == null || a.equals(str)) {
            return false;
        }
        if (bVar == null) {
            bVar = new IdSnapshot();
        }
        bVar.mo19477a(a);
        bVar.mo19476a(System.currentTimeMillis());
        bVar.mo19475a(i + 1);
        IdJournal aVar = new IdJournal();
        aVar.mo19447a(this.f17713c);
        aVar.mo19452c(a);
        aVar.mo19449b(str);
        aVar.mo19446a(bVar.mo19485e());
        if (this.f17714d == null) {
            this.f17714d = new ArrayList(2);
        }
        this.f17714d.add(aVar);
        if (this.f17714d.size() > 10) {
            this.f17714d.remove(0);
        }
        this.f17715e = bVar;
        return true;
    }

    /* renamed from: a */
    public boolean mo19360a() {
        return mo19378g();
    }

    /* renamed from: b */
    public String mo19361b() {
        return this.f17713c;
    }

    /* renamed from: c */
    public boolean mo19362c() {
        IdSnapshot bVar = this.f17715e;
        return bVar == null || bVar.mo19488h() <= 100;
    }

    /* renamed from: d */
    public IdSnapshot mo19363d() {
        return this.f17715e;
    }

    /* renamed from: e */
    public List<IdJournal> mo19364e() {
        return this.f17714d;
    }

    /* renamed from: f */
    public abstract String mo19365f();

    /* renamed from: a */
    public void mo19357a(IdSnapshot bVar) {
        this.f17715e = bVar;
    }

    /* renamed from: a */
    public void mo19359a(List<IdJournal> list) {
        this.f17714d = list;
    }

    /* renamed from: a */
    public String mo19356a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || "0".equals(trim)) {
            return null;
        }
        if ("unknown".equals(trim.toLowerCase(Locale.US))) {
            return null;
        }
        return trim;
    }

    /* renamed from: a */
    public void mo19358a(IdTracking cVar) {
        this.f17715e = (IdSnapshot) cVar.mo19509c().get(this.f17713c);
        List<IdJournal> h = cVar.mo19515h();
        if (h != null && h.size() > 0) {
            if (this.f17714d == null) {
                this.f17714d = new ArrayList();
            }
            for (IdJournal aVar : h) {
                if (this.f17713c.equals(aVar.f17783a)) {
                    this.f17714d.add(aVar);
                }
            }
        }
    }
}
