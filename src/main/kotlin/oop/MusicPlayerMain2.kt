package oop

class MusicPlayerMain2 {
    fun run() {
        val data = MusicPlayerData()
        // 켜기
        data.isOn = true
        println("음악 플레이를 시작 ")

        // 볼륨 증가
        data.volume++
        println("볼륨 증가: ${data.volume}")
        data.volume++
        println("볼륨 증가: ${data.volume}")

        // 볼륨 감소
        data.volume--
        println("볼륨 감소: ${data.volume}")
        data.volume--
        println("볼륨 감소: ${data.volume}")

        // 음악 플레이어 상태
        println(data.isOn)

        // 플레이어 끄기
        println("음악 플레이 종료")
        data.isOn = false
    }
}


fun main(args: Array<String>) {
    MusicPlayerMain2().run()
}