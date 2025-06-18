package com.awesomeapp.module_1_152

sealed class State152_95 {
    data object Loading : State152_95()
    data class Success(val data: String) : State152_95()
    data class Error(val message: String) : State152_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}