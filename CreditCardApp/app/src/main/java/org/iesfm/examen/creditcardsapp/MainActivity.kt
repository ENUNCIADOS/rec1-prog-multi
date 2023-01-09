package org.iesfm.examen.creditcardsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val creditcards = listOf(
            CreditCard(132433243, "Master Card", "Peppa Pig", 343),
            CreditCard(432343343, "Visa", "Bob Esponja", 342),
            CreditCard(545434443, "American Express", "Pocoyo", 233),
            CreditCard(445445454, "Visa", "Pato", 2343),
            CreditCard(445455445, "Master Card", "Elly", 446),
            CreditCard(645455454, "Visa", "Pajaroto", 778),
            CreditCard(733444554, "Visa", "George Pig", 454)
        )
    }
}