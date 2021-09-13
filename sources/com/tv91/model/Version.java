package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Version {
    public final String downloadUrl;
    public final String message;
    public final String updateUrl;
    public final String version;

    @JsonCreator
    public Version(@JsonProperty("Edition") String str, @JsonProperty("Message") String str2, @JsonProperty("DownloadURL") String str3, @JsonProperty("UpdateURL") String str4) {
        this.version = str;
        this.message = str2;
        this.downloadUrl = str3;
        this.updateUrl = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Version{version='");
        sb.append(this.version);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", downloadUrl='");
        sb.append(this.downloadUrl);
        sb.append('\'');
        sb.append(", updateUrl='");
        sb.append(this.updateUrl);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
