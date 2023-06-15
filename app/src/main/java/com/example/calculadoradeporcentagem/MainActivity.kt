package com.example.calculadoradeporcentagem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculate = findViewById<Button>(R.id.button_calculate)
        val editTextValue = findViewById<EditText>(R.id.edit_text_value)
        val editTextPercentage = findViewById<EditText>(R.id.edit_text_percentage)
        val textViewResult = findViewById<TextView>(R.id.text_view_result)

        buttonCalculate.setOnClickListener {
            val value = editTextValue.text.toString().toDoubleOrNull()
            val percentage = editTextPercentage.text.toString().toDoubleOrNull()

            if (value != null && percentage != null) {
                val result = value * (percentage / 100)
                val formattedResult = DecimalFormat("#.##").format(result)
                textViewResult.text = "Resultado: $formattedResult"
            } else {
                textViewResult.text = "Valores inválidos"
            }
        }
    }
}
