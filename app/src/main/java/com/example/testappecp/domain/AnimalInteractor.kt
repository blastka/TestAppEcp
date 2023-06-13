package com.example.testappecp.domain

import com.example.testappecp.presentation.AnimalsUi
import com.example.testappecp.presentation.AnimalsUiList
import com.github.johnnysc.coremvvm.core.Dispatchers
import com.github.johnnysc.coremvvm.data.HandleError
import com.github.johnnysc.coremvvm.domain.Interactor

interface AnimalInteractor {
    suspend fun animal(atFinish: () -> Unit, name: String, successful: (AnimalsUi) -> Unit)

    class Base(
        private val repository: AnimalRepository,
        private val mapper: AnimalDomain.Mapper<AnimalsUi>,
        private val mapperForLists: AnimalsUiList.Mapper<AnimalsUi>,
        dispatchers: Dispatchers,
        handleError: HandleError
    ) : AnimalInteractor, Interactor.Abstract(dispatchers, handleError) {

        override suspend fun animal(
            atFinish: () -> Unit,
            name: String,
            successful: (AnimalsUi) -> Unit
        ) =
            handle(successful, atFinish) {
                val data = repository.animal(name)
                val result = data.map { it.map(mapper) }
                val animalDomainList = AnimalsUiList.Base(result)
                return@handle animalDomainList.map(mapperForLists)
            }
    }
}