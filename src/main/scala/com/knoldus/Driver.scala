package com.knoldus

import scala.annotation.unused
import scala.util.{Failure, Success, Try}

object Driver extends App {
  private val sumOfList = new SumOfElementsOfList
  val list = List(3L, 4L, 7L, 2L, 9L)
  @unused
  val emptyList = List().empty
  private val result = Try(sumOfList.validateList(list))

  result match {
    case Success(value) => println(value)
    case Failure(exception) => exception.getMessage
  }
}