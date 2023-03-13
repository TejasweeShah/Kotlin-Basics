package fundamentals

/**
 * ## Collection Functions - .zip()
 *
 * zip function merges two given collections into a new collection. By default,
 * the result collection contains Pairs of source collection elements with the same index.
 * However, you can define your own structure of the result collection element.
 *
 * The size of the result collection equals to the minimum size of a source collection.
 *
 */


fun main() {

    val strList1 = listOf("a", "b", "c")
    val intList2 = listOf(1, 2, 3, 4)

    // Merges them into a list of pairs. The infix notation is used here.
    val resultPairs = strList1 zip intList2
    println("Result Pairs : $resultPairs")

    // Merges them into a list of String values by the given transformation.
    val resultReduce = strList1.zip(intList2) { a, b -> "$a-$b" }
    println("Result Reduced to $resultReduce")
}