package poly.basic

class CastingMain5 {
    fun run() {
        val parent1: Parent = Parent()
        call(parent1)
        val parent2: Parent = Child()
        call(parent2)
    }

    fun call(parent: Parent) {
        if (parent is Child) { // smart casting
            println("Child 인스턴스임")
            parent.childMethod()
        } else {
            println("Child 인스턴스 아님")
        }
    }
}

fun main() {
    CastingMain5().run()
}