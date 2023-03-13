package object_oriented_programming

import kotlin.math.sqrt

/**
 * Class : A blueprint of Object (Such as Aquarium Plan)
 *
 * Objects : Instances of a Class (i.e. Actual Aquarium)
 *
 * Properties : Characteristics of Class (i.e. Aquarium length, height, width etc.)
 *
 * Methods : Functionality of the Class (i.e. What the object could do ?? like fillWithWater())
 *
 * Interfaces : Specifications that a Class can implement (Clean -> Cleaning is common to many things and can  happen in similar ways and Aquarium "COULD IMPLEMENT IT")
 *
 */

fun main() {

    val rectangleObject = Rectangle(4.0, 5.0)
    println("PERIMETER : ${rectangleObject.perimeter()}")
    println("AREA : ${rectangleObject.area()}")
    println("Remark : ${rectangleObject.isSquare()}")

    val circleObject = Circle(6.0)

    val triangleObject = Triangle(2.0, 5.0, 5.0)
    println("PERIMETER : ${triangleObject.perimeter()}")
    triangleObject.area()

}

class Rectangle(
    private val rLength: Double, private val rBreadth: Double
) {
    init {
        println("Rectangle Created: Length = $rLength & Breadth = $rBreadth")
    }

    fun perimeter() = 2 * (rLength + rBreadth)

    fun area() = rLength * rBreadth

    fun isSquare() = if (rLength == rBreadth) "ITS A SQUARE TOO" else "A TRUE RECTANGLE"

}

class Circle(
    private val cRadius: Double
) {
    private val pi = Math.PI

    init {
        println("Circle Created with Radius = $cRadius")
        println("PERIMETER : ${perimeter()}")
        println("AREA : ${area()}")

    }

    private fun perimeter() = 2 * cRadius * pi

    private fun area() = pi * cRadius * cRadius
}

class Triangle(
    private val tSide1: Double, private val tBase: Double, private val tSide2: Double
) {
    init {
        println("Triangle Created : Side 1 = $tSide1, Base = $tBase & Side 3 = $tSide2")
    }

    fun perimeter() = tSide1 + tBase + tSide2

    fun area() {
        val tPerimeter = perimeter()
        val tArea =
            sqrt((tPerimeter / 2) * ((tPerimeter / 2) - tSide1) * ((tPerimeter / 2) - tBase) * ((tPerimeter / 2) - tSide2))
        println("AREA : $tArea")
    }
}