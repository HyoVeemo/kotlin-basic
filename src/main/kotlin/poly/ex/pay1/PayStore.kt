package poly.ex.pay1

abstract class PayStore {
    companion object {

        fun findPay(option: String): Pay {
            return when (option) {
                "kakao" -> KakaoPay()
                "naver" -> NaverPay()
                "newPay" -> NewPay()
                else -> DefaultPay()
            }
        }
    }
}