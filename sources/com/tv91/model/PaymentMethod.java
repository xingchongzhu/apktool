package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PaymentMethod {
    private static final String SEPARATOR = "#";

    /* renamed from: id */
    public final int f14087id;
    public final String image;
    private final String name;

    @JsonCreator
    public PaymentMethod(@JsonProperty("ID") int i, @JsonProperty("TypeName") String str, @JsonProperty("Img") String str2) {
        this.f14087id = i;
        this.name = str;
        this.image = str2;
    }

    public String getName() {
        int indexOf = this.name.indexOf(SEPARATOR);
        return indexOf == -1 ? this.name : this.name.substring(0, indexOf);
    }

    public String getNameExtra() {
        int indexOf = this.name.indexOf(SEPARATOR);
        if (indexOf == -1) {
            return "";
        }
        return this.name.substring(indexOf + 1);
    }
}
