package com.example.leo.i18n

import android.app.Activity
import android.content.Context
import java.util.*


abstract class BaseActivity : Activity() {

    companion object {
        var language : String = "pt"
    }

    override fun attachBaseContext(newBase: Context) {
        val newLocale = Locale(language)
        val context = ContextWrapper.wrap(newBase, newLocale)
        super.attachBaseContext(context)
    }

    protected fun setLocale(_language: String){
        language = _language
        recreate()
    }
}
