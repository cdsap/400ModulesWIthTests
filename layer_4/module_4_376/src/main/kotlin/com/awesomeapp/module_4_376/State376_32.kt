package com.awesomeapp.module_4_376

sealed class State376_32 {
    data object Loading : State376_32()
    data class Success(val data: String) : State376_32()
    data class Error(val message: String) : State376_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}