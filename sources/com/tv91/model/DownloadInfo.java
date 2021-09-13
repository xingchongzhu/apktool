package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class DownloadInfo {
    public final Date expireDate;

    /* renamed from: id */
    public final int f14080id;
    public final String url;
    public final String verifyId;

    @JsonCreator
    public DownloadInfo(@JsonProperty("CID") int i, @JsonProperty("GID") String str, @JsonProperty("URL") String str2, @JsonProperty("EndTime") Date date) {
        this.f14080id = i;
        this.verifyId = str;
        this.url = str2;
        this.expireDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DownloadInfo{id=");
        sb.append(this.f14080id);
        sb.append(", verifyId='");
        sb.append(this.verifyId);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", expireDate=");
        sb.append(this.expireDate);
        sb.append('}');
        return sb.toString();
    }
}
