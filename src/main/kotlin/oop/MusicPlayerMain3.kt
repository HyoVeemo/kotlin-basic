package oop

class MusicPlayerMain3 {
    fun run() {
        val data = MusicPlayerData()

        on(data)
        volumeUp(data)
        volumeUp(data)
        volumeDown(data)
        volumeDown(data)
        off(data)
    }

    fun on(data: MusicPlayerData) {
        data.isOn = true
        println("음악 플레이를 시작 ")
    }

    fun off(data: MusicPlayerData) {
        data.isOn = false
        println("음악 플레이 종료")
    }

    fun volumeUp(data: MusicPlayerData) {
        data.volume++
        println("볼륨 증가: ${data.volume}")
    }

    fun volumeDown(data: MusicPlayerData) {
        data.volume--
        println("볼륨 감소: ${data.volume}")
    }

    fun showStatus(data: MusicPlayerData) {
        println(data.isOn)
    }
}

fun main(args: Array<String>) {
    MusicPlayerMain3().run()
}