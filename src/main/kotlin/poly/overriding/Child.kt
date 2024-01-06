package poly.overriding

class Child : Parent() {
    override var value = "child"
    override fun method() {
        println("Child.method")
    }
}