package oop.ex

class Rectangle(
    val width: Int,
    val height: Int,
) {
    fun calculateArea(): Int {
        return width * height
    }

    fun calculatePerimeter(): Int {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        return width == height
    }
}