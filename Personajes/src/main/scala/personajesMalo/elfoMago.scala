package personajesMalo

class ElfoMago(alt : Int, eda : Int) extends Personaje{
    override var _altura : Int = alt
    override var _tamano : Int = 2
    override var _edad : Int = eda
    var mod : (Int, String) = (2, "Inteligencia")
    var libro : String = _
    var VisionNocturna : Int = 60

    override def atacar(ata : Int) : Int ={
        return mod._1 + ata + 1
    }

    override def correr() : Int ={
        return 60
    }
    
    override def descansar() : Unit ={
        var i = 0
    }
}