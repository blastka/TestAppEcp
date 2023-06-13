package com.example.testappecp.presentation

import com.example.testappecp.domain.AnimalInteractor
import com.github.johnnysc.coremvvm.core.Dispatchers
import com.github.johnnysc.coremvvm.presentation.BaseViewModel
import com.github.johnnysc.coremvvm.presentation.ProgressCommunication
import com.github.johnnysc.coremvvm.presentation.Visibility

class AnimalViewModel(
    private val interactor: AnimalInteractor,
    private val progressCommunication: ProgressCommunication.Update,
    communication: AnimalCommunication,
    dispatchers: Dispatchers
) : BaseViewModel<AnimalsUi>(communication, dispatchers), FetchAnimal {

    private val atFinish = {
        progressCommunication.map(Visibility.Gone())
    }

    override fun animal(name: String) {
        handle {
            progressCommunication.map(Visibility.Visible())
            interactor.animal(
                atFinish,
                name
            ) { it.map { animalsUi -> communication.map(animalsUi) } }
        }
    }
}

interface Init {
    fun init(isFirstRun: Boolean)
}

interface FetchAnimal {
    fun animal(name: String)
}