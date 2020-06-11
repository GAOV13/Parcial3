package clase
 
class Mago extends Clase{
    override var _mod : (Int, String) = (2, "Inteligencia")
    override var _proficiency : Int = 2
    var libro : String = _

    override def ataque(ata : Int) : Int ={
        return _mod._1 + ata + 1
    }
    
    override def habilidadEspecial() : Int ={
        return _proficiency
    }
}