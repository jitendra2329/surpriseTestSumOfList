package com.knoldus

object Driver extends App {
  private val sumOfList = new SumOfElementsOfList
  println(sumOfList.validateList(List(23, 4, 32, 4, 7)))
  println(sumOfList.validateList(List().empty))
}