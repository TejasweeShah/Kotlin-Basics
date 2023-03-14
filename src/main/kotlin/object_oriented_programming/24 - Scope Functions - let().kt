package object_oriented_programming

/**
 * ## Scope Functions
 *
 * * let() : Context obj - it  & Return value - lambda result
 *
 * The Kotlin standard library function let can be used for scoping and null-checks.
 * When called on an object, let executes the given block of code and returns the result of its last expression.
 * The object is accessible inside the block by the reference it (by default) or a custom name.
 *
 */


fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty()       // let returns the value of this expression.
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {         // Uses safe call, so let and its code block will be executed only on non-null values.
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->    // Uses the custom name instead of it, so that the nested let can access the context object of the outer let.
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

}