package fundamentals


/**
 * ## Collection Functions -  .map()
 * map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 *
 */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val doubled = numbers.map { x -> x * 2 }
    println("Double of Numbers List : $doubled")

    val tripled = numbers.map { it * 3 }
    println("Triple of Numbers List : $tripled")

    val squares = numbers.map { it * it }
    println("Squares of Numbers List : $squares")

    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30, "Ann" to 23, "Joe" to 45, "Jack" to 10, "Jill" to 16
    )
    val people: Map<String, Int> = peopleAges

    println(
        people.map {
            "${it.key} is ${it.value}"
        }.joinToString("; ")
    )
}