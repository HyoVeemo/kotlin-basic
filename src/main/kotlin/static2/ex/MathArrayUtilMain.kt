package static2.ex


import static2.ex.MathArrayUtils.Companion.average
import static2.ex.MathArrayUtils.Companion.max
import static2.ex.MathArrayUtils.Companion.min
import static2.ex.MathArrayUtils.Companion.sum

class MathArrayUtilMain {
    fun run() {
        // MathArrayUtils()
        val values = intArrayOf(1, 2, 3, 4, 5)
        print("sum = ${sum(values)}")
        print("average = ${average(values)}")
        print("min = ${min(values)}")
        print("max = ${max(values)}")
    }
}

fun main() {
    MathArrayUtilMain().run()
}