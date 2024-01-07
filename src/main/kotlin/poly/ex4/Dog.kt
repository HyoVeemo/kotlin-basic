package poly.ex4

class Dog : AbstractAnimal() {

    override fun sound() {
        println("멍멍")
    }

    override fun move() {
        println("개 이동")
    }
}