package object_oriented_programming

import kotlin.math.PI

/**
 * ## Interfaces - Grouping of classes based on the work/behaviour i.e. "What the do"
 *
 * Kotlin's interfaces are similar to interfaces in Java 8. They can contain definitions of abstract methods as well as implementations of non-abstract(concrete) methods. However, they cannot contain any state.
 *
 * Meaning, interface may have property, but it needs to be abstract or has to provide accessor implementations.
 *
 * NOTE
 * * Abstract classes in Kotlin are similar to interface with one important difference. It's not mandatory for properties of an abstract class to be abstract or provide accessor implementations.
 *
 * * Group objects based on what they can do rather than what they are ( Circle, Triangle and Square are Shapes - Inheritance works but, Circle, Triangle, Square and Players - all can be Draggable).
 * So, Interface is to use polymorphism in unrelated set of classes (i.e. classes which don't belong to same set of hierarchy )
 *
 * * Common terminology - Interface is a contract which state that whosoever implements that interface has to provide the implementation for the methods in that interface
 */

fun main() {

    val gameObjects = arrayOf(
        SmileyCircles(3.0),
        GrumpySquares(7.0),
        Player("Smiley"),
        ConfusedTriangles(8.0, 2.0),
        SmileyCircles(45.0),
        ConfusedTriangles(10.0, 5.0),
        Player("Grumpy")
    )
    dragObjects(gameObjects)
}

fun dragObjects(objects: Array<Draggable>) {

    for (obj in objects) {
        obj.drag()
    }
}

interface Draggable {
    // val dragSpeed : Int  ... Interface cannot have state. TODO("Need to confirm it in kotlin")
    fun drag()          // By default, it is Abstract
}

/*
interface Cloneable{
    fun clone()
}
*/

abstract class Shapes : Draggable, Cloneable {      //  A class can implement multiple interfaces

    abstract fun calculatePoints(): Double
}

class SmileyCircles(private val radius: Double) : Shapes() {

    override fun calculatePoints(): Double {
        return PI * radius * radius
    }

    override fun drag() = println("Circle is Dragging")
}

class GrumpySquares(private val side: Double) : Shapes() {

    override fun calculatePoints(): Double {
        return side * side
    }

    override fun drag() = println("Square is Dragging")
}

class ConfusedTriangles(private val base: Double, private val height: Double) : Shapes() {

    override fun calculatePoints(): Double {
        return 0.5 * base * height
    }

    override fun drag() = println("Triangle is Dragging")
}

class Player(val name: String) : Draggable {

    override fun drag() = println("$name is Dragging")
}