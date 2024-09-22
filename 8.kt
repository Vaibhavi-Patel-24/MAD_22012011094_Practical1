import java.util.*

fun main(){
    val Array_1 = arrayOf(1,2,3,4,5)
    println(Array_1.joinToString())

    val Array_2 = Array(5){0}
    println(Array_2.joinToString())

    val Array_3 = Array(7) { i -> i}
    println(Array_3.joinToString())
    
    val Array_4 = IntArray(5){0}
    println(Array_4.joinToString())

    val Array_5 = intArrayOf(5, 2, 8, 3, 9)
    for (i in 0..Array_5.lastIndex) {
        println(Array_5[i])
    }

    val array2D_1 = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println(java.util.Arrays.deepToString(array2D_1))

    val array2D_2 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println(array2D_2.contentDeepToString())

    val numbers = IntArray(5)
    println("please enter the values:")
    for (i in 0 until 5) {
        print("Enter value ${i + 1}: ")
        numbers[i] = readLine()!!.toInt()
    }
    println("Values using 'until' statement:")
    for (i in 0 until 5) {
        print("${numbers[i]} ")
    }
    println()
    println("Values using 'downTo' statement:")
    for (i in 4 downTo 0) {
        print("${numbers[i]} ")
    }


    println("**********Shorting with built in function***********")
    val num = intArrayOf(3, 1, 4, 2, 5)
    numbers.sort()
    println(numbers.joinToString(", "))

    println("**********Shorting without built in function********")
    val num1 = intArrayOf(3, 1, 4, 2, 5)
    for (i in 0 until num1.size - 1) {
        for (j in 0 until num1.size - i - 1) {
            if (num1[j] > num1[j + 1]) {
                // Swap elements
                val temp = num1[j]
                num1[j] = num1[j + 1]
                num1[j + 1] = temp
            }
        }
    }
    println(num1.joinToString(", "))



}

