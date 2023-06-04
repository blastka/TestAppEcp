package com.example.testappecp.domain

interface AnimalRepository {
    suspend fun animal(name:String):List<AnimalDomain>
}