package fundamentals

/**
 * Variables :-
 * Stores data and has its own name.
 *  val : Stores a read only value. Value is assigned only once, cannot be reassigned. - IMMUTABLE
 *  var : Value can be reassigned. - MUTABLE
 *
 * DATA TYPES
 *  Integer (Byte, Short, Int, Long) - Integer values can be separated by one or more underscores with one exception, underscores can't appear at the beginning and at the end of the number.
 *  Floating Point (Float, Double)
 *  Boolean (true, false)
 *  Character (Char, String)
 *
 *
 * Operators :-
 *  Arithmetic, Relational, Increment & Decrement Operators.
 *
 * Strings :-
 *  A template expression starts with a dollar($) sign and consists of either a name or an expression in curly braces
 * */

fun main() {
    val message = "Welcome!"  // Declares a immutable variable and initializes it.
    println(message)

    var number = 45  // Declares a mutable variable and initializes it.
    println(number)
    number += 5      // Resign mutable variable, a new value
    println(number)

    val no1 = 25
    val no2 = 20
    println("Addition is ${no1 + no2}")
    println("Subtraction is ${no1 - no2}")
    println("Multiplication is ${no1 * no2}")
    println("Division is ${no1 / no2}")
    println("Modulus is ${no1 % no2}")

    println(no1.plus(no2))
    println(no1.minus(20))
    println(no1.times(2))
    println(no1.div(5))
    println(no1.mod(4))

    var no3 = 10
    println("Number is $no3")
    println("Post Increment : no++ ${no3++}")
    println("Post Increment now i is $no3")

    var no4 = 50
    println("Number is $no4")
    println("Pre Increment : ++no  ${++no4}")
    println("Post Increment now i is $no4")

}