package fundamentals

/**
 * Null Safety
 * In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
 * If you need a variable that can be null, declare it nullable by adding ? at the end of its type.
 *
 */

fun main() {


    // val name :String = null    // Compile Error : Null can not be a value of a non-null type String

    var name :String? = null //Declare a variable name with null value.

    println("Name is $name")
    println("Name Length : ${name?.length} ")

    /**
    * Safe Operator Call will return ‘null‘ by default if the value is null but using Elvis Operator in conjunction with Safe Call Operator you can ask for the desired output other than ‘null‘ if the assigned value is null. Instruction right to ‘?:‘ operator will be returned if null is found in nullability check.
    */
    println("Name is $name")
    println("Name Length with Elivs : ${name?.length ?: -1} ")

    name = "Long Name "
    println("Name is $name")
    println("Name Length : ${name?.length} ")

}