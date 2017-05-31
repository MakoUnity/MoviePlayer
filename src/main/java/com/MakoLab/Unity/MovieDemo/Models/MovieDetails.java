package com.MakoLab.Unity.MovieDemo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.MakoLab.Unity.MovieDemo.Commons.RepositoryHelper;

@Document(collection = "actualPlayedMovie")
public class MovieDetails {
	@Id
	private String ID;
	private String movieToPlay;

	public String getMovieToPlay() {
		return movieToPlay;
	}

	public void setMovieToPlay(String movieToPlay) {
		this.movieToPlay = movieToPlay;
	}

	public String getID() {
		return ID;
	}

	public MovieDetails(String movieToPlay) {
		this.ID = RepositoryHelper.MONGO_SEARCH_ID.getValue();
		this.movieToPlay = movieToPlay;
	}

	@Override
	public String toString() {
		return "MovieDetails [ID=" + ID + ", movieToPlay=" + movieToPlay + "]";
	}
}
