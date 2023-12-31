package static1


class DataCountMain3 {
    fun run() {
        val data1 = Data3("A")
        // println("A count = ${data1.count}") 호출 할 수 없다. 왜 그렇더라...?

        val data2 = Data3("B")
        println("A count = ${data2.getCount()}")

        // 권장
        val data3 = Data3("C")
        println("A count = ${Data3.count}")
    }
}

fun main() {
    DataCountMain3().run()
}