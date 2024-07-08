package com.example.googleio2024.gdgbusanlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.Event
import com.example.googleio2024.databinding.ItemNowHereViewBinding

class NowHereViewHolder(
    private val binding: ItemNowHereViewBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(event: Event) {
        // bind
    }

    companion object {
        fun from(parent: ViewGroup): NowHereViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemNowHereViewBinding.inflate(layoutInflater, parent, false)
            return NowHereViewHolder(binding)
        }
    }
}
