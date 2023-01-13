package com.santi.demoe_commerce.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.santi.demoe_commerce.data_fake.DataFake
import com.santi.demoe_commerce.model.CategoryModel
import com.santi.demoe_commerce.model.ProductModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _imageList = MutableLiveData<ArrayList<SlideModel>>().apply {
        value = DataFake.bannerList()
    }
    val imageList: LiveData<ArrayList<SlideModel>> = _imageList

    private val _categoryList = MutableLiveData<ArrayList<CategoryModel>>().apply {
        value = DataFake.categoryList()
    }
    val categoryList: LiveData<ArrayList<CategoryModel>> = _categoryList

    private val _productList = MutableLiveData<ArrayList<ProductModel>>().apply {
        value = DataFake.suggestionList()
    }
    val productList: LiveData<ArrayList<ProductModel>> = _productList
}