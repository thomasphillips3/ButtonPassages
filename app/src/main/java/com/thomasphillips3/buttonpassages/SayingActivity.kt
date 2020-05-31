package com.thomasphillips3.buttonpassages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_saying.*

private lateinit var sayingTextView: TextView
private val sayings = arrayOf(
    "Don't expect from others - put in your own work",
    "The future belongs to those who prepare for it today",
    "We are the ones we've been waiting for - we are the change we seek"
)

class SayingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saying)

        val sayingId = intent.getIntExtra(SAYING_EXTRA, 0)
        if (sayingId == 0) { }
        else {
            if (sayingId == R.id.button) {
                Log.i(this.toString(), sayings[0])
                textView.text = sayings[0]
            }

            if (sayingId == R.id.button2) {
                Log.i(this.toString(), sayings[1])
                textView.text = sayings[1]
            }
            if (sayingId == R.id.button3) {
                Log.i(this.toString(), sayings[2])
                textView.text = sayings[2]
            }
        }
        Log.i("button ID", "$sayingId")
    }
}
