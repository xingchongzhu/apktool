package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Payment {
    public final Date createDate;
    public final String description;

    /* renamed from: id */
    public final int f14085id;
    public final boolean isOnly;
    public final boolean isPoint;
    public final int point;
    public final double price;

    @JsonCreator
    public Payment(@JsonProperty("ID") int i, @JsonProperty("Point") int i2, @JsonProperty("Money") double d, @JsonProperty("CreateTime") Date date, @JsonProperty("Desc") String str, @JsonProperty("IsOnly") boolean z, @JsonProperty("IsPoint") boolean z2) {
        this.f14085id = i;
        this.point = i2;
        this.price = d;
        this.createDate = date;
        this.description = str;
        this.isOnly = z;
        this.isPoint = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payment{id=");
        sb.append(this.f14085id);
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", createDate=");
        sb.append(this.createDate);
        sb.append(", description='");
        sb.append(this.description);
        sb.append('\'');
        sb.append(", isOnly=");
        sb.append(this.isOnly);
        sb.append(", isPoint=");
        sb.append(this.isPoint);
        sb.append('}');
        return sb.toString();
    }
}
