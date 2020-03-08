package com.example.ladm_u2_practica1_andresh

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    var puntero=p

    val triangulo = Path()
    var sol = Figura(1000f,20f,150f)
    var nube1 = Figura(150f,350f,150f)
    var nube2 = Figura(290f,370f,150f)
    var nube3 = Figura(190f,400f,150f)
    var nube4 = Figura(330f,440f,150f)
    var arbol1 = Figura(180f,1550f,80f)
    var arbol2 = Figura(180f,1670f,80f)
    var tronco = Figura(150f,1700f,60f,300f)
    var ventana = Figura(510f,1720f,60f)
    var suelo = Figura(0f,1870f,2000f,1500f)
    var casa = Figura(400f,1650f,700f,250f)
    var puerta = Figura(700f,1730f,130f,170f)
    var copo1 = Figura(100f,-50f,30f)
    var copo2 = Figura(150f,-100f,30f)
    var copo3 = Figura(800f,-240f,30f)
    var copo4 = Figura(630f,-310f,30f)
    var copo5 = Figura(1000f,-390f,30f)
    var copo6 = Figura(240f,-460f,30f)
    var copo7 = Figura(40f,-570f,30f)
    var copo8 = Figura(910f,-660f,30f)
    var copo9 = Figura(510f,-710f,30f)
    var copo10 = Figura(170f,-820f,30f)
    var copo11 = Figura(590f,-900f,30f)
    var copo12 = Figura(900f,-990f,30f)
    var copo13 = Figura(330f,-1120f,30f)
    var copo14 = Figura(725f,-2250f,30f)



    override fun onDraw(canvas: Canvas){

        super.onDraw(canvas)
        var paint = Paint()

        canvas.drawColor(Color.rgb(53,137,237))

        paint.color = Color.rgb(122,78,40)
        suelo.pintar(canvas,paint)

        paint.color = Color.YELLOW
        sol.pintar(canvas,paint)

        paint.color = Color.CYAN
        nube1.pintar (canvas,paint)
        nube2.pintar (canvas,paint)
        nube3.pintar (canvas,paint)
        nube4.pintar (canvas,paint)

        paint.color = Color.rgb(78,46,18)
        tronco.pintar (canvas,paint)

        paint.color = Color.GREEN
        arbol1.pintar (canvas,paint)
        arbol2.pintar (canvas,paint)

        paint.color = Color.rgb(232,225,94)
        casa.pintar (canvas,paint)

        triangulo.moveTo(750f,1450f)
        triangulo.lineTo(400f,1650f)
        triangulo.lineTo(1100f,1650f)
        Paint().color = Color.DKGRAY
        canvas.drawPath(triangulo,paint)

        paint.color = Color.rgb(165,215,220)
        ventana.pintar (canvas,paint)

        paint.color = Color.rgb(108,48,22)
        puerta.pintar (canvas,paint)

        paint.color = Color.rgb(182,212,232)
        copo1.pintar(canvas,paint)
        copo2.pintar(canvas,paint)
        copo3.pintar(canvas,paint)
        copo4.pintar(canvas,paint)
        copo5.pintar(canvas,paint)
        copo6.pintar(canvas,paint)
        copo7.pintar(canvas,paint)
        copo8.pintar(canvas,paint)
        copo9.pintar(canvas,paint)
        copo10.pintar(canvas,paint)
        copo11.pintar(canvas,paint)
        copo12.pintar(canvas,paint)
        copo13.pintar(canvas,paint)
        copo14.pintar(canvas,paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
            }
            MotionEvent.ACTION_UP -> {
            }
        }
        invalidate()
        return true
    }

    fun queNieve(){
        copo1.nevar(height)
        copo2.nevar(height)
        copo3.nevar(height)
        copo4.nevar(height)
        copo5.nevar(height)
        copo6.nevar(height)
        copo7.nevar(height)
        copo8.nevar(height)
        copo9.nevar(height)
        copo10.nevar(height)
        copo11.nevar(height)
        copo12.nevar(height)
        copo13.nevar(height)
        copo14.nevar(height)
        invalidate()
    }

}