import belajarinterface.Men
import belajarinterface.Women
import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
//    val kucing = Cat("Meong", 3.2, 2, true, "kuning", 4)
//
//    kucing.playWithHUman()
//    kucing.eat()
//    kucing.sleep()

//    val miaw = Animal("miaw")
//
//    miaw.eat("ikan tuna", "ikan tuna")
//    miaw.eat("Ikan Tuna")
//    miaw.eat("Ikan Tuna", 350.0)
//
//    val calc = Calculator()
//
//    println(calc.add(2,3))
//    println(calc.add(2.5, 2.2))
//    println(calc.add(2f,5f))
//    println(calc.add(1,2,3))
//
//    println(calc.min(9,2))
//    println(calc.min(9.2,2.6))

    val cwok = Men("Lutfi", 19)
    val cwek = Women("Sarah", 18)
    cwok.hobi()
    cwek.hobi()

    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    var someIntValue: Int = 0

    try {
//        someMustNotNullValue = someNullValue!!
//        println(someMustNotNullValue)
        someIntValue = someNullValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
            when(someIntValue) {
                0 -> println("Catch blok NullPointerException terpanggil")
                -1 -> println("Catch blok NumberFormatException terpanggil")
                else -> println(someIntValue)
            }
    }

    var animal = Animal("gatau", 0, false)
    println(animal.name)
    animal = Cat("Miaw", 4, true)
    println(animal.name)
    animal = Kanguru("John", 2, true)
    println(animal.name)

    val cat = Cat("oren", 4, true)
    val kanguru = Kanguru("Jhonny", 2, true)
    val listAnimal = mutableListOf<Animal>()
    listAnimal.add(cat)
    listAnimal.add(kanguru)
    for (i in listAnimal) {
        println(i.name)
    }
}