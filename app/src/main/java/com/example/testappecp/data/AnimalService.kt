package com.example.testappecp.data

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface AnimalService {

    @Headers
        ("X-Api-Key: v+3Dpdq2CtnLYEzHYaCCow==Xwa3DT5rMRtxCtAo")
    @GET("v1/animals")
    suspend fun animals(
        @Query("name") name: String
    ): List<AnimalCloud.Base>
}
