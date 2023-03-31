package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{an, be}

class SumOfElementsOfListTest extends AnyFlatSpec {
  val sumOfList = new SumOfElementsOfList

  it should "return sum = 30 " in {
    val list = List(3L,6L,7L,10L,4L)
    val actualResult = sumOfList.validateList(list)
    val expectedResult = 30
    assert(actualResult == expectedResult)
  }

  it should "return sum = 80 " in {
    val list = List(3L, 6L, 7L, 10L, 4L, 50L)
    val actualResult = sumOfList.validateList(list)
    val expectedResult = 80
    assert(actualResult == expectedResult)
  }

  it should "throw an exception : IllegalArgumentException, As list is empty" in {
    val list = List().empty
    an[IllegalArgumentException] should be thrownBy{
      sumOfList.validateList(list)
    }
  }
}
