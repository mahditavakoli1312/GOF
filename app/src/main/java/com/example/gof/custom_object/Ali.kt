package com.example.gof.custom_object

class Ali(ali: Ali? = null) : Human<Ali> {

    override fun clone(): Ali {
        return Ali(this)
    }
}