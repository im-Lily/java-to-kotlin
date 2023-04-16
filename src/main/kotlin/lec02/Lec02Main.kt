package lec02

fun main() {

    val str: String? = "ABC" // null 이 가능한 변수
//    println(str.length) 불가능
    println(str?.length) // safe call

    /* safe call & elvis 연산
     * 연산 결과가 null 이면 0 출
     */
    val str2: String? = null
    println(str2?.length ?: 0)

    println(startsWith4(null)) // NPE

    /**
     * @Nullable 인 경우 컴파일 에러 발생
     * @Notnull 로 수정 -> 만약, null 이 들어올 경우, NPE
     */
    val person = Person("공부하는 개발자")
    startsWith5(person.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")

    /*if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
    */
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")

    /*if (str == null) {
        return null
    }
    return str.startsWith("A"
    */
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A")
        ?: false

    /*if (str == null) {
        return false
    }
    return str.startsWith("A")*/
}

fun startsWith4(str: String?): Boolean {
    return str!!.startsWith("A") // null 타입이지만, 절대 null 이 아닐 경우
}

fun startsWith5(str: String): Boolean {
    return str.startsWith("A")
}