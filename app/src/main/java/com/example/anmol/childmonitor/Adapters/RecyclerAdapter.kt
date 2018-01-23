package com.example.anmol.childmonitor.Adapters


// Recycler Adapter of second activity

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.anmol.childmonitor.R

internal class RecyclerAdapter(ctx: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    internal inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return 0
    }
}
