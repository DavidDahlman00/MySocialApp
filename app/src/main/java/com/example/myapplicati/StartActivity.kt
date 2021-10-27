package com.example.myapplicati

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    private val contactFragment = ContactList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val mapFragment = supportFragmentManager
        switchFragment(contactFragment)

        start_navigation_bar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.maps -> switchFragment(contactFragment)

            }
            true
        }
    }
    private fun switchFragment(fragment: Fragment){
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.start_fragment_container, fragment)
            transaction.commit()
        }
    }
}