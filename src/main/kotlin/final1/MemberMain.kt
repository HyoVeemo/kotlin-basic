package final1

class MemberMain {
    fun run() {
        val member = Member("myId", "kim")
        member.print()
        member.changeData("id2", "lee")
        member.print()
    }
}

fun main() {
    MemberMain().run()
}