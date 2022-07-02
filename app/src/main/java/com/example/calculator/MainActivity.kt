package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim =ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        val numbers = ArrayList<String>()
        var text = ""
        var secondText = ""


            // 1
        tasarim.one.setOnClickListener {
            text += tasarim.one.text
            tasarim.resultText.text = text
            secondText +=tasarim.one.text
            tasarim.currentResult.text = secondText
        }

            // 2
        tasarim.two.setOnClickListener {
            text += tasarim.two.text
            tasarim.resultText.text = text
            secondText +=tasarim.two.text
            tasarim.currentResult.text = secondText
        }

            // 3
        tasarim.three.setOnClickListener {
            text += tasarim.three.text
            tasarim.resultText.text = text
            secondText +=tasarim.three.text
            tasarim.currentResult.text = secondText
        }

            // 4
        tasarim.four.setOnClickListener {
            text += tasarim.four.text
            tasarim.resultText.text = text
            secondText +=tasarim.four.text
            tasarim.currentResult.text = secondText
        }

            // 5
        tasarim.five.setOnClickListener {
            text += tasarim.five.text
            tasarim.resultText.text = text
            secondText +=tasarim.five.text
            tasarim.currentResult.text = secondText
        }

            // 6
        tasarim.six.setOnClickListener {
            text += tasarim.six.text
            tasarim.resultText.text = text
            secondText +=tasarim.six.text
            tasarim.currentResult.text = secondText
        }

            // 7
        tasarim.seven.setOnClickListener {
            text += tasarim.seven.text
            tasarim.resultText.text = text
            secondText +=tasarim.seven.text
            tasarim.currentResult.text = secondText
        }

             //8
        tasarim.eight.setOnClickListener {
            text += tasarim.eight.text
            tasarim.resultText.text = text
            secondText +=tasarim.eight.text
            tasarim.currentResult.text = secondText
        }

            // 9
        tasarim.nine.setOnClickListener {
            text += tasarim.nine.text
            tasarim.resultText.text = text
            secondText +=tasarim.nine.text
            tasarim.currentResult.text = secondText
        }

            // 0
        tasarim.zero.setOnClickListener {
            if(text != "0") {
                text += tasarim.zero.text
                tasarim.resultText.text = text
                secondText +=tasarim.zero.text
                tasarim.currentResult.text = secondText
            } else {
                text = ""
                secondText= ""
                tasarim.resultText.text = "0"
                tasarim.currentResult.text= "0"
            }

        }

            // +
        tasarim.plus.setOnClickListener {
            if(text != "") {
                numbers.add(text)
            }
            var total:Long = 0
            for (i in numbers) {
                total += i.toLong()
            }
            tasarim.resultText.text = "$total"
            secondText +="+"
            tasarim.currentResult.text = secondText
            text=""


        }

            // del
        tasarim.del.setOnClickListener {
            secondText = ""
            text = ""
            tasarim.resultText.text = "0"
            for (i in numbers) {
                secondText += "$i+"
            }
            tasarim.currentResult.text = secondText
        }

            // =
        tasarim.showResult.setOnClickListener {
            if(text!="") {
                numbers.add(text)
            }
            var total:Long = 0
            for (i in numbers) {
                total += i.toLong()
            }
            tasarim.resultText.text = "$total"
            //numbers.clear()
            text=""
        }

            // AC
        tasarim.reset.setOnClickListener {
            tasarim.resultText.text = "0"
            tasarim.currentResult.text = "0"
            text = ""
            secondText = ""
            numbers.clear()
        }
    }
}