package com.example.calculofactorial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miNumero = findViewById<EditText>(R.id.numero)

        val miBoton = findViewById<Button>(R.id.button)

        val miResultado = findViewById<TextView>(R.id.resultado)

        miBoton.setOnClickListener{
            val numero = miNumero.text.toString().toIntOrNull()
            if (numero!=null){
                val factorial = calcularFactorial(numero)
                miResultado.text = "$factorial"
            } else {
                miResultado.text="Introduce un numero valido"
            }
        }
    }

    private fun calcularFactorial(numero:Int):Long{
        var resultado:Long

        resultado=1

        for(i in 1.. numero){
            resultado *= i
        }

        return resultado
    }
}