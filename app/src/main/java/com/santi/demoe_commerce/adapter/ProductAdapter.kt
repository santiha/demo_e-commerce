package com.santi.demoe_commerce.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.santi.demoe_commerce.R
import com.santi.demoe_commerce.databinding.ItemProductBinding
import com.santi.demoe_commerce.model.ProductModel
import com.santi.demoe_commerce.utils.loadImage

class ProductAdapter(
    private val dataList: ArrayList<ProductModel>,
    private val listener: (ProductModel) -> Unit
): RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        with(holder) {
            binding.itemProductTitle.text = dataList[position].title
            binding.itemProductPrice.text = dataList[position].price
            binding.itemProductImage.loadImage(holder.itemView.context, dataList[position].image)

            holder.itemView.setOnClickListener {
                listener.invoke(dataList[position])
            }
        }
    }

    override fun getItemCount(): Int = dataList.size

    class ProductHolder(view: View): ViewHolder(view) {
        val binding = ItemProductBinding.bind(view)
    }
}