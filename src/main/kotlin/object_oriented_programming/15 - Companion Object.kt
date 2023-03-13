package object_oriented_programming

/**
 * ## Companion Object
 *
 * companion Keyword -
 *
 * Only one companion object is allowed in one Class
 *
 * @JvmStatic
 */

fun main() {

    // Calling create with factory reference
    val pizza1 = Pizza.Factory.create("Marinara")
    println(pizza1)

    //Add companion keyword to remove factory reference
    val pizza2 = Pizza.create("Paneer")
    println(pizza2)

    // Additional : If we want everyone to call this method when they Pizza, for that we will mark the constructor as private
    // val pizza3 = Pizza() // Now, each object needs to call create method
    // i.e. everyone needs to call Factory


}


class Pizza private constructor(private val type: String, private val toppings: String) {
    companion object Factory {
        fun create(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Marinara" -> Pizza("Marinara", "Tomato, Cheese")
                "Paneer" -> Pizza("Paneer", "Paneer, Onion, Capsicum, Tomato, Cheese")
                else -> Pizza("Basic", "Cheese")
            }
        }
    }

    override fun toString(): String {
        return "PIZZA : $type - TOPPINGS : $toppings"
    }
}