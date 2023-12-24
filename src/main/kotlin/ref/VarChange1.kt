package ref

class VarChange1 {
    fun run(){
        var a: Int = 10
        var b: Int = a

        println("변경")
        println(a)
        println(b)

        a = 20
        println("변경")
        println(a)
        println(b)


        b = 30
        println("변경")
        println(a)
        println(b)


        // java int vs integer
        // 원시 타입의 래퍼도 값만 복사 하는 구나

    }
}
fun main(args: Array<String>) {
    VarChange1().run()
}