package poly.car1

class Model3Car : Car {
    override fun startEngine() {
        println("Model3Car.startEngine")
    }

    override fun offEngine() {
        println("Model3Car.offEngine")
    }

    override fun pressAccelerator() {
        println("Model3Car.pressAccelerator")
    }

}