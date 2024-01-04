package extend1.overriding

class ElectricCar : Car() {

    // 'movee' overrides nothing
    override fun move() {
        println("전기차를 빠르게 이동합니다")
    }

    fun charge() {
        println("차를 충전합니다")
    }
}