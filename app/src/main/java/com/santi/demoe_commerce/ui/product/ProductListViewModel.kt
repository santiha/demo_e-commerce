package com.santi.demoe_commerce.ui.product

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.santi.demoe_commerce.data_fake.DataFake
import com.santi.demoe_commerce.model.ProductModel

class ProductListViewModel: ViewModel() {

    private val _productList = MutableLiveData<ArrayList<ProductModel>>().apply {
        value = DataFake.suggestionList()
    }
    val productList: LiveData<ArrayList<ProductModel>> = _productList
}