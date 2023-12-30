package access.ex

class MaxCounterMain {
    fun run() {
        val counter = MaxCounter(3)
        counter.increment()
        counter.increment()
        counter.increment()
        counter.increment()
        println("count: ${counter.getCount()}")
    }
}

fun main() {
    MaxCounterMain().run()
}