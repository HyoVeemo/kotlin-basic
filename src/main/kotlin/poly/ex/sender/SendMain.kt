package poly.ex.sender

class SendMain {
    fun run() {
        val senders = arrayOf<Sender>(EmailSender(), SmsSender(), FaceBookSender())
        senders.forEach { it.sendMessage("환영합니다.") }
    }
}

fun main() {
    SendMain().run()
}