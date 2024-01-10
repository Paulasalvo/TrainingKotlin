package codewars

/**
Given an array of numbers, return a new array of length number containing the last even numbers from the
original array (in the same order). The original array will be not empty and will contain at least "number"
even numbers.

For example:

([1, 2, 3, 4, 5, 6, 7, 8, 9], 3) => [4, 6, 8]
([-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26], 2) => [-8, 26]
([6, -25, 3, 7, 5, 5, 7, -3, 23], 1) => [6]
 */
fun evenNumbers(array: List<Int>, number: Int): List<Int> {
    var evenList:MutableList<Int> = mutableListOf()
    for (i in array.size -1 downTo 0){
        if (array[i] %2==0){
            evenList.add(array[i])
            if (evenList.size == number){
                break
            }
        }
    }
    return evenList.reversed()
}

fun main(){
    var array:List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(evenNumbers(array, 3))
}