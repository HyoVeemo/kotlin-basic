package poly.ex.pay1

class DefaultPay : Pay {
    override fun pay(amount: Int): Boolean {
        println("결제 수단이 없습니다.")
        return false
    }
}