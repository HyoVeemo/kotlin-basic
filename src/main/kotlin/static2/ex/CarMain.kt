package static2.ex

class CarMain {
    fun run() {
        val car1 = Car("K3")
        val car2 = Car("G80")
        val car3 = Car("Model Y")

        Car.showTotalCars()
    }
}

fun main() {
    CarMain().run()
}