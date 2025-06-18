package com.awesomeapp.module_1_160

sealed class State160_32 {
    data object Loading : State160_32()
    data class Success(val data: String) : State160_32()
    data class Error(val message: String) : State160_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}