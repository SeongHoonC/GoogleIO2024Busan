package com.example.googleio2024.gdgbusanlist.organizers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.googleio2024.Organizer
import com.example.googleio2024.databinding.ItemOrganizerBinding

class OrganizerViewHolder(
    private val binding: ItemOrganizerBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(organizer: Organizer) {
//        binding.ivOrganizer.load(organizer.imageUrl)
//        binding.tvOrganizerName.text = organizer.name
    }

    companion object {
        fun from(parent: ViewGroup): OrganizerViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemOrganizerBinding.inflate(layoutInflater, parent, false)
            return OrganizerViewHolder(binding)
        }
    }
}
