package com.example.testappecp.presentation.adapter

import com.github.johnnysc.coremvvm.presentation.adapter.GenericAdapter
import com.github.johnnysc.coremvvm.presentation.adapter.ViewHolderFactoryChain

interface AnimalAdapter {
    class Animal :
        GenericAdapter.Base(
            AnimalNameViewHolderFactoryChain(
                AnimalDetailsViewHolderFactoryChain(
                    ViewHolderFactoryChain.Exception()
                )
            )
        )
}