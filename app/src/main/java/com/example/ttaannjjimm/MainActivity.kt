package com.example.ttaannjjimm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btmBar = findViewById<BottomNavigationView>(R.id.low_bar)

        btmBar.setOnItemSelectedListener { menuItem ->

            if (menuItem.itemId==R.id.nav_guard){
                inflateFragment()
            }
            else if(menuItem.itemId==R.id.nav_home){
                inflateHomeFragment()
            }
            else if(menuItem.itemId==R.id.nav_dashboard){
                inflateDashboardFragment()
            }
            else if(menuItem.itemId==R.id.nav_profile){
                inflateProfileFragment()
            }


            true
        }

    }

    private fun inflateProfileFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,ProfileFragment.newInstance())
        transaction.commit()
    }

    private fun inflateDashboardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,DashboardFragment.newInstance())
        transaction.commit()
    }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,HomeFragment.newInstance())
        transaction.commit()
    }

    private fun inflateFragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,GuardFragment.newInstance())
        transaction.commit()

    }


}