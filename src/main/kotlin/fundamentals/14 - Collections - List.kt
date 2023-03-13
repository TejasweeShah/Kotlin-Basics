package fundamentals

/**
 * ## Collections - Lists
 *
 * List is an ordered collection with access to elements by indices – integer numbers that reflect their position. Elements can occur more than once in a list. An example of a list is a telephone number: it's a group of digits, their order is important, and they can repeat.
 *
 * In Kotlin, lists can be either mutable (MutableList) or read-only (List).
 * For list creation,
 * use the standard library functions listOf() for read-only lists
 * and mutableListOf() for mutable lists.
 *
 * To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List
 *
 */

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // Creates a MutableList.

val sudoers: List<Int> = systemUsers                // Creates a read-only view of the list.

fun addSystemUser(newUser: Int) {               // Adds a new item to the MutableList.
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                // A function that returns an immutable List.
    return sudoers
}

fun main() {
    addSystemUser(4)                                              // 5
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!        // Attempting to write to the read-only view causes a compilation error.
}