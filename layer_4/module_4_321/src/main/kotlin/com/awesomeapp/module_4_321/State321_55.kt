package com.awesomeapp.module_4_321

sealed class State321_55 {
    data object Loading : State321_55()
    data class Success(val data: String) : State321_55()
    data class Error(val message: String) : State321_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}