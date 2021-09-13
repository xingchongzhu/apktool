package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Actor {
    public final String avatar;
    public final int count;

    /* renamed from: id */
    public final int f14079id;
    public final String name;

    @JsonCreator
    public Actor(@JsonProperty("ID") int i, @JsonProperty("Count") int i2, @JsonProperty("Name") String str, @JsonProperty("Pic") String str2) {
        this.f14079id = i;
        this.count = i2;
        this.name = str;
        this.avatar = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor{id=");
        sb.append(this.f14079id);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", avatar='");
        sb.append(this.avatar);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
