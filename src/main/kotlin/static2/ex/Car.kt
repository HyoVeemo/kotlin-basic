package static2.ex

class Car(val name: String) {
    companion object {
        var count = 0
        fun showTotalCars() {
            println("구매한 차량 수: $count")
        }

    }

    init {
        println("차량 구입, 이름: $name")
        count++
    }
}