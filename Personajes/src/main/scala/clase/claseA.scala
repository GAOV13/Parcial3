package clase

abstract class Clase{
    var _mod : (Int, String)
    var _proficiency : Int

    def ataque(ata : Int) : Int
    def habilidadEspecial() : Int
}