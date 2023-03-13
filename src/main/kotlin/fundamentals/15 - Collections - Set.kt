package fundamentals

/**
 * ## Collections - Sets
 *
 * A set is an unordered collection that does not support duplicates.
 * Set is a collection of unique elements. It reflects the mathematical abstraction of set: a group of objects without repetitions. Generally, the order of set elements has no significance. For example, the numbers on lottery tickets form a set: they are unique, and their order is not important.
 *
 * For creating sets, there are functions setOf() and mutableSetOf().
 * A read-only view of a mutable set can be obtained by casting it to Set.
 *
 */

//  Creates a Set with given elements.
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)        // Returns a boolean value showing if the element was actually added.
}


// A Returns a string, based on function input parameter.
// Prints a success message: the new element is added to the Set.
// Prints a failure message: the element can't be added because it duplicates an existing element.

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}

