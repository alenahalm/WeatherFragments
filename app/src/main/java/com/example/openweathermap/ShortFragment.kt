package com.example.openweathermap

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShortFragment(var data: ArrayList<Weather>, val cntxt: Context) : Fragment() {

    lateinit var list: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_short, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = ShortAdapter(data)
        list = view.findViewById(R.id.shortList)
        list.layoutManager = LinearLayoutManager(cntxt)
        list.adapter = adapter
    }

    fun update(_data: ArrayList<Weather>) {
        (list.adapter as ShortAdapter).update(_data)
    }

}