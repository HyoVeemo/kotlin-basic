package poly.ex6

class Bird : AbstractAnimal(), Fly {
    override fun sound() {
        println("짹짹")
    }

    override fun fly() {
        println("훨훨")
    }
}