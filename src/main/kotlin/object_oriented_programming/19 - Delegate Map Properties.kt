package object_oriented_programming

/**
 * ## Delegate MAP properties
 *
 * Property delegation can be used for storing properties in a map. This is handy for tasks like parsing JSON or doing other "dynamic" stuff.
 *
 * You can delegate mutable properties to a map as well. In this case, the map will be modified upon property assignments. Note that you will need MutableMap instead of read-only Map.
 */

class User(private val map: Map<String, Any?>) {
    val name: String by map           // 1 Delegates take values from the map by the string keys - names of properties.
    val age: Int by map           // 1 Delegates take values from the map by the string keys - names of properties.
}

fun main() {
    val user = User(
        mapOf(
            "name" to "John Doe", "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
}