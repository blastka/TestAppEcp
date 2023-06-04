package com.example.testappecp.domain

import com.example.testappecp.presentation.AnimalUi
import com.github.johnnysc.coremvvm.core.Dispatchers
import com.github.johnnysc.coremvvm.data.HandleError
import com.github.johnnysc.coremvvm.domain.Interactor

interface AnimalInteractor {
    suspend fun animal(atFinish: () -> Unit, successful: (List<AnimalUi>) -> Unit, name: String)

    class Base(
        private val repository: AnimalRepository,
        private val mapper: AnimalDomain.Mapper<AnimalUi>,
        dispatchers: Dispatchers,
        handleError: HandleError
    ) : AnimalInteractor, Interactor.Abstract(dispatchers, handleError) {

        override suspend fun animal(
            atFinish: () -> Unit,
            successful: (List<AnimalUi>) -> Unit,
            name: String
        ) =
            handle(successful, atFinish) {
                val data = repository.animal(name)
                return@handle data.map { it.map(mapper) }
            }
    }
}