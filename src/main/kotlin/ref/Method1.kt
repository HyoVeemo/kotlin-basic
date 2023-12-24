package ref

class Method1 {
    fun run() {
        val student1 = Student(name = "학생1", grade = 90, age = 15)
        val student2 = Student(name = "학생2", grade = 98, age = 16)

        updateStudent(student1, 19, 100)
        updateStudent(student2, 17, 20)

        printStudent(student1)
        printStudent(student2)
    }

    fun printStudent(student: Student) {
        println("이름: ${student.name} 나이: ${student.age} 성적: ${student.grade}")
    }

    fun updateStudent(student: Student, age: Int, grade: Int) {
        student.age = age
        student.grade = grade
    }
}

fun main(args: Array<String>) {
    Method1().run()
}