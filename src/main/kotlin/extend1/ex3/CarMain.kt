package extend1.ex3

class CarMain {
    fun run() {
        val electricCar = ElectricCar()
        electricCar.move()
        electricCar.charge()
        electricCar.openDoor()

        val gasCar = GasCar()
        gasCar.move()
        gasCar.fillUp()
        gasCar.openDoor()

        val hydrogenCar = HydrogenCar()
        hydrogenCar.move()
        hydrogenCar.openDoor()
        hydrogenCar.fillHydrogen()
    }
}

fun main() {
    CarMain().run()
}