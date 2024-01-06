package poly.basic

// 자바 16 - pattern matching for instance of
class CastingMain6 {
    fun run() {
        val parent1: Parent = Parent()
        call(parent1)
        val parent2: Parent = Child()
        call(parent2)
    }

    fun call(parent: Parent) {
        // child 인스턴스인 경우 childMethod 실행
//        if (parent instanceof Child child) { // java: 확인과 동시에 변수 할당한다.
        if (parent is Child) { // smart casting
            println("Child 인스턴스임")
            parent.childMethod()
        } else {
            println("Child 인스턴스 아님")
        }
    }
}

fun main() {
    CastingMain6().run()
}