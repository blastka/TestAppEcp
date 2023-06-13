package com.example.testappecp.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.testappecp.R
import com.github.johnnysc.coremvvm.presentation.adapter.GenericViewHolder
import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi
import com.github.johnnysc.coremvvm.presentation.adapter.ViewHolderFactoryChain

class AnimalDetailsViewHolderFactoryChain(private val viewHolderFactoryChain: ViewHolderFactoryChain<ItemUi>) :
    ViewHolderFactoryChain<ItemUi> {
    override fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<ItemUi> {
        return if (viewType == 2)
            AnimalDetailsViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.animal_details_layout, parent, false)
            )
        else viewHolderFactoryChain.viewHolder(parent, viewType)
    }
}