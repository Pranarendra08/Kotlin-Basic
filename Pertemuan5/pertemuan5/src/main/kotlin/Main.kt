import java.lang.StringBuilder

var message = "Kotlin"

fun main(args: Array<String>) {
    /*
    // run
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "Replace text from $from to $to"
    }
    println(result)

    // with
    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    val result3 = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(result3)

    // apply
    val builder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(builder.toString())

    // let
    val message2: String? = null
    //val length = message2?.length ?: 0 * 2
    //val text2 = "text length $length"
    //println(text2)

    message2?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    //also
    val result4 = message.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result4")

     */

    //member references
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)

    //property references
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin academy")

    println(::message.get())

    println(factorial(3))
    println(factorial2(3))
}

fun Int.isEvenNumber() = this % 2 == 0

//function inside function
fun setWord(message: String) {
    fun printMessage() {
        println(message)
    }
    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int, valueD: Int):Int {
    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()
    valueD.validateNumber()

    return valueA + valueB + valueC + valueD
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n-1)
    }
}

//tail recursion
tailrec fun factorial2(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial2(n - 1, newResult)
    }
}