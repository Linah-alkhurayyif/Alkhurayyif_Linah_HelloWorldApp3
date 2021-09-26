package com.example.alkhurayyif_linah_helloworldapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    lateinit var button:Button
    lateinit var editText_sentence:EditText
    lateinit var editText:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         textView = findViewById(R.id.textView)
         button = findViewById(R.id.button)
        editText_sentence = findViewById(R.id.editText_sentence)
        button.setOnClickListener{
            editText = editText_sentence.getText().toString()

            buttonFuction()
        }
    }
    fun buttonFuction(){
        textView.text =editText;
    }
}