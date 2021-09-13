package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Category extends Entry {
    @JsonCreator
    public Category(@JsonProperty("ID") int i, @JsonProperty("Name") String str) {
        super(i, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Category{key=");
        sb.append(this.key);
        sb.append(", value='");
        sb.append(this.value);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
