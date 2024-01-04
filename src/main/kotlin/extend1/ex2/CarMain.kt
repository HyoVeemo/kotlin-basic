package extend1.ex2

class CarMain {
    fun run() {
        val electricCar = ElectricCar()
        electricCar.move()
        electricCar.charge()

        val gasCar = GasCar()
        gasCar.move()
        gasCar.fillUp()
    }
}

fun main() {
    CarMain().run()
}