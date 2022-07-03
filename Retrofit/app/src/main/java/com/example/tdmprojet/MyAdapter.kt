package com.example.tdmprojet
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Context, val textListe: List<textJItem>):RecyclerView.Adapter<MyAdapter.ViewHolder> (){
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var titre: TextView
        var text: TextView
        init {
            titre = itemView.findViewById(R.id.titre)
            text = itemView.findViewById(R.id.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titre.text = textListe[position].Texte_FR.toString()
        holder.text.text = textListe[position].ATexte
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}