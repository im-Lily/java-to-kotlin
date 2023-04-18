package lec06

fun main() {

    /**
     * listOf : 리스트 생성
     * : 대신 in
     */
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    /**
     * java = for (int i =1; i<=3; i++)
     */
    for (i in 1..3) {
        println(i)
    }

    /**
     * java = for (int i =3; i>=1; i--)
     */
    for (i in 3 downTo 1) {
        println(i)
    }

    /**
     * java = for (int i =1; i<=5; i+=2)
     */
    for (i in 1..5 step 2) {
        println(i)
    }
}