package object_oriented_programming

/**
 * ## Constructors :
 * A constructor is a concise way to initialize class properties.
 * It is a special member function that is called when an object is instantiated (created).
 *
 * ### Default Constructor :: When we don't define any constructor, Default Constructor is called.
 *
 * ### Primary Constructor :: A concise way to initialize a class
 *
 * ### Secondary Constructor
 *
 * ### init block
 *
 */

fun main() {

    // Calls Primary Constructor
    var car1 = Automobile("Car 1", 4,5,true,"Petrol")
    var car2 = Automobile("Car 2", 4,5,true,"Diesel")

    // Calls Default Constructor
    var driver1 = Driver()

    // Calls Primary Constructor
    var driver2 = Driver("Joe",12)
    var driver3 = Driver("Anamika", 25)


    // Calls Secondary Constructor
    var car3 = Automobile("Car 2","Diesel")
}

class Automobile(           // Primary CConstructor
    private val name : String = "Factory Car",
    val tyres : Int,
    private val maxSeating : Int,
    hasAirbags : Boolean,       // Not a property(doesn't have a val/var before it), just a parameter
    private val engineType : String
){
    val airBag = hasAirbags
    init {          // Initializer block allows to run some set os statements every time an object is created.
        println("$name is Created! Its a $engineType  Car with $maxSeating Seats")
    }

    constructor(nameParam: String, engineParam: String)         // Secondary Constructor
            : this(nameParam, 4,5,true,engineParam)     // Secondary  Const. eventually calls Primary Constructor
    {
        println("This is a Secondary Constructor Car! Remodeling Done :)")
    }
    fun startEngine() = println("Engine Started")
    fun brake() = println("BRAKEE!!!")
    fun drive() = println("There we go...")

}

class Driver( nameParam: String = "Default Driver", ageParam: Int = 0){   // nameParam and ageParam are not properties,
    private val name : String = nameParam               // name is a property of the class and will be initialized with corresponding param sent in constructor
    private val age = ageParam
    private var canDrive =  ageParam > 18           // Evaluated Property

    init {
        if (canDrive)
            println("$name is Ready to Drive.")
        else
            println("$name Cannot drive. Age : $age")

    }
}