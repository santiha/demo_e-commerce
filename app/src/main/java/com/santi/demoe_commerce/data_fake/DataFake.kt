package com.santi.demoe_commerce.data_fake

import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.santi.demoe_commerce.model.CategoryModel
import com.santi.demoe_commerce.model.ProductModel

object DataFake {

    fun bannerList(): ArrayList<SlideModel> {
        return arrayListOf(
            SlideModel("https://s.alicdn.com/@img/imgextra/i3/O1CN01nyVBY21GiUcdh1uy1_!!6000000000656-2-tps-990-400.png", ScaleTypes.CENTER_CROP),
            SlideModel("https://s.alicdn.com/@img/imgextra/i3/O1CN01M9x0R41VzdeRW8FYF_!!6000000002724-0-tps-990-400.jpg", ScaleTypes.CENTER_CROP),
            SlideModel("https://s.alicdn.com/@img/imgextra/i4/O1CN01Vot2c61l4sSNdbhnF_!!6000000004766-2-tps-990-400.png", ScaleTypes.CENTER_CROP)
        )
    }

    fun categoryList(): ArrayList<CategoryModel> {
        return arrayListOf(
            CategoryModel(1,"Wedding Apparel", "https://s.alicdn.com/@sc02/kf/HTB1OqCCOhTpK1RjSZFKq6y2wXXam.jpg_80x80xz.jpg"),
            CategoryModel(2,"Socks", "https://s.alicdn.com/@sc02/kf/H47c13842bc59401092f27f9d46e1ba14N.jpg_80x80xz.jpg"),
            CategoryModel(3,"Other Apparel", "https://s.alicdn.com/@sc02/kf/HTB1HFy0OiLaK1RjSZFxq6ymPFXaW.jpg_80x80xz.jpg"),
            CategoryModel(4,"Sportswear", "https://s.alicdn.com/@sc02/kf/HTB1isuIOgHqK1RjSZJnq6zNLpXaz.jpg_80x80xz.jpg"),
            CategoryModel(5,"Ethnic Clothing", "https://s.alicdn.com/@sc02/kf/H0773cf1419144524ab0766ea3e8952caN.jpg_80x80xz.jpg"),
            CategoryModel(6,"Garment", "https://s.alicdn.com/@sc02/kf/HTB1cimCOkvoK1RjSZPfq6xPKFXa5.jpg_80x80xz.jpg"),
            CategoryModel(7,"Women's Clothing", "https://s.alicdn.com/@sc02/kf/HTB15BWDOXzqK1RjSZFoq6zfcXXah.jpg_80x80xz.jpg"),
            CategoryModel(8,"Men's Clothing", "https://s.alicdn.com/@sc02/kf/HTB1WI2lQ7voK1RjSZPf760PKFXaf.png_80x80xz.jpg"),
            CategoryModel(9,"Novelty", "https://s.alicdn.com/@sc02/kf/HTB1yz5NOcfpK1RjSZFOq6y6nFXaj.jpg_80x80xz.jpg"),
            CategoryModel(10,"Special Use", "https://s.alicdn.com/@sc02/kf/HTB1yz5NOcfpK1RjSZFOq6y6nFXaj.jpg_80x80xz.jpg"),
        )
    }

    fun suggestionList(): ArrayList<ProductModel> {
        return arrayListOf(
            ProductModel("2021 New Designer Sexy Women Lantern Sleeve Rompers Basic Ribbed Knitted Long Sleeve Bodycon Bodysuits For Women", "\$14.75", "https://s.alicdn.com/@sc04/kf/Hd4bd1349662543008fc972507154cfffQ.jpg_250x250xz.jpg"),
            ProductModel("Male Custom Parka Jacket Men's Hooded Warm Coat Winter Parka Jacket", "\$19.19", "https://s.alicdn.com/@sc04/kf/H1e48361dce3d4883ae471c919d0c1cd2e.jpg_250x250xz.jpg"),
            ProductModel("F2290 European and American Fashion Sexy V Neck Bead Wrap Hip Plus Size Jumpsuits One Piece Jumpsuit Women", "\$11.40", "https://s.alicdn.com/@sc04/kf/H2f7e7e0e08f34b908bd8e79c6786d6cdv.jpg_250x250xz.jpg"),
            ProductModel("New arrival True Size Fall Zip Jumpsuits Fall 2021 Long Sleeve One Piece Bodycon Jumpsuits Casual Women Bodysuit Velvet Jumpsuit", "\$7.66", "https://s.alicdn.com/@sc04/kf/H28395404276145448802e7ff7fef09bc9.jpg_250x250xz.jpg"),
            ProductModel("2021 New Designer Sexy Women Lantern Sleeve Rompers Basic Ribbed Knitted Long Sleeve Bodycon Bodysuits For Women", "\$14.75", "https://s.alicdn.com/@sc04/kf/Hd4bd1349662543008fc972507154cfffQ.jpg_250x250xz.jpg"),
            ProductModel("Male Custom Parka Jacket Men's Hooded Warm Coat Winter Parka Jacket", "\$19.19", "https://s.alicdn.com/@sc04/kf/H1e48361dce3d4883ae471c919d0c1cd2e.jpg_250x250xz.jpg"),
            ProductModel("F2290 European and American Fashion Sexy V Neck Bead Wrap Hip Plus Size Jumpsuits One Piece Jumpsuit Women", "\$11.40", "https://s.alicdn.com/@sc04/kf/H2f7e7e0e08f34b908bd8e79c6786d6cdv.jpg_250x250xz.jpg"),
            ProductModel("New arrival True Size Fall Zip Jumpsuits Fall 2021 Long Sleeve One Piece Bodycon Jumpsuits Casual Women Bodysuit Velvet Jumpsuit", "\$7.66", "https://s.alicdn.com/@sc04/kf/H28395404276145448802e7ff7fef09bc9.jpg_250x250xz.jpg")
        )
    }
}