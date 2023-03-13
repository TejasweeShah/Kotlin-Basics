package fundamentals


/**
 * ### Generics in Kotlin
 *
 * Generics in Kotlin - Define classes or functions that work with different data types.
 *
 */

class CustomTriple<A : Any, B : Any, C : Any>(
    private var first: A, private var second: B, private var third: C
) {
    fun printTypes() {
        println(
            "First type : ${first::class.qualifiedName} \n" +
                    "Second type : ${second::class.qualifiedName} \n" +
                    "Third type : ${third::class.qualifiedName} \n"
        )
    }
}

fun <T> findElement(arrayOfT: Array<T>, element: T, callingFoundElement: (index: Int, element: T) -> Unit) {
    for (index in arrayOfT.indices) {
        if (arrayOfT[index] == element) {
            callingFoundElement(index, arrayOfT[index])
            return
        }
    }
    callingFoundElement(-1, element)
    return
}

fun main() {

    val customTripleType1 = CustomTriple("someStr", false, 75)
    customTripleType1.printTypes()

    val customTripleType2 = CustomTriple(
        45.78,
        charArrayOf('a', 'e', 'i', 'o', 'u'),
        true
    )
    customTripleType2.printTypes()

    findElement(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 31) { index, element ->
        if (index == -1) println("$element NOT FOUND")
        else println("$element FOUND AT ${index + 1} position")
    }

    findElement(arrayOf("cat", "sat", "pat", "mat"), "cat") { index, element ->
        if (index == -1) println("$element NOT FOUND")
        else println("$element FOUND AT ${index + 1} position")
    }
}
