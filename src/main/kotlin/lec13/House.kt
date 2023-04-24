package lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    /*
     Java 의 static 중첩 클래스 (권장)
     */
    /*class LivingRoom(
        private val area: Double
    )*/

    // Java 의 내부 클래스 (권장X)
    inner class LivingRoom(
        private val area: Double,
    ) {
        val address: String
            get() = this@House.address // 바깥 클래스 참조
    }
}

/**
 * Java) 클래스 안의 static 클래스 -> 바깥 클래스 참조 없음 (권장) / Kotlin) 클래스 안의 클래스 ->  바깥 클래스 참조 없음 (권장)
 * Java) 클래스 안의 클래스 -> 바깥 클래스 참조 있음 / Kotlin) 클래스 안의 inner 클래스 -> 바깥 클래스 참조 있음
 */