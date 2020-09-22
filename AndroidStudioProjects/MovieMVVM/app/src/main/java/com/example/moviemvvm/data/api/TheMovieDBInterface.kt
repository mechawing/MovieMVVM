package com.example.moviemvvm.data.api

import com.example.moviemvvm.data.vo.MovieDetails
import com.example.moviemvvm.data.vo.MovieResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=94ea91156e69939c83fee6a271bc0f2f&page1
    // https://api.themoviedb.org/3/movie/299534?api_key=94ea91156e69939c83fee6a271bc0f2f
    // https://api.themoviedb.org/3/

    @GET("move/popular")
    fun getPopularMovie(@Query("page")page: Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>
}