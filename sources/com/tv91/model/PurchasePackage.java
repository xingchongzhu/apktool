package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PurchasePackage {
    public final int day;
    public final boolean download;
    public final String name;
    public final int point;
    public final double price;
    public final PurchaseType type;

    @JsonCreator
    public PurchasePackage(@JsonProperty("BuyTypeID") PurchaseType purchaseType, @JsonProperty("BuyTypeName") String str, @JsonProperty("Day") int i, @JsonProperty("Point") int i2, @JsonProperty("Desc") double d, @JsonProperty("IsDownload") boolean z) {
        this.type = purchaseType;
        this.name = str;
        this.day = i;
        this.point = i2;
        this.price = d;
        this.download = z;
    }

    public static PurchasePackage download(int i) {
        PurchasePackage purchasePackage = new PurchasePackage(PurchaseType.DOWNLOAD, "", 0, i, 0.0d, true);
        return purchasePackage;
    }

    public static PurchasePackage single(int i) {
        PurchasePackage purchasePackage = new PurchasePackage(PurchaseType.SINGLE, "", 0, i, 0.0d, false);
        return purchasePackage;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchasePackage{type=");
        sb.append(this.type);
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", day=");
        sb.append(this.day);
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", download=");
        sb.append(this.download);
        sb.append('}');
        return sb.toString();
    }
}
