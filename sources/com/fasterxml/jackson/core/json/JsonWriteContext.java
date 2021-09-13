package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;
    protected JsonWriteContext _child;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected boolean _gotName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
    }

    private final void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            StringBuilder sb = new StringBuilder();
            sb.append("Duplicate field '");
            sb.append(str);
            sb.append("'");
            throw new JsonGenerationException(sb.toString(), source instanceof JsonGenerator ? (JsonGenerator) source : null);
        }
    }

    @Deprecated
    public static JsonWriteContext createRootContext() {
        return createRootContext(null);
    }

    public JsonWriteContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext createChildObjectContext() {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    public boolean hasCurrentName() {
        return this._currentName != null;
    }

    /* access modifiers changed from: protected */
    public JsonWriteContext reset(int i) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public JsonWriteContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    public int writeFieldName(String str) throws JsonProcessingException {
        if (this._type != 2 || this._gotName) {
            return 4;
        }
        int i = 1;
        this._gotName = true;
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
        if (this._index < 0) {
            i = 0;
        }
        return i;
    }

    public int writeValue() {
        int i = this._type;
        int i2 = 0;
        if (i == 2) {
            if (!this._gotName) {
                return 5;
            }
            this._gotName = false;
            this._index++;
            return 2;
        } else if (i == 1) {
            int i3 = this._index;
            this._index = i3 + 1;
            if (i3 >= 0) {
                i2 = 1;
            }
            return i2;
        } else {
            int i4 = this._index + 1;
            this._index = i4;
            if (i4 != 0) {
                i2 = 3;
            }
            return i2;
        }
    }

    public static JsonWriteContext createRootContext(DupDetector dupDetector) {
        return new JsonWriteContext(0, null, dupDetector);
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }

    public JsonWriteContext createChildArrayContext(Object obj) {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1, obj);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(1, this, dupDetector, obj);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    public JsonWriteContext createChildObjectContext(Object obj) {
        DupDetector dupDetector;
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2, obj);
        }
        DupDetector dupDetector2 = this._dups;
        if (dupDetector2 == null) {
            dupDetector = null;
        } else {
            dupDetector = dupDetector2.child();
        }
        JsonWriteContext jsonWriteContext2 = new JsonWriteContext(2, this, dupDetector, obj);
        this._child = jsonWriteContext2;
        return jsonWriteContext2;
    }

    protected JsonWriteContext(int i, JsonWriteContext jsonWriteContext, DupDetector dupDetector, Object obj) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._dups = dupDetector;
        this._currentValue = obj;
    }

    /* access modifiers changed from: protected */
    public JsonWriteContext reset(int i, Object obj) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        this._gotName = false;
        this._currentValue = obj;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
        return this;
    }
}
