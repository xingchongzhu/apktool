package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;
import java.util.Objects;

public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != NamedType.class) {
            return false;
        }
        NamedType namedType = (NamedType) obj;
        if (this._class != namedType._class || !Objects.equals(this._name, namedType._name)) {
            z = false;
        }
        return z;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        if (str == null || str.length() == 0) {
            str = null;
        }
        this._name = str;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[NamedType, class ");
        sb.append(this._class.getName());
        sb.append(", name: ");
        if (this._name == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder();
            String str2 = "'";
            sb2.append(str2);
            sb2.append(this._name);
            sb2.append(str2);
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        setName(str);
    }
}
