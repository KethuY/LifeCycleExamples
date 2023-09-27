package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentB :  Fragment() {
    val  TAG="Kethu FragBBBBBBBBBBBBBBBBBBB"
    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d(TAG, "onAttach: called ")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: called ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored: called ")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: called ")

        val heroImageView = view.findViewById<TextView>(R.id.textView)
        heroImageView.apply {
            visibility=View.GONE
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: called ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: called ")
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: called ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: called ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: called ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: called ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: called ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: called ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: called ")
    }
}