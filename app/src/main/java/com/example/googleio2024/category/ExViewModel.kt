package com.example.googleio2024.category

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExViewModel : ViewModel() {
    private val _categories = MutableLiveData<List<Category>>(/* value = */ listOf())
    val categories: LiveData<List<Category>> get() = _categories
    private var nowCategoryId = 0L
    private var nowContentId = 0L

    fun makeCategory(title: String) {
        nowCategoryId++
        val newCategory = Category(id = nowCategoryId, title = title, contents = listOf())
        val categories = categories.value ?: listOf()
        _categories.value = categories + newCategory
    }

    fun makeContent(
        categoryId: Long,
        content: String,
    ) {
        val categories = categories.value ?: return
        nowContentId++
        // 해당 카테고리를 인덱스 찾음
        val index = categories.indexOf(categories.last { it.id == categoryId })

        // 해당 카테고리의 contents를 가져옴
        val nowContents = categories[index].contents

        // content id를 증가시키고, 새로운 content를 만듦
        val newCategory =
            categories[index].copy(
                contents = nowContents + Content(id = nowContentId, content),
            )

        val newCategories = categories.toMutableList()
        newCategories[index] = newCategory
        _categories.value = newCategories
    }
}
