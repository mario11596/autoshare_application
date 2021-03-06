package com.riteh.autoshare.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.riteh.autoshare.R
import com.riteh.autoshare.ui.home.user.CardNumbersFormat
import com.riteh.autoshare.ui.home.user.UserCard
import kotlinx.android.synthetic.main.credit_card_layout.view.*

class CardListAdapter(private var cards: MutableList<UserCard>) :
    RecyclerView.Adapter<CardListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardListAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.credit_card_layout, parent, false)

        return ViewHolder(view)
    }

    /**
     * Length of list
     */
    override fun getItemCount(): Int {

        return cards.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val formatter = CardNumbersFormat()

        val cardNumber = formatter.formatCardNumber(cards[position].cardNumber)
        holder.cardTitle.text = cardNumber

        val cardMonthYear: String = cards[position].cardDue
        holder.cardDescription.text = cardMonthYear

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView = itemView.tv_card_name
        val cardDescription: TextView = itemView.tv_card_number

        init {}
    }

}