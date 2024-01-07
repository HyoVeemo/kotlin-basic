package poly.ex.pay1

class PayService {
    fun processPay(option: String, amount: Int) {
        println("결제를 시작합니다. option: $option, amount: $amount")
        val pay = PayStore.findPay(option)
        val result = pay.pay(amount)

        printResult(result)
    }


    private fun printResult(result: Boolean) {
        if (result) {
            println("결제가 성공했습니다.")
        } else {
            println("결제가 실패했습니다.")
        }
    }
}