package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PaymentHistory {
    public final String currency;
    public final String date;

    /* renamed from: id */
    public final int f14086id;
    public final String method;
    public final int point;
    public final double price;

    @JsonCreator
    public PaymentHistory(@JsonProperty("ID") int i, @JsonProperty("Name") String str, @JsonProperty("Money") double d, @JsonProperty("Currency") String str2, @JsonProperty("Point") int i2, @JsonProperty("CreateTime") String str3) {
        this.f14086id = i;
        this.method = str;
        this.price = d;
        this.currency = str2;
        this.point = i2;
        this.date = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentHistory{id=");
        sb.append(this.f14086id);
        sb.append(", method='");
        sb.append(this.method);
        sb.append('\'');
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", currency='");
        sb.append(this.currency);
        sb.append('\'');
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", date='");
        sb.append(this.date);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
