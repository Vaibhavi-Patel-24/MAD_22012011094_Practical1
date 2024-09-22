fun main() {
    println("Enter the MonthNumber")
    val MonthNumber = readLine()!!.toInt()

    val MonthName = when(MonthNumber) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid"
    }
    println(MonthName)
}