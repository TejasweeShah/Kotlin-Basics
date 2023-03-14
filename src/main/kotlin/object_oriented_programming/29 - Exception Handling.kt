package object_oriented_programming

/**
 * ## Exception Handling
 *
 * * try - catch Block
 *
 * * finally Block
 *
 * * throw custom exceptions
 *
 */


fun main() {

    // try - catch block
    try{
        val ar = arrayOf(1,2,3,4,5)
        val int = ar[6]
        println(int)
    }
    catch (msg: Exception){
        println("Catch Exception - $msg")
    }
    finally {
        println("Finally - This block always executes")
    }


    // Exception Handling as in "Expressions"
    val no1 = 24
    val no2 = 0

    val result = try {
        println("Multiline Try block in Expressions : - Last line of the block is the return value")
        no1 / no2
    } catch (e: ArithmeticException) {
        println("Multiline Catch block in Expressions : - Last line of the block is the return value")
        0
    }


    // Throw (and Handle) Custom Exceptions
    try {
        vote("Sara", 23)
        vote("Not Sara", 10)
    }
    catch (e: IllegalVoterException){
        e.printStackTrace()
    }

}


fun vote(name: String, age: Int){
    if (age < 18)
        throw IllegalVoterException("Not an Adult :  $name cannot Vote")
    else
        println("Welcome to voting club, $name")
}

class IllegalVoterException(message: String) : Exception(message)