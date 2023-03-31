# surpriseTestSumOfList



SumOfElementsOfList is a Scala class that provides functionality to find the sum of elements of a list of Long integers. The class contains two methods, findSum and validateList.

**Usage**

To use SumOfElementsOfList, create an instance of the class and call the validateList method, passing in a list of Long integers.


val sumOfElementsOfList = new SumOfElementsOfList()

val list = List(1L, 2L, 3L, 4L, 5L)

val sum = sumOfElementsOfList.validateList(list)

println(sum) // prints 15

If the list is empty, an IllegalArgumentException is thrown.


val emptyList = List()

sumOfElementsOfList.validateList(emptyList) // throws IllegalArgumentException("List is empty")

If there is any other exception thrown during the execution of findSum, the method returns 0.


val faultyList = List(1L, 2L, 3L, "4", 5L)

val sum = sumOfElementsOfList.validateList(faultyList)

println(sum) // prints 0

**Implementation**

The findSum method is a tail-recursive function that takes a list of Long integers and recursively adds the first element to a running sum until the list is empty. The sum is then returned.

The validateList method first checks if the list is empty and throws an exception if it is. Otherwise, it calls the findSum method and returns the sum.

If an exception is thrown during the execution of findSum, the method returns 0.
