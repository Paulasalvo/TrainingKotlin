package codewars

/**
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of
a string. You're given one parameter, the original string. You don't have to worry with strings with less
than two characters.
 */

fun removeChar(str: String) = str.substring( 1, str.length -1 )


fun main(){
println(removeChar("alvaro"))
}