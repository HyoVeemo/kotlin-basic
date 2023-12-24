package class1

// 배열 적용
class ClassStart2 {
    fun run(){
        val studentNames = listOf("학생1", "학생2")
        val studentAges = listOf(15)
        val studentGrades = listOf(90)

        for(i in 0..studentNames.size){
            print("이름: ${studentNames[i]}")
        }
    }
}

fun main(args: Array<String>) {
 ClassStart2().run()
}