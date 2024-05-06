package com.cinemaDB.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "seasonal_anime")
public class SeasonalAnime {
    @Id
    private String id;
    @Field
    private String title;
    @Field
    private String studio;
    @Field
    private List<String> genres;
    @Field
    private String startDate;
    @Field
    private Integer year;
    @Field
    private Integer season;

    public SeasonalAnime() {}

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getStartDate() {
        return startDate;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "SeasonalAnime{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", genres=" + genres +
                ", startDate='" + startDate + '\'' +
                ", year=" + year +
                ", season=" + season +
                '}';
    }
}
