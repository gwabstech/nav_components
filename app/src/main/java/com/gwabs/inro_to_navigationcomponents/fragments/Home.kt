package com.gwabs.inro_to_navigationcomponents.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.gwabs.inro_to_navigationcomponents.R
import com.gwabs.inro_to_navigationcomponents.databinding.FragmentHomeBinding

class Home : Fragment() {
    private var  _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.second.setOnClickListener {
            it.findNavController().navigate(R.id.action_home2_to_second2)
        }
        binding.trd.setOnClickListener {
            it.findNavController().navigate(R.id.action_home2_to_thard)
        }
        return view

    }


}