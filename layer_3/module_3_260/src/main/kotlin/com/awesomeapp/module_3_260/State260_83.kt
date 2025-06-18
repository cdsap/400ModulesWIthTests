package com.awesomeapp.module_3_260

sealed class State260_83 {
    data object Loading : State260_83()
    data class Success(val data: String) : State260_83()
    data class Error(val message: String) : State260_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}