package com.death.curry

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}