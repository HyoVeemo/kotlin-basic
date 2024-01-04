package extend1.overriding

class CarMain {
    fun run() {
        val electricCar: Car = ElectricCar() // 호출 시 부모 타입인데도 자식의 메서드가 호출되는 이유는?
        electricCar.move()

        val gasCar = GasCar()
        gasCar.move()
    }
}

fun main() {
    CarMain().run()
}