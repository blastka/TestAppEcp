package com.example.testappecp.presentation

import com.github.johnnysc.coremvvm.core.Mapper
import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi

interface AnimalUi: Mapper.Unit<Mapper.Unit<List<ItemUi>>> {

    class Base(private val list: List<ItemUi>): AnimalUi{
        override fun map(data: Mapper.Unit<List<ItemUi>>) {
            data.map(list)
        }

    }
}