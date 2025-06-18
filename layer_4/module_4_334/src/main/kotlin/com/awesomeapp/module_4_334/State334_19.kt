package com.awesomeapp.module_4_334

sealed class State334_19 {
    data object Loading : State334_19()
    data class Success(val data: String) : State334_19()
    data class Error(val message: String) : State334_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}