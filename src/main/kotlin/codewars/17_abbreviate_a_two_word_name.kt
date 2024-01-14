package codewars

/**
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */
fun abbrevName(name:String):String{
    var firstWord= ""
    var secondWord= ""
    val nameArray: List<String> = name.split(" ")
    firstWord= nameArray[0].first().toString().uppercase()
    secondWord= nameArray[1].first().toString().uppercase()
    return "$firstWord.$secondWord"
}

fun abbrevName2(name: String) = name.split(" ").joinToString(".") { it.take(1).uppercase() }

fun main(){
    println(abbrevName("Olga Muñoz"))
}