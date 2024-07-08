package com.example.googleio2024.gdgbusanlist.pastevents

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.databinding.ItemPastEventsTitleViewBinding

class PastEventsTitleViewHolder(
    private val binding: ItemPastEventsTitleViewBinding,
) : RecyclerView.ViewHolder(binding.root) {
    companion object {
        fun from(parent: ViewGroup): PastEventsTitleViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemPastEventsTitleViewBinding.inflate(layoutInflater, parent, false)
            return PastEventsTitleViewHolder(binding)
        }
    }
}
