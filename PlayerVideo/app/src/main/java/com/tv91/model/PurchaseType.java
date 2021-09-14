package com.tv91.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.util.StdConverter;

@JsonDeserialize(converter = TypeConverter.class)
@JsonSerialize(converter = IntConverter.class)
public enum PurchaseType {
    SINGLE(1),
    WEEK(2),
    MONTH(3),
    DOWNLOAD(4),
    SEASON(5),
    YEAR(6);
    

    /* renamed from: h */
    public final int f14096h;

    public static final class IntConverter extends StdConverter<PurchaseType, Integer> {
        /* renamed from: a */
        public Integer convert(PurchaseType purchaseType) {
            return Integer.valueOf(purchaseType.f14096h);
        }
    }

    public static final class TypeConverter extends StdConverter<Integer, PurchaseType> {
        /* renamed from: a */
        public PurchaseType convert(Integer num) {
            return PurchaseType.m17620a(num.intValue());
        }
    }

    private PurchaseType(int i) {
        this.f14096h = i;
    }

    /* renamed from: a */
    public static PurchaseType m17620a(int i) {
        PurchaseType[] values;
        for (PurchaseType purchaseType : values()) {
            if (purchaseType.f14096h == i) {
                return purchaseType;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown id ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
