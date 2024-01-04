package extend1.ex1

class CarMain {
    fun run() {
        val electricCar = ElectricCar()
        electricCar.move()
        electricCar.charge()
        
        val gasCar = GasCar()
        gasCar.move()
        gasCar.charge()
    }
}

fun main() {
    CarMain().run()
}