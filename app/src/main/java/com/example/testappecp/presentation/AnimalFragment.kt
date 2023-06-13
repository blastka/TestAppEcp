package com.example.testappecp.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.testappecp.R
import com.example.testappecp.presentation.adapter.AnimalAdapter
import com.github.johnnysc.coremvvm.presentation.BaseFragment
import com.google.android.material.textfield.TextInputEditText

class AnimalFragment: BaseFragment<AnimalViewModel>() {

    override val layoutResId: Int = R.layout.animal_fragment

    override fun viewModelClass(): Class<AnimalViewModel> {
        return AnimalViewModel::class.java
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.animalRecyclerView)
        val animalAdapter = AnimalAdapter.Animal()
        recyclerView.adapter = animalAdapter

        viewModel.observe(this) { currenciesUi ->
            currenciesUi.map(animalAdapter)
        }
        val button = view.findViewById<Button>(R.id.animalButton)
        val editText = view.findViewById<TextInputEditText>(R.id.animalTextInputEditText)
        button.setOnClickListener {
            viewModel.animal(editText.text.toString())
        }

    }

}