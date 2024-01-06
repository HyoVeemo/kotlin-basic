package poly.basic

class CastingMain2 {
    fun run() {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        val poly: Parent = Child()

        // 단, 자식의 기능은 사용할 수 없다.
        // poly.childMethod()

        // 다운캐스팅(부모 타입 -> 자식 타입)
        val child: Child = poly as Child
        child.childMethod()

        // 일시적 다운캐스팅 - 해당 메서드를 호춣하는 순간만 다운캐스팅
        // 코틀린에서는 as 를 사용한 이후부터 Child 타입으로 사용하기 때문에 다름
        // (poly as Child).childMethod()
    }
}

fun main() {
    CastingMain2().run()
}