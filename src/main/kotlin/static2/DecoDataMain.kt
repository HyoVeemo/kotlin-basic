package static2


import static2.DecoData.Companion.staticCall

//import static2.DecoData.Companion.*   - java static import 에서 DecoData.* 와 같이 전체 참조는 안됨

class DecoDataMain {
    
    fun run() {
        println("1. 정적 호출")
        staticCall()

        println("2. 인스턴스 호출")
        val decoData = DecoData()
        decoData.instanceCall()

        println("3. 인스턴스 호출2")
        val decoData2 = DecoData()
        decoData2.instanceCall()

        println("4. 정적 호출2")
        staticCall(decoData2)
        staticCall(decoData2)
        staticCall(decoData2)
        staticCall(decoData2)
        staticCall(decoData2)
        staticCall(decoData2)

        // 추가
        // 인스턴스를 통한 접근
        val decoData3 = DecoData()
        // decoData3.staticCall() java에서는 되지만 코틀린에서는 안된다.

    }
}

fun main() {
    DecoDataMain().run()
}