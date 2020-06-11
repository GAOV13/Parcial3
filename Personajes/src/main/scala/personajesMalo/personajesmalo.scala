package personajesMalo

abstract class Personaje{
    var _altura : Int
    var _tamano : Int
    var _edad : Int

    def atacar(ata : Int) : Int
    def correr() : Int
    def descansar() : Unit
}