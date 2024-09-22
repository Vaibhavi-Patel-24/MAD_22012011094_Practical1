
class Car(type: String, model:String, price:Double, currentPrice:Double, owner: String,milesDriven:Double){
    val type:String
    val model:String
    val price:Double
    val currentPrice:Double
    val owner:String
    val milesDriven:Double

    init {
        this.type = type
        this.model = model
        this.price = price
        this.currentPrice= currentPrice
        this.owner = owner
        this.milesDriven = milesDriven

    }
    fun showInfo(){
        println("Car Information: $type,$model")
        println("Car Owner: $owner")
        println("Miles Driven: $milesDriven")
        println("Original Car Price: $price")
        println("Current Car Price: $currentPrice")
    }
}

fun main(){

    val car1 = Car("BMW","2018",400000.0,399800.0,"vaibhavi",20.0)
    val car2 = Car("Toyota","2019",1080000.0,1079000.0,"Krish",100.0)

    car1.showInfo()
    car2.showInfo()
    
}