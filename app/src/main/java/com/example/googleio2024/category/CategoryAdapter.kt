package com.example.googleio2024.category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleio2024.databinding.ItemCategoryBinding

class CategoryAdapter(
    private val categories: List<Category>,
) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CategoryViewHolder = CategoryViewHolder.from(parent)

    override fun onBindViewHolder(
        holder: CategoryViewHolder,
        position: Int,
    ) = holder.bind(categories[position])

    override fun getItemCount(): Int = categories.size
}

class CategoryViewHolder(
    private val binding: ItemCategoryBinding,
) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var contentsAdapter: ContentsAdapter

    fun bind(category: Category) {
        binding.title.text = category.title
        contentsAdapter = ContentsAdapter(category.contents)
        binding.rvContents.adapter = contentsAdapter
    }

    companion object {
        fun from(parent: ViewGroup): CategoryViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemCategoryBinding.inflate(layoutInflater, parent, false)
            return CategoryViewHolder(binding)
        }
    }
}
