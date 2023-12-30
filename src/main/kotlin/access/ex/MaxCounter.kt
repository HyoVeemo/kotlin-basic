package access.ex

class MaxCounter(
    private val max: Int
) {
    private var count: Int = 0

    fun increment() {
        if (!validateCount()) {
            println("최대값을 초과할 수 없습니다.")
            return
        }
        count++
    }

    fun getCount(): Int {
        return count
    }

    private fun validateCount(): Boolean {
        return count <= max
    }
}