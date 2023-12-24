package oop

class ValueData(
    var value: Int
) {
    fun add() {
        value++
        println("숫자 증가")
    }
}