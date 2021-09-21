package com.sgz.antoni.mylib

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
//import com.sgz.antoni.lib.ComposeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_lib)
        button.setOnClickListener {
            //val intent = Intent(this, ComposeActivity::class.java)
            //startActivity(intent)
        }
    }
}