package codewars

/**
Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]
 */
fun maps(x: IntArray): IntArray {
    val doubledArray = IntArray(x.size)
    for (i in x.indices) {
        doubledArray[i] = x[i] * 2
    }

    return doubledArray
}

fun main(){
    val intArray = intArrayOf(1, 2, 3)
    val doubledArray = maps(intArray)
    println(doubledArray.joinToString(", "))

}