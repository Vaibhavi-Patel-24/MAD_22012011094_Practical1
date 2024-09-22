fun main() {
    println("Enter the number")
    val num = readLine()!!.toInt()

    println("factorial of $num = ${fact(num)}")
}
fun fact(num:Int):Int{
    if(num == 0 || num == 1)
    {
        return 1
    }
    else
    {
        return num*fact(num-1)
    }

}