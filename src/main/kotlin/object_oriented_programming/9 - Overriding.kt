package object_oriented_programming

/**
 *  ## Overriding
 */

fun main() {

    val generalMobile = Mobile("General Mobile")
    generalMobile.makeCall()
    generalMobile.powerOff()
    generalMobile.display()
    generalMobile.camera()

    println()

    val onePlusMobile = OnePlus("One Plus Smartphone")
    onePlusMobile.makeCall()
    onePlusMobile.powerOff()
    onePlusMobile.display()
    onePlusMobile.camera()
}

open class Mobile(type : String) {
    open val name : String = "Default Mobile"
    private val size : Int = 5

    init {
        println("Making type : $type.")
        println("Name: $name & Size : $size")
    }

    fun makeCall() = println("Calling . . . ")
    fun powerOff() = println("Going Down . . . ")
    open fun display() = println("Simple Display!")
    open fun camera(){
        val noOfCameras = 2
        // println("${noOfCameras+additional} Cameras :: Default - $noOfCameras Additional - $additional " )
        println("Default Cameras : $noOfCameras")
    }
}

class OnePlus(typeParam: String ) : Mobile(typeParam) {
    override val name: String
        get() = "Default OnePlus"

    override fun display() {
        println("Overriding Simple Display by OnePlus Style display")
    }

    override fun camera() {
        super.camera()

        val additional = 2
        println("Additional OnePLus cameras : $additional")
    }
}