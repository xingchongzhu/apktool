package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleMixInResolver implements MixInResolver, Serializable {
    private static final long serialVersionUID = 1;
    protected Map<ClassKey, Class<?>> _localMixIns;
    protected final MixInResolver _overrides;

    public SimpleMixInResolver(MixInResolver mixInResolver) {
        this._overrides = mixInResolver;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this._localMixIns == null) {
            this._localMixIns = new HashMap();
        }
        this._localMixIns.put(new ClassKey(cls), cls2);
    }

    public Class<?> findMixInClassFor(Class<?> cls) {
        MixInResolver mixInResolver = this._overrides;
        Class<?> findMixInClassFor = mixInResolver == null ? null : mixInResolver.findMixInClassFor(cls);
        if (findMixInClassFor != null) {
            return findMixInClassFor;
        }
        Map<ClassKey, Class<?>> map = this._localMixIns;
        return map != null ? (Class) map.get(new ClassKey(cls)) : findMixInClassFor;
    }

    public boolean hasMixIns() {
        if (this._localMixIns == null) {
            MixInResolver mixInResolver = this._overrides;
            if (mixInResolver == null) {
                return false;
            }
            if (mixInResolver instanceof SimpleMixInResolver) {
                return ((SimpleMixInResolver) mixInResolver).hasMixIns();
            }
        }
        return true;
    }

    public int localSize() {
        Map<ClassKey, Class<?>> map = this._localMixIns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this._localMixIns = null;
            return;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Entry entry : map.entrySet()) {
            hashMap.put(new ClassKey((Class) entry.getKey()), entry.getValue());
        }
        this._localMixIns = hashMap;
    }

    public SimpleMixInResolver withOverrides(MixInResolver mixInResolver) {
        return new SimpleMixInResolver(mixInResolver, this._localMixIns);
    }

    public SimpleMixInResolver withoutLocalDefinitions() {
        return new SimpleMixInResolver(this._overrides, null);
    }

    public SimpleMixInResolver copy() {
        MixInResolver mixInResolver;
        MixInResolver mixInResolver2 = this._overrides;
        HashMap hashMap = null;
        if (mixInResolver2 == null) {
            mixInResolver = null;
        } else {
            mixInResolver = mixInResolver2.copy();
        }
        if (this._localMixIns != null) {
            hashMap = new HashMap(this._localMixIns);
        }
        return new SimpleMixInResolver(mixInResolver, hashMap);
    }

    protected SimpleMixInResolver(MixInResolver mixInResolver, Map<ClassKey, Class<?>> map) {
        this._overrides = mixInResolver;
        this._localMixIns = map;
    }
}
