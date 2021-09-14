package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Promotion {
    public final String exchangeRule;
    public final String image;
    public final String name;
    public final int type;
    public final String url;

    @JsonCreator
    public Promotion(@JsonAlias({"URL", "Url"}) @JsonProperty("URL") String str, @JsonProperty("Name") String str2, @JsonProperty("Img") String str3, @JsonProperty("Type") int i, @JsonProperty("Info") String str4) {
        this.url = str;
        this.name = str2;
        this.image = str3;
        this.type = i;
        this.exchangeRule = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Promotion{url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", image='");
        sb.append(this.image);
        sb.append('\'');
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", exchangeRule='");
        sb.append(this.exchangeRule);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
