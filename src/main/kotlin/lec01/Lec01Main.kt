package lec01

fun main() {

    /**
     * 모든 변수 수정 가능 여부(var/val) 명시
     * 컴파일러가 타입 추론
     * primitive type/reference type 구분하지 않아도 됨
     */

    // 가변
    var number1 = 10L
    number1 = 5L

    // 불변 final
    val number2 = 10L

    /**
     * 변수에 null 이 들어갈 경우 "타입?" 사용
     */

    var number3: Long? = 1_000L
    number3 = null

    /**
     * 객체 인스턴스화 시 new X
     */

    var person = Person("lily")
}