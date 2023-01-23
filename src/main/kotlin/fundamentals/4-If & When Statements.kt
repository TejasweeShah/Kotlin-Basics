package fundamentals


/**
 * ## IF Statement
 *  'if' executes a certain section of code if the 'testExpression' is evaluated to true. It can have optional 'else' clause. Code inside else block is executed if the testExpression is false.
 *  'if' can be used an expression in Kotlin; it returns a value
 *
 * ## WHEN Statement ::
 *  when statements in Kotlin are like case or switch statements in other languages.
 */


fun main() {

    // IF Statement
    val number = -10

    if (number % 2 != 0) {
        println("$number is a Odd number")
    } else {
        println("$number is an Even number")
    }

    //IF with Expressions
    val result = if (number > 0) "Positive number" else "Negative number"
    println("$number is a $result")

    val no1 = -9
    val no2 = -11
    val max = if (no1 > no2) {
        println("$no1 is larger than $no2.")
        println("max variable holds value of a.")
        no1
    } else {
        println("$no2 is larger than $no1.")
        println("max variable holds value of b.")
        no2
    }
    println("MAX is  = $max")

    // WHEN Statement
    val welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say ?? ")
        in 1..50 -> println("Perfect !! That's a nice welcome message.")
        else -> println("Too long Greetingss!")
    }
}