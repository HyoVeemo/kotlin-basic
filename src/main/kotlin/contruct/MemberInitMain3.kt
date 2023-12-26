package contruct

class MemberInitMain3 {
    fun run() {
        val member1 = MemberInit()
        member1.initMember("user1", 10, 80)

        val member2 = MemberInit()
        member2.initMember("user1", 10, 80)

        val members = arrayListOf(member1, member2)
        for (member in members) {
            print("이름 : ${member.name}, 나이 : ${member.age}, 성적 ${member.grade}")
        }
    }
}