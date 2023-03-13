package object_oriented_programming

/**
 * ## Abstract Class
 *
 * An abstract class cannot be instantiated (you cannot create objects of an abstract class).
 * However, you can inherit subclasses from can them.
 * Abstract classes are always open. You do not need to explicitly use open keyword to inherit
 * subclasses from them.
 *
 * The members (properties and methods) of an abstract class are non-abstract unless you
 * explicitly use abstract keyword to make them abstract.
 *
 */

fun main() {

    val coffeeMachine1 = PremiumCoffeeMachine(1000.0, "Silver")
    val machineInfo1 = coffeeMachine1.machineInfo()
    println(machineInfo1)
    coffeeMachine1.makeCoffee("CAPPUCCINO")

    println("\n")

    val coffeeMachine2 = SimpleCoffeeMachine(600.0, "Gold")
    val machineInfo2 = coffeeMachine2.machineInfo()
    println(machineInfo2)
    coffeeMachine2.makeCoffee("EXPRESSO")

}

/**
 * An abstract class BaseCoffeeMachine is created. You cannot create objects of the class.
 *
 * The class has an abstract property and/or an abstract method.
 * It doesn't have any implementation and must be overridden in its subclasses.
 *
 * The class can have a non-abstract property and/or a non-abstract method.
 * If you need to override these members in the subclass, they should be marked with open keyword.
 *
 */
abstract class BaseCoffeeMachine(
    private val prize: Double, private val color: String
) {
    abstract val brandName: String

    abstract fun makeCoffee(type: String)

    open fun machineInfo(): String {
        return "Coffee Machine Details : \n" + " Price : $prize \n" + " Color : $color"
    }
}


class PremiumCoffeeMachine(
    prize: Double,
    color: String,
) : BaseCoffeeMachine(prize, color) {
    override val brandName
        get() = "Premium Brand"

    override fun makeCoffee(type: String) {
        println("Making.... Coffee....")
        println("Your $type is Ready ☕️")
    }

    override fun machineInfo(): String {
        return super.machineInfo() + "\n Brand Name : $brandName"
    }
}

class SimpleCoffeeMachine(
    prize: Double, color: String
) : BaseCoffeeMachine(prize, color) {
    override val brandName
        get() = "Simple Brand"

    override fun makeCoffee(type: String) {
        println("Making.... Coffee....")
        Thread.sleep(4000)
        println("Your $type is Ready ☕️")
    }

    override fun machineInfo(): String {
        return super.machineInfo() + "\n Brand Name : $brandName"
    }
}