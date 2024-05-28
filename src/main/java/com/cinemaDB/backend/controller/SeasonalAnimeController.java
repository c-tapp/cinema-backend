package com.cinemaDB.backend.controller;

import com.cinemaDB.backend.entity.SeasonalAnime;
import com.cinemaDB.backend.repository.SeasonalAnimeRepo;
import com.cinemaDB.backend.service.SeasonalAnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SeasonalAnimeController {

    @Autowired
    private SeasonalAnimeRepo repo;

    @Autowired
    private SeasonalAnimeService animeService;

    @GetMapping("/seasonal-anime")
    public String showSeasonalAnime(Model model) {
        List<SeasonalAnime> seasonalAnimeList = repo.findAll();
        model.addAttribute("seasonalAnimeList", seasonalAnimeList);
        return "seasonal_anime";
    }

    @PostMapping("/delete")
    public String deleteAnime(@RequestParam("animeId") String animeId) {
        // Delete the anime entry from the database based on the provided ID
        animeService.deleteAnime(animeId);

        // Reload after successful deletion
        return "redirect:/seasonal-anime";
    }
}
