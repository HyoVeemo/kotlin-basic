package poly.car1

class CarMain1 {
    fun run() {
        val driver = Driver()

        // 차량 선택
        val k3Car = K3Car()
        driver.setCar(k3Car)
        driver.drive()

        // 차량 변경(k3 -> model3)
        val model3 = Model3Car()
        driver.setCar(model3)
        driver.drive()

        // 차량 변경(model3 -> newCar)
        driver.setCar(NewCar())
        driver.drive()
    }
}

fun main() {
    CarMain1().run()
}