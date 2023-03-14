package object_oriented_programming

/**
 * ## Scope Functions
 *
 * * also() : Context obj - it  & Return value - context object
 *
 * also works like apply: it executes a given block and returns the object called.
 * Inside the block, the object is referenced by it, so it's easier to pass it as an argument.
 *
 * This function is handy for embedding additional actions, such as logging in call chains.
 *
 */

data class AProfile(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: AProfile) {
    println("A new person ${p.name} was created.")
}

fun main() {

    val devProfile = AProfile("John", 30, "Android developer")   // 1
        .also {        // 2 Applies the given code block to the object. The return value is the object itself.
            writeCreationLog(it)               // 3
        }

}