package lec11

class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price // getter 는 public
    private set // setter 는 private

}