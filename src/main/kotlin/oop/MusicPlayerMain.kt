package oop

class MusicPlayerMain {
    // 음악 플레이어를 절차적으로 작성하기
    fun run() {
        var volumn = 0
        var isOn = false

        // 켜기
        isOn = true
        println("음악 플레이를 시작 ")

        // 볼륨 증가
        volumn++
        println("볼륨 증가: $volumn")
        volumn++
        println("볼륨 증가: $volumn")

        // 볼륨 감소
        volumn--
        println("볼륨 감소: $volumn")
        volumn--
        println("볼륨 감소: $volumn")

        // 음악 플레이어 상태
        println(isOn)

        // 플레이어 끄기
        println("음악 플레이 종료")
        isOn = false
    }
}