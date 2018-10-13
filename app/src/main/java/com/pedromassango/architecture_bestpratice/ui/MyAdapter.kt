package com.pedromassango.architecture_bestpratice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pedromassango.architecture_bestpratice.data.models.Phrase
import com.pedromassango.architecture_bestpratice.R
import kotlinx.android.synthetic.main.row_phrase.view.*

class MyHolder(private val v: View): RecyclerView.ViewHolder(v){

    fun bind(item: Phrase){
        with(v){
            tv_phrase.text = item.text
        }
    }
}

class MyAdpter(private val data: ArrayList<Phrase> = arrayListOf()):
        RecyclerView.Adapter<MyHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyHolder {
        val itemView = LayoutInflater.from(p0.context)
                .inflate(R.layout.row_phrase, p0, false)

        return MyHolder(itemView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind( data[position])
    }

    fun add(phrase: Phrase){
        data.add( phrase)
        notifyDataSetChanged()
    }

    fun addAll(phrases: List<Phrase>){
        data.addAll( phrases)
        notifyDataSetChanged()
    }


}