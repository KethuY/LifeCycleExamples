package com.example.myapplication.replacefragmentwithbackstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.myapplication.Communicator
import com.example.myapplication.FragmentA
import com.example.myapplication.FragmentB
import com.example.myapplication.LaunchActivityE
import com.example.myapplication.R

class LaunchActivityD : AppCompatActivity(),Communicator {
    val TAG="Kethu LAD"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace<FragmentA>(R.id.container)
            // addToBackStack("BB")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "onNewIntent: ")
    }

    override fun navigateToFragentB() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace<FragmentB>(R.id.container)
             addToBackStack("BB")

        }
    }
}