package com.conekta.examenes

class Conjunto100 {

  private val initialList: List[Int] = List.range(1, 101)
  private var tempList: List[Int] = initialList

  def obtenerList: List[Int] = {
    initialList
  }

  def extraerElement(element:Int) : Int = {
    require(element>0 && element <= 100, "El elemento deseado se encuentra fuera del rango 1 - 100")
    tempList = initialList diff List(element)
    initialList(element-1)
  }

  def obtenerNumeroExtraido : List[Int] = {
    initialList diff tempList
  }

}
