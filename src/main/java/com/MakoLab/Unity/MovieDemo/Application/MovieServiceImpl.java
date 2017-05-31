package com.MakoLab.Unity.MovieDemo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MakoLab.Unity.MovieDemo.Commons.RepositoryHelper;
import com.MakoLab.Unity.MovieDemo.Models.MovieDetails;
import com.MakoLab.Unity.MovieDemo.Repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository; 
	
	@Override
	public void saveMovieDetails(MovieDetails movieDetails) {
		movieRepository.save(movieDetails);
	}

	@Override
	public String getActualPlayedMovie() {
		MovieDetails result = movieRepository.findOne(RepositoryHelper.MONGO_SEARCH_ID.getValue());
		
		return result.getMovieToPlay();
	}

}
