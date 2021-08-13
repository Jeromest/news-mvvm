package com.hjzf.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hjzf.R
import com.hjzf.databinding.ActivityMainBinding
import com.hjzf.util.LogUtil

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private lateinit var currentNavController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        LogUtil.e(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        // View binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Init "currentNavController"
        val navHostFragment = supportFragmentManager.findFragmentById(
            R.id.nav_host_container
        ) as NavHostFragment
        currentNavController = navHostFragment.navController

        // Setup the bottom navigation view with navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setupWithNavController(currentNavController)
    }

    override fun onSupportNavigateUp(): Boolean {
        LogUtil.e(TAG, "onSupportNavigateUp: ")
        return currentNavController.navigateUp()
    }

    companion object {
        const val TAG = "MainActivity"
    }
}