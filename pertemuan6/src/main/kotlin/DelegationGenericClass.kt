import kotlin.reflect.KProperty

class DelegationGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
        println("fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
        println("fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("nilai ${property.name} dari $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal4 {
    var name: Any by DelegationGenericClass()
    var weight: Any by DelegationGenericClass()
    var age: Any by DelegationGenericClass()
}