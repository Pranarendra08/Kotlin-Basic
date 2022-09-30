import java.util.Scanner
import kotlin.random.Random

fun main() {
    /*
    val name = "kotlin"
    val old = 3
    println("My name is $name, im $old years old")

    val hour = 7
    println("office ${if (hour > 7) "already close" else "is open"}")


    //ini komen
    println("ini bukan komen")
    //ini juga komen
    //komen aja lu

    println("1. println")
    println("2. println")
    print("1. print")
    print("2. print")

    println("input")

    //val stringInput = readLine()?.toInt()
    //println("ini kata kamu $stringInput")

    val scan = Scanner(System.`in`)
    print("masukan angka: ")

    //var angkaInterger: Int = scan.nextInt()
    var kata: String = scan.nextLine()

    println("$kata")


    val kantorBuka = 7
    val now = 5
    val kantor = if (now > kantorBuka) "kantor udah buka" else "kantor dah tutup boss"
    println(kantor)

     */

    val value = 7

    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("gaada valuenya")
    }

    val anyType : Any = 100L
    when(anyType){
        !is Long -> println("ini Long")
        !is String -> println("ini String")
        else -> println("gatauu")
    }

    val ranges = 10..50

    when(value) {
        in ranges -> println("ada didalam range")
        !in ranges -> println("tidak ada didalam range")
        else -> println("value gaada dimana mana yeeuuuu")
    }

    val registerNumber = when(val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)