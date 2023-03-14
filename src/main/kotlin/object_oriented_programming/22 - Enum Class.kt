package object_oriented_programming

/**
 * ## Enum
 * The most basic use case for enum classes is the implementation of type-safe enums
 * (set of predefined Constant that compiler already knows)
 *
 * Enum classes are used to model types that represent a finite set of distinct values,
 * such as directions, states, modes, and so forth.
 * Enums may contain properties and methods like other classes,
 * separated from the list of enum constants by a semicolon.
 *
 * Each enum constant is an object. Enum constants are separated by commas.
 *
 * Since each enum is an instance of the enum class, it can be initialized by passing values to Constructors
 *
 * An enum class can implement an interface (but it cannot derive from a class - cannot inherit a class.),
 * providing either a common implementation of interface members for all the entries,
 * or separate implementations for each entry within its anonymous class
 *
 * enum classes can't extend a sealed class (as well as any other class),
 * but they can implement sealed interfaces.
 *
 */



enum class Direction(val degreeNum: Int) {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

}

enum class Days : DaySpecials, SomeInterface{
    SUNDAY {
        override fun eatFruit() {
            println("Fruit of your Choice ")
        }
    },
    MONDAY {
        override fun eatFruit() {
            println("Strawberries")
        }
    },
    TUESDAY{
        override fun eatFruit() {
            println("Bananas")
        }
    },
    WEDNESDAY{
        override fun eatFruit() {
            println("Watermelon")
        }
    },
    THURSDAY{
        override fun eatFruit() {
            println("Mango")
        }
    },
    FRIDAY{
        override fun eatFruit() {
            println("Kiwi")
        }
    },
    SATURDAY{
        override fun eatFruit() {
            println("Pineapple")
        }
    };

    fun formattedDay(){
        println(" DAY is : $this")
    }

    override fun commonFunction() {
        println("common task for all the days Constants by implementing SomeInterface")
    }
}

interface DaySpecials{
    fun eatFruit()
}

interface SomeInterface{
    fun commonFunction()
}

fun main() {

    val day1 = Days.SUNDAY
    println("DAY 1 : $day1")

    Days.values().forEach{
        println(it)
    }

    day1.formattedDay()

    Direction.values().forEach {
        println("$it : ${it.degreeNum} Degree")
    }


}