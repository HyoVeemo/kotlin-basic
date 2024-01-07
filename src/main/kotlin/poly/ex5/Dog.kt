package poly.ex5

class Dog : InterfaceAnimal {

    override fun sound() {
        println("멍멍")
    }

    override fun move() {
        println("개 이동")
    }
}