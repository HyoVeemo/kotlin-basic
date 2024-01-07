package poly.ex2

class AnimalPolyMain {
    fun run() {
        val dog = Dog()
        val cow = Cow()
        val cat = Cat()

        soundAnimal(dog)
        soundAnimal(cow)
        soundAnimal(cat)
    }

    fun soundAnimal(animal: Animal) {
        println("동물 소리 테스트 시작")
        animal.sound()
        println("동물 소리 테스트 끝")
    }
}

fun main() {
    AnimalPolyMain().run()
}