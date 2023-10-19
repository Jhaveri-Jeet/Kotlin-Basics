// In Kotlin there are 2 main mechanisms
// 1st for branching [ if, when ]
// 2nd for looping [ for, while, do-while ]

fun main() {
    var choice: Int = 1
    val array = arrayOf(1, "Jeet", 'J', 123)

    // If Statement
    if (choice == 1) {
        println("The choice is 1")
    } else if (choice == 2) {
        println("The choice is 2")
    } else {
        println("Nothing is been selected")
    }

    // When Statement
    when (choice) {
        1 -> println("The choice is 1")
        2 -> println("The choice is 2")
        else -> println("Nothing is been selected")
    }

    // For Loop
    for (data in array) println("Data of array : $data")

    // While Loop
    while (choice <= 10) {
        println(choice)
        choice++
    }

    // Do-While Loop
    do {
        println(choice)
        choice++
    } while (choice <= 10)

}