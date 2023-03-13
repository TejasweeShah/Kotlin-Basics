package object_oriented_programming

/**
 * ## Visibility Modifiers
 *
 * ### Visibility Modifiers Inside Classes and Interfaces
 *
 * public :    Visible to any client who can see the declaring class
 *
 * private :    Visible inside the class only
 *
 * protected :  Visible inside the class and its subclasses
 *
 * internal :   Visible to any client inside the module that can see the declaring class
 *
 */

open class Base() {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    protected fun e() { }     // visible to the Base and the Derived class
}

class Derived: Base() {

    // a, c, d, and e() of the Base class are visible
    // b is not visible

    override val c = 9        // c is protected
}

fun main(args: Array<String>) {
    val base = Base()

    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
}