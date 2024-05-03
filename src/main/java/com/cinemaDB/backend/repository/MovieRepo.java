package com.cinemaDB.backend.repository;

import com.cinemaDB.backend.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepo extends MongoRepository<Movie, String> {
    // Custom mongoDB queries
}
