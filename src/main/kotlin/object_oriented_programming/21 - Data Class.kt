package object_oriented_programming

/**
 * ## Data Class
 *
 * Data class's main purpose is to hold data.
 * Data classes make it easy to create classes that are used to store values.
 * Such classes are automatically provided with methods for copying, getting a string
 * representation, and using instances in collections. You can override these methods with
 * your own implementations in the class declaration.
 *
 * * The primary constructor needs to have at least one parameter.
 *
 * * All primary constructor parameters need to be marked as val or var.
 *
 * * Data classes cannot be abstract, open, sealed, or inner.
 *
 */

data class POJOUser(        // Define a data class with the data modifier.
    val name: String,
    val id: Int
){
    // Override the default equals method by declaring users equal if they have the same id.
    override fun equals(other: Any?) =
        other is POJOUser && other.id == this.id
}


fun main() {
    val user = POJOUser("Alex", 1)
    println(user)     // Method toString is auto-generated, which makes println output look nice.

    val secondUser = POJOUser("Alex", 1)
    val thirdUser = POJOUser("Max", 2)

    // Our custom equals considers two instances equal if their ids are equal.
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())    // Data class instances with exactly matching attributes have the same hashCode.
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())    // Auto-generated copy function makes it easy to create a new instance.
    println(user === user.copy())     // copy creates a new instance, so the object and its copy have distinct references.
    println(user.copy(name = "Max"))    // When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
    println(user.copy(id = 3))     // Use copy with named arguments to change the value despite the properties order.


    // ComponentN() and De-structuring declarations
    // ComponentN() functions let you get the values of properties in the order of declaration.
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")


    val someUser = POJOUser("Jane", 35)
    val (name, age) = someUser
    println("$name, is : ${someUser.component2()} years")
}