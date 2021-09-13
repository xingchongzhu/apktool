package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    private static final long serialVersionUID = 1;
    protected final TypeFactory _factory;

    static final class MyTokenizer extends StringTokenizer {
        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        public String getAllInput() {
            return this._input;
        }

        public String getRemainingInput() {
            return this._input.substring(this._index);
        }

        public boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
                return str;
            }
            String nextToken = super.nextToken();
            this._index += nextToken.length();
            return nextToken.trim();
        }

        public void pushBack(String str) {
            this._pushbackToken = str;
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{myTokenizer.getAllInput(), myTokenizer.getRemainingInput(), str}));
    }

    /* access modifiers changed from: protected */
    public Class<?> findClass(String str, MyTokenizer myTokenizer) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot locate class '");
            sb.append(str);
            sb.append("', problem: ");
            sb.append(e.getMessage());
            throw _problem(myTokenizer, sb.toString());
        }
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType parseType = parseType(myTokenizer);
        if (!myTokenizer.hasMoreTokens()) {
            return parseType;
        }
        throw _problem(myTokenizer, "Unexpected tokens after complete type");
    }

    /* access modifiers changed from: protected */
    public JavaType parseType(MyTokenizer myTokenizer) throws IllegalArgumentException {
        if (myTokenizer.hasMoreTokens()) {
            Class findClass = findClass(myTokenizer.nextToken(), myTokenizer);
            if (myTokenizer.hasMoreTokens()) {
                String nextToken = myTokenizer.nextToken();
                if ("<".equals(nextToken)) {
                    return this._factory._fromClass(null, findClass, TypeBindings.create(findClass, parseTypes(myTokenizer)));
                }
                myTokenizer.pushBack(nextToken);
            }
            return this._factory._fromClass(null, findClass, TypeBindings.emptyBindings());
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    /* access modifiers changed from: protected */
    public List<JavaType> parseTypes(MyTokenizer myTokenizer) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String nextToken = myTokenizer.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected token '");
                sb.append(nextToken);
                sb.append("', expected ',' or '>')");
                throw _problem(myTokenizer, sb.toString());
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }
}
