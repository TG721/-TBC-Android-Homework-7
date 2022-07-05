package com.example.tbc_homework_7

import android.os.Bundle
import android.text.InputType
import android.util.Log.d
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.marginTop
import com.example.tbc_homework_7.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

var linearLayout = binding.mainLinearLayout
var checkBox = binding.checkBox
var inputFieldLayout = binding.textInputlayout
var inputField = binding.textInputEditText

        checkBox.setOnClickListener {
            if(checkBox.isChecked) inputField.inputType=InputType.TYPE_CLASS_NUMBER
            else inputField.inputType=InputType.TYPE_CLASS_TEXT

        }

        binding.addButton.setOnClickListener {
            if(inputField.text.toString().trim().isEmpty()) inputFieldLayout.helperText="Required*"
            else {
                var textView = TextView(this)
                textView.text = inputField.text
                var res: Int = R.drawable.border
                textView.setBackgroundResource(res)
                linearLayout.addView(textView)
                inputFieldLayout.helperText=""
            }
        }

        }
    }
