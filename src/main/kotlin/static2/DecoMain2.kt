package static2

class DecoMain2 {
    fun run() {
        val str = "hello java"
        val deco = DecoUtil2.deco(str)

        println("before: $str")
        println("after: $deco")
    }
}

fun main() {
    DecoMain2().run()
}