package poly.overriding

class OverridingMain {
    fun run() {
        // 자식 변수가 자식 인스턴스 참조
        val child = Child()
        println("Child -> Child")
        println("value = ${child.value}")
        child.method()

        // 부모 변수가 부모 인스턴스 참조
        val parent = Parent()
        println("Parent -> Parent")
        println("value = ${parent.value}")
        parent.method()

        // 부모 변수가 자식 인스턴스 참조
        val poly: Parent = Child()
        println("Parent -> Child")
        // 변수 오버라이딩 (java 에서는 변수 오버라이딩 안되지만 코틀린에서는 명시적으로 필드 오버라이딩)
        println("value = ${poly.value}")
        poly.method()// 메서드 오버라이딩
    }
}

fun main() {
    OverridingMain().run()
}