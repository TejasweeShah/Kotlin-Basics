package object_oriented_programming

/**
 * ## Object Declaration
 *
 * Class (like structure) and its Single Object is created at once. (Can make ONLY ONE object of that type)
 *
 * No Constructors are allowed. (init block is allowed)
 *
 * Singleton pattern.
 * Example :- We need only one instance of Database or Logger per application.
 *
 * You can inherit class or interface
 *
 *
 */

fun main() {

    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()

    SharingWidget.incrementTwitterLike()
    SharingWidget.incrementTwitterLike()
    SharingWidget.incrementTwitterLike()

    SharingWidget.displayLikes()

}

object SharingWidget {

    init {
        println("Initialized: $SharingWidget")
    }

    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLike() = twitterLikes++
    fun incrementFbLike() = fbLikes++

    fun displayLikes() {
        println("FB : $fbLikes 👍🏼 & Twitter : $twitterLikes 👍🏼")
    }

}