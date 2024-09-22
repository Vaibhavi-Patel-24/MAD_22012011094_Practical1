fun main(){
    var a : Int = 3
    var b: Double = a.toDouble()
    println("Integer =$a")
    println("Integer to Double = $b")
    var s1 : String = "100"
    var c : Int = Integer.valueOf(s1)
    println("String = $s1")
    println("String to Integer = $c")
    var s2 : String = "10.89"
    var d :Double =s2.toDouble()
    println("String=$s2")
    println("String to Double = $d")
}