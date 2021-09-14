package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Product {
    private static final String SEPARATOR = "#";
    public final String description;
    public final List<PaymentMethod> paymentMethods;
    public final double price;
    private final String title;

    @JsonCreator
    public Product(@JsonProperty("Money") double d, @JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("Items") List<PaymentMethod> list) {
        this.price = d;
        this.title = str;
        this.description = str2;
        this.paymentMethods = list;
    }

    public String getTitle() {
        int indexOf = this.title.indexOf(SEPARATOR);
        return indexOf == -1 ? this.title : this.title.substring(0, indexOf);
    }

    public String getTitleExtra() {
        int indexOf = this.title.indexOf(SEPARATOR);
        if (indexOf == -1) {
            return "";
        }
        return this.title.substring(indexOf + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{price=");
        sb.append(this.price);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.description);
        sb.append('\'');
        sb.append(", paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append('}');
        return sb.toString();
    }
}
