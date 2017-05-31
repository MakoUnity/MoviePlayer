package com.MakoLab.Unity.MovieDemo.Application;

import com.MakoLab.Unity.MovieDemo.Models.MovieDetails;

public interface MovieService {
	void saveMovieDetails(MovieDetails movieDetails);
	String getActualPlayedMovie();
}
