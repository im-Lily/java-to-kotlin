package lec07

import java.lang.NumberFormatException

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt() // 기본 타입간의 형변환은 toType() 사용
    } catch (e: NumberFormatException) { // 타입이 뒤에 위치
        throw java.lang.IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.") // new 사용X
    }
}

/**
 * 하나의 Expression 은 하나의 return 문으로 선언
 */
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}