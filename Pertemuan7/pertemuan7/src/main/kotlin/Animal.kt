open class Animal(
    val name: String,
    val numOfFeet: Int,
    val isMamal: Boolean
//    val weight: Double,
//    val age: Int,
//    val isCarnivore: Boolean
//    private var name: String
) {
    open fun eat(/*jenisMakanan : String, typeFood: String*/) {
        println("$name sedang makan")
    }

//    fun eat(typeFood: String) {
//        println("$name memakan $typeFood")
//    }
//
//    fun eat(typeFood: String, quantity: Double) {
//        println("$name memakan $typeFood sebanyak $quantity gram")
//    }

    open fun sleep() {
        println("$name sedang tidur")
    }
}