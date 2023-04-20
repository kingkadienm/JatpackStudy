package com.wangzs.jatpackstudy.adapter

import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.wangzs.jatpackstudy.bean.UserBean

class TextBindingAdapter {
    companion object {
        @JvmStatic
        @BindingAdapter("total", requireAll = false)
        fun setText(textView: TextView, total: Int?) {
            Log.e("totalSize", "totalSize: $total")
            textView.text = "${total} aa "
        }
    }

}