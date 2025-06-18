package com.awesomeapp.module_3_312

sealed class State312_32 {
    data object Loading : State312_32()
    data class Success(val data: String) : State312_32()
    data class Error(val message: String) : State312_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}