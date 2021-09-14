package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PromotionDetail {
    public final Date date;
    public final int effect;
    public final String name;

    @JsonCreator
    public PromotionDetail(@JsonProperty("MemberPromoteName") String str, @JsonProperty("CreateDate") Date date2, @JsonProperty("Benefit") int i) {
        this.name = str;
        this.date = new Date(date2.getTime());
        this.effect = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotionDetail{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", effect=");
        sb.append(this.effect);
        sb.append('}');
        return sb.toString();
    }
}
