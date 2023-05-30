package com.example.pantrypal.view.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pantrypal.R
import com.example.pantrypal.databinding.FragmentFoodRecipeBinding


class FoodRecipeFragment : Fragment() {
    private var _binding : FragmentFoodRecipeBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_recipe, container, false)
    }

    companion object {

    }
}