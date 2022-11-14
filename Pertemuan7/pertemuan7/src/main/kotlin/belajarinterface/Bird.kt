package belajarinterface

import belajarinterface.IFly

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 1) println("Flying with $numberOfWings wings")
        else println("saya terbang tanpa sayap")
    }
}