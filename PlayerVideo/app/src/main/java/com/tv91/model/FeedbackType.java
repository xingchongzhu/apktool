package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class FeedbackType extends Entry {
    @JsonCreator
    public FeedbackType(@JsonProperty("ID") int i, @JsonProperty("Name") String str) {
        super(i, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FeedbackType{key=");
        sb.append(this.key);
        sb.append(", value='");
        sb.append(this.value);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
