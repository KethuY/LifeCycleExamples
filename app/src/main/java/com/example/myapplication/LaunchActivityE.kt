package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class LaunchActivityE : AppCompatActivity(), Communicator {
    private lateinit var nhf: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ")
        setContentView(R.layout.activity_launch_c)
        nhf =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment

    }

    override fun onStart() {
        super.onStart()
        Log.d(Companion.TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(Companion.TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(Companion.TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(Companion.TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Companion.TAG, "onDestroy: ")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(Companion.TAG, "onNewIntent: ")
    }

    override fun navigateToFragentB() {
        nhf.findNavController().navigate(R.id.fragmentA_fragmentB)
    }

    companion object {
        const val  TAG="Kethu LAE"
    }
}