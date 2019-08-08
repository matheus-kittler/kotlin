package com.example.testekotlin.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
class Notes() {

    @Id
    var id: Long = 0
    var noteOne: String? = null
    var noteTwo: String? = null
    var noteThree: String? = null

    constructor(
        noteOne: String?,
        noteTwo: String?,
        noteThree: String?
    ) : this() {
        this.noteOne = noteOne
        this.noteTwo = noteTwo
        this.noteThree = noteThree
    }

}