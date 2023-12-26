package contruct

class MemberInitMain1 {
    fun run() {
        val member1 = MemberInit()
        member1.age = 10
        member1.grade = 90
        member1.name = "user1"

        val member2 = MemberInit()
        member2.age = 10
        member2.grade = 90
        member2.name = "user2"

        val members = arrayListOf(member1, member2)
        for (member in members) {
            print("이름 : ${member.name}, 나이 : ${member.age}, 성적 ${member.grade}")
        }
    }
}