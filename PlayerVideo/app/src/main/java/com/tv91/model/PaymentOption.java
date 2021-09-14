package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PaymentOption {
    public final int currencyId;
    public final String description;

    /* renamed from: id */
    public final int f14088id;
    public final String image;
    public final String method;
    public final int payType;
    public final List<Payment> paymentList;
    public final int type;

    @JsonCreator
    public PaymentOption(@JsonProperty("TypeID") int i, @JsonProperty("PayType") int i2, @JsonProperty("Type") int i3, @JsonProperty("TypeName") String str, @JsonProperty("Img") String str2, @JsonProperty("CurrencyID") int i4, @JsonProperty("Desc") String str3, @JsonProperty("Items") List<Payment> list) {
        this.f14088id = i;
        this.payType = i2;
        this.type = i3;
        this.method = str;
        this.image = str2;
        this.currencyId = i4;
        this.description = str3;
        this.paymentList = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentOption{id=");
        sb.append(this.f14088id);
        sb.append(", payType=");
        sb.append(this.payType);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", method='");
        sb.append(this.method);
        sb.append('\'');
        sb.append(", image='");
        sb.append(this.image);
        sb.append('\'');
        sb.append(", currencyId=");
        sb.append(this.currencyId);
        sb.append(", description='");
        sb.append(this.description);
        sb.append('\'');
        sb.append(", paymentList=");
        sb.append(this.paymentList);
        sb.append('}');
        return sb.toString();
    }

    public PaymentOption(PaymentOption paymentOption, List<Payment> list) {
        this.f14088id = paymentOption.f14088id;
        this.payType = paymentOption.payType;
        this.type = paymentOption.type;
        this.method = paymentOption.method;
        this.image = paymentOption.image;
        this.currencyId = paymentOption.currencyId;
        this.description = paymentOption.description;
        this.paymentList = list;
    }
}
