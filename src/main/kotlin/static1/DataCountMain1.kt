package static1


class DataCountMain1 {
    fun run() {
        // Data1 의 누적 개수를 출력하고 싶음
        val data1 = Data1("A")
        println("A count = ${data1.count}")
        val data2 = Data1("B")
        println("B count = ${data2.count}")
        val data3 = Data1("C")
        println("C count = ${data3.count}")
    }
}

fun main() {
    // count = 1,1,1
    // count 변수가 인스턴스별로 새로 만들어진다.
    DataCountMain1().run()
}