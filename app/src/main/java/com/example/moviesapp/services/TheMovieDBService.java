package com.example.moviesapp.services;

import com.example.moviesapp.models.MoviesList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TheMovieDBService {
    @GET("discover/movie?api_key=11518df004464f136f1ea9018d4db6d1&sort_by=popularity.desc")
    Call<MoviesList> listMovies();

    @GET("/search/movie?api_key=11518df004464f136f1ea9018d4db6d1&query=${movie}")
    Call<MoviesList> searchMovie(@Path("movie") String movie);
}
