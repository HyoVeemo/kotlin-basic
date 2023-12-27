package access

class SpeakerMain {
    fun run() {
        val speaker = Speaker(90)
        speaker.volumeUp()
        speaker.showVolume()

        speaker.volumeDown()
        speaker.showVolume()

        // 필드에 직접 접근 불가
        // println("필드 직접 접근 수정")
        // speaker.volume += 100
        speaker.showVolume()
    }
}

fun main() {
    SpeakerMain().run()
}