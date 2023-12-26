package contruct

class MemberConstruct(name: String, grade: Int, age: Int) {
    var name: String? = null
    var age: Int? = null
    var grade: Int? = null

    init {
        println("생성자 호출")
        this.name = name
        this.grade = grade
        this.age = age
    }

    constructor(name: String, age: Int) : this(name, age, 50) {
        println("부 생성자 호출")
    }
}