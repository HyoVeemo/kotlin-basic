package poly.car1

class Driver {
    private var car: Car? = null

    fun setCar(car: Car?) {
        println("자동차 설정: $car")
        this.car = car
    }

    fun drive() {
        println("자동차를 운전합니다. ")
        car?.run {
            startEngine()
            pressAccelerator()
            offEngine()
        }
    }
}