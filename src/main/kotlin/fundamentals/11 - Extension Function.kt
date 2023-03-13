package fundamentals

/**
 * ### Extension Function
 *
 * Suppose, you need to extend a class with new functionalities. In most programming languages,
 * you either derive a new class or use some kind of design pattern to do this.
 *
 * However, in Koltin, you can also use extension function to extend a class with new functionalities. Basically, an extension function is a member function of a class that is defined outside the class.
 *
 * For example, you need to use a method to the String class that returns a new string with first and
 * last character removed; this method is not already available in String class.
 * You can use extension function to accomplish this task.
 *
 */

fun main() {
    val sentence1 = "Hello! to my world. Hope you have a wonderful journey.     "

    println("No of Words in a Sentence :  ${sentence1.countWords()}")
    println("List of Words : ${sentence1.getAllWords()}")
}

fun String.getAllWords(): List<String> {
    return this.trim().split(" ")
}

fun String.countWords(): Int {
    return this.trim().split(" ").size
}