package com.riteh.autoshare.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.riteh.autoshare.R
import com.riteh.autoshare.ui.user.UserCard
import kotlinx.android.synthetic.main.credit_card_layout.view.*

class CardListAdapter(private var cards: MutableList<UserCard>): RecyclerView.Adapter<CardListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.credit_card_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return cards.size
    }

    override fun onBindViewHolder(holder: CardListAdapter.ViewHolder, position: Int) {
        val formattedNumber = cards[position].cardNumber
        holder.cardTitle.text = formattedNumber

        holder.cardDescription.text = cards[position].expirationYear
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView = itemView.tv_card_name
        val cardDescription: TextView = itemView.tv_card_number

        init {}
    }

}