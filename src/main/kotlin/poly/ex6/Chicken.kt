package poly.ex6

class Chicken : AbstractAnimal(), Fly {
    override fun sound() {
        println("고기요")
    }

    override fun fly() {
        println("닭날기")
    }
}