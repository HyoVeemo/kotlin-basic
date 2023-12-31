package static1


class DataCountMain2 {
    fun run() {
        val counter = Counter()
        val data1 = Data2("A", counter)
        println("A count = ${data1.counter.count}")

        val data2 = Data2("B", counter)
        println("B count = ${data2.counter.count}")

        val data3 = Data2("C", counter)
        println("C count = ${data3.counter.count}")
        // data2 와 무관한 변수 생성
        // 생성자가 복잡해진다
        // data 클래스 안에서 해결하는 것이 바람직하다
    }
}

fun main() {
    DataCountMain2().run()
}