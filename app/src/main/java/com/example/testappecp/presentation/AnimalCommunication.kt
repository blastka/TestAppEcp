package com.example.testappecp.presentation

import com.github.johnnysc.coremvvm.presentation.Communication

interface AnimalCommunication: Communication.Mutable<AnimalsUi> {
    class Base: Communication.UiUpdate<AnimalsUi>(), AnimalCommunication
}