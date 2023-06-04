package com.example.testappecp.presentation

import com.github.johnnysc.coremvvm.core.Dispatchers
import com.github.johnnysc.coremvvm.presentation.BaseViewModel

class AnimalViewModel(
    communication: AnimalCommunication,
    dispatchers: Dispatchers
) : BaseViewModel<AnimalUi>(communication, dispatchers) {


}

interface Init {
    fun init(isFirstRun: Boolean)
}

interface FetchAnimal{
    suspend fun animal(name: String)
}