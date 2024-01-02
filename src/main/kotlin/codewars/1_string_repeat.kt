/**
Write a function that accepts an integer n and a string s as parameters, and returns a string
of s repeated exactly n times.
 */
fun repeatStr(n: Int, text: String) : String{
   return text.repeat(n)
}


fun main(){
    val text: String= "hello"
    val result = repeatStr(5, text)
    println(result)
}