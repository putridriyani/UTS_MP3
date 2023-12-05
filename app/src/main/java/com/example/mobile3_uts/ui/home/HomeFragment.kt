package com.example.mobile3_uts.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cc.utslabmp3.ExerciseAdapter
import com.cc.utslabmp3.Popular
import com.example.mobile3_uts.R
import com.example.mobile3_uts.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var recyclerViewAdapter: ExerciseAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView = binding.recyclerView
        val layoutManager = LinearLayoutManager(requireContext())
        recyclerView.layoutManager = layoutManager

        recyclerViewAdapter = ExerciseAdapter(createPopularList())
        recyclerView.adapter = recyclerViewAdapter
    }

    private fun createPopularList(): List<Popular> {
        val popularList = mutableListOf<Popular>()
        popularList.add(Popular(R.drawable.popular_1, "Full Shot Stretching Arm", "Beginner", "30 min"))
        popularList.add(Popular(R.drawable.popular_2, "Athlete Practicing Monochrome", "Beginner", "50 min"))

        // Tambahkan item-item lainnya sesuai kebutuhan

        return popularList
    }
}
