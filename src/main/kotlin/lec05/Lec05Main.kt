package lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw java.lang.IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

/**
 * .. : 범위를 나타냄 (~=between)
 */
fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw java.lang.IllegalArgumentException("score의 범위는 0부터 100입니다.")
    }
}

/**
 * 자바와 다르게 1개의 return
 * 3항 연산자 존재X
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 50) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

/**
 * switch 대신 when (특정 값이나 범위로 분기 처리 가능)
 * case 대신 -> 로 분기
 * default 대신 else
 */
fun getGradeWithSwitch(score: Int): String {
    /*
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
    */
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/**
 * java 에서의 instanseof 를 쓰지않아도 is 조건을 충족하면 해당 메서드 호출
 */
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

/**
 * 다중 조건
 */
fun judgeNumber(number: Int) {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("-1, 0, 1이 아닙니다.")
    }
}

/**
 * when 에 값이 없다면 조건을 충족하는 메서드 호출
 */
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }

}