package Inheritance

fun main() {
    val derived = Derived()
    derived.foo()

    val p = Parrot()
    p.fly()
    println(p.color)
}
open class Base{
    val x = 10
}
class Derived: Base() {
    fun foo() {
        println("x is equal to " + x)
    }
}
open class Bird {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}
interface Duck {
    fun fly() {
        println("Duck is flying...")
    }
}
class Parrot: Bird(),Duck {
    override var color = "Green"
    override fun fly() {
        super<Bird>.fly()
        super<Duck>.fly()
        println("Parrot is flying...")

    }
}  