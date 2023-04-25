package lec14

fun main() {
    val dto1 = PersonDto(name = "lily", age = 20)
    val dto2 = PersonDto("lily", 20)
    println(dto1 == dto2)
    println(dto1)
}

/*
 * data 키워드를 붙여주면 equals, hashCode, toString 을 자동으로 생성해줌
 */
data class PersonDto(
    val name: String,
    val age: Int
)