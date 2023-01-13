package com.santi.demoe_commerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.santi.demoe_commerce.R
import com.santi.demoe_commerce.databinding.ItemHomeCategoryBinding
import com.santi.demoe_commerce.model.CategoryModel
import com.santi.demoe_commerce.utils.loadImage

class CategoryAdapter(
    private val dataList: ArrayList<CategoryModel>,
    private val listener: (CategoryModel) -> Unit
    ): RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_category, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        with(holder) {
            binding.itemHomeCategoryTitle.text = dataList[position].title
            binding.itemHomeCategoryImage.loadImage(holder.itemView.context, dataList[position].imageLink)

            holder.itemView.setOnClickListener {
                listener.invoke(dataList[position])
            }
        }
    }

    override fun getItemCount(): Int = dataList.size

    class CategoryHolder(view: View): ViewHolder(view) {
        val binding = ItemHomeCategoryBinding.bind(view)
    }
}