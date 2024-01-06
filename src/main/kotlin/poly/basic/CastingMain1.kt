package poly.basic

class CastingMain1 {
    fun run() {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        val poly: Parent = Child()

        // 단, 자식의 기능은 사용할 수 없다.
        // poly.childMethod()

        // 다운캐스팅(부모 타입 -> 자식 타입)
        val child: Child = poly as Child // java: (Child)poly
        child.childMethod()
    }
}

fun main() {
    CastingMain1().run()
}