package poly.ex.pay0

class PayService {
    fun processPay(option: String, amount: Int) {
        var result: Boolean = false
        println("결제를 시작합니다. option: $option, amount: $amount")
        if (option == "kakao") {
            val kakaoPay = KakaoPay()
            result = kakaoPay.pay(amount)
        } else if (option == "naver") {
            val naverPay = NaverPay()
            result = naverPay.pay(amount)
        } else {
            println("결제 수단이 없습니다. ")
        }

        if (result) {
            println("결제가 성공했습니다.")
        } else {
            println("결제가 실패했습니다.")
        }

    }
}