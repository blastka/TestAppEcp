package com.example.testappecp.data

import com.github.johnnysc.coremvvm.data.CloudDataSource
import com.github.johnnysc.coremvvm.data.HandleError

interface AnimalCloudDataSource {

    suspend fun animal(name: String): List<AnimalCloud>

    class Base(private val animalService: AnimalService,
               handleError: HandleError
    ) : AnimalCloudDataSource, CloudDataSource.Abstract(handleError) {

        override suspend fun animal(name: String) = handle {
            animalService.animals(name)
        }

    }
}