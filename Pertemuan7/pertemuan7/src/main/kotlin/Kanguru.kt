class Kanguru(
    name: String,
    numOfFeet: Int,
    isMamal: Boolean
) : Animal(name, numOfFeet, isMamal) {
    override fun eat() {
        println("kanguru $name makan rumput")
    }
}