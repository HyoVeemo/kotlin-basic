package poly.ex.sender

class EmailSender : Sender {
    override fun sendMessage(message: String) {
        println("이메일에 발송합니다: $message")
    }
}