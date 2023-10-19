// In kotlin there are 2 types of constructor [ Primary, Secondary ]

// Primary Constructor
class ConstructorPractice(private var name: String, private var age: Int) {
    fun display() {
        println("Primary Constructor")
        println("Name: $name")
        println("Age: $age")
    }
}


// Secondary Constructor
class SecondaryConstrcutor {
    private var name: String = ""
    private var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun display() {
        println("Secondary Constructor")
        println("Name : $name")
        println("Age : $age")
    }
}

fun main() {

    // Primary Constructor Example
    var p1 = ConstructorPractice("abc", 90)
    p1.display()

    // Secondary Constructor Example
    var sc = SecondaryConstrcutor("xyz", 20)
    sc.display()
}