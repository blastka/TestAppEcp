package com.example.testappecp.data

import com.example.testappecp.domain.AnimalDomain
import com.example.testappecp.domain.AnimalRepository

class BaseAnimalRepository(private val animalCloudDataSource: AnimalCloudDataSource,
private val mapper: AnimalCloud.Mapper<AnimalDomain>) :
    AnimalRepository {
    override suspend fun animal(name: String): List<AnimalDomain> {
        val data = animalCloudDataSource.animal(name)
        return data.map { it.map(mapper) }
    }
}