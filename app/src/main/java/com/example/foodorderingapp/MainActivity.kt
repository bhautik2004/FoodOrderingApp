package com.example.foodorderingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.foodorderingapp.Fragment.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
class MainActivity : AppCompatActivity(), ProfileFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.fragment)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomNav.setupWithNavController(navController)

    }
}
