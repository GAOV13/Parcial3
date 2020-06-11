package personajes

import clase._

class Humano(alt : Int, eda : Int, clase : Clase) extends Personaje{
    override var _altura : Int = alt
    override var _tamano : Int = 2
    override var _edad : Int = eda
    override var _clase : Clase = clase

    override def atacar(ata : Int) : Int ={
        return clase.ataque(ata)
    }

    override def correr() : Int ={
        return 60
    }
    
    override def descansar() : Unit ={
        var i = 0
    }

    override def especial() : Int ={
        return clase.habilidadEspecial()
    }
}