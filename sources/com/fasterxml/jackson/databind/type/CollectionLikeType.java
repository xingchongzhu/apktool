package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public class CollectionLikeType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected final JavaType _elementType;

    protected CollectionLikeType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj, Object obj2, boolean z) {
        super(cls, typeBindings, javaType, javaTypeArr, javaType2.hashCode(), obj, obj2, z);
        this._elementType = javaType2;
    }

    public static CollectionLikeType construct(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(cls, typeBindings, javaType, javaTypeArr, javaType2, null, null, false);
        return collectionLikeType;
    }

    public static CollectionLikeType upgradeFrom(JavaType javaType, JavaType javaType2) {
        if (javaType instanceof TypeBase) {
            return new CollectionLikeType((TypeBase) javaType, javaType2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot upgrade from an instance of ");
        sb.append(javaType.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JavaType _narrow(Class<?> cls) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(cls, this._bindings, this._superClass, this._superInterfaces, this._elementType, this._valueHandler, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    /* access modifiers changed from: protected */
    public String buildCanonicalName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._class.getName());
        if (this._elementType != null) {
            sb.append('<');
            sb.append(this._elementType.toCanonical());
            sb.append('>');
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) obj;
        if (this._class != collectionLikeType._class || !this._elementType.equals(collectionLikeType._elementType)) {
            z = false;
        }
        return z;
    }

    public Object getContentTypeHandler() {
        return this._elementType.getTypeHandler();
    }

    public Object getContentValueHandler() {
        return this._elementType.getValueHandler();
    }

    public StringBuilder getErasedSignature(StringBuilder sb) {
        return TypeBase._classSignature(this._class, sb, true);
    }

    public StringBuilder getGenericSignature(StringBuilder sb) {
        TypeBase._classSignature(this._class, sb, false);
        sb.append('<');
        this._elementType.getGenericSignature(sb);
        sb.append(">;");
        return sb;
    }

    public boolean hasHandlers() {
        return super.hasHandlers() || this._elementType.hasHandlers();
    }

    public boolean isCollectionLikeType() {
        return true;
    }

    public boolean isContainerType() {
        return true;
    }

    public boolean isTrueCollectionType() {
        return Collection.class.isAssignableFrom(this._class);
    }

    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(cls, typeBindings, javaType, javaTypeArr, this._elementType, this._valueHandler, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[collection-like type; class ");
        sb.append(this._class.getName());
        sb.append(", contains ");
        sb.append(this._elementType);
        sb.append("]");
        return sb.toString();
    }

    public JavaType withContentType(JavaType javaType) {
        if (this._elementType == javaType) {
            return this;
        }
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, javaType, this._valueHandler, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    public JavaType withHandlersFrom(JavaType javaType) {
        JavaType withHandlersFrom = super.withHandlersFrom(javaType);
        JavaType contentType = javaType.getContentType();
        if (contentType == null) {
            return withHandlersFrom;
        }
        JavaType withHandlersFrom2 = this._elementType.withHandlersFrom(contentType);
        return withHandlersFrom2 != this._elementType ? withHandlersFrom.withContentType(withHandlersFrom2) : withHandlersFrom;
    }

    @Deprecated
    public static CollectionLikeType construct(Class<?> cls, JavaType javaType) {
        TypeBindings typeBindings;
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length != 1) {
            typeBindings = TypeBindings.emptyBindings();
        } else {
            typeBindings = TypeBindings.create(cls, javaType);
        }
        CollectionLikeType collectionLikeType = new CollectionLikeType(cls, typeBindings, TypeBase._bogusSuperClass(cls), null, javaType, null, null, false);
        return collectionLikeType;
    }

    public JavaType getContentType() {
        return this._elementType;
    }

    public CollectionLikeType withContentTypeHandler(Object obj) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withTypeHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    public CollectionLikeType withContentValueHandler(Object obj) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withValueHandler(obj), this._valueHandler, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    public CollectionLikeType withStaticTyping() {
        if (this._asStatic) {
            return this;
        }
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType.withStaticTyping(), this._valueHandler, this._typeHandler, true);
        return collectionLikeType;
    }

    public CollectionLikeType withTypeHandler(Object obj) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType, this._valueHandler, obj, this._asStatic);
        return collectionLikeType;
    }

    public CollectionLikeType withValueHandler(Object obj) {
        CollectionLikeType collectionLikeType = new CollectionLikeType(this._class, this._bindings, this._superClass, this._superInterfaces, this._elementType, obj, this._typeHandler, this._asStatic);
        return collectionLikeType;
    }

    protected CollectionLikeType(TypeBase typeBase, JavaType javaType) {
        super(typeBase);
        this._elementType = javaType;
    }
}
