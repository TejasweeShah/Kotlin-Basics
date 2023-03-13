package fundamentals

/**
 * ## Collection Functions - .filter()
 *
 * filter function enables you to filter collections. It takes a filter predicate as a lambda-parameter. The predicate is
 * applied to each element. Elements that make the predicate true are returned in the result collection.
 *
 */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6, 7, 10, 2, 14, -54, -36)

    val positives = numbers.filter { x -> x > 0 }
    println("Positive Numbers : $positives")

    val negatives = numbers.filter { it < 0 }
    println("Negative Numbers : $negatives")


    val odds = numbers.filter(fun(n: Int): Boolean {
        return n % 2 != 0
    })
    println("Odd Numbers : $odds")

    val evens = numbers.filter(::isEven)
    println("Even Numbers  $evens")

    val multiplesOf5 = numbers.filter(::isDivisibleBy5)
    println("Multiple of 5 : $multiplesOf5")

    val notDivisibleBy5 = numbers.filterNot(::isDivisibleBy5)
    println("Not Divisible By 5 : $notDivisibleBy5")

}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun isDivisibleBy5(n: Int): Boolean {
    return n % 5 == 0
}