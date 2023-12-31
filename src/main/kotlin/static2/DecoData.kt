package static2

class DecoData {
    private var instanceValue: Int = 0

    companion object {
        //        instanceValue++ // 인스턴스 변수 접근 compile error
        //        instanceMethod() // 인스턴스 메서드 접근 compile error
        var staticValue = 0
        fun staticCall() {
            staticValue++ // 정적 변수 접근
            staticMethod()
        }

        fun staticCall(data: DecoData) {
            data.instanceCall()
            data.instanceValue++
        }
        
        private fun staticMethod() {
            println("staticValue= $staticValue")
        }
    }

    fun instanceCall() {
        instanceValue++
        instanceMethod()

        staticValue++
        staticMethod()
    }

    private fun instanceMethod() {
        println("instanceValue= $instanceValue")
    }
}