package com.example.testekotlin.view.edit

import android.arch.lifecycle.MutableLiveData
import com.example.testekotlin.model.Notes
import com.example.testekotlin.util.BoxUtils
import io.objectbox.Box

class EditNoteViewModel {

    private val notesBox: Box<Notes> by lazy { BoxUtils.getBox<Notes>() }

    val errorId: MutableLiveData<String> = MutableLiveData()

    var notesId: Long = 0

    fun getNotes(): List<Notes> {
        return notesBox.all
    }

    fun saveNotes(noteOne: String, noteTwo: String, noteThree: String, isEditing: Boolean, success: (Notes) -> Unit) {
        when {
            noteOne.isEmpty() -> {
                errorId.value = "dados não preenchidos"
            }
            noteTwo.isEmpty() -> {
                errorId.value = "dados não preenchidos"
            }
            noteThree.isEmpty() -> {
                errorId.value = "dados não preenchidos"
            }
            else -> {
                val notes: Notes = Notes().apply {
                    this.noteOne
                    this.noteTwo
                    this.noteThree
                }

                notesBox.put(notes)
                success(notes)
            }
        }
    }
}