package belajarinterface

class Women(override val name: String, override val age: Int) : HumanInterface {
    override fun hobi() {
        println("$name hobi masak")
    }

    override fun sayHello() {
        println("halo nama saya $name, umur saya $age tahun, saya perempuan")
    }
}