package ref

class InitMain {
    fun run() {
        val initData = InitData(100)
        println("${initData.value1}, ${initData.value2}")
    }
}


fun main(args: Array<String>) {
    InitMain().run()
}