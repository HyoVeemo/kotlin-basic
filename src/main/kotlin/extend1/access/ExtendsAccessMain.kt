package extend1.access

import extend1.access.child.Child

class ExtendsAccessMain {
    fun run() {
        val child = Child()
        child.call()
    }
}

fun main() {
    ExtendsAccessMain().run()
}