package com.efs.sdk.base.p176a.p179c;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.efs.sdk.base.a.c.a */
public final class C1670a {

    /* renamed from: a */
    public String f11297a;

    /* renamed from: b */
    public String f11298b;

    /* renamed from: c */
    public Context f11299c;

    /* renamed from: d */
    public boolean f11300d = true;

    /* renamed from: e */
    public boolean f11301e = true;

    /* renamed from: f */
    public boolean f11302f = false;

    /* renamed from: g */
    public boolean f11303g = false;

    /* renamed from: h */
    public String f11304h;

    /* renamed from: i */
    public boolean f11305i = false;

    /* renamed from: j */
    public long f11306j = 5000;

    /* renamed from: k */
    public long f11307k = 10000;

    /* renamed from: l */
    public long f11308l = 10000;

    /* renamed from: m */
    public ILogEncryptAction f11309m;

    /* renamed from: n */
    public ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f11310n = new ConcurrentHashMap<>();

    /* renamed from: o */
    public List<IEfsReporterObserver> f11311o = new ArrayList(5);

    /* renamed from: p */
    private Boolean f11312p = null;

    /* renamed from: q */
    private Map<String, String> f11313q = new HashMap(5);

    /* renamed from: a */
    public final Map<String, String> mo9636a() {
        Map<String, String> map = this.f11313q;
        return map == null ? Collections.emptyMap() : map;
    }

    /* renamed from: a */
    public final void mo9637a(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap(this.f11313q);
            hashMap.putAll(map);
            this.f11313q = hashMap;
        }
    }

    /* renamed from: a */
    public final List<ValueCallback<Pair<Message, Message>>> mo9635a(int i) {
        if (!this.f11310n.containsKey(Integer.valueOf(i)) || this.f11310n.get(Integer.valueOf(i)) == null) {
            return Collections.emptyList();
        }
        return (List) this.f11310n.get(Integer.valueOf(i));
    }
}
