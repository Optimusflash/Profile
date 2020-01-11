package com.optimus.profile.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.optimus.profile.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private lateinit var navigationDrawer: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initToolbar()
        initViews()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home){
            navigationDrawer.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)

    }

    private fun initViews() {
        navigationDrawer = navigation_drawer
        navigationView = navigation_view
        navigationView.setNavigationItemSelectedListener {
            showToast(it.title.toString())
            it.isChecked = true
            navigationDrawer.closeDrawer(GravityCompat.START)
            return@setNavigationItemSelectedListener false
        }
    }

    private fun initToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_dehaze_black_24dp)
            setDisplayHomeAsUpEnabled(true)
            title = "Dmitriy Chebotar"
        }

    }


}
