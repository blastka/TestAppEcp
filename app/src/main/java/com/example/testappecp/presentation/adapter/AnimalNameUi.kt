package com.example.testappecp.presentation.adapter

import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi
import com.github.johnnysc.coremvvm.presentation.adapter.MyView

class AnimalNameUi(private val text: String): ItemUi {
    override fun content(): String {
        return text
    }

    override fun id(): String {
        return text
    }

    override fun show(vararg views: MyView) {
        views[0].show(text)
    }

    override fun type(): Int {
        return 1
    }
}