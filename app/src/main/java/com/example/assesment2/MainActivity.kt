package com.example.assesment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import ui.DashboardFragment
import ui.HomeFragment
import ui.PhoneBookFragment
import ui.PhoneFragment
import ui.ProfileFragment
import ui.SettingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navview:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navview=findViewById(R.id.nav_view)

        replace(Fragment())
        navview.setOnItemSelectedListener {
            when(it.itemId){
                R.id.navigation_blank->replace(Fragment())
                R.id.navigation_home->replace(HomeFragment())
                R.id.navigation_dashboard->replace(DashboardFragment())
                R.id.navigation_phonebook->replace(PhoneFragment())
                R.id.navigation_settinf->replace(SettingFragment())
                R.id.navigation_profile->replace(ProfileFragment())
            }
            true
        }
    }

    private fun replace(phoneFragment: PhoneFragment) {
        val fragmentManager=supportFragmentManager
        val  fragmenttransaction=fragmentManager.beginTransaction()
        fragmenttransaction.commit()
    }

    private fun replace(fragment: HomeFragment) {
        val fragmentManager=supportFragmentManager
        val  fragmenttransaction=fragmentManager.beginTransaction()
        fragmenttransaction.commit()
    }

    private  fun replace(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val  fragmenttransaction=fragmentManager.beginTransaction()
        fragmenttransaction.replace(R.id.navhost,fragment)
        fragmenttransaction.commit()
    }
}



