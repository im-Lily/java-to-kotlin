package lec12

fun main() {
    // 익명 클래스 
    moveSomething(object : Movable {
        override fun move() {
            println("move move")
        }

        override fun fly() {
            println("fly fly")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}