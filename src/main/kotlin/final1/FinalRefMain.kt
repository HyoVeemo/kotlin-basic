package final1

class FinalRefMain {
    fun run() {
        // 참조 대상 변경 불가능
        val data = Data()
        // data = Data

        // 참조 대상의 값은 변경 가능
        data.value = 10
        println("${data.value}")
        data.value = 20
        println("${data.value}")
    }
}

fun main() {
    FinalRefMain().run()
}