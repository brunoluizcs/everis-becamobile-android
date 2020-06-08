package com.everis.catalogfilme.ui.adapter


import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import android.view.View
import android.view.ViewGroup
import com.everis.catalogfilme.R
import com.everis.catalogfilme.model.Note
import kotlinx.android.synthetic.main.note_item.view.*


class NoteListAdapter(
    private val notes: List<Note>,
    private val context: Context
) : Adapter<NoteListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.note_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return notes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = notes[position]
        holder.let {
            it.binView(note)
        }

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun binView(note: Note) {
            val title = itemView.note_item_title
            val description = itemView.note_item_description

            title.text = note.title
            description.text = note.description
        }
    }

}