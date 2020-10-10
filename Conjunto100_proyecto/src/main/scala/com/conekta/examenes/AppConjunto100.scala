package com.conekta.examenes

import scala.io.StdIn.readLine
import scala.language.postfixOps

/**
 * @author ${user.name}
 */
object AppConjunto100 extends  App {

    println("Scala here")

    val newConjunto = new Conjunto100

    var otro: Boolean = false

    do {
      val num = readLine("Ingres el numero a extraer ")
      newConjunto extraerElement (num toInt)

      otro = readLine("¿Desea validar dato extraido? (true o false) ").toBoolean

      if (otro)
        println(newConjunto obtenerNumeroExtraido)

      otro = readLine("¿Desea intentarlo de nuevo? (true o false) ").toBoolean

    } while (otro)


}
