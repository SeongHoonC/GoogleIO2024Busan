package com.example.googleio2024.gdgbusanlist.organizers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.Organizer
import com.example.googleio2024.databinding.ItemOrganizersViewBinding

class OrganizersViewHolder(
    private val binding: ItemOrganizersViewBinding,
) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var adapter: OrganizersAdapter

    fun bind(organizers: List<Organizer>) {
        adapter = OrganizersAdapter(organizers)
        binding.rvOrganizers.adapter = adapter
    }

    companion object {
        fun from(parent: ViewGroup): OrganizersViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemOrganizersViewBinding.inflate(layoutInflater, parent, false)
            return OrganizersViewHolder(binding)
        }
    }
}