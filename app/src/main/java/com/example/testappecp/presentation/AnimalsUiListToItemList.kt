package com.example.testappecp.presentation

import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi

class AnimalsUiListToItemList: AnimalsUiList.Mapper<List<ItemUi>>{
    override fun map(list: List<AnimalsUi>): List<ItemUi> {
        val result = mutableListOf<ItemUi>()

        return result
    }

}