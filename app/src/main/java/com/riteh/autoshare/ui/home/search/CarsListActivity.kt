package com.riteh.autoshare.ui.home.search

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.riteh.autoshare.R
import com.riteh.autoshare.adapters.CarListAdapter
import com.riteh.autoshare.data.dataholders.CarListItem
import kotlinx.android.synthetic.main.activity_cars_list.*

class CarsListActivity : AppCompatActivity() {
    private var carsList = mutableListOf<CarListItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars_list)

        setUpRecyclerView()
        setOnClickListeners()
    }

    override fun onResume() {
        super.onResume()
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        rv_cars.layoutManager = LinearLayoutManager(this)
        rv_cars.adapter = CarListAdapter(carsList, this)
    }

    private fun setOnClickListeners() {
        bt_filter.setOnClickListener {
            val intent = Intent()
            startActivity(intent)
        }
    }
}