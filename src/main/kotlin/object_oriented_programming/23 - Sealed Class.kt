package object_oriented_programming

/**
 * ## Sealed CLasses
 *
 * Defines a limited Set of classes. Sealed classes let you restrict the use of inheritance. O
 * nce you declare a class sealed, it can only be subclassed from inside the same package where
 * the sealed class is declared.
 * It cannot be subclassed outside the package where the sealed class is declared.
 *
 * Example: When we fetch some data from network, it may lead to Success or Failure.
 * In this case we can define a Sealed class
 *
 * All direct subclasses of a sealed class are known at compile time.
 *
 * No other subclasses may appear outside a module within which the sealed class is defined.
 * For example,
 * third-party clients can't extend your sealed class in their code.
 * Thus, each instance of a sealed class has a type from a limited set that is known
 * when this class is compiled.
 *
 * A sealed class is abstract by itself, it cannot be instantiated directly and can have abstract members.
 *
 * Constructors of sealed classes can have one of two visibilities: protected (by default) or private:
 *
 *
 *
 * ## Sealed Interfaces
 * The same works for sealed interfaces and their implementations:
 * once a module with a sealed interface is compiled, no new implementations can appear.
 *
 * enum classes can't extend a sealed class (as well as any other class),
 * but they can implement sealed interfaces.
 */

sealed class NResponse {             // It's an Abstract class, and we cannot create its object
    class Success(val data: Int) : NResponse()
    data class Failure(val error: Int) : NResponse()
    object Loading : NResponse()
}

fun getSomeResponse(): NResponse {
    val response = (100..1000).random()
    return if (response < 500 ){
        NResponse.Success(response)
    }
    else{
        NResponse.Failure(response)
    }
}


fun main() {

    val someResponse = getSomeResponse()
    when(someResponse){
        is NResponse.Success -> println("Success with code ${someResponse.data}")
        is NResponse.Failure -> println("Failure with code ${someResponse.error}")
        is NResponse.Loading -> println("Loading....")
    }
}