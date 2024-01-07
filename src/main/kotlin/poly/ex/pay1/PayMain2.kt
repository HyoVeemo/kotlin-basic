package poly.ex.pay1

import java.util.*

class PayMain2 {
    fun run() {
        val payService = PayService()
        val scanner = Scanner(System.`in`)

        while (true) {
            println("결제 수단을 입력하세요")
            val payOption = scanner.nextLine()

            if (payOption == "exit") {
                println("프로그램 종료")
                return
            }

            println("결제 금액을 입력하세요")
            val amount = scanner.nextInt()
            payService.processPay(payOption, amount)
        }

    }
}

fun main() {
    PayMain2().run()
}