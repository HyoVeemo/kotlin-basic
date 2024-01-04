package extend1.super2

open class ClassB(a: Int) : ClassA() {

    init {
        // 코틀린의 주 생성자는 다른 생성자 호출 불가능
        println("classB 생성자")
    }

    constructor(a: Int, b: Int) : this(a) {
        println("classB 부 생성자")
    }
}