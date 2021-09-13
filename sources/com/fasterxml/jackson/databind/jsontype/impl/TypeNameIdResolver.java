package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo.C1769Id;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class TypeNameIdResolver extends TypeIdResolverBase {
    protected final boolean _caseInsensitive;
    protected final MapperConfig<?> _config;
    protected final Map<String, JavaType> _idToType;
    protected final ConcurrentHashMap<String, String> _typeToId;

    protected TypeNameIdResolver(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> hashMap) {
        super(javaType, mapperConfig.getTypeFactory());
        this._config = mapperConfig;
        this._typeToId = concurrentHashMap;
        this._idToType = hashMap;
        this._caseInsensitive = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    protected static String _defaultTypeId(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public static TypeNameIdResolver construct(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        HashMap hashMap;
        ConcurrentHashMap concurrentHashMap;
        if (z != z2) {
            if (z) {
                concurrentHashMap = new ConcurrentHashMap();
                hashMap = null;
            } else {
                hashMap = new HashMap();
                concurrentHashMap = new ConcurrentHashMap(4);
            }
            boolean isEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
            if (collection != null) {
                for (NamedType namedType : collection) {
                    Class type = namedType.getType();
                    String name = namedType.hasName() ? namedType.getName() : _defaultTypeId(type);
                    if (z) {
                        concurrentHashMap.put(type.getName(), name);
                    }
                    if (z2) {
                        if (isEnabled) {
                            name = name.toLowerCase();
                        }
                        JavaType javaType2 = (JavaType) hashMap.get(name);
                        if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                            hashMap.put(name, mapperConfig.constructType(type));
                        }
                    }
                }
            }
            return new TypeNameIdResolver(mapperConfig, javaType, concurrentHashMap, hashMap);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public JavaType _typeFromId(String str) {
        if (this._caseInsensitive) {
            str = str.toLowerCase();
        }
        return (JavaType) this._idToType.get(str);
    }

    public String getDescForKnownTypeIds() {
        return new TreeSet(this._idToType.keySet()).toString();
    }

    public C1769Id getMechanism() {
        return C1769Id.NAME;
    }

    /* access modifiers changed from: protected */
    public String idFromClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String str = (String) this._typeToId.get(name);
        if (str == null) {
            Class rawClass = this._typeFactory.constructType((Type) cls).getRawClass();
            if (this._config.isAnnotationProcessingEnabled()) {
                str = this._config.getAnnotationIntrospector().findTypeName(this._config.introspectClassAnnotations(rawClass).getClassInfo());
            }
            if (str == null) {
                str = _defaultTypeId(rawClass);
            }
            this._typeToId.put(name, str);
        }
        return str;
    }

    public String idFromValue(Object obj) {
        return idFromClass(obj.getClass());
    }

    public String idFromValueAndType(Object obj, Class<?> cls) {
        if (obj == null) {
            return idFromClass(cls);
        }
        return idFromValue(obj);
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{getClass().getName(), this._idToType});
    }

    public JavaType typeFromId(DatabindContext databindContext, String str) {
        return _typeFromId(str);
    }
}
