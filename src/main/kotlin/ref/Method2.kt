package ref

class Method2 {
    fun run() {
        val student1 = createStudent(name = "학생1", grade = 90, age = 15)
        val student2 = createStudent(name = "학생2", grade = 98, age = 16)

        printStudent(student1)
        printStudent(student2)
    }

    fun printStudent(student: Student) {
        println("이름: ${student.name} 나이: ${student.age} 성적: ${student.grade}")
    }

    fun createStudent(name: String, age: Int, grade: Int): Student {
        return Student(name, age, grade)
    }
}

fun main(args: Array<String>) {
    Method2().run()
}