fun main() {
    val a = 2
    val b = true
    var c = 2

    var result: Int = 1
    var booleanResult: Boolean

    result = -a
    println("-a = $result")

    result = +a
    println("+a = $result")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")

    ++c
    println("++c = $c")
}