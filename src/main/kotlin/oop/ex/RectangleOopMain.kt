package oop.ex

class RectangleOopMain {
    fun run() {
        val rectangle = Rectangle(1, 2)

        println("넓이 = ${rectangle.calculateArea()}")
        println("둘레 = ${rectangle.calculatePerimeter()}")
        println("정사각형 여부 = ${rectangle.isSquare()}")
    }
}


fun main(args: Array<String>) {
    RectangleOopMain().run()
}