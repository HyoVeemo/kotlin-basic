package poly.ex3


class AbstractMain {
    fun run() {
        // 추상 클래스 생성 불가
//         AbstractAnimal()
        val dog = Dog()
        val cat = Cat()
        val cow = Cow()

        cat.sound()
        cat.move()

        soundAnimal(dog)
        soundAnimal(cat)
        soundAnimal(cow)


    }

    fun soundAnimal(animal: AbstractAnimal) {
        println("동물 소리 테스트 시작")
        animal.sound()
        println("동물 소리 테스트 끝")
    }
}

fun main() {
    AbstractMain().run()
}