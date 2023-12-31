package static2

class DecoMain1 {
    fun run() {
        val str = "hello java"
        val utils = DecoUtil1()
        val deco = utils.deco(str)

        println("before: $str")
        println("after: $deco")
    }
}

fun main() {
    DecoMain1().run()
}