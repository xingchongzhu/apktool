package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConfigOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    protected Value _defaultInclusion;
    protected Boolean _defaultLeniency;
    protected Boolean _defaultMergeable;
    protected JsonSetter.Value _defaultSetterInfo;
    protected Map<Class<?>, MutableConfigOverride> _overrides;
    protected VisibilityChecker<?> _visibilityChecker;

    public ConfigOverrides() {
        this(null, Value.empty(), JsonSetter.Value.empty(), Std.defaultInstance(), null, null);
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, MutableConfigOverride> _newMap() {
        return new HashMap();
    }

    public ConfigOverrides copy() {
        Map _newMap;
        if (this._overrides == null) {
            _newMap = null;
        } else {
            _newMap = _newMap();
            for (Entry entry : this._overrides.entrySet()) {
                _newMap.put(entry.getKey(), ((MutableConfigOverride) entry.getValue()).copy());
            }
        }
        ConfigOverrides configOverrides = new ConfigOverrides(_newMap, this._defaultInclusion, this._defaultSetterInfo, this._visibilityChecker, this._defaultMergeable, this._defaultLeniency);
        return configOverrides;
    }

    public JsonFormat.Value findFormatDefaults(Class<?> cls) {
        Map<Class<?>, MutableConfigOverride> map = this._overrides;
        if (map != null) {
            ConfigOverride configOverride = (ConfigOverride) map.get(cls);
            if (configOverride != null) {
                JsonFormat.Value format = configOverride.getFormat();
                if (format != null) {
                    if (!format.hasLenient()) {
                        format = format.withLenient(this._defaultLeniency);
                    }
                    return format;
                }
            }
        }
        Boolean bool = this._defaultLeniency;
        if (bool == null) {
            return JsonFormat.Value.empty();
        }
        return JsonFormat.Value.forLeniency(bool.booleanValue());
    }

    public MutableConfigOverride findOrCreateOverride(Class<?> cls) {
        if (this._overrides == null) {
            this._overrides = _newMap();
        }
        MutableConfigOverride mutableConfigOverride = (MutableConfigOverride) this._overrides.get(cls);
        if (mutableConfigOverride != null) {
            return mutableConfigOverride;
        }
        MutableConfigOverride mutableConfigOverride2 = new MutableConfigOverride();
        this._overrides.put(cls, mutableConfigOverride2);
        return mutableConfigOverride2;
    }

    public ConfigOverride findOverride(Class<?> cls) {
        Map<Class<?>, MutableConfigOverride> map = this._overrides;
        if (map == null) {
            return null;
        }
        return (ConfigOverride) map.get(cls);
    }

    public Value getDefaultInclusion() {
        return this._defaultInclusion;
    }

    public Boolean getDefaultLeniency() {
        return this._defaultLeniency;
    }

    public Boolean getDefaultMergeable() {
        return this._defaultMergeable;
    }

    public JsonSetter.Value getDefaultSetterInfo() {
        return this._defaultSetterInfo;
    }

    public VisibilityChecker<?> getDefaultVisibility() {
        return this._visibilityChecker;
    }

    public void setDefaultInclusion(Value value) {
        this._defaultInclusion = value;
    }

    public void setDefaultLeniency(Boolean bool) {
        this._defaultLeniency = bool;
    }

    public void setDefaultMergeable(Boolean bool) {
        this._defaultMergeable = bool;
    }

    public void setDefaultSetterInfo(JsonSetter.Value value) {
        this._defaultSetterInfo = value;
    }

    public void setDefaultVisibility(VisibilityChecker<?> visibilityChecker) {
        this._visibilityChecker = visibilityChecker;
    }

    protected ConfigOverrides(Map<Class<?>, MutableConfigOverride> map, Value value, JsonSetter.Value value2, VisibilityChecker<?> visibilityChecker, Boolean bool, Boolean bool2) {
        this._overrides = map;
        this._defaultInclusion = value;
        this._defaultSetterInfo = value2;
        this._visibilityChecker = visibilityChecker;
        this._defaultMergeable = bool;
        this._defaultLeniency = bool2;
    }

    @Deprecated
    protected ConfigOverrides(Map<Class<?>, MutableConfigOverride> map, Value value, JsonSetter.Value value2, VisibilityChecker<?> visibilityChecker, Boolean bool) {
        this(map, value, value2, visibilityChecker, bool, null);
    }
}
