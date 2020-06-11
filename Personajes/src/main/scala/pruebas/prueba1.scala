package pruebas

import personajesMalo._

object Main1 extends App{
    var enano1 : EnanoBarbaro = new EnanoBarbaro(150, 60)

    println("El ataque del enano barbaro es " + enano1.atacar(10))
    println("El correr del enano barbaro es " + enano1.correr())
    var elfo1 : ElfoRogue = new ElfoRogue(180, 150)
    println("El ataque del elfo rogue es " + elfo1.atacar(5))
    println("El ataue del elfo rogue es " + elfo1.atacar(14))
    println("El correr del elfo rogue es " + elfo1.correr())
    println("El bonus action del elfo rogue es " + elfo1.bonusAction(15))
}