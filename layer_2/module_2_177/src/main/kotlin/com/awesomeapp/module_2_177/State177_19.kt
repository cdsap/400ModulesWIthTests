package com.awesomeapp.module_2_177

sealed class State177_19 {
    data object Loading : State177_19()
    data class Success(val data: String) : State177_19()
    data class Error(val message: String) : State177_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}