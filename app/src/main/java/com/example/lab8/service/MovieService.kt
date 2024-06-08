package com.example.lab8.service

import com.example.lab8.model.MovieRequest
import com.example.lab8.model.StatusResponse
import com.example.lab8.response.MovieResponse
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    @GET("BaiViet")
    suspend fun getListFilms(): Response<List<MovieResponse>>

    @GET("BaiViet/{id}")
    suspend fun getFilmDetail(@Path("id") id: String): Response<MovieResponse>

    @POST("BaiViet")
    suspend fun addFilm(@Body filmRequest: MovieRequest): Response<StatusResponse>

    @PUT("BaiViet/{id}")
    suspend fun updateFilm(
        @Path("id") id: String,
        @Body filmRequest: MovieRequest
    ): Response<StatusResponse>

    @DELETE("BaiViet/{id}")
    suspend fun deleteFilm(@Path("id") id: String): Response<StatusResponse>
}