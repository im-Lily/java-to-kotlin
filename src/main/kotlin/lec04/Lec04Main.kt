package lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    /**
     * 객체 비교 시 비교 연산자를 사용하면 자동으로 compareTo 호
     */
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money5) // 주소 비교 (동일성)
    println(money3 == money5) // 값 비교 (동등성)

    // lazy 연산
    if (fun1() || fun2()) {
        println("본문")
    }

    if (fun1() && fun2()) {
        println("본문")
    }

    val money6 = Money(1_000L)
    val money7 = Money(2_000L)

//    println(money6.plus(money7))
    println(money6 + money7) // 연산자 오버로딩
}

fun fun1(): Boolean {
    println("fun 1")
    return  true
}

fun fun2(): Boolean {
    println("fun 2")
    return  false
}