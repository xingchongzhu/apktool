package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PromotionReport {
    public final int bonus;
    public final int current;
    public final List<PromotionDetail> details;
    private final boolean exchangeable;
    public final String name;
    public final int target;
    public final int type;

    @JsonCreator
    public PromotionReport(@JsonProperty("Type") int i, @JsonProperty("Name") String str, @JsonProperty("Current") int i2, @JsonProperty("Target") int i3, @JsonProperty("Bonus") int i4, @JsonProperty("IsConvert") boolean z, @JsonProperty("MyPromoteInfo") List<PromotionDetail> list) {
        this.type = i;
        this.name = str;
        this.current = i2;
        this.target = i3;
        this.bonus = i4;
        this.exchangeable = z;
        this.details = list;
    }

    public boolean isExchangeable() {
        return this.exchangeable || this.current >= this.target;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotionReport{type=");
        sb.append(this.type);
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", current=");
        sb.append(this.current);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", bonus=");
        sb.append(this.bonus);
        sb.append(", exchangeable=");
        sb.append(this.exchangeable);
        sb.append(", details=");
        sb.append(this.details);
        sb.append('}');
        return sb.toString();
    }
}
