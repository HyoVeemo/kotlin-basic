package poly.car0

class CarMain0 {
    fun run() {
        val driver = Driver()

        driver.setK3Car(K3Car())
        driver.drive()

        // 추가
        driver.setK3Car(null)
        driver.setModel3Car(Model3Car())
        driver.drive()
    }
}

fun main() {
    CarMain0().run()
}