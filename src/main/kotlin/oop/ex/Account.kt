package oop.ex

class Account(
    var balance: Int,
) {
    fun deposit(amount: Int) {
        balance += amount
        println("$amount 원 입금 - 잔액: $balance 원")
    }

    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("잔액 부족! : $balance 원")
            return
        }
        balance -= amount
        println("$amount 원 출금 - 잔액: $balance 원")
    }

    fun showBalance() {
        println("잔액: $balance")
    }


}