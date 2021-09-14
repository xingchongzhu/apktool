package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class PurchaseHistory {
    public final Date end;
    public final String movieCoverImg;
    public final String movieCreateTime;
    public final String movieDescription;
    public final int movieId;
    public final String movieImg;
    public final String movieName;
    public final String packageName;
    public final int point;
    public final int sourceId;
    public final Date start;

    @JsonCreator
    public PurchaseHistory(@JsonProperty("StartTime") Date date, @JsonProperty("EndTime") Date date2, @JsonProperty("Point") int i, @JsonProperty("BuyType") String str, @JsonProperty("SourceId") int i2, @JsonProperty("MovieID") int i3, @JsonProperty("Name") String str2, @JsonProperty("Description") String str3, @JsonProperty("CreateTime") String str4, @JsonProperty("Img") String str5, @JsonProperty("CoverImg") String str6) {
        this.start = date;
        this.end = date2;
        this.point = i;
        this.packageName = str;
        this.sourceId = i2;
        this.movieId = i3;
        this.movieName = str2;
        this.movieDescription = str3;
        this.movieCreateTime = str4;
        this.movieImg = str5;
        this.movieCoverImg = str6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseHistory{start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", point=");
        sb.append(this.point);
        sb.append(", purchaseName='");
        sb.append(this.packageName);
        sb.append('\'');
        sb.append(", sourceId=");
        sb.append(this.sourceId);
        sb.append(", movieId=");
        sb.append(this.movieId);
        sb.append(", movieName='");
        sb.append(this.movieName);
        sb.append('\'');
        sb.append(", movieDescription='");
        sb.append(this.movieDescription);
        sb.append('\'');
        sb.append(", movieCreateTime='");
        sb.append(this.movieCreateTime);
        sb.append('\'');
        sb.append(", movieImg='");
        sb.append(this.movieImg);
        sb.append('\'');
        sb.append(", movieCoverImg='");
        sb.append(this.movieCoverImg);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
