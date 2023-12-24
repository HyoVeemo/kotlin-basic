package ref

class MethodChange1 {
    fun run() {
        var a = 10
        println("메서드 호출 전: $a")
        changePrimitive(a)
        println("메서드 호출 후: $a")

    }

    fun changePrimitive(x: Int) {
//        x = 30
//        kotlin 에서는 파라미터가 기본적으로 변경 불가능
    }
}


class MethodChange2 {
    fun run() {
        var a = Data(10)
        println("메서드 호출 전: ${a.value}")
        changeReference(a)
        println("메서드 호출 후: $a.value")

    }

    fun changeReference(x: Data) {
        x.value = 30
    }
}
