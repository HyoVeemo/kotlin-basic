package poly.diamond

class Child : InterfaceA, InterfaceB {
    override fun methodA() {
        println("Child.methodA")
    }

    override fun methodCommon() {
        println("Child.methodCommon")
    }

    override fun methodB() {
        println("Child.methodB")
    }
}