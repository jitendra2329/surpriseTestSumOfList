package com.knoldus

import scala.annotation.tailrec

class SumOfElementsOfList {
  def findSum(list: List[Long]): Long = {
    val index = 0

    @tailrec
    def findSumHelper(list: List[Long], sum: Long = 0): Long = {
      if (list.isEmpty) sum
      else {
        findSumHelper(list.drop(index + 1), list(index) + sum)
      }
    }

    findSumHelper(list)
  }

  def validateList(list: List[Long]): Either[String, Long] = {
    list match {
      case Nil =>Left("List is empty!")
      case _ => Right(findSum(list))
    }
  }
}
