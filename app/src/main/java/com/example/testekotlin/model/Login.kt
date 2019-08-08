package com.example.testekotlin.model

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
class Login {

    @Id
    var id: Long = 0

    var name: String? = null
    var password: String? = null

    constructor(id: Long, name: String?, password: String?) {
        this.id = id
        this.name = name
        this.password = password
    }
}