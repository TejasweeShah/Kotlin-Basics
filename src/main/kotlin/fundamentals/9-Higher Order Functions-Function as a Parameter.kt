package fundamentals

/**
 * ## Higher Order Functions
 * A function is called Higher Order function when it
 * 1. Accepts function as a parameter
 * 2. Returns function as a return type
 * 3. OR does both
 *
 * ### Trailing Lambda : According to Kotlin convention, if the last parameter of a function is a function, then a lambda expression passed as the corresponding argument can be placed outside the parentheses:
 */

 // ## FUNCTION / LAMBDA AS A PARAMETER

fun main() {

    // Invoke the higher-order function
    // NOTE : Int the function call below : 3rd Argument, the lambda expression is placed OUTSIDE the parentheses, called as Trailing Lambda.
    rollDice(1..7, 4) {
        println("Rolled To : $it")
    }

    // Invoke the higher-order function passing in two integer values and the function argument ::sum. :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::sum)

    // Invoke the higher-order function passing in a lambda as a function argument.
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}


fun rollDice(range: IntRange, times: Int, callbackItSelf: (result: Int) -> Unit): Unit {
    for (cnt in 0 until times) {
        val rolledTo = range.random()
        callbackItSelf(rolledTo)
    }
}

fun calculate(no1: Int, no2: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(no1, no2)                                          // 2
}

fun sum(x: Int, y: Int) = x + y     // A Normal a function that matches the operation signature.

fun divide(x: Int, y: Int) = x / y     // A Normal a function that matches the operation signature.



