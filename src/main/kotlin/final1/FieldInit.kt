package final1

class FieldInit {
    // final int value = 10
    val value = 10

    companion object {
        // static final int CONST_VALUE = 10
        const val CONST_VAL = 10
    }
}

// 추가
// kotlin const val 은 최상위에서 사용
const val CONST_VAL_PUBLIC = 10
// = public static final int CONST_VAL = 10