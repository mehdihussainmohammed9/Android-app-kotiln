package com.example.mykotlinone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gotoScreentwo_btn.setOnClickListener {
            var msg = msg_editText.text.toString()
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}