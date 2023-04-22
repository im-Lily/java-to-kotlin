package lec09

fun main() {
    val person = Person("lily", 20)
    println(person.name) // getter
    person.age = 100 // setter
    println(person.age)

    Person()
}

/**
 * 생성자는 위에 선언, 생략 가능
 * 프로퍼티 (getter, setter) 자동 생성
 * */


/*class Person constructor(name: String, age: Int) {
    val name = name // 불변 (final)
    var age = age // 가변
}*/




/**
 * 클래스의 필드 선언과 생성자 동시에 선언 가능
 */
class Person(name: String, var age: Int) {

    /**
     * 주생성자에서 받은 name 을 불변 프로퍼티 name 에 바로 대입
     * custom getter 사용
     */

    /*val name: String = name
        get() = field.uppercase()*/

    /*fun getUppercaseName(): String {
        return this.name.uppercase()
    }*/

/*    val uppercaseName: String
        get() = this.name.uppercase()*/

    // setter 사용 지양
    var name: String = name
        set(value) {
            field = value.uppercase()
        }


    /**
     * init 블록은 생성자가 호출되는 시점에 호출
     * 생성 시점에 나이 검증
     */
    init {
        if (age < 0) {
            throw java.lang.IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    /**
     * 부생성자 (두번째 생성자)
     * this 로 주생성자 호출
     */
    constructor(name: String) : this(name, 1) {
        println("첫번째 부생성자")
    }

    constructor() : this("jeong") {
        println("두번째 부생성자")
    }

    /*fun isAdult(): Boolean {
        return this.age >= 20
    }*/

    // custom getter : 프로퍼티 접근
    /*val isAdult: Boolean
        get() = this.age >= 20
    */

    // custom getter
    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
}

