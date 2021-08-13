package com.hjzf

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class NewsApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        // 聚合数据 新闻头条API的口令
        const val KEY = "6ba530bcea7f80a28980d1632179d568"
        val newsTypeChineseName = mapOf(
            "top" to "头条",
            "shehui" to "社会",
            "guonei" to "国内",
            "guoji" to "国际",
            "yule" to "娱乐",
            "tiyu" to "体育",
            "junshi" to "军事",
            "keji" to "科技",
            "caijing" to "财经",
            "shishang" to "时尚"
        )
    }

    override fun onCreate() {
        super.onCreate()
        context = baseContext
    }
}