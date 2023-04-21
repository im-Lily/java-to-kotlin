package lec08

fun main() {
    repeat("Hello")
    /**
     * named argument : 매개변수 이름을 통해 직접 지정 / 지정되지 않은 매개변수는 기본값 사용
     */
    repeat("World", useNewLine = false)

    printNameAndGender(name = "lily", gender = "FEMALE")

    /**
     * Java 의 함수를 사용할 때는 named argument 를 사용할 수 없음
    Lec08Main.repeat(str = "Hello")
     */

    printAll("A", "B", "C") // 바로 값 대입 가능

    /**
     * 가변인자 함수 사용 시 배열을 바로 넣는 대신 스프레드 연산자(*) 사용
     */
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}
/**
 * 함수가 하나의 결과값이라면, block 부분을 = 으로 쓸 수 있음
 * public 접근지시는 생략 가능
 */
/*
fun max(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }
*/

/**
 * = 를 사용하는 경우 반환 타입 생략 가능
 * block {} 을 사용하는 경우, 반환 타입이 Unit 이 아니면 명시적으로 작성 필요
 */
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 *  밖에서 파라미터를 넣어주지 않을 경우, 기본값 사용
 */
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

/**
 * 같은 타입의 여러 파라미터 받기 (가변인자)
 * vararg
 */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}