fun main() {
    var x = 5
    var y = 10

    println("Before Swapping:")
    println("x = $x, y = $y")

    // Swapping without a third variable
    x = x + y  // x becomes 15
    y = x - y  // y becomes 5
    x = x - y  // x becomes 10

    println("After Swapping without a third variable (using arithmetic):")
    println("x = $x, y = $y")
}
//fun main() {
//    var a = 5
//    var b = 10
//
//    println("Before Swapping:")
//    println("a = $a, b = $b")
//
//    // Swapping using a third variable
//    val temp = a
//    a = b
//    b = temp
//
//    println("After Swapping using a third variable:")
//    println("a = $a, b = $b")
//}
