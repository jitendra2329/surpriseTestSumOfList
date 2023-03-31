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
}


