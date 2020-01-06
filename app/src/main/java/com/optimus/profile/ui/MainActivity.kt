package com.optimus.profile.ui

import android.os.Bundle
import com.optimus.profile.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()

    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
    }


}
