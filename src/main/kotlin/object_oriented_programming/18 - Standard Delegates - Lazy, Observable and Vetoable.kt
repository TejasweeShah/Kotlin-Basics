package object_oriented_programming

import kotlin.properties.Delegates

/**
 * ## Standard Delegates - Lazy, Observable and Vetoable
 *
 *  ### Lazy
 * lazy() is a function that takes a lambda and returns an instance of Lazy<T>, which can serve as a delegate for
 * implementing a lazy property. The first call to get() executes the lambda passed to lazy() and remembers the result. Subsequent calls to get() simply return the remembered result.
 *
 * By default, the evaluation of lazy properties is synchronized: the value is computed only in one thread,
 * but all threads will see the same value.
 * If the synchronization of the initialization delegate is not required to allow multiple threads
 * to execute it simultaneously, pass LazyThreadSafetyMode.PUBLICATION as a parameter to lazy().
 *
 *
 *  ### Observable & Vetoable
 * Whenever we need to observe the value change, observable delegate is used.
 * Delegates.observable() takes two arguments: the initial value and a handler for modifications.
 * Initial value is passed to Constructor
 * The handler is called every time you assign to the property (after the assignment has been performed).
 * It has three parameters: the property being assigned to, the old value, and the new value:
 *
 * If you want to intercept assignments and veto them, use vetoable() instead of observable().
 * The handler passed to vetoable will be called before the assignment of a new property value.
 *
 */

class HeavyStudent {

    var name: String = ""

    init {
        println("Initialize A student class with tonzz of admission paperwork with - properties and methods")
    }
}

class LightStudent {

    val heavyStudent by lazy { HeavyStudent() }  // Property by-lazy is not initialized on object creation.

    var marks: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("Marks change from : $oldValue to $newValue")
    }

    var age by Delegates.vetoable(5) { property, oldValue, newValue ->
        println("Age change from : $oldValue to $newValue (IF the condition is true)")
        newValue > oldValue
    }
}

fun main() {
    val student = LightStudent()

    student.heavyStudent
    student.heavyStudent    // initializes lazy objects only once, will not initialize again and saves the processor from heavy work

    student.heavyStudent.name = "Anamika"
    println("NAME : ${student.heavyStudent.name}")

    student.marks = 45
    println("MARKS this term : ${student.marks}")

    student.marks = 12
    println("MARKS this term : ${student.marks}")

    student.marks = 76
    println("MARKS this term : ${student.marks}")

    student.age = 6
    println("Current Age : ${student.age}")

    student.age = 4
    println("Current Age : ${student.age}")

    student.age = 8
    println("Current Age : ${student.age}")

}