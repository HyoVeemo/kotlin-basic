package extend1.super1

class Child : Parent() {

    override val value = "Child"
    override fun hello() {
        println("Child.hello")
    }

    fun call() {
        println("this.value= ${this.value}")
        println("super.value= ${super.value}")
        this.hello()
        super.hello()
    }
}