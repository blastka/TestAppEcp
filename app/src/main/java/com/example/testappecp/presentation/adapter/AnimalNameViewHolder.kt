package com.example.testappecp.presentation.adapter

import android.view.View
import com.example.testappecp.R
import com.github.johnnysc.coremvvm.presentation.adapter.GenericViewHolder
import com.github.johnnysc.coremvvm.presentation.adapter.ItemUi

class AnimalNameViewHolder(view: View): GenericViewHolder<ItemUi>(view)  {
    override fun bind(item: ItemUi) = item.show(itemView.findViewById(R.id.animalNameTextView))
}