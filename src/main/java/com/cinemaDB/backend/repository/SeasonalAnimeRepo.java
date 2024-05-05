package com.cinemaDB.backend.repository;

import com.cinemaDB.backend.entity.SeasonalAnime;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeasonalAnimeRepo extends MongoRepository<SeasonalAnime, String> {
    // Custom mongoDB queries

}
