package poly.ex.pay1

class NewPay : Pay {
    override fun pay(amount: Int): Boolean {
        println("NewPay 시스템과 연결합니다.")
        println("$amount 원 결제를 시도합니다.")
        return true
    }
}