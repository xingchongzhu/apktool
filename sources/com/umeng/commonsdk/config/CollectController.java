package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.commonsdk.config.b */
public class CollectController implements IFieldWatcher {

    /* renamed from: a */
    private static Map<String, Boolean> f17346a = new HashMap();

    /* renamed from: b */
    private static Object f17347b = new Object();

    /* renamed from: com.umeng.commonsdk.config.b$a */
    /* compiled from: CollectController */
    private static class C3181a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final CollectController f17348a = new CollectController();

        private C3181a() {
        }
    }

    /* renamed from: b */
    public static CollectController m22211b() {
        return C3181a.f17348a;
    }

    /* renamed from: a */
    public void mo19242a() {
        synchronized (f17347b) {
            f17346a.clear();
        }
    }

    private CollectController() {
    }

    /* renamed from: a */
    public static boolean m22210a(String str) {
        if (!FieldTable.m22216a(str)) {
            return false;
        }
        synchronized (f17347b) {
            if (!f17346a.containsKey(str)) {
                return true;
            }
            boolean booleanValue = ((Boolean) f17346a.get(str)).booleanValue();
            return booleanValue;
        }
    }

    /* renamed from: a */
    public void mo19243a(String str, Boolean bool) {
        if (FieldTable.m22216a(str)) {
            synchronized (f17347b) {
                Map<String, Boolean> map = f17346a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
