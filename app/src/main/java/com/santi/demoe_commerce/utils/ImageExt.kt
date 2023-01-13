package com.santi.demoe_commerce.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.signature.ObjectKey

fun ImageView.loadImage(context: Context, linkImage: String) {
    Glide.with(context)
        .load(linkImage).fitCenter()
        .signature(ObjectKey(System.currentTimeMillis().toString()))
        .into(this)
}