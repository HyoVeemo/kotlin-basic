package poly.car1

class NewCar : Car {
    override fun startEngine() {
        println("NewCar.startEngine")
    }

    override fun offEngine() {
        println("NewCar.offEngine")
    }

    override fun pressAccelerator() {
        println("NewCar.pressAccelerator")
    }
}