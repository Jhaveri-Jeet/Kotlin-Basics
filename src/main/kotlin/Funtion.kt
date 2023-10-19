// We can make the functions using "fun" keyword

// Simple function
fun doSomething() {
    println("This is a normal function")
}

// Function with arguments
fun addition(num1: Int, num2: Int) {
    var sum = num1 + num2
    println("This is the answer of your addition: $sum")
}

// Function which have a return type
fun subtraction(num1: Int, num2: Int): Int {
    var sub = num1 - num2
    return sub
}

// Function which have the arguments with default values
fun defaultAddition(num1: Int = 10, num2: Int = 10) {
    var sum = num1 + num2
    println("The answer will be : $sum")
}

// Function which will add the numbers which will be inserted while calling the function
fun sum(vararg numbers: Int) {
    var addition: Int = 0
    for (number in numbers) {
        addition += number
        println("The addition will be : $addition")
    }
}

// Function which will take numbers from the user and add them
fun userAddition() {
    print("Enter number 1 : ")
    var number1 = readln().toInt()
    print("Enter number 2 : ")
    var number2 = readln().toInt()

    var addition = number1 + number2
    println("This will be the answer of your addition : $addition")

}

// Main Function
fun main() {
    doSomething()
    addition(10, 10)
    var ans = subtraction(20, 10)
    println("This is the answer of your subtraction : $ans")
    defaultAddition()
    sum(10, 20, 30)
    userAddition()
}