package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.addfragmentwithbackstack.LaunchActivityB
import com.example.myapplication.addfragmentwithoutbackstack.LaunchActivityA
import com.example.myapplication.databinding.ActivityLaunchBBinding
import com.example.myapplication.replacefragmentwithbackstack.LaunchActivityD
import com.example.myapplication.replacefragmentwithoutbackstack.LaunchActivityC

class MainActivity : AppCompatActivity() {
    lateinit var bindingActivityB: ActivityLaunchBBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivityB= ActivityLaunchBBinding.inflate(layoutInflater)
        setContentView(bindingActivityB.root)

        bindingActivityB.addFragWithoutBack.setOnClickListener {
                val intent = Intent(this@MainActivity, LaunchActivityA::class.java)
                startActivity(intent)
        }
        bindingActivityB.addFragWithBack.setOnClickListener {
            val intent = Intent(this@MainActivity, LaunchActivityB::class.java)
            startActivity(intent)
        }

        bindingActivityB.replaceFragWithOutBack.setOnClickListener {
            val intent = Intent(this@MainActivity, LaunchActivityC::class.java)
            startActivity(intent)
        }

        bindingActivityB.replaceFragWithBack.setOnClickListener {
            val intent = Intent(this@MainActivity, LaunchActivityD::class.java)
            startActivity(intent)
        }

        bindingActivityB.startActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, LaunchActivityE::class.java)
            startActivity(intent)
        }

    }
}