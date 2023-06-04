package com.example.testappecp.data

import com.google.gson.annotations.SerializedName

interface AnimalTaxonomy {

    fun <T> map(mapper: Mapper<T>): T

    interface Mapper<T> {
        fun map(
            kingdom: String,
            phylum: String,
            myclass: String,
            order: String,
            family: String,
            genus: String,
            scientific_name: String
        ): T
    }

    class Base(
        private val kingdom: String,
        private val phylum: String,
        @SerializedName("class")
        private val myclass: String,
        private val order: String,
        private val family: String,
        private val genus: String,
        private val scientific_name: String
    ) : AnimalTaxonomy {
        override fun <T> map(mapper: Mapper<T>): T =
            mapper.map(kingdom, phylum, myclass, order, family, genus, scientific_name)
    }
}