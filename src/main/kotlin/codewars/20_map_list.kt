package codewars

data class Perrito(
    val name: String?,
    val age: Double,
    val description: String
)

data class Perro(
    val name: String,
    val age: Int,
    val description: String
)

fun fetchPerrito() = listOf(
    Perrito("a", 2.0, "x"),
    Perrito(null, 1.0, "y"),
    Perrito("c", 6.0, "z")
)

fun main() {
    val perritos = fetchPerrito()
    val perros = perritos.map {
        Perro(it.name ?: "", it.age.toInt(), it.description)
    }
    println(perritos)
    println(perros)
}









fun mapAndForEach() {
    val oneList = listOf(10, 20, 30, 40, 50, 60)
    val modifyList = mutableListOf<Int>()

    oneList.forEachIndexed { index, element ->
        println("index: $index value: $element")
        modifyList.add(index)
    }

    val newList = oneList.map { it * -2 }
    println(newList)
    println(oneList)
    println(modifyList)
}