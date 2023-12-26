package contruct

class ConstructMain2 {
    fun run() {
        val member1 = MemberConstruct("user1", 13, 23)
        val member2 = MemberConstruct("user2", 23)


        val members = arrayListOf(member1, member2)

        for (member in members) {
            print("이름 : ${member.name}, 나이 : ${member.age}, 성적 ${member.grade}")
        }
    }
}

fun main() {
    ConstructMain2().run()
}