package poly.ex2

class AnimalPolyMain2 {
    fun run() {
        val animalArr: Array<Animal> = arrayOf(
            Dog(),
            Cow(),
            Cat(),
            Duck()
        )

        animalArr.forEach { soundAnimal(it) }

    }

    private fun soundAnimal(animal: Animal) {
        println("동물 소리 테스트 시작")
        animal.sound()
        println("동물 소리 테스트 끝")
    }
}

fun main() {
    AnimalPolyMain2().run()
}