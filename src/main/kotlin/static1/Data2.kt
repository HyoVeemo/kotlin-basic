package static1

class Data2(val name: String, var counter: Counter) {
    init {
        counter.count++
    }
}