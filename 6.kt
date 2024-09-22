fun main() {
    println("Enter the first number")
    val a = readLine()!!.toInt()
    println("Enter the second number")
    val b = readLine()!!.toInt()

    println("Addition of $a and $b = ${add(a,b)}")
    println("Subtraction of $a and $b = ${sub(a,b)}")
    println("Multiplication of $a and $b = ${mul(a,b)}")
    println("Division of $a and $b = ${div(a,b)}")

}
fun add(a:Int,b:Int):Int{
    return a+b
}
fun sub(a:Int,b:Int):Int{
    return a-b
}
fun mul(a:Int,b:Int):Int{
    return a*b
}
fun div(a:Int,b:Int):Int{
    return a/b
}