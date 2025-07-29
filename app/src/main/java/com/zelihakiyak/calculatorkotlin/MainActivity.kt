package com.zelihakiyak.calculatorkotlin

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.zelihakiyak.calculatorkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var num1 : Double? = null
    private var num2 : Double? = null
    private var result : Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun mySum(view: View){

        num1 = binding.num1Text.text.toString().toDoubleOrNull()
        num2 = binding.num2Text.text.toString().toDoubleOrNull()

        if( num1 != null && num2 != null){
            result = num1!! + num2!!
            binding.resultText.text = "Result : ${result}"
        }else{
            binding.resultText.text = "Enter your numbers properly."
        }
    }

    fun mySub(view: View){
        num1 = binding.num1Text.text.toString().toDoubleOrNull()
        num2 = binding.num2Text.text.toString().toDoubleOrNull()

        if( num1 != null && num2 != null){
            result = num1!! - num2!!
            binding.resultText.text = "Result : ${result}"
        }else{
            binding.resultText.text = "Enter your numbers properly."
        }
    }
    fun myMul(view: View){
        num1 = binding.num1Text.text.toString().toDoubleOrNull()
        num2 = binding.num2Text.text.toString().toDoubleOrNull()

        if( num1 != null && num2 != null){
            result = num1!! * num2!!
            binding.resultText.text = "Result : ${result}"
        }else{
            binding.resultText.text = "Enter your numbers properly."
        }
    }
    fun myDiv(view: View){
        num1 = binding.num1Text.text.toString().toDoubleOrNull()
        num2 = binding.num2Text.text.toString().toDoubleOrNull()

        if( num1 != null && num2 != null){
            if(num2 != 0.toDouble()){
                result = num1!! / num2!!
                binding.resultText.text = "Result : ${result}"
            }else{
                binding.resultText.text = "Can not divide by zero."

            }

        }else{
            binding.resultText.text = "Enter your numbers properly."
        }
    }
}