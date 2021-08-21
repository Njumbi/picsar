package com.example.picsar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.picsar.R
import com.example.picsar.ui.fragments.HomeFragment
import com.example.picsar.ui.fragments.ProfileFragment
import com.example.picsar.ui.fragments.SearchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())

        bottomBar.setOnItemSelectedListener {
            when(it){
                0 ->loadFragment(HomeFragment())
                1 ->loadFragment(SearchFragment())
                2 -> loadFragment(ProfileFragment())


            }
        }
    }

    private fun loadFragment(frag: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_main_holder, frag)
            .commit()
    }


}