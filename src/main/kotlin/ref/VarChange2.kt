package ref


class VarChange2 {
    fun run() {
        var a: Data = Data(10)
        var b: Data = a

        println("참조값: $a, 값:${a.value}")
        println("참조값: $b, 값:${b.value}")

        a.value = 20
        println("참조값: $a, 값:${a.value}")
        println("참조값: $b, 값:${b.value}")

        b.value = 30
        println("참조값: $a, 값:${a.value}")
        println("참조값: $b, 값:${b.value}")

    }
}

fun main(args: Array<String>) {
    VarChange2().run()
}