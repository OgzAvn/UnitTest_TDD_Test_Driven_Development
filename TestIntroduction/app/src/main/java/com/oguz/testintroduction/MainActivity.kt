package com.oguz.testintroduction

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tax = Tax()

        val netIncome = tax.calculateIncome(100.0,0.1)
        val netTax = tax.calculateTax(100.0,0.1)

        println(netTax)
        println(netIncome)
    }
}