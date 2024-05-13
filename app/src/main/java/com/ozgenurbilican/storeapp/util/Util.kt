package com.ozgenurbilican.storeapp.util

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.downloadURL(url:String){
    Glide.with(this).load(url).into(this)
}