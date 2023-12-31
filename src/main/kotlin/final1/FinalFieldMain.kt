package final1

class FinalFieldMain {
    fun run() {
        println("생성자 초기화")
        val constructInit1 = ConstructInit(10)
        val constructInit2 = ConstructInit(20)
        println(constructInit1.value)
        println(constructInit2.value)

        println("필드 초기화")
        val fieldInit1 = FieldInit()
        println(fieldInit1.value)

        println("상수")
        println(FieldInit.CONST_VAL)

        println("최상위 필드 상수")
        println(CONST_VAL_PUBLIC)
    }
}

fun main() {
    FinalFieldMain().run()
}