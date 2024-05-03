package com.cinemaDB.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {
    @Id
    private String id;
    private String title;
    private String studio;
    private String[] genres;
    private String startDate;
    private Integer year;
    private Integer season;
}
