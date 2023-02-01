package fundamentals

import kotlin.math.pow

/**
 * ## Lambdas
 * Anonymous functions (with no function-name)
 * * A lambda expression is always surrounded by curly braces.
 * * Parameter declarations in the full syntactic form go inside curly braces and have optional type annotations.
 * * The body goes after the ->.
 * * If the inferred return type of the lambda is not Unit, the last (or possibly single) expression inside the lambda body is treated as the return value.
 *
 */

fun main() {

    // Lambda with two input parameters and Int return type
    val simpleLambda = { x: Int, y:Int -> x+y}

    //multiLineLambda - with no parameters and multiline body - LAST line of the Lambda body is its return type
    val multiLineLambda = {
        println("Hello! In MultiLine Lambda Body")
        val a = 45 + 7
        "Returning a no $a in String from Lambda"
    }

    //single parameter and body - LAST line of the Lambda body is its return type
    val singleParamLambda = {name: String ->
        println("Namaste! $name")
        //Nothing to return, So return type is Unit
    }

    // Explicitly  type defined lambda
    val typeDefinedLambda: (Double, Double) -> Double = { x, y  -> x.pow(y) }

    //If a lambda has only one parameter, by default it is denoted bt "it" variable
    val simplifiedSingleParamLambda: (Int) -> Int = {it * it * it}

    /**
     * Calling Lambda - As it is a function only we put () in front of variable name
     */

    // Executes the body of Lambda
    multiLineLambda()
    println("-----------")

    // Call Lambda and print whatever it returns
    println(multiLineLambda())

    simpleLambda(5,9)

    singleParamLambda("Anamika")

    val powResult = typeDefinedLambda(2.0, 3.0)
    println("Power is : $powResult")

    println("Cube is : ${simplifiedSingleParamLambda(5)}")
}