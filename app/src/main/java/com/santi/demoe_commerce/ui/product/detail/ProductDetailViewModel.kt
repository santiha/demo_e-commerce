package com.santi.demoe_commerce.ui.product.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class ProductDetailViewModel: ViewModel() {

    private val _description = MediatorLiveData<String>().apply {
        value = "* Material -- Shell: fiber; Lining: 100% polyester flannel; Sleeve: cotton quilted\n\n" +
                " * Double Closure -- Full-length zipper closure with button placket. Firmer zipper and buttons are used for an extra protection closure\n\n" +
                " * Hand Wash Only\n\n" +
                " * Added warmth - This stylish puffer coat is thickened with soft flannel lining, warm and toasty. Stand collar design and insulated sleeves with elastic cuffs can definitely get you warm in wind and cold days\n\n" +
                " * Multi pockets -- 1 inside pocket, 2 double-layer hand pockets and 2 zipper chest pockets provide large capacity for storing cell-phone, keys, wallet, and other belongings while the inside fleece lining offers great comfort to your hands\n\n" +
                " * Removable Hood -- Faux-fur trim hood with zipper closure is easy to detach and attach. Finished with adjustable drawstrings and buckles, the hood is more flexible and expandable, protecting you from the cold air\n\n" +
                " * Best Use -- Crafted from durable fabric, this hip-length parka coat is windproof and waterproof, which is ideal for both daily life and outdoor activities like running, cycling, skiing, snowboarding, hiking, climbing, camping, driving, walking, etc\n\n" +
                " * Garment Care -- Hand Wash or Machine Wash in Normal Cycle, Hang Dry, Do Not Bleach and Iron. (Attention: there are size chart on product description, please confirm the size before you place an order)"
    }
    val description: LiveData<String> = _description
}