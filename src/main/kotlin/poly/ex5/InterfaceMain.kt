package poly.ex5

class InterfaceMain {
    fun run() {
        // 인터페이스 생성 불가
//        InterfaceAnimal()

        val dog = Dog()
        val cat = Cat()
        val cow = Cow()

        cat.sound()
        cat.move()

        soundAnimal(dog)
        soundAnimal(cat)
        soundAnimal(cow)

        moveAnimal(dog)
        moveAnimal(cat)
        moveAnimal(cow)
    }

    fun soundAnimal(animal: InterfaceAnimal) {
        println("동물 소리 테스트 시작")
        animal.sound()
        println("동물 소리 테스트 끝")
    }

    fun moveAnimal(animal: InterfaceAnimal) {
        println("동물 이동 테스트 시작")
        animal.sound()
        println("동물 이동 테스트 끝")
    }
}

fun main() {
    InterfaceMain().run()
}