package com.example.doglist.interfaces

import com.example.doglist.dataclass.DogsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface PetsServices {
    @GET
    suspend fun getDogsByBreeds(@Url url:String): Response<DogsResponse>
}