package oop

class MusicPlayer(
    var volumn: Int = 0,
    var isOn: Boolean = false
) {
    fun on() {
        isOn = true

        println("음악 플레이를 시작")
    }

    fun off() {
        isOn = false

        println("음악 플레이를 종료")
    }

    fun volumUp() {
        volumn++
        println("플레이어 볼륨 증가: $volumn")
    }

    fun volumnDown() {
        volumn--

        println("플레이어 볼륨 감소: $volumn")
    }

    fun statusShow() {
        println("플레이어 상태: ${isOn}")
    }
}