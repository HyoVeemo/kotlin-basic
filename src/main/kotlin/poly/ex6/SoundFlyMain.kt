package poly.ex6


class SoundFlyMain {
    fun run() {
        val dog = Dog()
        val bird = Bird()
        val chicken = Chicken()

        soundAnimal(dog)
        soundAnimal(bird)
        soundAnimal(chicken)

        moveAnimal(dog)
        moveAnimal(bird)
        moveAnimal(chicken)

        flyAnimal(bird)
        flyAnimal(chicken)
    }

    fun soundAnimal(animal: AbstractAnimal) {
        println("동물 소리 테스트 시작")
        animal.sound()
        println("동물 소리 테스트 끝")
    }

    fun moveAnimal(animal: AbstractAnimal) {
        println("동물 이동 테스트 시작")
        animal.sound()
        println("동물 이동 테스트 끝")
    }

    fun flyAnimal(fly: Fly) {
        println("날기 테스트 시작")
        fly.fly()
        println("날기 테스트 끝")
    }
}

fun main() {
    SoundFlyMain().run()
}