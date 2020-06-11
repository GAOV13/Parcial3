package pruebas

import personajes._
import clase._

object Main2 extends App{
    var mago : Mago = new Mago
    var enano1 : Enano = new Enano(150, 60, mago)

    var rogue : Rogue = new Rogue
    var elfo1 : Elfo = new Elfo(180, 150, rogue)

    var barbaro : Barbaro = new Barbaro
    var huma1 : Humano = new Humano(200, 20, barbaro)

    println("El ataque del enano mago es " + enano1.atacar(10))
    println("El correr del enano mago es " + enano1.correr())
    println("El especial del enano mago es " + enano1.especial())

    println("El ataque del elfo rogue es " + elfo1.atacar(5))
    println("El ataue del elfo rogue es " + elfo1.atacar(14))
    println("El correr del elfo rogue es " + elfo1.correr())
    println("El bonus action del elfo rogue es " + elfo1.especial())

    println("El ataque del humano barbaro es " + huma1.atacar(5))
    println("El correr del humano barbaro es " + huma1.correr())
    println("El bonus action del humano barbaro es " + huma1.especial())
}