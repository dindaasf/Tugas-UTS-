package com.example.utsmobiledong

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listfakultas.view.*

class FakultasAdapter (val ListItemFakultas: List<DataFakultas>, val clickListener: (DataFakultas)-> Unit ) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.listfakultas, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(ListItemFakultas[position], clickListener) //To change body of created functions use File | Settings | File Templates.

    }

    override fun getItemCount() =ListItemFakultas.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(Fakultas: DataFakultas, clickListener: (DataFakultas) -> Unit) {
            itemView.imageView.setImageResource (Fakultas.image)
            itemView.nama_fakultas.text = Fakultas.fakultas
            itemView.setOnClickListener{clickListener(Fakultas)}
        }
    }
}