package lec16

/**
 * 1. 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다.
 * 2. 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
 * 3. 확장함수는 현재 타입을 기준으로 호출된다.
 */

fun main() {
    var str = "ABC"
    println(str.lastChar()) // String 의 멤버함수처럼 사용 가능
}

// String 클래스 확장함수
fun String.lastChar(): Char {
    return this[this.length - 1]
}