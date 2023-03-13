package object_oriented_programming

/**
 * ## Inheritance - Grouping of classes based on their hierarchy i.e. "Who they are"
 *
 * Inheritance is one of the key features of object-oriented programming. It allows user to create a new class (derived class) from an existing class (base class).
 *
 * The derived class inherits all the features from the base class and can have additional features of its own.
 *
 * Kotlin DOESN'T SUPPORT Multiple Inheritance.
 *
 * Parent class constructor is Always called before Child class Constructor
 *
 * There is the keyword "open" before the base class, It's important.
 * By default, classes in Kotlin are final. If you are familiar with Java, you know that a final class cannot be subclassed. By using the open keyword on a class, compiler allows you to derive new classes from it.
 *
 * If the class has a primary constructor, the base must be initialized using the parameters of the primary constructor.
 *
 * In case of no primary constructor, each base class has to initialize the base (using super keyword), or delegate to another constructor which does that.
 *
 */

open class Person(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {

    fun teachMaths() {
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main() {
    val t1 = MathTeacher(25, "Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
}
