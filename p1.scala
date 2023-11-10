//PROBLEMA 1
//---------------------
//El siguiente programa ...
object PalabraConMasVocales {
  def contarVocales(palabra: String): Int = {
    palabra.toLowerCase.count(c => "aeiou".contains(c))
  }

  def palabraConMasVocales(palabras: List[String]): String = {
    if (palabras.isEmpty) {
      "No se proporcionaron palabras."
    } else {
      palabras.maxBy(contarVocales)
    }
  }

  def main(args: Array[String]): Unit = {
    println("Ingresa palabras, una por línea. Presiona Ctrl+D (Unix/Linux) o Ctrl+Z (Windows) para finalizar la entrada.")
    
    // Lee las palabras de la entrada estándar
    val inputWords = scala.io.Source.stdin.getLines().toList
    
    val palabraResultante = palabraConMasVocales(inputWords)
    println(s"La palabra con más vocales es: $palabraResultante")
  }
}
