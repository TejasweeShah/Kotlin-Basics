package object_oriented_programming

/**
 * ## Scope Functions
 *
 * * run() : Context obj - this  & Return value - lambda result
 *
 * Like let, run is another scoping function from the standard library. Basically,
 * it does the same: executes a code block and returns its result.
 * The difference is that inside run the object is accessed by this.
 * This is useful when you want to call the object's methods rather than pass it as an argument.
 *
 */


fun getNullableLength(someStr: String?) {
    println("for \"$someStr\":")
    someStr?.run {                                                  // 1
        println("\t is empty? " + isEmpty())     // Inside run, the object's members are accessed without its name.
        println("\t length = $length")
        length               // run returns the length of the given String if it's not null
    }
}

fun main() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}
