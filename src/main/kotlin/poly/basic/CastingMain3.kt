package poly.basic

// upcasting vs  downCasting
class CastingMain3 {
    fun run() {
        val child = Child()
        val parent1 = child as Parent// 업캐스팅은 생략가능하지만 생략 권장
        val parent2: Parent = child // 업캐스팅 전략

        parent1.parentMethod()
        parent2.parentMethod()
    }
}

fun main() {
    CastingMain3().run()
}