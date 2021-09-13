package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Base;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.Validity;

public final class LaissezFaireSubTypeValidator extends Base {
    public static final LaissezFaireSubTypeValidator instance = new LaissezFaireSubTypeValidator();
    private static final long serialVersionUID = 1;

    public Validity validateBaseType(MapperConfig<?> mapperConfig, JavaType javaType) {
        return Validity.INDETERMINATE;
    }

    public Validity validateSubClassName(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return Validity.ALLOWED;
    }

    public Validity validateSubType(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return Validity.ALLOWED;
    }
}
