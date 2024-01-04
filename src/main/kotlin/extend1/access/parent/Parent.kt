package extend1.access.parent

open class Parent {
    var publicValue: Int? = null
    protected var protectedValue: Int? = null
    private var privateValue: Int? = null
    internal var internalValue: Int? = null

    fun publicMethod() {
        println("Parent.publicMethod")
    }

    protected fun protectedMethod() {
        println("Parent.protectedMethod")
    }

    private fun privateMethod() {
        println("Parent.privateMethod")
    }

    internal fun internalMethod() {
        println("Parent.internalMethod")
    }

    fun printParent() {
        println("==Parent 메서드 안==")
        println("publicValue= $publicValue")
        println("protectedValue= $protectedValue")
        println("privateValue= $privateValue")
        println("internalValue= $internalValue")

        // 부모 메서드 안에서 모두 접근 가능
        publicMethod()
        privateMethod()
        protectedMethod()
        internalMethod()
    }

}