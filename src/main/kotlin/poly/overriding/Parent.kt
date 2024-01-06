package poly.overriding

open class Parent {
    open var value: String = "parent"

    open fun method() {
        println("Parent.method")
    }
}