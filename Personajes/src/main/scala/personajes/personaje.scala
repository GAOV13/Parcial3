package personajes

import clase._

abstract class Personaje{
    var _altura : Int
    var _tamano : Int
    var _edad : Int
    var _clase : Clase

    def atacar(ata : Int) : Int
    def correr() : Int
    def descansar() : Unit
    def especial() : Int
}