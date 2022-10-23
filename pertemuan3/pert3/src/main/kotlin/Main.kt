data class dataUser(val name: String, val age: Int) {
    fun intro() {
        println("Nama saya $name, saya berumut $age tahun")
    }
}

class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    /*
    val user1 = User("Rendra", 17)
    val user2 = User("Rendra", 17)
    val dataUser1 = dataUser("rendra", 17)
    val dataUser2 = dataUser("rendra", 17)
    val dataUser3 = dataUser("prana", 17)

    println(user1)
    println(dataUser1)

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

    println(user1.equals(user2))

    val dataUser4 = dataUser3.copy(name = "dudung", age = 90)

    println(dataUser4)

//    val name = dataUser4.component1()
//    val age = dataUser4.component2()

    val (nama, umur) = dataUser4

    println("Nama saya $nama, saya berumur $umur")

    dataUser4.intro()

    val numberList : List<Int> = listOf(1,2,3,4,5,6)

    val anyList = mutableListOf('a', "rendra", 1, true, dataUser("dinding", 100))

    anyList.add('d')
    anyList.add(1, "love")
    anyList[3] = false
    anyList.removeAt(1)

    for (ini in anyList) {
        println(ini)
    }


    val integerSet = setOf(1,2,3,4,5)
    println(integerSet)

    val setA = setOf(1,2,3,4,1,1,2,5,6)
    val setB = setOf(1,2,3,4,5,6)
    println(setA)
    println(setA == setB)

    println(5 in setA)

    val setC = setOf(1, 5, 7, 8, 9)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    val setD = mutableSetOf(1,1,2,2,3,4,5)

    setD.add(6)
    setD.remove(1)
    println(setD)

    val capital = mapOf(
        "jakarta" to "indonesia",
        "london" to "inggris",
        "new delhi" to "india",
        //"jakarta" to "myanmar"
    )

    println(capital["jakarta"])
    println(capital.getValue("jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values
    println(mapKeys)
    println(mapValues)

    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter { it % 2  == 0 }
    val notEvenList = numberList.filterNot { it % 2  == 0 }

    println(evenList)
    println(notEvenList)

    val multipliedBy5 = numberList.map { it * 5 }

    println(multipliedBy5)

    println(numberList.count())

    val firstOddNumber = numberList.find { it % 2 == 0 }
    val firstOrNullNumber = numberList.lastOrNull { it % 2 == 3}

    println(firstOddNumber)
    println(firstOrNullNumber)

    val moreThan6 = numberList.first {it > 6}
    println(moreThan6)

    val total = numberList.sum()
    println(total)

    val kotlinChar = listOf('k','o','t','l','i','n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

     */

    //sequence

//    val list = (1..1000000).toList()
//    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach{ println(it) }

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { println(it) }
}