package poly.basic

// 다운캐스팅을 자동으로 하지 않는 이유;;
class CastingMain4 {
    fun run() {
        val parent1: Parent = Child()
        val child1: Child = parent1 as Child
        child1.childMethod() // 문제가 없음

        val parent2: Parent = Parent()
//        val child2: Child = parent2 as Child // 런타임 오류 - ClassCastException
//      child2.childMethod() // 실행 불가

        val parent3: Parent = Parent()
        // null 반환
        val child3: Child? = parent2 as? Child
        // 실행 안됨
        child3?.childMethod()
    }
}

fun main() {
    CastingMain4().run()
}