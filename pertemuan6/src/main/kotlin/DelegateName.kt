import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal3 {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}