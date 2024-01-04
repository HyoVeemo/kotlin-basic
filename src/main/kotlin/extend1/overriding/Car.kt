package extend1.overriding

open class Car {
    // 코틀린은 기본값 final 이기 때문에 open으로 변경해줘야 함
    open fun move() {
        println("차를 이동합니다")
    }

    // 추가
    fun openDoor() {
        println("문을 엽니다")
    }
}