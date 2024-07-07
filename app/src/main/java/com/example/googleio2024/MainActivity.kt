package com.example.googleio2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.googleio2024.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var organizersAdapter: OrganizersAdapter
    private lateinit var pastEventsAdapter: PastEventsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        organizersAdapter = OrganizersAdapter(gdgBusanOrganizers + gdgBusanOrganizers)
        pastEventsAdapter = PastEventsAdapter(gdgBusanEvents + gdgBusanEvents + gdgBusanEvents + gdgBusanEvents)
        binding.rvOrganizers.adapter = organizersAdapter
        binding.rvPastEvent.adapter = pastEventsAdapter
    }
}
