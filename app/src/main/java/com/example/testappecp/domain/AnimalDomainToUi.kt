package com.example.testappecp.domain

import com.example.testappecp.data.AnimalCharacteristics
import com.example.testappecp.data.AnimalTaxonomy
import com.example.testappecp.presentation.AnimalUi

class AnimalDomainToUi: AnimalDomain.Mapper<AnimalUi> {
    override fun map(
        name: String,
        characteristics: AnimalCharacteristics,
        locations: List<String>,
        taxonomy: AnimalTaxonomy
    ): AnimalUi {
        TODO("Not yet implemented")
    }
}