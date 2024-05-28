package com.cinemaDB.backend.service;

import com.cinemaDB.backend.repository.SeasonalAnimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonalAnimeService {

    @Autowired
    private SeasonalAnimeRepo animeRepo;

    // Method to delete an anime entry based on its ID
    public void deleteAnime(String animeId) {
        // Check if the anime entry exists in the database
        if (animeRepo.existsById(animeId)) {
            // If it exists, delete the entry
            animeRepo.deleteById(animeId);
        } else {
            // Handle the case where the anime entry does not exist
            throw new IllegalArgumentException("Anime entry with ID " + animeId + " not found");
        }
    }
}
