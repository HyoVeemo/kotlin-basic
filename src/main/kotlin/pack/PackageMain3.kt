package pack
// 디렉터리 이름과 같아야 함
// 패키지 이름은 소문자
// 회사 도메인 사용 관례 com.company.myapp
// * 외부 라이브러리 사용시 겹치지 않음

import pack.a.User

class PackageMain3 {
    fun run() {
        // 중복되는 경우 패키지 명시
        val userA = User()
        val userB = pack.b.User()
    }
}

fun main() {
    PackageMain2().run()
}