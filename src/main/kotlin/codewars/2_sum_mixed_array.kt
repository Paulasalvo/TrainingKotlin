package codewars

/**
Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
Return your answer as a number.
 */

public class MixedSum {
    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var sum = 0
        for (i in mixed) {
            when (i) {
                is Int -> sum += i
                is String -> {
                    try {
                        sum += i.toInt()
                    } catch (e: NumberFormatException) {
                        // Handle non-convertible strings here if needed
                        // For simplicity, this example assumes that non-convertible strings are treated as 0
                    }
                }
            }
        }
        return sum;
    }
}


fun main() {
    val mixedSum = MixedSum()
    // Example usage
    val inputList = listOf(1, "2", "3", 4, "5")
    val result = mixedSum.sum(inputList)
    println("Sum of the array values: $result")
}
