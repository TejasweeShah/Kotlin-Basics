package object_oriented_programming

/**
 * ## Nested Class & Inner Class
 *
 * Similar like Java, Kotlin allows you to define a class within another class known as nested class.
 * The nested classes in Kotlin do not have access to the outer class instance.
 *
 */


class Outer {

    val a = "Outside Nested class."

    inner class Inner {
        fun callMe() = a
    }
}

fun main() {

    val outer = Outer()
    println("Using outer object: ${outer.Inner().callMe()}")

    val inner = Outer().Inner()
    println("Using inner object: ${inner.callMe()}")
}
