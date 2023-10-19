// We can make the class with the help of class keyword
class Person {
    private var name: String = ""
    private var age: Int = 0

    fun setData(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun showData() {
        println("Name : $name")
        println("Age : $age")
    }
}

// Main function
fun main() {
    // We can also make object using this method
    val obj = Person()
    obj.setData("abc", 12)
    obj.showData()
}