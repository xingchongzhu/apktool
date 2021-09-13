package com.tv91.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class Highlight {
    public final Advertise advertise;
    public final List<MovieGroup> groups;
    public final Ranking rankingMonth;
    public final Ranking rankingTop;
    public final Ranking rankingYear;
    public final Recommend recommend;
    public final Web web;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Advertise {
        public final List<ExternalSource> advertises;
        public final String description;
        public final String title;

        @JsonCreator
        public Advertise(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<ExternalSource> list) {
            this.title = str;
            this.description = str2;
            this.advertises = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Model {
        public final String description;
        public List<Movie> movies;
        public final String title;

        @JsonCreator
        public Model(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<Movie> list) {
            this.title = str;
            this.description = str2;
            this.movies = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class MovieGroup {
        public final String description;
        public final boolean hasMore;

        /* renamed from: id */
        public int f14082id;
        public final List<Movie> movies;
        public final String title;

        @JsonCreator
        public MovieGroup(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<Movie> list, @JsonProperty("IsMore") boolean z) {
            this.title = str;
            this.description = str2;
            this.movies = list;
            this.hasMore = z;
            if (list != null && !list.isEmpty()) {
                this.f14082id = ((Movie) list.get(0)).typeId;
            }
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Ranking {
        public final String description;
        public final List<Movie> movies;
        public final String title;

        @JsonCreator
        public Ranking(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<Movie> list) {
            this.title = str;
            this.description = str2;
            this.movies = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Recommend {
        public final String description;
        public final List<Movie> movies;
        public final String title;

        @JsonCreator
        public Recommend(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<Movie> list) {
            this.title = str;
            this.description = str2;
            this.movies = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Swag {
        public final String description;
        public List<Movie> movies;
        public final String title;

        @JsonCreator
        public Swag(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<Movie> list) {
            this.title = str;
            this.description = str2;
            this.movies = list;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Web {
        public final String description;
        public final List<ExternalSource> sources;
        public final String title;

        @JsonCreator
        public Web(@JsonProperty("Title") String str, @JsonProperty("Desc") String str2, @JsonProperty("List") List<ExternalSource> list) {
            this.title = str;
            this.description = str2;
            this.sources = list;
        }
    }

    @JsonCreator
    public Highlight(@JsonProperty("Adv") Advertise advertise2, @JsonProperty("Ranking") Ranking ranking, @JsonProperty("RankingMM") Ranking ranking2, @JsonProperty("RankingYY") Ranking ranking3, @JsonProperty("FilmList") List<MovieGroup> list, @JsonProperty("WebBox") Web web2, @JsonProperty("PushMovie") Recommend recommend2) {
        this.advertise = advertise2;
        this.rankingTop = ranking;
        this.rankingMonth = ranking2;
        this.rankingYear = ranking3;
        this.groups = list;
        this.web = web2;
        this.recommend = recommend2;
    }
}
