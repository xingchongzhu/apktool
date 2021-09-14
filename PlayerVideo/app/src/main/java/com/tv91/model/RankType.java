package com.tv91.model;

/* renamed from: com.tv91.model.c */
public enum RankType {
    DAY(1),
    MONTH(2),
    YEAR(3);
    

    /* renamed from: e */
    public final int f14118e;

    private RankType(int i) {
        this.f14118e = i;
    }

    /* renamed from: a */
    public static RankType m17633a(int i) {
        return values()[i];
    }

    /* renamed from: b */
    public int mo17044b() {
        return ordinal();
    }
}
