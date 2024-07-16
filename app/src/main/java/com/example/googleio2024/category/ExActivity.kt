package com.example.googleio2024.category

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.googleio2024.databinding.ActivityExBinding

class ExActivity : AppCompatActivity() {
    private val binding by lazy { ActivityExBinding.inflate(layoutInflater) }
    private val viewModel: ExViewModel by viewModels()
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel.categories.observe(this) {
            categoryAdapter = CategoryAdapter(it)
            binding.rvCategory.adapter = categoryAdapter
        }

        binding.btnNewCategory.setOnClickListener {
            viewModel.makeCategory("New Category")
        }

        binding.btnNewContent.setOnClickListener {
            viewModel.makeContent(1L, "New Content")
        }
    }
}
