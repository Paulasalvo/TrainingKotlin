package codewars

/**
 * I have a cat and a dog.
 *
 * I got them at the same time as kitten/puppy. That was humanYears years ago.
 *
 * Return their respective ages now as [humanYears,catYears,dogYears]
 *
 * NOTES:
 *
 * humanYears >= 1
 * humanYears are whole numbers only
 * Cat Years
 * 15 cat years for first year
 * +9 cat years for second year
 * +4 cat years for each year after that
 * Dog Years
 * 15 dog years for first year
 * +9 dog years for second year
 * +5 dog years for each year after that
 */
fun calculateYears(years: Int): Array<Int> {
    var dogAge:Int = 0
    var catAge: Int = 0

    when (years) {
        1 -> {
            dogAge = 15
            catAge = 15
        }
        2 -> {
            dogAge = 24
            catAge = 24
        }
        else -> {
            dogAge = (years-2)*5 +24
            catAge = (years-2)*4+ 24
        }
    }
    return arrayOf(years, catAge, dogAge);
}

fun main(){
    val years = 10
    val result= calculateYears(years)
    println("(${result.joinToString()})")
}