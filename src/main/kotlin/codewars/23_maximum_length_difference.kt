package codewars


/**
You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. Let x be any
string in the first array and y be any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

Example:
a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]38
mxdiflg(a1, a2) --> 13
Bash note:
input : 2 strings with substrings separated by ,
output: number as a string

Now if you are wondering what this kata want's you to do, here:

1.Find maximum and minimum in both arrays
2.Compare maximum from array1 with minimum of array2
3.Compare maximum from array2 with minimum of array1
4.Return the maximum from both comparisions
 */

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty() ){
        return -1
    }else{
        var compA1A2= (a1.maxBy { it.length }.length)-(a2.minBy { it.length}.length)
        var comA2A1=(a2.maxBy { it.length }.length)-(a1.minBy { it.length }.length)
        if (compA1A2>comA2A1){
            return compA1A2
        }else
            return comA2A1
    }
}

fun mxdiflg2(a1:Array<String>, a2:Array<String>):Int {
    if (a1.isEmpty() || a2.isEmpty() ){
        return -1
    }

        var compA1A2= (a1.maxBy { it.length }.length)-(a2.minBy { it.length}.length)
        var comA2A1=(a2.maxBy { it.length }.length)-(a1.minBy { it.length }.length)
        if (compA1A2>comA2A1){
            return compA1A2
        }else
            return comA2A1

}

fun mxdiflg3(a1:Array<String>, a2:Array<String>) = if (a1.isEmpty() || a2.isEmpty()) -1 else listOf(
    a1.maxBy { it.length }!!.length - a2.minBy { it.length }!!.length,
    a2.maxBy { it.length }!!.length - a1.minBy { it.length }!!.length
).max()
fun main(){
    println(mxdiflg(arrayOf<String>("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"), arrayOf<String>("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")))
}