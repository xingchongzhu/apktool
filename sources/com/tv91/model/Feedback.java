package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Feedback {
    public final String content;
    public final Date date;

    /* renamed from: id */
    public final String f14081id;
    public final String replyContent;
    public final Date replyDate;

    @JsonCreator
    public Feedback(@JsonProperty("ID") String str, @JsonProperty("Message") String str2, @JsonProperty("CreateTime") Date date2, @JsonProperty("Reply") String str3, @JsonProperty("ReplyTime") Date date3) {
        this.f14081id = str;
        this.content = str2;
        this.date = date2;
        this.replyContent = str3;
        this.replyDate = date3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feedback{id='");
        sb.append(this.f14081id);
        sb.append('\'');
        sb.append(", content='");
        sb.append(this.content);
        sb.append('\'');
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", replyContent='");
        sb.append(this.replyContent);
        sb.append('\'');
        sb.append(", replyDate=");
        sb.append(this.replyDate);
        sb.append('}');
        return sb.toString();
    }
}
