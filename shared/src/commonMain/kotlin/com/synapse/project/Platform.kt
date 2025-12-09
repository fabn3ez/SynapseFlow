package com.synapse.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform