package codewars

/**
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element
is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    var counter:Int= 0
    var sum:Int=0
    var newArray: Array<Int> = arrayOf()

    if (input == null) return newArray
    for (i in input) {
        if (i >= 1) {
            counter += 1
        } else if (i <= -1) {
            sum += i
        }
    }
    if (counter == 0 && sum==0){
        return newArray
    }
    newArray= arrayOf(counter,sum)

    return newArray
}
fun countPositivesSumNegatives2(input : Array<Int>?) : Array<Int> =
    if (input.isNullOrEmpty())
        arrayOf()
    else
        arrayOf(input.count { it > 0 }, input.filter{ it < 0 }.sum())


fun main(){
    println(countPositivesSumNegatives(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15)).joinToString())
}