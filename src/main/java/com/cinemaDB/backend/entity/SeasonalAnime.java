package com.cinemaDB.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "seasonal_anime")
public class SeasonalAnime {
    @Id
    private String id;
    private String title;
    private String studio;
    private List<String> genres;
    private String startDate;
    private Integer year;
    private Integer season;

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

}
