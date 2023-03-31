package com.knoldus

import scala.annotation.tailrec
import scala.util.{Failure, Success, Try}

class SumOfElementsOfList {
  private def findSum(list: List[Long]): Long = {
    val index = 0

    Try {
      @tailrec
      def findSumHelper(list: List[Long], sum: Long = 0): Long = {
        if (list.isEmpty) sum
        else {
          findSumHelper(list.drop(index + 1), list(index) + sum)
        }
      }

      findSumHelper(list)
    }
  } match {
    case Success(value) => value
    case Failure(exception) => 0
  }

  def validateList(list: List[Long]): Long = {
    list match {
      case Nil => throw new IllegalArgumentException("List is empty")
      case _ => findSum(list)
    }
  }
}
