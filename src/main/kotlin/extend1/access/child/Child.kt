package extend1.access.child

import extend1.access.parent.Parent

class Child : Parent() {
    fun call() {
        publicValue = 1
        protectedValue = 1 // 상속 관계 or 같은 패키지
        internalValue = 1 // 패키지가 달라도 같은모듈 안
        // privateValue = 1 // 접근 불가, 컴파일 오류

        publicMethod()
        protectedMethod()
        internalMethod()

        printParent()

    }
}