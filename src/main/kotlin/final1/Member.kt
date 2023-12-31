package final1

class Member(
    val id: String,
    var name: String
) {
    fun changeData(id: String, name: String) {
        // this.id = id
        this.name = name
    }

    fun print() {
        println("id: $id, name: $name")
    }

}