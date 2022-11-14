package belajarinterface

class Men(override val name: String, override val age: Int) : HumanInterface {
    override fun hobi() {
        println("$name hobi olahraga")
    }

    override fun sayHello() {
        println("halo nama saya $name, umur saya $age tahun, saya laki-laki")
    }
}