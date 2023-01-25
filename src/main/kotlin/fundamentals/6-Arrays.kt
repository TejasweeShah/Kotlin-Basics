package fundamentals

/**
 * ## ARRAY
 * Arrays in Kotlin are represented by the Array class. It has get() and set() functions that turn into [] by operator overloading conventions, and the size property, along with other useful member functions:
 *
 * Kotlin also has classes that represent arrays of primitive types without boxing overhead: ByteArray, ShortArray, IntArray, and so on. These classes have no inheritance relation to the Array class, but they have the same set of methods and properties.
 */

fun main() {

    val intArr1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (item in intArr1){
        print("$item ")
    }
    println()

    val stringArr = arrayOf("One","Two","Three","Four","Five","Six")
    for ((index,item) in stringArr.withIndex()){
        println("$index. $item")
    }

    val intArr2 = intArrayOf(10,9,8,7,6,5,4,3,2,1)
    val valToFind = 15
    println("Array size of array : ${intArr2.size}")
    println("First Element of array : ${intArr2.first()}")
    println("Last Element of array : ${intArr2.first()}")
    println("Find element in array : ${intArr2.find { it == valToFind }}")
    println("Find First Odd Number : ${intArr2.find { it % 2 != 0 }}")
    println("Find First Even Number : ${intArr2.find { it % 2 == 0 }}")
    println("Find ALL Even NumberS : ${intArr2.filter { it % 2 == 0 }}")


    val charArr1 = charArrayOf('a','e','i','o','u')
    println(charArr1)

    var charArr2 = CharArray(5) {'*'}
    charArr2.forEach { print("$it ") }

    println()

    val charArr3 = "abcdefghijklmnopqrstuvwxyz".toCharArray()
    charArr3.forEach { print("$it ") }

    println()
    charArr2 = "aeiou".toCharArray()
    println("Vowels: ${charArr2.contentToString()}")
    println("Consonants : ${charArr3.filterNot { charArr2.contains(it) }}")

}