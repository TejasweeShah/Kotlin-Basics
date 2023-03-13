package object_oriented_programming

/**
 * ## Getters & Setters
 *
 *
 */
class Aquarium{
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    val volume
        get() = length * width * height

    var aquariumName: String = "Default Aquarium Name"
        set(value) {
            if(value.length < 4){
                println("OPPPSS !! Name cannot be less than 4 characters")
            }else{
                field = value
            }
        }

    fun fillContents() {
        println("Aquarium is Filled")
    }

    fun open() {
        println("Aquarium Opened")
    }

}

fun main() {
    val aquarium1 = Aquarium()

    aquarium1.height = 7
    println("Height: ${aquarium1.height}")
    println("Length: ${aquarium1.length}")
    println("Width: ${aquarium1.width}")
    println("Volume: ${aquarium1.volume}")

    aquarium1.aquariumName = "Box"
    println("Name: ${aquarium1.aquariumName}")

    aquarium1.open()
    aquarium1.fillContents()
}