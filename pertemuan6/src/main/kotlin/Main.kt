class Animal2{
    var name: String = "MIIAAWWW"
        get() {
            println("fungsi getter terpanggil")
            return field
        }
        set(value) {
            println("fungsi stter terpanggil")
            field = value
        }
}


fun main(args: Array<String>) {
    /*
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())

    val cat = Animal("rendra miaw", 4.2, 2, true)
    println("nama: ${cat.name} /nBerar: ${cat.weigth} /numur: ${cat.age} /nmamalia: ${cat.isMamal}")
    cat.eat()
    cat.sleep()

    val binatang = Animal2()
    println("${binatang.name}")
    binatang.name = "GUK"
    println("${binatang.name}")

    val binatangLagi = Animal3()
    binatangLagi.name = "meong"
    println("nama hewan: ${binatangLagi.name}")

    val orang = Person()
    orang.name = "rendra"
    println("nama orang: ${orang.name}")

    val hero = Hero()
    hero.name = "rendra juga"
    println("nama hero: ${hero.name}")

    val binatangLagiDah = Animal4()
    binatangLagiDah.name = "Kurrr kurr"
    binatangLagiDah.weight = 3.2
    binatangLagiDah.age = 2

    println("nama: ${binatangLagiDah.name}")
    println("berat: ${binatangLagiDah.weight} Kg")
    println("umur: ${binatangLagiDah.age} tahun")

     */

    val ayam = Animal("kur kur", -0.2, -2, )
    println(ayam.name)
    println(ayam.age)
    println(ayam.weigth)
    println(ayam.isMamal)


}