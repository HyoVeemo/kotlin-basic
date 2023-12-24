package class1

class ClassStart1 {
    fun run(){
        val student1Name = "학생1"
        val student1Age = 15
        val student1Grade = 90

        val student2Name = "학생2"
        val student2Age = 15
        val student2Grade = 90

        println("이름: $student1Name 나이: $student1Age 성적: $student1Grade}")
        println("이름: $student2Name 나이: $student2Age 성적: $student2Grade}")

    }

}
fun main(args: Array<String>) {
    ClassStart1().run()
}