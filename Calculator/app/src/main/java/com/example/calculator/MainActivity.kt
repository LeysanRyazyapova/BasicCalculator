package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var editText : EditText = findViewById(R.id.editText)
        var text = findViewById<EditText>(R.id.editText).text.toString()
        var first: Double
        first = if(text.isBlank())
            0.0
        else
            text.toDouble()
        var flag = ""
        var sign = 1
        var result = 0.0
        findViewById<Button>(R.id.button0).setOnClickListener {
            if(text.equals("-")) {
                text = "0"
                sign = -1
            }
            else if(!text.equals("0"))
                text = "${text}0"
            else
                text = "0"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button1).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "1"
            }
            else if(!text.equals("0"))
                text = "${text}1"
            else
                text = "1"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "2"
            }
            else if(!text.equals("0"))
                text = "${text}2"
            else
                text = "2"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "3"
            }
            else if(!text.equals("0"))
                text = "${text}3"
            else
                text = "3"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "4"
            }
            else if(!text.equals("0"))
                text = "${text}4"
            else
                text = "4"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "5"
            }
            else if(!text.equals("0"))
                text = "${text}5"
            else
                text = "5"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "6"
            }
            else if(!text.equals("0"))
                text = "${text}6"
            else
                text = "6"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button7).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "7"
            }
            else if(!text.equals("0"))
                text = "${text}7"
            else
                text = "7"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button8).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "8"
            }
            else if(!text.equals("0"))
                text = "${text}8"
            else
                text = "8"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.button9).setOnClickListener {
            if(text.equals("-")) {
                sign = -1
                text = "9"
            }
            else if(!text.equals("0"))
                text = "${text}9"
            else
                text = "9"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.dotButton).setOnClickListener {
            if (text.equals("-")) {
                text = "0."
                sign = -1
            }
            else if(!text.contains("."))
                text = "${text}."
            else
                text = "$text"
            editText.setText("$text")
        }
        findViewById<Button>(R.id.clearButton).setOnClickListener {
            text = ""
            editText.setText("$text")
            editText.hint = "0"
        }
        findViewById<Button>(R.id.addButton).setOnClickListener {
            first = text.toDouble()
            val text1 = text
            text = ""
            flag = "plus"
            editText.setText("$text")
            editText.hint = "$text1"
        }
        findViewById<Button>(R.id.subtractButton).setOnClickListener {
            var text1: String = ""
            if(text == "0" || text == "-") {
                text = "-"
            }
            else {
                first = text.toDouble()
                text1 = text
                text = ""

            }
            flag = "minus"
            editText.setText("$text")
            editText.hint = "$text1"
            text = "-"
        }
        findViewById<Button>(R.id.multiplyButton).setOnClickListener {
            var text1 = text
            first = text.toDouble()
            text = ""
            flag = "mult"
            editText.setText("$text")
            editText.hint = "$text1"
        }
        findViewById<Button>(R.id.divideButton).setOnClickListener {
            first = text.toDouble()
            val text1 = text
            text = ""
            flag = "div"
            editText.setText("$text")
            editText.hint = text1
        }
        findViewById<Button>(R.id.equalButton).setOnClickListener {
            var second = text.toDouble()
            if(flag == "plus")
                result = first + second
            if (flag == "minus")
                result = first + sign * second
            if (flag == "mult")
                result = first * second
            if(flag == "div")
                result = first / second
            if(result - result.toInt() == 0.0)
                text = result.toInt().toString()
            else
                text = result.toString()
            editText.setText("$text")
        }
    }
}