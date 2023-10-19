open class Parent {
    fun displayParent(){
        println("This is an Parent Class")
    }
}

class Child : Parent() {
    fun displayChild() {
        println("This is an Child Class")
    }
}

fun main() {
    val child = Child()
    child.displayParent()
    child.displayChild()
}