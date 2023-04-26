package lec15

fun main() {
    // 배열 생성
    val array = arrayOf(100, 200)

    // 배열에 값 추가
    array.plus(300)

    // 인덱스 사용
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    // 인덱스와 값 사용
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    // 리스트 생성 (불변)
    val numbers = listOf(10, 20)
    // 빈 리스트 생성 시 타입 지정
//    val emptyList = emptyList<Int>()

    useNumbers(emptyList()) // 타입 추론이 가능할 경우, 생략 가능

    // 하나의 값 가져오기
    println(numbers[0])

    // forEach
    for (number in numbers) {
        println(number)
    }

    // 전통적인 for 문
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    // 리스트 생성 (가변)
    val numbers2 = mutableListOf(100,200)
    numbers2.add(300)

    // set 생성
    val numbers3 = setOf(100, 200)

    for (number in numbers3) {
        println(number)
    }

    for ((idx, value) in numbers3.withIndex()) {
        println("${idx} ${value}")
    }

    // set 생성 (가변)
    val number4 = mutableSetOf<Int>()

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // key-value 형식으로 map 초기화 (불변)
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

}

private fun useNumbers(numbers: List<Int>) {
}