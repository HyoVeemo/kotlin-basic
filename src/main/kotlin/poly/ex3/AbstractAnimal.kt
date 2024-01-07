package poly.ex3

abstract class AbstractAnimal {
    abstract fun sound()
    fun move() {
        println("동물이 움직입니다")
    }
}