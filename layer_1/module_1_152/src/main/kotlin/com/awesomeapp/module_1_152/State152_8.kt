package com.awesomeapp.module_1_152

sealed class State152_8 {
    data object Loading : State152_8()
    data class Success(val data: String) : State152_8()
    data class Error(val message: String) : State152_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}