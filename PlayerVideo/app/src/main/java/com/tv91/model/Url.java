package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Url {
    public final String apiUrl;
    public final String apiUrl2;
    public final String novelUrl;
    public final String reportUrl;
    public final String webUrl;

    @JsonCreator
    public Url(@JsonProperty("A") String str, @JsonProperty("U") String str2, @JsonProperty("N") String str3, @JsonProperty("S") String str4, @JsonProperty("R") String str5) {
        this.apiUrl = str;
        this.webUrl = str2;
        this.novelUrl = str3;
        this.apiUrl2 = str4;
        this.reportUrl = str5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Url{apiUrl='");
        sb.append(this.apiUrl);
        sb.append('\'');
        sb.append(", webUrl='");
        sb.append(this.webUrl);
        sb.append('\'');
        sb.append(", novelUrl='");
        sb.append(this.novelUrl);
        sb.append('\'');
        sb.append(", apiUrl2='");
        sb.append(this.apiUrl2);
        sb.append('\'');
        sb.append(", reportUrl='");
        sb.append(this.reportUrl);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
