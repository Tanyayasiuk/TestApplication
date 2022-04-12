package com.example.testapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testapplication.databinding.FragmentTopHeadlinesBinding

class TopHeadlinesFragment : Fragment() {

    var binding: FragmentTopHeadlinesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTopHeadlinesBinding.inflate(inflater, container, false)
        this.binding = binding

        // TODO: Add adapter for list, handling query etc.

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}