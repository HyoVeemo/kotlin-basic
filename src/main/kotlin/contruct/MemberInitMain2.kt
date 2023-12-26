package contruct

class MemberInitMain2 {
    fun run() {
        val member1 = MemberInit()
        initMember(member1, "user1", 10, 90)

        val member2 = MemberInit()
        initMember(member2, "user2", 10, 90)

        val members = arrayListOf(member1, member2)
        for (member in members) {
            print("이름 : ${member.name}, 나이 : ${member.age}, 성적 ${member.grade}")
        }
    }

    fun initMember(member: MemberInit, name: String, grade: Int, age: Int) {
        member.name = name
        member.grade = grade
        member.age = age
    }
}