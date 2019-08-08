package com.example.testekotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testekotlin.R
import com.example.testekotlin.model.Notes
import kotlinx.android.synthetic.main.row_notes.view.*

class NotesAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var context: Context
    lateinit var notes: List<Notes>
    lateinit var inflater: LayoutInflater

    constructor(context: Context, notes: List<Notes>, inflater: LayoutInflater = LayoutInflater.from(context)) : this() {
        this.context = context
        this.notes = notes
        this.inflater = inflater
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return  ViewHolder(inflater.inflate(R.layout.row_notes, parent, false))
    }

    override fun getItemCount(): Int = notes.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val notes = notes[position]

        holder.itemView.tvNotePri.text = notes.noteOne
        holder.itemView.tvNoteSecu.text = notes.noteTwo
        holder.itemView.tvNoteThree.text = notes.noteThree
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
}