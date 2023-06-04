package com.example.testappecp.data

import com.github.johnnysc.coremvvm.data.MakeService
import com.github.johnnysc.coremvvm.data.ProvideRetrofitBuilder

interface ProvideAnimalService {
    fun animalService()

    class Base(retrofitBuilder: ProvideRetrofitBuilder) : MakeService.Abstract(retrofitBuilder),
        ProvideAnimalService {

        override fun animalService() {
            TODO("Not yet implemented")
        }

        override fun baseUrl(): String {
            return "https://api-ninjas.com/"
        }
    }
}