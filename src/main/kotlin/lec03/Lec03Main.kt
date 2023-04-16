package lec03

fun main() {
    /* 명시적 형변환
    val number1 = 3
    val number2: Long = number1.toLong()
    */

    // null 이 들어올 경우 safe call 과 elvis 연산자 사용
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0
    println(number2)

    printAgeIfPerson2(null)

    val person = Person("lily", 100)
    println("이름: ${person.name}")

    val name = "lily"
    val str =
    """
        abc
        def
        ${name}
    """.trimIndent()

    println(str)

    val str2 = "ABCDE"
    println(str2[0])
    println(str2[3])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) { // java 의 instanceof
        /* 생략 가능
        val person = obj as Person // java 의 (Person) obj
        println(person.age)
        */
        println(obj.age) // 스마트 캐스트
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}