package class1

// 클래스 적용
class ClassStart3 {
    fun run(){
        val student1 = Student(name = "학생", grade = 90, age = 15);
        val student2 = Student(name = "학생", grade = 98, age = 16);

        println("이름: ${student1.name} 나이: ${student1.age} 성적: ${student1.grade}")
        println("이름: ${student2.name} 나이: ${student2.age} 성적: ${student2.grade}")

        // 변수는 객체 인스턴트에 대한 참조값 저장
        println(student1)
        println(student2)

        // dot 키워드를 통해 참조값으로 실제 객체 접근
        student1.name // = @681a9515.name
    }
}

fun main(args: Array<String>) {
    ClassStart3().run()
}