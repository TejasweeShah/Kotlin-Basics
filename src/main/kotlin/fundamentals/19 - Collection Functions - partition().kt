package fundamentals

/**
 * ## Collection Functions - .partition()
 *
 * The partition function splits the original collection into a pair of lists using a given
 * predicate:
 * 1. Elements for which the predicate is true.
 * 2. Elements for which the predicate is false.
 *
 *
 */


fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6, 7, -10, 45, -36, 20, -22)

    // Splits numbers into a Pair of lists with even and odd numbers.
    val evenOdd = numbers.partition { it % 2 == 0 }
    println("EVEN ODD RESULTS $evenOdd")
    println("Evens ${evenOdd.first}")
    println("Odds ${evenOdd.second}")

    // Splits numbers into two lists with positive and negative numbers.
    // Pair destructuring is applied here to get the Pair members.
    val (positives, negatives) = numbers.partition { it > 0 }
    println("Positives : $positives")
    println("Negatives : $negatives")


    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1

    val resultPairs = A zip B
    println("Result : $resultPairs")


    val resultReduce = A.zip(B) { a, b -> "$a $b" }
    println("Result $resultReduce")
}