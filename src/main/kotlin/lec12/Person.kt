package lec12

fun main() {
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int,
) {
    /**
     * companion object ~= static
     * 클래스와 동행하는 유일한 오브젝트
     * 인터페이스 구현 가능
     */
    companion object Factory : Log {
        /**
         * const : 컴파일 시 변수 할당
         * 기본 타입과 String 에만 사용 가능
         */
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory 에요")
        }
    }
}

// Singleton
object Singleton {
    var a: Int = 0
}