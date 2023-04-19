package com.example.movieapp.api

import com.example.movieapp.helper.Constants.END_POINT
import com.example.movieapp.models.TvShowsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(END_POINT)
    suspend fun getTvShows():Response<TvShowsResponse>
}