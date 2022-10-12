import java.util.Arrays

fun main(args: Array<String>) {
//    val text: String? = null
//    if (text != null) {
//        val textLength = text.length
//    }
//
//    text?.length

//    val textLength = text!!.length
    /*
    val mixArray = arrayOf(1,3,5,7,"rendra",true)
    val intArray = intArrayOf(1,3,5,7)

    println(mixArray[4])

    var sum = 0

    for (i in intArray) {
        sum += i
    }

    println(sum)

    println(mixArray[2])
    mixArray[2] = "kotlin"

    println(mixArray[2])

    val intArray2 = Array(4, { i -> i * i})
    println(intArray2[0])
    println(intArray2[1])
    println(intArray2[2])
    println(intArray2[3])

    println(Arrays.toString(intArray2))


    val pattern = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(1,"index 1,1",3,4),
        arrayOf(1,2,3,4)
    )

    println(pattern[1][1])
    println(pattern[2][2])



    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)

    Color.GREEN.printValue()
    Color.BLUE.printValue()
    Color.RED.printValue()

    val warna: Color = Color.valueOf("RED")

    println("warna $warna")
    println("value warna $warna adalah ${warna.value.toString(16)}")

    val warna2: Color = Color.GREEN

    println("Posisi GREEN ${warna2.ordinal}")

    val warnaLagi: Array<Color> = Color.values()
    warnaLagi.forEach { color ->
        println(color)
    }



    //while
    var counter = 1
    while (counter <= 3) {
        println("Hello World!")
        counter++
    }


    //do while
    println("====ini do while====")
    counter = 1
    do {
        println("Hello World!")
        counter++
    } while (counter <= 3)

//    var value = "A"
//    do {
//        println(value)
//    } while (value <= "E")



    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        println("$it")
    }

    println(rangeInt.step)

    val range2 = 1.rangeTo(5)
    range2.forEach {
        println("$it")
    }

    val range3 = 5.downTo(1)
    range3.forEach {
        println("$it")
    }



    //for loop

    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

     */

    val listOfInt = listOf(1,2,3,null,5,null,7)
    for (i in listOfInt) {
        if (i == null) break
        println(i)
    }
}
/*
enum class Color(val value: Int) {
    RED(0xFF0000){
                  override fun printValue() {
                      println("value of RED is $value")
                  }
                 },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

//enum class Color{
//    RED, GREEN, BLUE
//}

 */