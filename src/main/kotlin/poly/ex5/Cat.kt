package poly.ex5

class Cat : InterfaceAnimal {
    override fun sound() {
        println("야옹")
    }

    override fun move() {
        println("고양이 이동")
    }
}