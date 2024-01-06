package poly.basic

class PolyMain {
    fun run() {
        // 부모 타입의 변수가 부모 인스턴스 참조
        println("Parent -> Parent")
        val parent = Parent()
        parent.parentMethod()

        // 자식 타입의 변수가 자식 인스턴스 참조
        println("Child -> Child")
        val child = Child()
        child.parentMethod()
        child.childMethod()

        // 부모 타입의 변수가 자식 인스턴스 참조
        println("Parent -> Child")
        val poly: Parent = Child()
        poly.parentMethod()
        // 자식의 기능은 호출할 수 없다. 컴파일 오류
//        poly.childMethod()

        // 자식은 부모를담을 수 없다. 컴파일 오류
//        val child2: Child = Parent()

    }
}

fun main() {
    PolyMain().run()
}