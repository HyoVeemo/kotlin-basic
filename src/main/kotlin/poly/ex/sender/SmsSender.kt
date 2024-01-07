package poly.ex.sender

class SmsSender : Sender {
    override fun sendMessage(message: String) {
        println("SMS을 발송합니다: $message")
    }
}