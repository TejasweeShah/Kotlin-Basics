package fundamentals

import java.math.BigInteger

/**
 * ## Recursion
 *
 * A function that calls itself is known as recursive function. And, this technique is known as recursion.
 *
 * A physical world example would be to place two parallel mirrors facing each other.
 * Any object in between them would be reflected recursively.
 *
 *
 * ## Kotlin Tail Recursion
 * Tail recursion is a generic concept rather than the feature of Kotlin language.
 * Some programming languages including Kotlin use it to optimize recursive calls,
 * whereas other languages (e.g. Python) do not support them.
 *
 * ## What is tail recursion?
 * In normal recursion, you perform all recursive calls first, and calculate the result from
 * return values at last (as show in the above example).
 * Hence, you don't get result until all recursive calls are made.
 *
 * In tail recursion, calculations are performed first, then recursive calls are executed
 * (the recursive call passes the result of your current step to the next recursive call).
 * This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.
 *
 *
 * ## Condition for Tail Recursion
 * A recursive function is eligible for tail recursion if the function call to itself is
 * the last operation it performs. For example,
 *
 * Example 1: Not eligible for tail recursion because the function call to itself
 * n*factorial(n-1) is not the last operation.
 *
 *      fun factorial(n: Int): Long {
 *          if (n == 1) {
 *             return n.toLong()
 *          } else {
 *             return n*factorial(n - 1)
 *          }
 *      }
 *
 * Example 2: Eligible for tail recursion because function call to itself
 * fibonacci(n-1, a+b, a) is the last operation.
 *
 *      fun fibonacci(n: Int, a: Long, b: Long): Long {
 *          return if (n == 0) b else fibonacci(n-1, a+b, a)
 *      }
 *
 * To tell compiler to perform tail recursion in Kotlin, you need to mark the function with
 * tailrec modifier.
 *
 */


fun main() {

    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci(n, first, second))


    val number = 5
    println("Factorial of $number = ${factorial(number)}")
}


tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n - 1, b, a + b)
}


tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}