package final1

class ConstantMain {
    // 최대 인원수를 수정하면 여러번 수정해야함
    fun run() {
        println("프로그램 최대 참여자 수 : ${Constant.MAX_USERS}")
        var currentUserCount = 999

        process(currentUserCount++)
        process(currentUserCount++)
        process(currentUserCount++)
    }

    fun process(currentUserCount: Int) {
        println("참여자 수: $currentUserCount")
        if (currentUserCount > Constant.MAX_USERS) {
            println("대기자로 등록합니다. ")
        } else {
            println("게임에 참여합니다.")
        }
    }
}

fun main() {
    ConstantMain().run()
}