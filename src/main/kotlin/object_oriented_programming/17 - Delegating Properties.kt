package object_oriented_programming

import kotlin.reflect.KProperty

/**
 * ## Delegating Properties
 *
 *
 */

class Kid {
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    override fun toString(): String {
        return "$firstName $lastName"
    }

}

class NameDelegate {

    var formattedValue: String? = null

    operator fun setValue(
        thisRef: Any?, property: KProperty<*>, value: String?
    ) {
        if (value != null && value.length > 5) formattedValue = value.trim().uppercase()
    }

    operator fun getValue(
        thisRef: Any?, property: KProperty<*>
    ): String? {
        return formattedValue
    }
}

fun main() {
    val kid1 = Kid()
    kid1.firstName = "  Jackie  "
    kid1.lastName = " O'Jilly   "
    println("Formatted Student :  $kid1")
}