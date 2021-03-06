package com.optimus.profile.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.optimus.profile.R


/**
 * Created by Dmitriy Chebotar on 06.01.2020.
 */
abstract class BaseActivity : AppCompatActivity() {

    private lateinit var alertDialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        val alertDialogBuilder = AlertDialog.Builder(this).apply {
            setCancelable(false)
            setView(R.layout.loading_dialog)
        }
        alertDialog = alertDialogBuilder.create()
    }

    fun showProgress() {
        alertDialog.show()
    }

    fun hideProgress() {
        alertDialog.hide()
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}