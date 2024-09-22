fun main(){
    println("Enter Number")
    val num = readLine()!!.toInt()
    println(
        if (num % 2 == 0)
        {
            "Even"
        }
        else
        {
            "Odd"
        }
    )
}