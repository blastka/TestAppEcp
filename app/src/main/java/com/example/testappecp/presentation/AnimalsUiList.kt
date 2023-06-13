package com.example.testappecp.presentation

interface AnimalsUiList {

    fun <T> map(mapper: Mapper<T>): T

    class Base(private val list: List<AnimalsUi>): AnimalsUiList{
        override fun <T> map(mapper: Mapper<T>): T = mapper.map(list)
    }

    interface Mapper<T> {
        fun map(list: List<AnimalsUi>): T
    }
}