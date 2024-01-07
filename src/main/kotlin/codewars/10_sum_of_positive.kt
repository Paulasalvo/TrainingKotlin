package codewars

/**
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

fun sum(numbers: IntArray): Int {
    var sumpositive = 0
    for (i in numbers){
        if (i>0){
            sumpositive+= i
        }
    }
     return sumpositive
}



fun main(){
    val numbers = intArrayOf(1, -4, 7, 12)
    val result = sum(numbers)
    println("Sum of positive numbers: $result")
}