package com.jezerm.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.jezerm.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
        this.init()
    }

    private fun init() {
        this.binding.btnSuma.setOnClickListener {
            val num1 = this.binding.etNum1.text.toString().toDouble()
            val num2 = this.binding.etNum2.text.toString().toDouble()
            val operation = Operation(num1, num2)
            val result = operation.sumar()

            this.binding.etResult.setText(result.toString())
        }
        this.binding.btnResta.setOnClickListener {
            val num1 = this.binding.etNum1.text.toString().toDouble()
            val num2 = this.binding.etNum2.text.toString().toDouble()
            val operation = Operation(num1, num2)
            val result = operation.restar()

            this.binding.etResult.setText(result.toString())
        }
        this.binding.btnMulti.setOnClickListener {
            val num1 = this.binding.etNum1.text.toString().toDouble()
            val num2 = this.binding.etNum2.text.toString().toDouble()
            val operation = Operation(num1, num2)
            val result = operation.multiplicar()

            this.binding.etResult.setText(result.toString())
        }
        this.binding.btnDiv.setOnClickListener {
            val num1 = this.binding.etNum1.text.toString().toDouble()
            val num2 = this.binding.etNum2.text.toString().toDouble()
            val operation = Operation(num1, num2)
            val result = operation.dividir()

            this.binding.etResult.setText(result.toString())
        }
    }
}