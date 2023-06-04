package com.example.testappecp.data

import com.google.gson.annotations.SerializedName

interface AnimalCloud {

    fun <T> map(mapper: Mapper<T>): T

    data class Base(
        @SerializedName("name")
        private val name: String,

        @SerializedName("characteristics")
        private val characteristics: AnimalCharacteristics.Base,

        @SerializedName("locations")
        private val locations: List<String>,

        @SerializedName("taxonomy")
        private val taxonomy: AnimalTaxonomy.Base

    ) : AnimalCloud {
        override fun <T> map(mapper: Mapper<T>): T =
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