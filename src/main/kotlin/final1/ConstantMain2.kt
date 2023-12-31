package final1

class ConstantMain2 {
    fun run() {
        println("프로그램 최대 참여자 수 : 1000")
        var currentUserCount = 999

        process(currentUserCount++)
        process(currentUserCount++)
        process(currentUserCount++)
    }

    fun process(currentUserCount: Int) {
        println("참여자 수: $currentUserCount")
        if (currentUserCount > 1000) {
            println("대기자로 등록합니다. ")
        } else {
            println("게임에 참여합니다.")
        }
    }
}

fun main() {
    ConstantMain2().run()
}