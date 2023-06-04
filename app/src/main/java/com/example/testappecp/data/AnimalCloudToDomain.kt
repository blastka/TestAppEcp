package com.example.testappecp.data

import com.example.testappecp.domain.AnimalDomain

class AnimalCloudToDomain : AnimalCloud.Mapper<AnimalDomain> {
    override fun map(
        name: String,
        characteristics: AnimalCharacteristics,
        locations: List<String>,
        taxonomy: AnimalTaxonomy
    ): AnimalDomain {
        return AnimalDomain.Base(name, characteristics, locations, taxonomy)
    }

}