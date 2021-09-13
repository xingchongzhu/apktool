package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p194io.CharTypes;

public abstract class JsonStreamContext {
    protected static final int TYPE_ARRAY = 1;
    protected static final int TYPE_OBJECT = 2;
    protected static final int TYPE_ROOT = 0;
    protected int _index;
    protected int _type;

    protected JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i = this._index;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.f11506NA;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i = this._type;
        if (i == 0) {
            return "ROOT";
        }
        if (i != 1) {
            return i != 2 ? "?" : "OBJECT";
        }
        return "ARRAY";
    }

    public boolean hasCurrentIndex() {
        return this._index >= 0;
    }

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public boolean hasPathSegment() {
        int i = this._type;
        if (i == 2) {
            return hasCurrentName();
        }
        if (i == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public JsonPointer pathAsPointer() {
        return JsonPointer.forPath(this, false);
    }

    public void setCurrentValue(Object obj) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                CharTypes.appendQuoted(sb, currentName);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(getCurrentIndex());
            sb.append(']');
        }
        return sb.toString();
    }

    public String typeDesc() {
        int i = this._type;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    protected JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonPointer pathAsPointer(boolean z) {
        return JsonPointer.forPath(this, z);
    }

    protected JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }
}
