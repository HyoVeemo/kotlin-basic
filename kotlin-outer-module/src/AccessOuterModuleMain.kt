import access.a.AccessData


fun main() {
    val data = AccessData()
    // public
    data.publicField = 1
    data.publicMethod()

    // 같은 모듈 internal 호출 가능
//    data.internalField = 2
    data.innerAccess()

    // private 호출 불가
    // data.privateField
    data.privateMethod()

    data.innerAccess()
}