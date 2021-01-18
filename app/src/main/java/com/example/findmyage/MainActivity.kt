package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text=""
        button.text="Find your age"

        button.setOnClickListener {
            var DOB:Int = editText.text.toString().toInt()
            var currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
            var age:Int = currentYear - DOB
            textView.text = "You are " + age.toString() + " years old!"
        }
    }
}
