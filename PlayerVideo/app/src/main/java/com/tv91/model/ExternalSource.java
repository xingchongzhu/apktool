package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class ExternalSource {
    public final String image;
    public final String title;
    public final String type;
    public final String url;

    @JsonCreator
    public ExternalSource(@JsonProperty("Title") String str, @JsonAlias({"Img"}) @JsonProperty("Pic") String str2, @JsonProperty("Type") String str3, @JsonProperty("URL") String str4) {
        this.title = str;
        this.image = str2;
        this.type = str3;
        this.url = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Advertisement{title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", image='");
        sb.append(this.image);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.type);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
