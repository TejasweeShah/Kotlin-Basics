package fundamentals


/**
 * ## Higher Order Functions
 * A function is called Higher Order function when it
 * 1. Accepts function as a parameter
 * 2. Returns function as a return type
 * 3. OR does both
 */

// ## FUNCTION / LAMBDA  AS A RETURN TYPE

fun main() {

    createHero()

    val returningFunction1 = initiateSum()
    println("Addition is ${returningFunction1(45,67)}")

    val greetFunction = greetingsIN( "English")
    greetFunction("Anamika")


    val returningFunction2 = divideOrMod("Divide")
    val result = returningFunction2(45,9)
    println("Result is $result")

}

// Returns a  LAMBDA (return type is UNIT)
fun createHero(): (String, String) -> Unit {
    return {
        realName, heroName ->
        println("$realName is now $heroName")
    }
}

// Returns a LAMBDA with an Int return type
fun initiateSum(): (Int, Int) -> Int{
    println("In initiateSum Function.")
    return{
        no1,no2 ->
        println("In a lambda, which is the return function of Initiate Sum")
        no1 + no2
    }
}

// Return a function (with Unit return type)
fun greetingsIN(language: String) : (String) -> Unit {

    val hindiGreet : (String) -> Unit = { println("Namaste ! $it") }
    val spanishGreet : (String) -> Unit = { println("Hola ! $it") }
    val englishGreet: (String) -> Unit = { println("Hello ! $it") }

    return when(language){
        "Hindi" -> hindiGreet
        "Spanish" -> spanishGreet
        else -> englishGreet
    }
}


// Return a function (with Int return type)
fun divideOrMod(operation: String): (Int, Int) -> Int{
    val divideFunction = {
        no1: Int, no2: Int ->
            no1 / no2
    }

    val modFunction = {
            no1: Int, no2: Int ->
        no1 % no2
    }

    return if(operation == "Divide") divideFunction else modFunction
}

