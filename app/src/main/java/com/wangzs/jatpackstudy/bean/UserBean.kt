package com.wangzs.jatpackstudy.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import com.wangzs.jatpackstudy.BR

class UserBean : BaseObservable() {
   val totalField = ObservableField<Int>()
    var curPage = 0
    var offset = 0
    var isOver = false
    var pageCount = 0
    var size = 0

    @get:Bindable
    var total = 11
        set(value) {
            field = value
            notifyPropertyChanged(BR.total)
        }

    var datas: List<DatasBean>? = null

    class DatasBean {
        var isAdminAdd = false
        var apkLink: String? = null
        var audit = 0
        var author: String? = null
        var isCanEdit = false
        var chapterId = 0
        var chapterName: String? = null
        var isCollect = false
        var courseId = 0
        var desc: String? = null
        var descMd: String? = null
        var envelopePic: String? = null
        var isFresh = false
        var host: String? = null
        var id = 0
        var isIsAdminAdd = false
            private set
        var link: String? = null
        var niceDate: String? = null
        var niceShareDate: String? = null
        var origin: String? = null
        var prefix: String? = null
        var projectLink: String? = null
        var publishTime: Long = 0
        var realSuperChapterId = 0
        var isRoute = false
        var selfVisible = 0
        var shareDate: Long = 0
        var shareUser: String? = null
        var superChapterId = 0
        var superChapterName: String? = null
        var title: String? = null
        var type = 0
        var userId = 0
        var visible = 0
        var zan = 0
        var tags: List<*>? = null
        fun setIsAdminAdd(isAdminAdd: Boolean) {
            isIsAdminAdd = isAdminAdd
        }
    }
}