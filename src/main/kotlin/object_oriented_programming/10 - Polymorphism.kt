package object_oriented_programming

import kotlin.math.PI

/**
 * ## Polymorphism
 * ### (Poly means MANY Morph means FORMS) Method name is same but it will behave differently based on the object.
 *
 * Parent can hold the reference to its child class ( i.e. reference variable can be of parent class and call child class method)
 *
 * Parent class can call child class (which are common - between that parent and child(ones which child inherited from parent class))
 *
 */

fun main() {

    val circle: Shape = RoundCircle(5.0)
    println("Area of Circle : ${circle.area()}")

    val square: Shape = PerfectSquare(5.0)
    println("Area of Square : ${square.area()}")

    val rtTriangle: Shape = RightAngleTriangle(5.0, 7.0)
    println("Area of Triangle : ${rtTriangle.area()}")

    println()

    val shapes = arrayOf(
        RoundCircle(3.0),
        PerfectSquare(7.0),
        RightAngleTriangle(8.0, 2.0),
        RoundCircle(45.0),
        RightAngleTriangle(10.0, 5.0)
    )
    calculateAreas(shapes)
}

fun calculateAreas(shapes: Array<Shape>) {

    for (shape in shapes) {
        println("Area of ${shape.javaClass.simpleName} : ${shape.area()} ")
    }
}

open class Shape {

    open fun area(): Double = 0.0

}

class RoundCircle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return PI * radius * radius
    }
}

class PerfectSquare(private val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class RightAngleTriangle(private val base: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}