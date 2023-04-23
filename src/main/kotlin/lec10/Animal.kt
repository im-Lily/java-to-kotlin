package lec10

abstract class Animal(

    protected val species: String,
    protected open val legCount: Int, // 프로퍼티 오버라이드 시 open 키워드 필수
) {
    abstract fun move()
}
