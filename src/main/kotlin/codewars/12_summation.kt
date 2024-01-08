package codewars

/**

Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer
greater than 0. Your function only needs to return the result, what is shown between parentheses in the example
below is how you reach that result and it's not part of it, see the sample tests.

For example (Input -> Output):

2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

 */

object GrassHopper {
    fun summation(n:Int):Int {
        var num=1
        var sum=0
        while(num <= n){
            sum+=num
            num++
        }
        return sum
    }
}

fun main(){
    println(GrassHopper.summation(8))

}