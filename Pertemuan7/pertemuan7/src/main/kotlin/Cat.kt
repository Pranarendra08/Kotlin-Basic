class Cat(
    name: String,
    numOfFeet: Int,
    isMamal: Boolean
//    pWeight: Double,
//    pAge: Int,
//    pIsCarnivore: Boolean,
//    val furColor: String,
//    val numberOfFeet: Int
)
    : Animal(name, numOfFeet, isMamal) {

    override fun eat() {
        println("$name sedang makan ikan")
    }

//    override fun sleep() {
//        println("$name sedang tidur di bantal")
//    }
//
//    fun playWithHUman() {
//        println("$name bermain dengan manusia")
//    }
}