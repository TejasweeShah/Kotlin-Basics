package object_oriented_programming

/**
 * ## Object Expression
 *
 * Anonymous Object(instance of a class with no name) using object keyword.
 * It's a replacement of Java's Anonymous Inner Class.
 *
 */

fun main() {
    val person1 = object : APerson("Jack", 29) {
        override fun eat() {
            super.eat()
            println("And Also : Milk and Milk Products")
            println("NO TO : Meat, Fish, Egg")
        }
    }
    person1.eat()       // Usage
    person1.talk()

    println("")

    val person2 = object : APerson("Joe", 55) {
        override fun eat() = println("Eats Everything on Planet")
    }
    person2.eat()
    person2.talk()

    println("")

    val cloneOf = object : CloneableInf {
        override fun cloneMe() {
            super.cloneMe()
            println("Additional Clone Features")
        }
    }
    cloneOf.cloneMe()
}

open class APerson(name: String, age: Int) {

    init {
        println("Name: $name, Age: $age")
    }

    fun talk() = println("Jibber Jabber")
    open fun eat() = println("Eat : Fruits & Vegetables")
}

interface CloneableInf {
    fun cloneMe() = println("I am a Clone of ...")
}