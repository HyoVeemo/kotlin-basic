package contruct

class MemberInit {
    var name: String? = null
    var grade: Int? = null
    var age: Int? = null

    fun initMember(name: String, grade: Int, age: Int) {
        this.name = name
        this.grade = grade
        this.age = age
    }
}