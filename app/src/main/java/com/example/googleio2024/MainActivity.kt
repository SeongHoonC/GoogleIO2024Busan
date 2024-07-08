package com.example.googleio2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.googleio2024.databinding.ActivityMainBinding
import com.example.googleio2024.gdgbusanlist.GdgBusanAdapter
import com.example.googleio2024.gdgbusanlist.GdgBusanViewItem.*

class MainActivity : ComponentActivity() {
    val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var gdgBusanAdapter: GdgBusanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        gdgBusanAdapter =
            GdgBusanAdapter(
                listOf(
                    NowHereEventItem(Event(24L, "Google I/O 2024", "", "", "")),
                    OrganizersItem(gdgBusanOrganizers),
                    PastEventsTitleItem,
                ) + gdgBusanEvents.map { PastEventsItem(it) } +
                    gdgBusanEvents.map { PastEventsItem(it) } + gdgBusanEvents.map { PastEventsItem(it) },
            )
        binding.rvGdgBusan.adapter = gdgBusanAdapter
    }
}
