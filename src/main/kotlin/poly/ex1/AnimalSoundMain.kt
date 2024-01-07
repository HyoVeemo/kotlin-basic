package poly.ex1

class AnimalSoundMain {
    fun run() {
        val dog = Dog()
        val cow = Cow()
        val cat = Cat()

        println("동물 소리 테스트 시작")
        dog.sound()
        println("동물 소리 테스트 종료")

        // 메서드 분리로 중복 제거: 타입별로 메서드를 만들어야 함
        soundCat(cat)
        soundCow(cow)

        // 배열로 중복 제거도 불가
//        val cowArr = listOf<Cow>(dog, cow, cat)
    }

    fun soundCow(cow: Cow) {
        println("동물 소리 테스트 시작")
        cow.sound()
        println("동물 소리 테스트 종료")
    }

    fun soundCat(cat: Cat) {
        println("동물 소리 테스트 시작")
        cat.sound()
        println("동물 소리 테스트 종료")
    }

}

fun main() {
    AnimalSoundMain().run()
}