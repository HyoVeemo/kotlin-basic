package memory

class JavaMemoryMain1 {
    fun run() {
        println("main start")
        method1(10)
        println("main end")
    }

    fun method1(m1: Int) {
        println("method 1 start")
        val cal = m1 * 2
        method2(cal)
        println("method 1 end")
    }

    fun method2(m2: Int) {
        println("method 2 start")
        println("method 2 end")
    }
}

fun main() {
    JavaMemoryMain1().run()
    // 지역 변수는 스택 영역에서 관리 = 힙 영역은 스택 프레임에 포함된 것?
}