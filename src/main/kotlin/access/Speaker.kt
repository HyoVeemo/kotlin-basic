package access

class Speaker(
    private var volume: Int,
) {
    // 자바 default - 같은 패키지 안에서 호출 허용
    // 코틀린 internal - 같은 프로젝트 모듈 안에서 허용이므로 패키지는 달라도 호출 가능
    // 코틀린의 default 는 public 이고 모든 접근 허용 = 자바 public
    internal var publicVolume: Int = 10
    fun volumeUp() {
        if (volume >= 100) {
            println("음량을 증가할 수 없습니다. 최대 음량입니다.")
        } else {
            volume += 10
            println("음량 10 증가")
        }
    }

    fun volumeDown() {
        volume -= 10
        println("음량 10 감소")
    }

    fun showVolume() {
        println("현재 음량 $volume")
    }
}