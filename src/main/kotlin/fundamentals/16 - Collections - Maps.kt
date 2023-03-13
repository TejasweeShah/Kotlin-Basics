package fundamentals

/**
 * ## Collections - Maps
 *
 * Map (or dictionary) is a set of key-value pairs. Keys are unique, and each of them maps
 * to exactly one value. The values can be duplicates. Maps are useful for storing logical
 * connections between objects, for example, an employee's ID and their position.
 *
 * For creating maps, there are functions mapOf() and mutableMapOf().
 * Using the to infix function makes initialization less noisy.
 * A read-only view of a mutable map can be obtained by casting it to Map.
 *
 * Two maps containing the equal pairs are equal regardless of the pair order.
 *
 * Example
 *  val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
 *  val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
 *
 *
 */

const val POINTS_X_PASS: Int = 15

// Creates a mutable Map.
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

// Creates a read-only view of the Map.
val EZPassReport: Map<Int, Int> = EZPassAccounts

// A function that : Checks if the Map's key exists.
// And Reads the corresponding value and increments it with a constant value.
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun addNewAccount(accountId: Int, defaultCredit: Int = 100) {
    if (!EZPassAccounts.containsKey(accountId)) {
        // EZPassAccounts[accountId] = defaultCredit
        EZPassAccounts[accountId] to defaultCredit
        println("New Account Created - (id: $accountId & credit: ${EZPassAccounts[accountId]})")
    } else {
        println("Account : $accountId  Already exists !")
    }
}

// Iterates immutable Map and prints key/value pairs.
fun accountsReport() {
    println("EZ-Pass report:")

    EZPassReport.forEach { (k, v) ->
        println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()
    addNewAccount(4)
    addNewAccount(5, 100)


    updatePointsCredit(2)
    updatePointsCredit(2)       // Updates an existing account two times.

    updatePointsCredit(10)        // Tries to update a non-existing account: prints an error message.
    accountsReport()                      // Reads the account points balance, after updates.
}
