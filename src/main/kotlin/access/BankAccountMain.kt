package access

class BankAccountMain {
    fun run() {
        val acc = BankAccount()
        acc.deposit(10000)
        acc.withdraw(3000)
        println("balance = ${acc.getBalance()}")
        
        // 유효 검사 메세지
        acc.withdraw(-1000)
    }
}

fun main() {
    BankAccountMain().run()
}