package lec10

/**
 * extends, implements -> :
 * 상위 클래스의 생성자 바로 호출
 * @Override -> override 지시어
 */
class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}