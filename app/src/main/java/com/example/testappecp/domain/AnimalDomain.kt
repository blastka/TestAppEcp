package com.example.testappecp.domain

import com.example.testappecp.data.AnimalCharacteristics
import com.example.testappecp.data.AnimalCloud
import com.example.testappecp.data.AnimalTaxonomy

interface AnimalDomain {

    fun <T> map(mapper: Mapper<T>): T

    class Base(private val name: String,
               private val characteristics: AnimalCharacteristics,
               private val locations: List<String>,
               private val taxonomy: AnimalTaxonomy
    ): AnimalDomain{
        override fun <T> map(mapper: Mapper<T>) =
            mapper.map(name, characteristics, locations, taxonomy)

    }

    interface Mapper<T> {
        fun map(
            name: String,
            characteristics: AnimalCharacteristics,
            locations: List<String>,
            taxonomy: AnimalTaxonomy
        ): T
    }

}