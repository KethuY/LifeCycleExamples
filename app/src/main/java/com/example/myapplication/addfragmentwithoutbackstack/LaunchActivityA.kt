package com.example.myapplication.addfragmentwithoutbackstack

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.myapplication.Communicator
import com.example.myapplication.FragmentA
import com.example.myapplication.FragmentB
import com.example.myapplication.R

@SuppressLint("CustomSplashScreen")
class LaunchActivityA : AppCompatActivity(), Communicator {
    val TAG="Kethu Activity_A"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_main)
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentA>(R.id.container)
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
            add<FragmentB>(R.id.container)
        }
    }
}