package com.example.gof.singleton

class Singleton private constructor() {
    var value: Int? = null
        private set

    companion object {
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            if (instance == null) {

               /* if a request for getInstance pass (instance == null) must check it after synchronized too.
                because of when a first request is in synchronized process 2th request can pass first if (instance == null)*/

                synchronized(this) {
                    if (instance == null)
                        instance = Singleton()
                }
            }
            return instance!!
        }


    }

    fun setValue(value: Int) {
        this.value = value
    }

    override fun toString() = this.value.toString()

}