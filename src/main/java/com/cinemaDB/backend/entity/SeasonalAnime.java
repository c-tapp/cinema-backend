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
    private String start_date;
    @Field
    private Integer year;
    @Field
    private Integer season;
    @Field
    private String image_url;

    public SeasonalAnime() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "SeasonalAnime{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", genres=" + genres +
                ", start_date='" + start_date + '\'' +
                ", year=" + year +
                ", season=" + season +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
