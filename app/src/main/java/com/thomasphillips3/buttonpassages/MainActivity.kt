package com.thomasphillips3.buttonpassages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val SAYING_EXTRA = "com.thomasphillips3.buttonpassages.extra.SAYING"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchActivity(view: View) {
        val intent = Intent(this, SayingActivity::class.java)
        intent.putExtra(SAYING_EXTRA, view.id)
        startActivity(intent)
    }
}
