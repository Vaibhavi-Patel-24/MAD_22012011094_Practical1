fun main(){
    val Array_1 = arrayListOf<Int>()
    print("enter how many numbers do you want to enter?")
    val size = readLine()!!.toInt()

    if(size>0){
        for(i in 1..size){
            print("enter $i number:")
            val number = readLine()!!.toInt()
            Array_1.add(number)
        }
        val maxnumber = Array_1.max()
        println("maxnumber = $maxnumber")
    }

}