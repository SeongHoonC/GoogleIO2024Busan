package com.example.googleio2024.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.databinding.ItemContentBinding

class ContentsAdapter(
    private val contents: List<Content>,
) : RecyclerView.Adapter<ItemContentViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): ItemContentViewHolder = ItemContentViewHolder.from(parent)

    override fun onBindViewHolder(
        holder: ItemContentViewHolder,
        position: Int,
    ) = holder.bind(contents[position])

    override fun getItemCount(): Int = contents.size
}

class ItemContentViewHolder(
    private val binding: ItemContentBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(content: Content) {
        binding.title.text = content.name
    }

    companion object {
        fun from(parent: ViewGroup): ItemContentViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemContentBinding.inflate(layoutInflater, parent, false)
            return ItemContentViewHolder(binding)
        }
    }
}
