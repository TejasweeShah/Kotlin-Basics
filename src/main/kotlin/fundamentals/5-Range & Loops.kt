package fundamentals

/**
 *
 * ## RANGE
 *
 * ## FOR Loop
 *
 * ## WHILE Loop
 *
 * ## DO-WHILE Loop
 *
 * ## 3 structural jump expressions in Kotlin - break, continue and return
 *
 */

fun main() {

    rangeExample()

    forExample()
    whileExample()
    doWhileExample()

    breakExample()
    continueExample()
    labelExample()

    returnExample1()
    returnExample2()

}

//RANGE
fun rangeExample() {
    val number = 5
    val rangeIn = number in 1..5
    val rangeUntil = number in 1 until 5
    println("Range IN : $rangeIn, Coz $number is checked from 1st to last number in the range")
    println("Range UNTIL : $rangeUntil, Coz $number is checked from 1st to second last number in the range")
}

// FOR
fun forExample() {
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // Prints Nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

    val language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (index in language.indices) {

        // printing array elements having even index only
        if (index % 2 == 0)
            println(language[index])
    }
}

// WHILE
fun whileExample() {
    var cnt1 = 1
    while (cnt1 <= 10) {
        println("Line $cnt1")
        cnt1 += 2
    }
}

// DO-WHILE
fun doWhileExample() {
    var cnt2 = 1
    do {
        println("Line $cnt2")
        cnt2 += 2
    } while (cnt2 <= 10)
}

// BREAK
// Example: Calculate Sum Until User enters 0
fun breakExample() {
    var sum1 = 0
    var num1: Int
    while (true) {
        print("Enter a number: ")
        num1 = readln().toInt()

        if (num1 == 0)
            break

        sum1 += num1
    }
    print("Sum Until User enters 0 = $sum1")
}

// CONTINUE
// Example: Calculate Sum of Positive Numbers Only
fun continueExample() {
    var num2: Int
    var sum2 = 0

    for (i in 1..6) {
        print("Enter an $i th integer (-ve/+ve): ")
        num2 = readln().toInt()

        if (num2 <= 0)
            continue
        //Next part of code is executed only if condition is true and continue is
        sum2 += num2
    }
    println("Sum of Positive Numbers  = $sum2")

}

//LABEL & BREAK
fun labelExample() {
    first@ for (i in 1..4) {
        second@ for (j in 1..2) {
            println("i = $i; j = $j")
            if (i == 2)
                break@first
        }
    }
}

//RETURN
fun returnExample1() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun returnExample2(){
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with explicit label")
}