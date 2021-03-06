package com.vandenbreemen.kevindesignsystemsamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showStatusLogDemo(view: View) {
        val intent = Intent(this, SystemStatusLogDemo::class.java)
        startActivity(intent)
    }

    fun showButtonsDemo(view: View) {
        val intent = Intent(this, KDSButtonActivity::class.java)
        startActivity(intent)

    }
}
