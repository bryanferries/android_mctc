package com.example.tsatoteamlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var clickableButton: Button
    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        clickableButton = findViewById(R.id.click_button)
        textView1 = findViewById(R.id.text_view_1)
        textView2 = findViewById(R.id.text_view_2)
        textView3 = findViewById(R.id.textView)
        editText1 = findViewById(R.id.edit_text)
        editText2 = findViewById(R.id.edit_text2)
        clickableButton.setOnClickListener { view: View ->
            val text = editText1.text
            val text2 = editText2.text
            if (text.isNotBlank() && text2.isNotBlank()) {
                chooseRandom()
            } else {
                Toast.makeText(this, getString(R.string.toast_error_string), Toast.LENGTH_SHORT).show()
            }
        }
    }
// Testing Android Studio
    private fun chooseRandom() {

        val randomChoice = listOf("heads", "tails").random()



        if (randomChoice == "heads") {
            textView3.text = editText1.text
        } else {
            textView3.text = editText2.text
        }

    }
}