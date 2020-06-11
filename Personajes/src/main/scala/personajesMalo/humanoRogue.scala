package personajesMalo

class HumanoRogue(alt : Int, eda : Int) extends Personaje{
    override var _altura : Int = alt
    override var _tamano : Int = 2
    override var _edad : Int = eda
    var mod : (Int, String) = (3, "Destreza")
    var sneak : Int = 2

    override def atacar(ata : Int) : Int ={
        var ver : Boolean = false
        if(ata >= 10){
            ver = true
        }
        ver = isSneakAttack(ver)
        var daño : Int = mod._1 + ata + 1 
        if(ver){
            daño = daño*2
        }
        return daño
    }

    override def correr() : Int ={
        return 120
    }
    
    override def descansar() : Unit ={
        var i = 0
    }

    def isSneakAttack(espalda : Boolean) : Boolean ={
        var ver = false
        if(espalda){
            ver = true
        }
        return ver
    }

    def bonusAction(num : Int) : Int ={
        return num*2
    }
}
