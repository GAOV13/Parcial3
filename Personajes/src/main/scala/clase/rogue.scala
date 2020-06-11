package clase
 
class Rogue extends Clase{
    override var _mod : (Int, String) = (3, "Destreza")
    var sneak : Int = 2
    override var _proficiency : Int = 2

    override def ataque(ata : Int) : Int ={
        var ver : Boolean = false
        if(ata >= 10){
            ver = true
        }
        ver = isSneakAttack(ver)
        var daño : Int = _mod._1 + ata + 1 
        if(ver){
            daño = daño*2
        }
        return daño
    }
    
    def isSneakAttack(espalda : Boolean) : Boolean ={
        var ver = false
        if(espalda){
            ver = true
        }
        return ver
    }
    override def habilidadEspecial() : Int={
        var num1 : Int = bonusAction(20)
        return num1
    }

    def bonusAction(num : Int) : Int ={
        return num*2
    }
}