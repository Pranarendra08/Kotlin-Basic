class Animal(name: String, weigth: Double, age: Int){
    private val name: String
    val weigth: Double
    val age: Int
    var isMamal: Boolean

    init {
        this.weigth = if (weigth < 0) 0.1 else weigth
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMamal = false
    }

    constructor(name: String, weigth: Double, age: Int, isMamal: Boolean): this(name, weigth, age){
        this.isMamal = isMamal
    }
}


//val Animal.getAnimalInfo : String
//    get() = "nama: ${this.name}, berat: ${this.weigth}, umur: ${this.age}, mamalia: ${this.isMamal}"

//{
//    fun eat(){
//        println("$name makan!")
//    }
//
//    fun sleep() {
//        println("$name tidur")
//    }
//}