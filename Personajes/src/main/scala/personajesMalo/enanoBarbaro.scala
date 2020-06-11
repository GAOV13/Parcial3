package personajesMalo

class EnanoBarbaro(alt : Int, eda : Int) extends Personaje{
    override var _altura : Int = alt
    override var _tamano : Int = 1
    override var _edad : Int = eda
    var _mod : (Int, String) = (2, "Fuerza")
    var _rague : Int = 2


    override def atacar(ata : Int) : Int ={
        return _mod._1 + ata + 1
    }

    override def correr() : Int ={
        return 50
    }
    
    override def descansar() : Unit ={
        _rague = 2
    }

    def ragueIn() : Unit ={
        if(_rague > 0){
            _rague = _rague - 1
        }
    }

    def ragueOut() : Unit = {
        var i : Int = 0
    }
}