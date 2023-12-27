package access.a

class AccessData {
    var publicField: Int? = null

    // 코틀린의 default 는 public 이므로 internal 로 대체
    internal var internalField: Int? = null

    private var privateField: Int? = null

    fun publicMethod() {
        println("public 호출 $publicField")
    }

    fun internalMethod() {
        println("internal 호출 $internalField")
    }

    fun privateMethod() {
        println("private 호출 $privateField")
    }

    fun innerAccess() {
        println("내부 호출")
        publicField = 100
        internalField = 200
        privateField = 300
        publicMethod()
        internalMethod()
        privateMethod()
    }
}