package poly.ex6

abstract class AbstractAnimal {
    abstract fun sound()
    fun move() {
        println("동물이 이동합니다.")
    }
}