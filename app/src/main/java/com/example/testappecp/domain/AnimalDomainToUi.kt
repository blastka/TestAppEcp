package com.example.testappecp.domain

import com.example.testappecp.data.AnimalCharacteristics
import com.example.testappecp.data.AnimalTaxonomy
import com.example.testappecp.presentation.AnimalsUi
import com.example.testappecp.presentation.adapter.AnimalDetailsUi
import com.example.testappecp.presentation.adapter.AnimalNameUi
import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi

class AnimalDomainToUi: AnimalDomain.Mapper<List<ItemUi>> {
    override fun map(
        name: String,
        characteristics: AnimalCharacteristics,
        locations: List<String>,
        taxonomy: AnimalTaxonomy
    ): List<ItemUi> {
        val result = mutableListOf<ItemUi>(AnimalNameUi(name))
        result.add(AnimalDetailsUi(name))//todo сейчас просто проверка, переделать
        return result
    }
}
