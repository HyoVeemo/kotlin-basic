package contruct

class MemberThis {
    var nameField: String? = null

    fun initMember(nameParam: String) {
        // this 생략
        nameField = nameParam
    }
}