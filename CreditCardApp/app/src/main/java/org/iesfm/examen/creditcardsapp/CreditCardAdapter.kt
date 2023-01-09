package org.iesfm.examen.creditcardsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CreditCardAdapter(val context: Context) : Adapter<CreditCardAdapter.CreditCardViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    class CreditCardViewHolder(val v: View) : ViewHolder(v) {
        fun load(creditCard: CreditCard) {
            TODO("Not yet implemented")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreditCardViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CreditCardViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}