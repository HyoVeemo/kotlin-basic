package oop

class MusicPlayerMain3 {
    fun run() {
        val data = MusicPlayerData()

        on(data)
        volumnUp(data)
        volumnUp(data)
        volumnDown(data)
        volumnDown(data)
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

    fun volumnUp(data: MusicPlayerData) {
        data.volumn++
        println("볼륨 증가: ${data.volumn}")
    }

    fun volumnDown(data: MusicPlayerData) {
        data.volumn--
        println("볼륨 감소: ${data.volumn}")
    }

    fun showStatus(data: MusicPlayerData) {
        println(data.isOn)
    }
}

fun main(args: Array<String>) {
    MusicPlayerMain3().run()
}