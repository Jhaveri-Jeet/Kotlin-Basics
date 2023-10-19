// We all know the simple data types kotlin as all of them

fun main() {

    // :Int is the way to give a variable the data type
    var number: Int = 10
    // :Int? will allow to store nullable values
    var num: Int? = null

    var long: Long = 123456L
    var float: Float = 23.2f
    var result: Boolean = false
    var letter: Char = '6'
    var name: String = "Jeet Jhaveri"

    // If you want an array with any kind of data
    var array = arrayOf(1, "jeet", 'g')
    //If you want an array with a specific kind of data
    var newArray: Array<Int> = arrayOf(1, 2, 3)

    // To convert a letter to integer
    var letterToInt: Int = letter.digitToInt()

    // $ sign will allow you to call the variable inside the string and you can also make ${} to do various operations with variables
    println("Integer : $number")
    println("Long : $long")
    println("Float : $float")
    println("Boolean : $result")
    println("Letter : $letter")
    println("String : $name")
    println("Array : ${array[0]}")
    println("Letter to Integer : $letterToInt")

}