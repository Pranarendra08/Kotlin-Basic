fun main(args: Array<String>) {
    /*
    val contributor = listOf("baba", "bibi", "bubu", "bebe", "bobo")
    val points = mapOf<String, Int>("dudu" to 10, "dada" to 20)

    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)



    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))

    val number1 = ListNumber<Long>()
    val number2 = ListNumber<Int>()
    val number3 = ListNumber<Float>()
    val number4 = ListNumber<Double>()
//    val number5 = ListNumber<String>()

    val numbers1 = listOf(1,2,3,4,5)
    numbers1.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber()
    */

    val caar = Car(200)
    val motor = MotorCycle(100)
    var vehicle: Vehicle = caar
    println(vehicle)
    vehicle = motor
    println(vehicle)

    val carList = listOf(Car(100), Car(120), Bicycle(30))
    val vehicleList = carList
    println(vehicleList)
}

interface Comparable<in T> {
    operator fun CompareTo(other: T): Int
}

interface ListCovariant<out E> : Collection<E> {
    operator fun get(index: Int) : E
}

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)
class Bicycle(speed: Int)

/*
private fun <E : Number> kotlin.collections.List<E>.sumNumber() {
    TODO("Not yet implemented")
}


class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

//public fun <T> List<T>.slice(indices: Iterable<Int>) : List<T> {
//    /*...*/
//}
*/

interface List<T>{
    operator fun get(index: Int) : T
}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}

