package oop.ex

class AccountMain {
    fun run() {
        val account = Account(10000)

        val arr = IntArray(5)
        account.withdraw(9000)
        account.withdraw(2000)
        account.showBalance()
    }
}

fun main() {
    AccountMain().run()
}