package final1


class FinalLocalMain {
    fun run() {
        // final 지역 변수(val 이 final 에 해당한다)
        val data = 10
//        data1 = 20  // 컴파일 오류

        // final 지역 변수 2
        val data2 = 30
        method(data2)
    }

    fun method(param: Int) {
//        param = 20
    }
}

fun main() {

}