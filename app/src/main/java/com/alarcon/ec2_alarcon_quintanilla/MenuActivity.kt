package com.alarcon.ec2_alarcon_quintanilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.alarcon.ec2_alarcon_quintanilla.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Maps())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.camera -> replaceFragment(Camera())
                R.id.maps -> replaceFragment(Maps())
                R.id.info -> replaceFragment(Info())

                else -> {
                }
            }
            true

        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

}