package fundamentals

import kotlin.math.pow

/**
 * ## Functions
 * * Function with No return-type
 * * Function with return-type
 * * Function as an Expressions
 * * Function with Default Argument Values
 * * Function with Variable Arguments - varargs
 * * Function with Named Arguments
 *
 */

fun main() {

    addNumbers(35,67)

    val num = 45
    val isEven = evenOrOdd(num)
    println("$num is ${if(isEven) "Even" else "Odd"}")

    println(checkPositiveOrNegativeNo(1008))
    println(checkPositiveOrNegativeNo(-4683))

    val funInVariable = ::power
    println("Power : ${funInVariable(3.0, 4.0)}")

    greetings()
    greetings("Anamika")

    rollDice()
    rollDice(3)
    rollDice(2,(1..10))

    sumVarArgs()
    sumVarArgs(2,3,4,5,6,7,8,9,10)
    sumVarArgs(10,20,30)

    makeBurger("XL", "Vegetarian",true,false)
    makeBurger(type = "Vegetarian", extraCheese = false, size="Large", makeItAMeal = true)
}

// Function with no return type
fun addNumbers(no1: Int, no2: Int){
    val result =  no1 + no2
    println("Addition of two numbers is $result")
}

// Function with return type
fun evenOrOdd(num: Int): Boolean {
    return num % 2 == 0
}

// Function as an Expressions
fun checkPositiveOrNegativeNo(no: Int) = if (no > 0) "$no is a Positive Number" else "$no is a Negative Number"

// Important concept to understand Higher Order functions.
// Function store in a Variable - Helpful in scenarios where one Function is needed as a Parameter of other function
fun power(no1: Double, no2: Double): Double = no1.pow(no2)

// Function with Default Argument Value
fun greetings(name : String = "There"){
    println("Namaste! $name")
}

// Function with Default Values
fun rollDice(times: Int = 1, range: IntRange = (1..6)) {
    println("Dice Roll $times times --- ")
    for (cnt in 0 until times){
        val result =  range.random()
        println("ROll $cnt :: $result")
    }
}

// Function with Variable Arguments
fun sumVarArgs(vararg numbers: Int){
    println("Sum of variable numbers : ${numbers.sum()}")
}

// Function with Named Arguments - It is not necessary to pass the Arguments in same Sequence. Helps in cases where no of arguments is more
fun makeBurger(size: String, type: String, extraCheese: Boolean, makeItAMeal: Boolean){
    println("Enjoy Your Order : 1 $size $type Burger with ${if(extraCheese) "Extra Cheese" else "NO Extra Cheese"} ${if(makeItAMeal) "- Make a MEAL" else ""}")
}