package poly.car0

class Driver {
    private var k3Car: K3Car? = null
    private var model3Car: Model3Car? = null

    fun setK3Car(k3Car: K3Car?) {
        this.k3Car = k3Car
    }

    fun setModel3Car(model3Car: Model3Car?) {
        this.model3Car = model3Car
    }


    fun drive() {
        println("자동차 운전합니다.")
        if (k3Car != null) {
            k3Car?.run {
                startEngine()
                pressAccelerator()
                offEngine()
            }
            return
        } else if (model3Car != null) {
            model3Car?.run {
                startEngine()
                pressAccelerator()
                offEngine()
            }
        } else {
            println("차가 없습니다..")
        }
    }
}