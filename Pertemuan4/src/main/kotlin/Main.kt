import java.lang.StringBuilder

fun main(args: Array<String>) {
    /*
    val fullName = getFullName(middle = "is", last = "Awesome", first = "Kotlin")
    println(fullName)

    val namaLengkap = getFullName("kotlin", "is", "fun")
    println(namaLengkap)

    val angka = sumNumbers(10,10,20,30,10,10,10,100,10,10,11,12,13,14,15, angka = 10)
    println(angka)

    10.printInt()
    12.printInt()
    100.printInt()

    30.plusTiga()
    println(3.plusTiga())

    println(10.slice)

    val value: Int? = null
    println(value.sliceNull)

    mesage("Hallo aku Lambda, salam kenal! xixixixixi")

    val pesanLength = pesanReturn("Hallo dari Lambda")
    println("Panjang pesan $pesanLength")

     */

    printResult(10, jumlah)

    printResult(12) { value -> value + value }

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda")
    }

    println(message)

    val sumResult = sum?.invoke(10,10)
    println(sumResult)
    val variabelNull: Int? = null
    val multiplyResult = multiply?.invoke(0,0)
    println(multiplyResult)

}

typealias Arithmetic = ((Int, Int) -> Int)?

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var jumlah: (Int) -> Int = { value -> value + value }

/*
val pesanReturn = { pesan: String ->
    pesan.length }

val mesage = { pesan: String -> println(pesan) }

val Int?.sliceNull: Int
    get() = this?.div(2) ?: 0

val Int.slice: Int
    get() = this / 2

fun Int.plusTiga(): Int {
    return this + 3
}
fun Int.printInt() {
    println("value $this")
}

private fun sum(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

private fun sumDuaYangIniBaru(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

private fun sumNumbers(vararg number: Int, angka: Int): Int {
    return number.size
}


 */
