package com.example.googleio2024.gdgbusanlist.pastevents

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.googleio2024.Event
import com.example.googleio2024.databinding.ItemPastEventBinding

class PastEventViewHolder(
    private val binding: ItemPastEventBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(event: Event) {
//        binding.tvEventName.text = event.name
//        binding.tvEventDate.text = event.date
//        binding.tvEventCategory.text = event.category
//        binding.ivEventImage.load(event.imageUrl)
    }

    companion object {
        fun from(parent: ViewGroup): PastEventViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemPastEventBinding.inflate(layoutInflater, parent, false)
            return PastEventViewHolder(binding)
        }
    }
}
