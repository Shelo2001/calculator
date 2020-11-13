package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var resultTextView: TextView
    private var operand: Double=0.0

    private var opperation: String=""
    override fun onCreate(savedInstanceState: Bundle?) {


        resultTextView=findViewById(R.id.resultTextView)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun numberClick(view: View) {

        if (view is TextView) {

            var result: String = resultTextView.text.toString()
            val number: String = view.text.toString()
            if (result=="0") {
                result=""
            }

            resultTextView.text = result + number

        }
    }

    fun operationClick(view: View) {
        if (view is TextView) {


            if (!TextUtils.isEmpty(resultTextView.text)) {

                operand = resultTextView.text.toString().toDouble()
            }


            opperation = view.text.toString()

            resultTextView.text = ""


        }

    }

    fun equalsClick(view: View) {

        var secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0

        if (!TextUtils.isEmpty(secOperandText)) {
            secOperand = secOperandText.toDouble()
        }

        when (opperation) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()

        }
    }

    fun clearClick(view: View) {
        var Result: String = resultTextView.text.toString()
        if (!TextUtils.isEmpty(Result)) {

            Result = ""

        }
    }
    fun deleteClick(view: View) {

        val text = resultTextView.text.toString()
        if (text.isNotEmpty()) {
            resultTextView.text = text.dropLast(1)
        }
    }

    fun dotClick(view: View) {
        if (view is TextView) {


            var dot: String = resultTextView.text.toString()
            val number1: String = view.text.toString()

            if (resultTextView.text == "")  {

                dot = ""


            }


            if (!TextUtils.isEmpty(resultTextView.text)) {

                dot = "."

            }

        }


    }

}




