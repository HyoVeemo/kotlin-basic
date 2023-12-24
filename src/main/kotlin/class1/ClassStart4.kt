package class1

class ClassStart4 {
    fun run(){
        val student1 = Student(name = "학생1", grade = 90, age = 15);
        val student2 = Student(name = "학생2", grade = 98, age = 16);

        val students = mutableListOf<Student>()
        students += student1
        students += student2

//        println("이름: ${students[0]} 나이: ${students[0]} 성적: ${students[0]}")

        for( student in students){
            println("이름: ${student.name} 나이: ${student.age} 성적: ${student.grade}")
        }

    }
}

fun main(args: Array<String>) {
    ClassStart4().run()
}