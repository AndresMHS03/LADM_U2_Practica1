package com.example.ladm_u2_practica1_andresh

class Hilo(p:MainActivity):Thread() {
    var puntero=p

    override fun run(){
        super.run()
        sleep(9000)
        while (true){
            puntero.runOnUiThread {
                puntero.dibujo!!.queNieve()
            }
        }
    }
}