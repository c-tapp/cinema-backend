package com.cinemaDB.backend;

import com.cinemaDB.backend.repository.SeasonalAnimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaDBApplication {

	private final SeasonalAnimeRepo seasonalRepo;

	@Autowired
	public CinemaDBApplication(SeasonalAnimeRepo seasonalRepo){
		this.seasonalRepo = seasonalRepo;
	}

	public static void main(String[] args) {

		SpringApplication.run(CinemaDBApplication.class, args);

	}

}