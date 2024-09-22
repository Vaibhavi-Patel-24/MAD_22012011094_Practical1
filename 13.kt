open class Product(
    val productName: String,
    val quantity: Int
) {
    var amountPerQuantity: Double = 0.0


    constructor(productName: String, quantity: Int, amountPerQuantity: Double) : this(productName, quantity) {
        this.amountPerQuantity = amountPerQuantity
    }


    open fun displayProductInfo() {
        println("Product Name: $productName")
        println("Quantity: $quantity")
        println("Amount per Quantity: $amountPerQuantity")
    }
}


class Laptop(
    productName: String,
    quantity: Int,
    amountPerQuantity: Double,
    val cpuName: String
) : Product(productName, quantity, amountPerQuantity) {

    var ramSize: Int = 0
    var hddSize: Int = 0


    constructor(
        productName: String, quantity: Int, amountPerQuantity: Double,
        cpuName: String, ramSize: Int, hddSize: Int
    ) : this(productName, quantity, amountPerQuantity, cpuName) {
        this.ramSize = ramSize
        this.hddSize = hddSize
    }


    override fun displayProductInfo() {
        super.displayProductInfo()
        println("CPU Name: $cpuName")
        println("RAM Size: $ramSize GB")
        println("HDD Size: $hddSize GB")
    }
}

fun main() {

    val laptops = arrayListOf<Laptop>(
        Laptop("Dell XPS", 2, 1200.0, "Intel i7", 16, 512),
        Laptop("HP Spectre", 1, 1400.0, "Intel i5", 8, 256),
        Laptop("MacBook Pro", 3, 2000.0, "Apple M1", 16, 512),
        Laptop("Acer Aspire", 5, 800.0, "AMD Ryzen 5", 8, 256),
        Laptop("Lenovo ThinkPad", 2, 1100.0, "Intel i7", 16, 1024)
    )


    for (laptop in laptops) {
        println("\nLaptop Information:")
        laptop.displayProductInfo()
    }
}
