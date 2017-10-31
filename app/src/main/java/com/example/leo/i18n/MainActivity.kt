package com.example.leo.i18n

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_button_pt.setOnClickListener {
            setLocale("pt")
        }

        activity_main_button_en.setOnClickListener {
            setLocale("en")
        }

        activity_main_button_es.setOnClickListener {
            setLocale("es")
        }
    }
}
