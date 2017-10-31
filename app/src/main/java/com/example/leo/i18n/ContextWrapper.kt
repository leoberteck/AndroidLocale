package com.example.leo.i18n

import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import android.os.LocaleList
import java.util.*

class ContextWrapper : ContextWrapper {

    companion object {
        @SuppressWarnings("deprecation")
        fun wrap(context: Context, newLocale: Locale): com.example.leo.i18n.ContextWrapper {
            var _context = context
            val res = context.resources
            val configuration = res.configuration
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                configuration.locale =newLocale
                val localList = LocaleList(newLocale)
                configuration.locales = localList
                _context = context.createConfigurationContext(configuration)
            } else if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                configuration.locale = newLocale
                _context = context.createConfigurationContext(configuration)
            } else {
                configuration.locale = newLocale
                res.updateConfiguration(configuration, res.displayMetrics)
            }
            return com.example.leo.i18n.ContextWrapper(_context)
        }
    }

    constructor(context : Context) : super(context)
}