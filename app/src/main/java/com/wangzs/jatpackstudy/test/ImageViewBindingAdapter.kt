package com.wangzs.jatpackstudy.test

import android.graphics.Color
import android.text.TextUtils
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean

class ImageViewBindingAdapter {
    companion object {

        @JvmStatic
        @BindingAdapter("image")
        fun setImage(imageView: ImageView, url: String?) {
            // 加载网络图片
            if (!TextUtils.isEmpty(url)) {
                Glide.with(imageView).load(url).into(imageView)
            } else {
                imageView.setBackgroundColor(Color.GREEN)
            }
        }

     
    }
}

