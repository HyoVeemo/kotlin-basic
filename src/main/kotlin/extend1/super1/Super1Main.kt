package extend1.super1

class Super1Main {
    fun run() {
        val child = Child()
        child.call()
    }
}

fun main() {
    Super1Main().run()
}
