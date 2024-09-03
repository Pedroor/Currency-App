package com.pedroor.currencyapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform