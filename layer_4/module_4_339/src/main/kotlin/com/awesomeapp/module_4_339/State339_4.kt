package com.awesomeapp.module_4_339

sealed class State339_4 {
    data object Loading : State339_4()
    data class Success(val data: String) : State339_4()
    data class Error(val message: String) : State339_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}