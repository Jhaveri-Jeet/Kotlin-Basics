//Example of Function Overloading
class calc {
    fun add(num1: Int, num2: Int) {
        println("The answer of your addition is : ${num1 + num2}")
    }

    fun add(num1: Int, num2: Int, num3: Int) {
        println("The answer of your addition is : ${num1 + num2 + num3}")
    }
}


//Example of Function Overriding
open class ParentClass {
    open fun display() {
        println("This is an Parent Class")
    }
}

class ChildClass : ParentClass() {
    override fun display() {
        println("This is an Child Class")
    }
}

fun main() {
    val obj = calc()
    obj.add(2, 2)
    obj.add(2, 2, 2)

    val obj2 = ChildClass()
    obj2.display()
}