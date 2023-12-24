package ref

class NullMain {
    fun run() {
        var data: Data? = null
        data?.value = 10
    }
}

class NullMain2 {
    fun run() {
        val bigData = BigData(1, null)

        println(bigData.count)
        println(bigData.data)
        println(bigData.data!!.value)
    }
}

fun main(args: Array<String>) {
    NullMain2().run()
}