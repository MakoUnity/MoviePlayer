package com.MakoLab.Unity.MovieDemo.Endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MakoLab.Unity.MovieDemo.Application.MovieService;
import com.MakoLab.Unity.MovieDemo.Models.MovieDetails;

@Controller
@RestController
@RequestMapping("/moviePlayer")
public class MovieEndpoint {
	private final static String MOVIE_TO_PLAY = "movieToPlay";

	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/change/{movieToPlay}", method = RequestMethod.GET)
	public ResponseEntity<Void> changePlayedMovie(@PathVariable(MOVIE_TO_PLAY) String movieToPlay) {
		movieService.saveMovieDetails(new MovieDetails(movieToPlay));

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/actualPlayed", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> getPlayedMovie() {
		Map<String, String> result = new HashMap<>();
		result.put(MOVIE_TO_PLAY, movieService.getActualPlayedMovie());
		
		return new ResponseEntity<Map<String, String>>(result, HttpStatus.OK);
	}
}
