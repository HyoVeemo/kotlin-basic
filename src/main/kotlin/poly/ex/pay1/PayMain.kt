package poly.ex.pay1

class PayMain {
    fun run() {
        val payService = PayService()

        // kakao 결제
        val payOption1 = "kakao"
        val amount1 = 5000
        payService.processPay(payOption1, amount1)

        // naver 결제
        val payOption2 = "naver"
        val amount2 = 10000
        payService.processPay(payOption2, amount2)

        // 잘못된 결제 수단
        val payOption3 = "bad"
        val amount3 = 15000
        payService.processPay(payOption3, amount3)

        // newPay 결제
        payService.processPay("newPay", 20000)
    }
}

fun main() {
    PayMain().run()
}