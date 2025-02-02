package com.example.calculofactorial

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun calcularFactorial(numero:Int):Long{
        var resultado:Long=0

        for(i in 1.. numero){
            resultado *= i
        }
        
        return resultado
    }
}