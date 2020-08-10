package com.jennelyn.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Created by Jennelyn Urot Peromingan on August 10, 2020, at 7:29 PM
 */

@BindingAdapter("loadimage")
fun bindingImage(
    userImageView: ImageView, imageUri: String
) {
    Glide.with(userImageView.context)
        .load(imageUri)
        .into(userImageView)
}