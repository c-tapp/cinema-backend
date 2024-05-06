package com.cinemaDB.backend.controller;

import com.cinemaDB.backend.entity.SeasonalAnime;
import com.cinemaDB.backend.repository.SeasonalAnimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SeasonalAnimeController {

    @Autowired
    private SeasonalAnimeRepo repo;

    @GetMapping("/seasonal-anime")
    public String showSeasonalAnime(Model model) {
        List<SeasonalAnime> seasonalAnimeList = repo.findAll();
        System.out.println(seasonalAnimeList); // Log the list to verify data
        model.addAttribute("seasonalAnimeList", seasonalAnimeList);
        return "seasonal_anime";
    }
}
