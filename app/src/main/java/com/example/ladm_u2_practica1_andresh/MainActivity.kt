package com.example.ladm_u2_practica1_andresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var dibujo : Lienzo?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dibujo = Lienzo(this)
        setContentView(dibujo!!)
        Hilo(this).start()
    }
}
