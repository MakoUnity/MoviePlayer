package com.MakoLab.Unity.MovieDemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MakoLab.Unity.MovieDemo.Models.MovieDetails;

@Repository
public interface MovieRepository extends MongoRepository<MovieDetails, String>{

}
