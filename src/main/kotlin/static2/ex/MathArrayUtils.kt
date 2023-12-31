package static2.ex

class MathArrayUtils private constructor() {

    companion object {
        fun sum(array: IntArray): Int {
            return array.sum()
        }

        fun average(array: IntArray): Double {
            return sum(array).toDouble() / array.size
        }

        fun min(array: IntArray): Int {
            return array.min()
        }

        fun max(array: IntArray): Int {
            return array.max()
        }

    }
}