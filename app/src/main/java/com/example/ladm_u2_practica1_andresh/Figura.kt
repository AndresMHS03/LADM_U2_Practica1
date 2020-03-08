package com.example.ladm_u2_practica1_andresh

import android.graphics.Canvas
import android.graphics.Paint

class Figura () {

    var x = 0f
    var y = 0f
    var tipo = 1 // 1 = Circulo - 2 = Rectangulo
    var radio = 0f
    var ancho = 0f
    var alto = 0f
    var p1x = 0f
    var p1y = 0f
    var p2x = 0f
    var p2y = 0f
    var p3x = 0f
    var p3y = 0f
    var caida = 2
    var mov = 1




    constructor(x:Float,y:Float,radio:Float):this(){
        this.x = x
        this.y=y
        this.radio=radio
    }

    constructor(x:Float,y:Float,ancho:Float,alto:Float):this(){
        this.x=x
        this.y=y
        this.ancho=ancho
        this.alto=alto
        tipo=2
    }


    fun pintar(c: Canvas, p: Paint){

        when(tipo){
            1->{
                c.drawCircle(x,y,radio,p)
            }
            2->{
                c.drawRect(x,y,x+ancho,y+alto,p)
            }
        }
    }

    fun nevar(pantalla:Int){
        y=y+mov
        if(y>pantalla){
            y=0f
        }
    }


}