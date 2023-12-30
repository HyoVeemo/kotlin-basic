package memory

class JavaMemoryMain2 {
    fun run() {
        println("main start")
        method1()
        println("main end")
    }

    private fun method1() {
        println("method 1 start")
        val data = Data(10)
        method2(data)
        println("method 1 end")
    }

    private fun method2(data: Data) {
        println("method 2 start")
        println("data.value = ${data.getValue()}")
        println("method 2 end")
    }
}

fun main() {
    JavaMemoryMain2().run()
}