package com.example.testappecp.presentation

import com.github.johnnysc.coremvvm.presentation.Communication

interface AnimalCommunication: Communication.Mutable<AnimalUi> {
    class Base: Communication.UiUpdate<AnimalUi>(), AnimalCommunication
}