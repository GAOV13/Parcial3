package clase 
 
class Barbaro extends Clase{
    override var _mod : (Int, String) = (2, "Fuerza")
    override var _proficiency : Int = 2
    var _rague : Int = 2


    override def ataque(ata : Int) : Int ={
        return _mod._1 + ata + 1
    }

    override def habilidadEspecial() : Int ={
        ragueIn()
        return _rague
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