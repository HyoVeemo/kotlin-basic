package static1

class Data3(val name: String) {
    companion object {
        var count: Int = 0
    }

    init {
        // Data3.count++
        count++
    }

    fun getCount(): Int {
        return count
    }

}