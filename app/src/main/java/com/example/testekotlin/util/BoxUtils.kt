package com.example.testekotlin.util

import android.app.Application
import com.example.testekotlin.model.MyObjectBox
import io.objectbox.Box
import io.objectbox.BoxStore
import java.lang.RuntimeException
import kotlin.reflect.KClass

object BoxUtils {

    private var boxStore: BoxStore? = null

    inline fun <reified T> getBox() = getBox<T>(T::class)

    fun initialize (application: Application) {
        if (boxStore == null) {
            boxStore = MyObjectBox.builder().androidContext(application).build()
        }
    }

    fun <T>getBox(kClass: KClass<*>): Box<T> {
        boxStore?.run {
            return  this.boxFor(kClass.java) as Box<T>
        } ?: throw RuntimeException("Vc deve inicializar a BoxUtils")
    }
}